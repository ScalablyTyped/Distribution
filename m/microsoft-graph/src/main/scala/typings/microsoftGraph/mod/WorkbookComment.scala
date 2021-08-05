package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookComment
  extends StObject
     with Entity {
  
  // The content of comment.
  var content: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates the type for the comment.
  var contentType: js.UndefOr[String] = js.undefined
  
  // Read-only. Nullable.
  var replies: js.UndefOr[NullableOption[js.Array[WorkbookCommentReply]]] = js.undefined
}
object WorkbookComment {
  
  inline def apply(): WorkbookComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookComment]
  }
  
  extension [Self <: WorkbookComment](x: Self) {
    
    inline def setContent(value: NullableOption[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setReplies(value: NullableOption[js.Array[WorkbookCommentReply]]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    inline def setRepliesNull: Self = StObject.set(x, "replies", null)
    
    inline def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    inline def setRepliesVarargs(value: WorkbookCommentReply*): Self = StObject.set(x, "replies", js.Array(value :_*))
  }
}
