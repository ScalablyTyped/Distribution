package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.CommentMention
import typings.officeJs.Excel.ContentType
import typings.officeJs.officeJsStrings.Mention
import typings.officeJs.officeJsStrings.Plain
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `comment.toJSON()`. */
trait CommentData extends StObject {
  
  /**
    *
    * Gets the email of the comment's author.
    *
    * [Api set: ExcelApi 1.10]
    */
  var authorEmail: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets the name of the comment's author.
    *
    * [Api set: ExcelApi 1.10]
    */
  var authorName: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The comment's content. The string is plain text.
    *
    * [Api set: ExcelApi 1.10]
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets the content type of the comment.
    *
    * [Api set: ExcelApi 1.12]
    */
  var contentType: js.UndefOr[ContentType | Plain | Mention] = js.undefined
  
  /**
    *
    * Gets the creation time of the comment. Returns null if the comment was converted from a note, since the comment does not have a creation date.
    *
    * [Api set: ExcelApi 1.10]
    */
  var creationDate: js.UndefOr[Date] = js.undefined
  
  /**
    *
    * Specifies the comment identifier.
    *
    * [Api set: ExcelApi 1.10]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets the entities (e.g., people) that are mentioned in comments.
    *
    * [Api set: ExcelApi 1.11]
    */
  var mentions: js.UndefOr[js.Array[CommentMention]] = js.undefined
  
  /**
    *
    * Represents a collection of reply objects associated with the comment.
    *
    * [Api set: ExcelApi 1.10]
    */
  var replies: js.UndefOr[js.Array[CommentReplyData]] = js.undefined
  
  /**
    *
    * The comment thread status. A value of "true" means the comment thread is resolved.
    *
    * [Api set: ExcelApi 1.11]
    */
  var resolved: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the rich comment content (e.g., mentions in comments). This string is not meant to be displayed to end-users. Your add-in should only use this to parse rich comment content.
    *
    * [Api set: ExcelApi 1.11]
    */
  var richContent: js.UndefOr[String] = js.undefined
}
object CommentData {
  
  @scala.inline
  def apply(): CommentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentData]
  }
  
  @scala.inline
  implicit class CommentDataMutableBuilder[Self <: CommentData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorEmail(value: String): Self = StObject.set(x, "authorEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorEmailUndefined: Self = StObject.set(x, "authorEmail", js.undefined)
    
    @scala.inline
    def setAuthorName(value: String): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorNameUndefined: Self = StObject.set(x, "authorName", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: ContentType | Plain | Mention): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMentions(value: js.Array[CommentMention]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    @scala.inline
    def setMentionsVarargs(value: CommentMention*): Self = StObject.set(x, "mentions", js.Array(value :_*))
    
    @scala.inline
    def setReplies(value: js.Array[CommentReplyData]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    @scala.inline
    def setRepliesVarargs(value: CommentReplyData*): Self = StObject.set(x, "replies", js.Array(value :_*))
    
    @scala.inline
    def setResolved(value: Boolean): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
    
    @scala.inline
    def setRichContent(value: String): Self = StObject.set(x, "richContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRichContentUndefined: Self = StObject.set(x, "richContent", js.undefined)
  }
}
