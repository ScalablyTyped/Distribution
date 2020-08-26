package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvitedUserMessageInfo extends js.Object {
  // Additional recipients the invitation message should be sent to. Currently only 1 additional recipient is supported.
  var ccRecipients: js.UndefOr[js.Array[Recipient]] = js.native
  // Customized message body you want to send if you don't want the default message.
  var customizedMessageBody: js.UndefOr[String] = js.native
  /**
    * The language you want to send the default message in. If the customizedMessageBody is specified, this property is
    * ignored, and the message is sent using the customizedMessageBody. The language format should be in ISO 639. The default
    * is en-US.
    */
  var messageLanguage: js.UndefOr[String] = js.native
}

object InvitedUserMessageInfo {
  @scala.inline
  def apply(): InvitedUserMessageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvitedUserMessageInfo]
  }
  @scala.inline
  implicit class InvitedUserMessageInfoOps[Self <: InvitedUserMessageInfo] (val x: Self) extends AnyVal {
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
    def setCcRecipientsVarargs(value: Recipient*): Self = this.set("ccRecipients", js.Array(value :_*))
    @scala.inline
    def setCcRecipients(value: js.Array[Recipient]): Self = this.set("ccRecipients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCcRecipients: Self = this.set("ccRecipients", js.undefined)
    @scala.inline
    def setCustomizedMessageBody(value: String): Self = this.set("customizedMessageBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomizedMessageBody: Self = this.set("customizedMessageBody", js.undefined)
    @scala.inline
    def setMessageLanguage(value: String): Self = this.set("messageLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageLanguage: Self = this.set("messageLanguage", js.undefined)
  }
  
}

