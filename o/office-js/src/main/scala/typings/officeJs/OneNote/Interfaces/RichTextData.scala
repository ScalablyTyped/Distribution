package typings.officeJs.OneNote.Interfaces

import typings.officeJs.OneNote.ParagraphStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `richText.toJSON()`. */
trait RichTextData extends StObject {
  
  /**
    * Gets the ID of the RichText object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The language id of the text. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var languageId: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the text style of the RichText object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.8]
    */
  var style: js.UndefOr[ParagraphStyle] = js.undefined
  
  /**
    * Gets the text content of the RichText object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var text: js.UndefOr[String] = js.undefined
}
object RichTextData {
  
  inline def apply(): RichTextData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RichTextData]
  }
  
  extension [Self <: RichTextData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLanguageId(value: String): Self = StObject.set(x, "languageId", value.asInstanceOf[js.Any])
    
    inline def setLanguageIdUndefined: Self = StObject.set(x, "languageId", js.undefined)
    
    inline def setStyle(value: ParagraphStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
