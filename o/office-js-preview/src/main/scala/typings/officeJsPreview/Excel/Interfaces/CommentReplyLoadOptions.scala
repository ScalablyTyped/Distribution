package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a comment reply in the workbook.
  *
  * [Api set: ExcelApi 1.10]
  */
trait CommentReplyLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the email of the comment reply's author.
    *
    * [Api set: ExcelApi 1.10]
    */
  var authorEmail: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the name of the comment reply's author.
    *
    * [Api set: ExcelApi 1.10]
    */
  var authorName: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The comment reply's content. The string is plain text.
    *
    * [Api set: ExcelApi 1.10]
    */
  var content: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The content type of the reply.
    *
    * [Api set: ExcelApi 1.12]
    */
  var contentType: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the creation time of the comment reply.
    *
    * [Api set: ExcelApi 1.10]
    */
  var creationDate: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the comment reply identifier.
    *
    * [Api set: ExcelApi 1.10]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The entities (e.g., people) that are mentioned in comments.
    *
    * [Api set: ExcelApi 1.11]
    */
  var mentions: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The comment reply status. A value of "true" means the reply is in the resolved state.
    *
    * [Api set: ExcelApi 1.11]
    */
  var resolved: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The rich comment content (e.g., mentions in comments). This string is not meant to be displayed to end-users. Your add-in should only use this to parse rich comment content.
    *
    * [Api set: ExcelApi 1.11]
    */
  var richContent: js.UndefOr[Boolean] = js.undefined
}
object CommentReplyLoadOptions {
  
  @scala.inline
  def apply(): CommentReplyLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentReplyLoadOptions]
  }
  
  @scala.inline
  implicit class CommentReplyLoadOptionsMutableBuilder[Self <: CommentReplyLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setAuthorEmail(value: Boolean): Self = StObject.set(x, "authorEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorEmailUndefined: Self = StObject.set(x, "authorEmail", js.undefined)
    
    @scala.inline
    def setAuthorName(value: Boolean): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorNameUndefined: Self = StObject.set(x, "authorName", js.undefined)
    
    @scala.inline
    def setContent(value: Boolean): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: Boolean): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Boolean): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMentions(value: Boolean): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    @scala.inline
    def setResolved(value: Boolean): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
    
    @scala.inline
    def setRichContent(value: Boolean): Self = StObject.set(x, "richContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRichContentUndefined: Self = StObject.set(x, "richContent", js.undefined)
  }
}
