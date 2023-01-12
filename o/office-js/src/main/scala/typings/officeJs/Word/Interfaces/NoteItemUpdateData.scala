package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the NoteItem object, for use in `noteItem.set({ ... })`. */
trait NoteItemUpdateData extends StObject {
  
  /**
    * Represents the body object of the note item. It's the portion of the text within the footnote or endnote.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  var body: js.UndefOr[BodyUpdateData] = js.undefined
  
  /**
    * Represents a footnote or endnote reference in the main document.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  var reference: js.UndefOr[RangeUpdateData] = js.undefined
}
object NoteItemUpdateData {
  
  inline def apply(): NoteItemUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoteItemUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoteItemUpdateData] (val x: Self) extends AnyVal {
    
    inline def setBody(value: BodyUpdateData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setReference(value: RangeUpdateData): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
  }
}
