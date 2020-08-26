package typings.onfleetNodeOnfleet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecipientName extends js.Object {
  var recipientName: String | Null = js.native
  var recipientNotes: String | Null = js.native
  var recipientSkipSMSNotifications: String | Null = js.native
  var useMerchantForProxy: String | Null = js.native
}

object RecipientName {
  @scala.inline
  def apply(): RecipientName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientName]
  }
  @scala.inline
  implicit class RecipientNameOps[Self <: RecipientName] (val x: Self) extends AnyVal {
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
    def setRecipientName(value: String): Self = this.set("recipientName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipientNameNull: Self = this.set("recipientName", null)
    @scala.inline
    def setRecipientNotes(value: String): Self = this.set("recipientNotes", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipientNotesNull: Self = this.set("recipientNotes", null)
    @scala.inline
    def setRecipientSkipSMSNotifications(value: String): Self = this.set("recipientSkipSMSNotifications", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipientSkipSMSNotificationsNull: Self = this.set("recipientSkipSMSNotifications", null)
    @scala.inline
    def setUseMerchantForProxy(value: String): Self = this.set("useMerchantForProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseMerchantForProxyNull: Self = this.set("useMerchantForProxy", null)
  }
  
}

