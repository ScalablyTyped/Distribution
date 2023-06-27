package typings.officeJs.Word.Interfaces

import typings.officeJs.Word.NoteItemType
import typings.officeJs.officeJsStrings.Endnote
import typings.officeJs.officeJsStrings.Footnote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `noteItem.toJSON()`. */
trait NoteItemData extends StObject {
  
  /**
    * Represents the body object of the note item. It's the portion of the text within the footnote or endnote.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var body: js.UndefOr[BodyData] = js.undefined
  
  /**
    * Represents a footnote or endnote reference in the main document.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var reference: js.UndefOr[RangeData] = js.undefined
  
  /**
    * Represents the note item type: footnote or endnote.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var `type`: js.UndefOr[NoteItemType | Footnote | Endnote] = js.undefined
}
object NoteItemData {
  
  inline def apply(): NoteItemData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoteItemData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoteItemData] (val x: Self) extends AnyVal {
    
    inline def setBody(value: BodyData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setReference(value: RangeData): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setType(value: NoteItemType | Footnote | Endnote): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
