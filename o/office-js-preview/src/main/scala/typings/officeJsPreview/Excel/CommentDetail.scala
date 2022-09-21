package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A structure for the comment ID and IDs of its related replies.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
trait CommentDetail extends StObject {
  
  /**
    * Represents the ID of the comment.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var commentId: String
  
  /**
    * Represents the IDs of the related replies that belong to the comment.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var replyIds: js.Array[String]
}
object CommentDetail {
  
  inline def apply(commentId: String, replyIds: js.Array[String]): CommentDetail = {
    val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any], replyIds = replyIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentDetail]
  }
  
  extension [Self <: CommentDetail](x: Self) {
    
    inline def setCommentId(value: String): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
    
    inline def setReplyIds(value: js.Array[String]): Self = StObject.set(x, "replyIds", value.asInstanceOf[js.Any])
    
    inline def setReplyIdsVarargs(value: String*): Self = StObject.set(x, "replyIds", js.Array(value*))
  }
}
