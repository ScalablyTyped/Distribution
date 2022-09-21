package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a RichText object in a Paragraph.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
trait RichTextLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the ID of the RichText object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The language id of the text. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var languageId: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the Paragraph object that contains the RichText object.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var paragraph: js.UndefOr[ParagraphLoadOptions] = js.undefined
  
  /**
    * Gets the text style of the RichText object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.8]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the text content of the RichText object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.undefined
}
object RichTextLoadOptions {
  
  inline def apply(): RichTextLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RichTextLoadOptions]
  }
  
  extension [Self <: RichTextLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLanguageId(value: Boolean): Self = StObject.set(x, "languageId", value.asInstanceOf[js.Any])
    
    inline def setLanguageIdUndefined: Self = StObject.set(x, "languageId", js.undefined)
    
    inline def setParagraph(value: ParagraphLoadOptions): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    inline def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
    
    inline def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
