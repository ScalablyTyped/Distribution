package typings.paypalPayoutsSdk.mod

import typings.paypalPayoutsSdk.anon.Alternatefullname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayoutItemDetail extends StObject {
  
  var amount: Currency
  
  var note: js.UndefOr[String] = js.undefined
  
  var receiver: String
  
  var recipient_name: js.UndefOr[Alternatefullname] = js.undefined
  
  var recipient_type: js.UndefOr[RecipientType] = js.undefined
  
  var recipient_wallet: js.UndefOr[RecipientWallet] = js.undefined
  
  var sender_item_id: js.UndefOr[String] = js.undefined
}
object PayoutItemDetail {
  
  @scala.inline
  def apply(amount: Currency, receiver: String): PayoutItemDetail = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], receiver = receiver.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayoutItemDetail]
  }
  
  @scala.inline
  implicit class PayoutItemDetailMutableBuilder[Self <: PayoutItemDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Currency): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setReceiver(value: String): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient_name(value: Alternatefullname): Self = StObject.set(x, "recipient_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient_nameUndefined: Self = StObject.set(x, "recipient_name", js.undefined)
    
    @scala.inline
    def setRecipient_type(value: RecipientType): Self = StObject.set(x, "recipient_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient_typeUndefined: Self = StObject.set(x, "recipient_type", js.undefined)
    
    @scala.inline
    def setRecipient_wallet(value: RecipientWallet): Self = StObject.set(x, "recipient_wallet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient_walletUndefined: Self = StObject.set(x, "recipient_wallet", js.undefined)
    
    @scala.inline
    def setSender_item_id(value: String): Self = StObject.set(x, "sender_item_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender_item_idUndefined: Self = StObject.set(x, "sender_item_id", js.undefined)
  }
}
