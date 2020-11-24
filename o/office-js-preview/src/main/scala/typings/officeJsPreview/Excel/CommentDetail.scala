package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * A structure for the comment ID and IDs of its related replies.
  *
  * [Api set: ExcelApi 1.12]
  */
@js.native
trait CommentDetail extends js.Object {
  
  /**
    *
    * Represents the ID of comment.
    *
    * [Api set: ExcelApi 1.12]
    */
  var commentId: String = js.native
  
  /**
    *
    * Represents the IDs of the related replies belong to comment.
    *
    * [Api set: ExcelApi 1.12]
    */
  var replyIds: js.Array[String] = js.native
}
object CommentDetail {
  
  @scala.inline
  def apply(commentId: String, replyIds: js.Array[String]): CommentDetail = {
    val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any], replyIds = replyIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentDetail]
  }
  
  @scala.inline
  implicit class CommentDetailOps[Self <: CommentDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommentId(value: String): Self = this.set("commentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyIdsVarargs(value: String*): Self = this.set("replyIds", js.Array(value :_*))
    
    @scala.inline
    def setReplyIds(value: js.Array[String]): Self = this.set("replyIds", value.asInstanceOf[js.Any])
  }
}
