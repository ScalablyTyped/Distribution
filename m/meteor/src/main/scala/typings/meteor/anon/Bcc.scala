package typings.meteor.anon

import typings.meteor.MailComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bcc extends js.Object {
  var attachments: js.UndefOr[js.Array[js.Object]] = js.native
  var bcc: js.UndefOr[String | js.Array[String]] = js.native
  var cc: js.UndefOr[String | js.Array[String]] = js.native
  var from: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var html: js.UndefOr[String] = js.native
  var mailComposer: js.UndefOr[MailComposer] = js.native
  var replyTo: js.UndefOr[String | js.Array[String]] = js.native
  var subject: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
  var to: js.UndefOr[String | js.Array[String]] = js.native
}

object Bcc {
  @scala.inline
  def apply(): Bcc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bcc]
  }
  @scala.inline
  implicit class BccOps[Self <: Bcc] (val x: Self) extends AnyVal {
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
    def setAttachmentsVarargs(value: js.Object*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[js.Object]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    @scala.inline
    def setBccVarargs(value: String*): Self = this.set("bcc", js.Array(value :_*))
    @scala.inline
    def setBcc(value: String | js.Array[String]): Self = this.set("bcc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBcc: Self = this.set("bcc", js.undefined)
    @scala.inline
    def setCcVarargs(value: String*): Self = this.set("cc", js.Array(value :_*))
    @scala.inline
    def setCc(value: String | js.Array[String]): Self = this.set("cc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCc: Self = this.set("cc", js.undefined)
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setMailComposer(value: MailComposer): Self = this.set("mailComposer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMailComposer: Self = this.set("mailComposer", js.undefined)
    @scala.inline
    def setReplyToVarargs(value: String*): Self = this.set("replyTo", js.Array(value :_*))
    @scala.inline
    def setReplyTo(value: String | js.Array[String]): Self = this.set("replyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyTo: Self = this.set("replyTo", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setToVarargs(value: String*): Self = this.set("to", js.Array(value :_*))
    @scala.inline
    def setTo(value: String | js.Array[String]): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

