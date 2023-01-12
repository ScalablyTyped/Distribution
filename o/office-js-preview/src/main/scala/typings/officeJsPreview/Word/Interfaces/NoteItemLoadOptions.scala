package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a footnote or endnote.
  *
  * @remarks
  * [Api set: WordApiOnline 1.1]
  */
trait NoteItemLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the body object of the note item. It's the portion of the text within the footnote or endnote.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  var body: js.UndefOr[BodyLoadOptions] = js.undefined
  
  /**
    * Represents a footnote or endnote reference in the main document.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  var reference: js.UndefOr[RangeLoadOptions] = js.undefined
  
  /**
    * Represents the note item type: footnote or endnote.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
}
object NoteItemLoadOptions {
  
  inline def apply(): NoteItemLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoteItemLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoteItemLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setBody(value: BodyLoadOptions): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setReference(value: RangeLoadOptions): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
