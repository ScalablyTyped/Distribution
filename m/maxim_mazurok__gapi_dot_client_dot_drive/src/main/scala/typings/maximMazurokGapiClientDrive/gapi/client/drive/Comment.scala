package typings.maximMazurokGapiClientDrive.gapi.client.drive

import typings.maximMazurokGapiClientDrive.anon.MimeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends StObject {
  
  /** A region of the document represented as a JSON string. See anchor documentation for details on how to define and interpret anchor properties. */
  var anchor: js.UndefOr[String] = js.native
  
  /** The author of the comment. The author's email address and permission ID will not be populated. */
  var author: js.UndefOr[User] = js.native
  
  /** The plain text content of the comment. This field is used for setting the content, while htmlContent should be displayed. */
  var content: js.UndefOr[String] = js.native
  
  /** The time at which the comment was created (RFC 3339 date-time). */
  var createdTime: js.UndefOr[String] = js.native
  
  /** Whether the comment has been deleted. A deleted comment has no content. */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /** The content of the comment with HTML formatting. */
  var htmlContent: js.UndefOr[String] = js.native
  
  /** The ID of the comment. */
  var id: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "drive#comment". */
  var kind: js.UndefOr[String] = js.native
  
  /** The last time the comment or any of its replies was modified (RFC 3339 date-time). */
  var modifiedTime: js.UndefOr[String] = js.native
  
  /** The file content to which the comment refers, typically within the anchor region. For a text file, for example, this would be the text at the location of the comment. */
  var quotedFileContent: js.UndefOr[MimeType] = js.native
  
  /** The full list of replies to the comment in chronological order. */
  var replies: js.UndefOr[js.Array[Reply]] = js.native
  
  /** Whether the comment has been resolved by one of its replies. */
  var resolved: js.UndefOr[Boolean] = js.native
}
object Comment {
  
  @scala.inline
  def apply(): Comment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: String): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setAuthor(value: User): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: String): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setHtmlContent(value: String): Self = StObject.set(x, "htmlContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlContentUndefined: Self = StObject.set(x, "htmlContent", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setModifiedTime(value: String): Self = StObject.set(x, "modifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedTimeUndefined: Self = StObject.set(x, "modifiedTime", js.undefined)
    
    @scala.inline
    def setQuotedFileContent(value: MimeType): Self = StObject.set(x, "quotedFileContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotedFileContentUndefined: Self = StObject.set(x, "quotedFileContent", js.undefined)
    
    @scala.inline
    def setReplies(value: js.Array[Reply]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    @scala.inline
    def setRepliesVarargs(value: Reply*): Self = StObject.set(x, "replies", js.Array(value :_*))
    
    @scala.inline
    def setResolved(value: Boolean): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
  }
}
