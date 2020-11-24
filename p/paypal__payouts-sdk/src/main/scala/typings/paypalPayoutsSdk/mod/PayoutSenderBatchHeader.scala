package typings.paypalPayoutsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayoutSenderBatchHeader extends js.Object {
  
  var email_message: js.UndefOr[String] = js.native
  
  var email_subject: js.UndefOr[String] = js.native
  
  var recipient_type: js.UndefOr[RecipientType] = js.native
  
  var sender_batch_id: js.UndefOr[String] = js.native
}
object PayoutSenderBatchHeader {
  
  @scala.inline
  def apply(): PayoutSenderBatchHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PayoutSenderBatchHeader]
  }
  
  @scala.inline
  implicit class PayoutSenderBatchHeaderOps[Self <: PayoutSenderBatchHeader] (val x: Self) extends AnyVal {
    
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
    def setEmail_message(value: String): Self = this.set("email_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail_message: Self = this.set("email_message", js.undefined)
    
    @scala.inline
    def setEmail_subject(value: String): Self = this.set("email_subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail_subject: Self = this.set("email_subject", js.undefined)
    
    @scala.inline
    def setRecipient_type(value: RecipientType): Self = this.set("recipient_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipient_type: Self = this.set("recipient_type", js.undefined)
    
    @scala.inline
    def setSender_batch_id(value: String): Self = this.set("sender_batch_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSender_batch_id: Self = this.set("sender_batch_id", js.undefined)
  }
}
