package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Update extends js.Object {
  
  var callback_query: js.UndefOr[CallbackQuery] = js.native
  
  var channel_post: js.UndefOr[Message] = js.native
  
  var chosen_inline_result: js.UndefOr[ChosenInlineResult] = js.native
  
  var edited_channel_post: js.UndefOr[Message] = js.native
  
  var edited_message: js.UndefOr[Message] = js.native
  
  var inline_query: js.UndefOr[InlineQuery] = js.native
  
  var message: js.UndefOr[Message] = js.native
  
  var pre_checkout_query: js.UndefOr[PreCheckoutQuery] = js.native
  
  var shipping_query: js.UndefOr[ShippingQuery] = js.native
  
  var update_id: Double = js.native
}
object Update {
  
  @scala.inline
  def apply(update_id: Double): Update = {
    val __obj = js.Dynamic.literal(update_id = update_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
  
  @scala.inline
  implicit class UpdateOps[Self <: Update] (val x: Self) extends AnyVal {
    
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
    def setUpdate_id(value: Double): Self = this.set("update_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallback_query(value: CallbackQuery): Self = this.set("callback_query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback_query: Self = this.set("callback_query", js.undefined)
    
    @scala.inline
    def setChannel_post(value: Message): Self = this.set("channel_post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel_post: Self = this.set("channel_post", js.undefined)
    
    @scala.inline
    def setChosen_inline_result(value: ChosenInlineResult): Self = this.set("chosen_inline_result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChosen_inline_result: Self = this.set("chosen_inline_result", js.undefined)
    
    @scala.inline
    def setEdited_channel_post(value: Message): Self = this.set("edited_channel_post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdited_channel_post: Self = this.set("edited_channel_post", js.undefined)
    
    @scala.inline
    def setEdited_message(value: Message): Self = this.set("edited_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdited_message: Self = this.set("edited_message", js.undefined)
    
    @scala.inline
    def setInline_query(value: InlineQuery): Self = this.set("inline_query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline_query: Self = this.set("inline_query", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setPre_checkout_query(value: PreCheckoutQuery): Self = this.set("pre_checkout_query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePre_checkout_query: Self = this.set("pre_checkout_query", js.undefined)
    
    @scala.inline
    def setShipping_query(value: ShippingQuery): Self = this.set("shipping_query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipping_query: Self = this.set("shipping_query", js.undefined)
  }
}
