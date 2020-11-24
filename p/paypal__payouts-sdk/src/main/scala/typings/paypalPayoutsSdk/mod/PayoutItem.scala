package typings.paypalPayoutsSdk.mod

import typings.paypalPayoutsSdk.anon.Phone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayoutItem extends js.Object {
  
  var alternate_notification_method: js.UndefOr[Phone] = js.native
  
  var amount: typings.paypalPayoutsSdk.anon.Currency = js.native
  
  var note: js.UndefOr[String] = js.native
  
  var notification_language: js.UndefOr[String] = js.native
  
  var receiver: String = js.native
  
  var recipient_type: js.UndefOr[RecipientType] = js.native
  
  var recipient_wallet: js.UndefOr[RecipientWallet] = js.native
  
  var sender_item_id: js.UndefOr[String] = js.native
}
object PayoutItem {
  
  @scala.inline
  def apply(amount: typings.paypalPayoutsSdk.anon.Currency, receiver: String): PayoutItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], receiver = receiver.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayoutItem]
  }
  
  @scala.inline
  implicit class PayoutItemOps[Self <: PayoutItem] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: typings.paypalPayoutsSdk.anon.Currency): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiver(value: String): Self = this.set("receiver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternate_notification_method(value: Phone): Self = this.set("alternate_notification_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternate_notification_method: Self = this.set("alternate_notification_method", js.undefined)
    
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    
    @scala.inline
    def setNotification_language(value: String): Self = this.set("notification_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotification_language: Self = this.set("notification_language", js.undefined)
    
    @scala.inline
    def setRecipient_type(value: RecipientType): Self = this.set("recipient_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipient_type: Self = this.set("recipient_type", js.undefined)
    
    @scala.inline
    def setRecipient_wallet(value: RecipientWallet): Self = this.set("recipient_wallet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipient_wallet: Self = this.set("recipient_wallet", js.undefined)
    
    @scala.inline
    def setSender_item_id(value: String): Self = this.set("sender_item_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSender_item_id: Self = this.set("sender_item_id", js.undefined)
  }
}
