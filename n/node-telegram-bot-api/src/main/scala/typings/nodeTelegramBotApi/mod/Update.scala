package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Update extends StObject {
  
  var callback_query: js.UndefOr[CallbackQuery] = js.undefined
  
  var channel_post: js.UndefOr[Message] = js.undefined
  
  var chosen_inline_result: js.UndefOr[ChosenInlineResult] = js.undefined
  
  var edited_channel_post: js.UndefOr[Message] = js.undefined
  
  var edited_message: js.UndefOr[Message] = js.undefined
  
  var inline_query: js.UndefOr[InlineQuery] = js.undefined
  
  var message: js.UndefOr[Message] = js.undefined
  
  var pre_checkout_query: js.UndefOr[PreCheckoutQuery] = js.undefined
  
  var shipping_query: js.UndefOr[ShippingQuery] = js.undefined
  
  var update_id: Double
}
object Update {
  
  @scala.inline
  def apply(update_id: Double): Update = {
    val __obj = js.Dynamic.literal(update_id = update_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
  
  @scala.inline
  implicit class UpdateMutableBuilder[Self <: Update] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback_query(value: CallbackQuery): Self = StObject.set(x, "callback_query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallback_queryUndefined: Self = StObject.set(x, "callback_query", js.undefined)
    
    @scala.inline
    def setChannel_post(value: Message): Self = StObject.set(x, "channel_post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel_postUndefined: Self = StObject.set(x, "channel_post", js.undefined)
    
    @scala.inline
    def setChosen_inline_result(value: ChosenInlineResult): Self = StObject.set(x, "chosen_inline_result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChosen_inline_resultUndefined: Self = StObject.set(x, "chosen_inline_result", js.undefined)
    
    @scala.inline
    def setEdited_channel_post(value: Message): Self = StObject.set(x, "edited_channel_post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdited_channel_postUndefined: Self = StObject.set(x, "edited_channel_post", js.undefined)
    
    @scala.inline
    def setEdited_message(value: Message): Self = StObject.set(x, "edited_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdited_messageUndefined: Self = StObject.set(x, "edited_message", js.undefined)
    
    @scala.inline
    def setInline_query(value: InlineQuery): Self = StObject.set(x, "inline_query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline_queryUndefined: Self = StObject.set(x, "inline_query", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setPre_checkout_query(value: PreCheckoutQuery): Self = StObject.set(x, "pre_checkout_query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPre_checkout_queryUndefined: Self = StObject.set(x, "pre_checkout_query", js.undefined)
    
    @scala.inline
    def setShipping_query(value: ShippingQuery): Self = StObject.set(x, "shipping_query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipping_queryUndefined: Self = StObject.set(x, "shipping_query", js.undefined)
    
    @scala.inline
    def setUpdate_id(value: Double): Self = StObject.set(x, "update_id", value.asInstanceOf[js.Any])
  }
}
