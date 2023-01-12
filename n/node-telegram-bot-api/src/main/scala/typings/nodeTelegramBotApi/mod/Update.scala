package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Update extends StObject {
  
  var callback_query: js.UndefOr[CallbackQuery] = js.undefined
  
  var channel_post: js.UndefOr[Message] = js.undefined
  
  var chat_join_request: js.UndefOr[ChatJoinRequest] = js.undefined
  
  var chat_member: js.UndefOr[ChatMemberUpdated] = js.undefined
  
  var chosen_inline_result: js.UndefOr[ChosenInlineResult] = js.undefined
  
  var edited_channel_post: js.UndefOr[Message] = js.undefined
  
  var edited_message: js.UndefOr[Message] = js.undefined
  
  var inline_query: js.UndefOr[InlineQuery] = js.undefined
  
  var message: js.UndefOr[Message] = js.undefined
  
  var my_chat_member: js.UndefOr[ChatMemberUpdated] = js.undefined
  
  var poll: js.UndefOr[Poll] = js.undefined
  
  var poll_answer: js.UndefOr[PollAnswer] = js.undefined
  
  var pre_checkout_query: js.UndefOr[PreCheckoutQuery] = js.undefined
  
  var shipping_query: js.UndefOr[ShippingQuery] = js.undefined
  
  var update_id: Double
}
object Update {
  
  inline def apply(update_id: Double): Update = {
    val __obj = js.Dynamic.literal(update_id = update_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Update] (val x: Self) extends AnyVal {
    
    inline def setCallback_query(value: CallbackQuery): Self = StObject.set(x, "callback_query", value.asInstanceOf[js.Any])
    
    inline def setCallback_queryUndefined: Self = StObject.set(x, "callback_query", js.undefined)
    
    inline def setChannel_post(value: Message): Self = StObject.set(x, "channel_post", value.asInstanceOf[js.Any])
    
    inline def setChannel_postUndefined: Self = StObject.set(x, "channel_post", js.undefined)
    
    inline def setChat_join_request(value: ChatJoinRequest): Self = StObject.set(x, "chat_join_request", value.asInstanceOf[js.Any])
    
    inline def setChat_join_requestUndefined: Self = StObject.set(x, "chat_join_request", js.undefined)
    
    inline def setChat_member(value: ChatMemberUpdated): Self = StObject.set(x, "chat_member", value.asInstanceOf[js.Any])
    
    inline def setChat_memberUndefined: Self = StObject.set(x, "chat_member", js.undefined)
    
    inline def setChosen_inline_result(value: ChosenInlineResult): Self = StObject.set(x, "chosen_inline_result", value.asInstanceOf[js.Any])
    
    inline def setChosen_inline_resultUndefined: Self = StObject.set(x, "chosen_inline_result", js.undefined)
    
    inline def setEdited_channel_post(value: Message): Self = StObject.set(x, "edited_channel_post", value.asInstanceOf[js.Any])
    
    inline def setEdited_channel_postUndefined: Self = StObject.set(x, "edited_channel_post", js.undefined)
    
    inline def setEdited_message(value: Message): Self = StObject.set(x, "edited_message", value.asInstanceOf[js.Any])
    
    inline def setEdited_messageUndefined: Self = StObject.set(x, "edited_message", js.undefined)
    
    inline def setInline_query(value: InlineQuery): Self = StObject.set(x, "inline_query", value.asInstanceOf[js.Any])
    
    inline def setInline_queryUndefined: Self = StObject.set(x, "inline_query", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMy_chat_member(value: ChatMemberUpdated): Self = StObject.set(x, "my_chat_member", value.asInstanceOf[js.Any])
    
    inline def setMy_chat_memberUndefined: Self = StObject.set(x, "my_chat_member", js.undefined)
    
    inline def setPoll(value: Poll): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
    
    inline def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
    
    inline def setPoll_answer(value: PollAnswer): Self = StObject.set(x, "poll_answer", value.asInstanceOf[js.Any])
    
    inline def setPoll_answerUndefined: Self = StObject.set(x, "poll_answer", js.undefined)
    
    inline def setPre_checkout_query(value: PreCheckoutQuery): Self = StObject.set(x, "pre_checkout_query", value.asInstanceOf[js.Any])
    
    inline def setPre_checkout_queryUndefined: Self = StObject.set(x, "pre_checkout_query", js.undefined)
    
    inline def setShipping_query(value: ShippingQuery): Self = StObject.set(x, "shipping_query", value.asInstanceOf[js.Any])
    
    inline def setShipping_queryUndefined: Self = StObject.set(x, "shipping_query", js.undefined)
    
    inline def setUpdate_id(value: Double): Self = StObject.set(x, "update_id", value.asInstanceOf[js.Any])
  }
}
