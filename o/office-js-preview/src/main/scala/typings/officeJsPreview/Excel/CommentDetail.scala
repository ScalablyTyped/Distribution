package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A structure for the comment ID and IDs of its related replies.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait CommentDetail extends js.Object {
  /**
    *
    * Represents the ID of comment.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var commentId: String
  /**
    *
    * Represents the IDs of the related replies belong to comment.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var replyIds: js.Array[String]
}

object CommentDetail {
  @scala.inline
  def apply(commentId: String, replyIds: js.Array[String]): CommentDetail = {
    val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any], replyIds = replyIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentDetail]
  }
}

