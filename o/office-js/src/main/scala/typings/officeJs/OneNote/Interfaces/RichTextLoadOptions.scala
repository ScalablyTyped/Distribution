package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a RichText object in a Paragraph.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait RichTextLoadOptions extends StObject {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the ID of the RichText object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The language id of the text. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var languageId: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the Paragraph object that contains the RichText object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraph: js.UndefOr[ParagraphLoadOptions] = js.undefined
  
  /**
    *
    * Gets the text content of the RichText object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.undefined
}
object RichTextLoadOptions {
  
  @scala.inline
  def apply(): RichTextLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RichTextLoadOptions]
  }
  
  @scala.inline
  implicit class RichTextLoadOptionsMutableBuilder[Self <: RichTextLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLanguageId(value: Boolean): Self = StObject.set(x, "languageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageIdUndefined: Self = StObject.set(x, "languageId", js.undefined)
    
    @scala.inline
    def setParagraph(value: ParagraphLoadOptions): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
    
    @scala.inline
    def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
