package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookComment extends Entity {
  
  // The content of comment.
  var content: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates the type for the comment.
  var contentType: js.UndefOr[String] = js.native
  
  // Read-only. Nullable.
  var replies: js.UndefOr[NullableOption[js.Array[WorkbookCommentReply]]] = js.native
}
object WorkbookComment {
  
  @scala.inline
  def apply(): WorkbookComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookComment]
  }
  
  @scala.inline
  implicit class WorkbookCommentMutableBuilder[Self <: WorkbookComment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: NullableOption[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNull: Self = StObject.set(x, "content", null)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setReplies(value: NullableOption[js.Array[WorkbookCommentReply]]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepliesNull: Self = StObject.set(x, "replies", null)
    
    @scala.inline
    def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    @scala.inline
    def setRepliesVarargs(value: WorkbookCommentReply*): Self = StObject.set(x, "replies", js.Array(value :_*))
  }
}
