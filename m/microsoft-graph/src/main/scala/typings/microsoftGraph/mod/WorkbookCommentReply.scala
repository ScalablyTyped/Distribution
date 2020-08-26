package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookCommentReply extends Entity {
  // The content of a comment reply.
  var content: js.UndefOr[String] = js.native
  // Indicates the type for the comment reply.
  var contentType: js.UndefOr[String] = js.native
}

object WorkbookCommentReply {
  @scala.inline
  def apply(): WorkbookCommentReply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookCommentReply]
  }
  @scala.inline
  implicit class WorkbookCommentReplyOps[Self <: WorkbookCommentReply] (val x: Self) extends AnyVal {
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
  }
  
}

