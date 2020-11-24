package typings.mondaySdkJs.anon

import typings.mondaySdkJs.mondaySdkJsStrings.error
import typings.mondaySdkJs.mondaySdkJsStrings.info
import typings.mondaySdkJs.mondaySdkJsStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends js.Object {
  
  /**
    * The message to display
    */
  var message: String = js.native
  
  /**
    * The number of milliseconds to show the message until it closes
    * Defaults to 5000
    */
  var timeout: js.UndefOr[Double] = js.native
  
  /**
    * The type of message to display. Can be "success" (green), "error" (red) or "info" (blue)
    * Defaults to "info"
    */
  var `type`: js.UndefOr[success | error | info] = js.native
}
object Message {
  
  @scala.inline
  def apply(message: String): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setType(value: success | error | info): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
