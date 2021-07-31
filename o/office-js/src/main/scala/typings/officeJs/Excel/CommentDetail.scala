package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * A structure for the comment Id and Ids of its related replies.
  *
  * [Api set: ExcelApi 1.12]
  */
trait CommentDetail extends StObject {
  
  /**
    *
    * Represents the id of comment.
    *
    * [Api set: ExcelApi 1.12]
    */
  var commentId: String
  
  /**
    *
    * Represents the ids of the related replies belong to comment.
    *
    * [Api set: ExcelApi 1.12]
    */
  var replyIds: js.Array[String]
}
object CommentDetail {
  
  @scala.inline
  def apply(commentId: String, replyIds: js.Array[String]): CommentDetail = {
    val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any], replyIds = replyIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentDetail]
  }
  
  @scala.inline
  implicit class CommentDetailMutableBuilder[Self <: CommentDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommentId(value: String): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyIds(value: js.Array[String]): Self = StObject.set(x, "replyIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyIdsVarargs(value: String*): Self = StObject.set(x, "replyIds", js.Array(value :_*))
  }
}
