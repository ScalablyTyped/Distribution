package typings.nodemailer.mimeNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Addresses extends js.Object {
  var bcc: js.UndefOr[js.Array[String]] = js.native
  var cc: js.UndefOr[js.Array[String]] = js.native
  var from: js.UndefOr[js.Array[String]] = js.native
  var `reply-to`: js.UndefOr[js.Array[String]] = js.native
  var sender: js.UndefOr[js.Array[String]] = js.native
  var to: js.UndefOr[js.Array[String]] = js.native
}

object Addresses {
  @scala.inline
  def apply(): Addresses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Addresses]
  }
  @scala.inline
  implicit class AddressesOps[Self <: Addresses] (val x: Self) extends AnyVal {
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
    def setBccVarargs(value: String*): Self = this.set("bcc", js.Array(value :_*))
    @scala.inline
    def setBcc(value: js.Array[String]): Self = this.set("bcc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBcc: Self = this.set("bcc", js.undefined)
    @scala.inline
    def setCcVarargs(value: String*): Self = this.set("cc", js.Array(value :_*))
    @scala.inline
    def setCc(value: js.Array[String]): Self = this.set("cc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCc: Self = this.set("cc", js.undefined)
    @scala.inline
    def setFromVarargs(value: String*): Self = this.set("from", js.Array(value :_*))
    @scala.inline
    def setFrom(value: js.Array[String]): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def `setReply-toVarargs`(value: String*): Self = this.set("reply-to", js.Array(value :_*))
    @scala.inline
    def `setReply-to`(value: js.Array[String]): Self = this.set("reply-to", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteReply-to`: Self = this.set("reply-to", js.undefined)
    @scala.inline
    def setSenderVarargs(value: String*): Self = this.set("sender", js.Array(value :_*))
    @scala.inline
    def setSender(value: js.Array[String]): Self = this.set("sender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSender: Self = this.set("sender", js.undefined)
    @scala.inline
    def setToVarargs(value: String*): Self = this.set("to", js.Array(value :_*))
    @scala.inline
    def setTo(value: js.Array[String]): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

