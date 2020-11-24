package typings.ow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends js.Object {
  
  /**
    The error message which should be shown if the `validator` is `false`. Or a error function which returns the error message and accepts the label as first argument.
    */
  var message: String | (js.Function1[/* label */ String, String]) = js.native
  
  /**
    Should be `true` if the validation is correct.
    */
  var validator: Boolean = js.native
}
object Message {
  
  @scala.inline
  def apply(message: String | (js.Function1[/* label */ String, String]), validator: Boolean): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    
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
    def setMessageFunction1(value: /* label */ String => String): Self = this.set("message", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMessage(value: String | (js.Function1[/* label */ String, String])): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidator(value: Boolean): Self = this.set("validator", value.asInstanceOf[js.Any])
  }
}
