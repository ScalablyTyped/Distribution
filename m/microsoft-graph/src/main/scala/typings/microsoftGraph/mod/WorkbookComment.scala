package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookComment extends Entity {
  // The content of comment.
  var content: js.UndefOr[String] = js.native
  // Indicates the type for the comment.
  var contentType: js.UndefOr[String] = js.native
  // Read-only. Nullable.
  var replies: js.UndefOr[js.Array[WorkbookCommentReply]] = js.native
}

object WorkbookComment {
  @scala.inline
  def apply(): WorkbookComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookComment]
  }
  @scala.inline
  implicit class WorkbookCommentOps[Self <: WorkbookComment] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setRepliesVarargs(value: WorkbookCommentReply*): Self = this.set("replies", js.Array(value :_*))
    @scala.inline
    def setReplies(value: js.Array[WorkbookCommentReply]): Self = this.set("replies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplies: Self = this.set("replies", js.undefined)
  }
  
}

