package typings.pahoMqtt.mod.global.Paho.MQTT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithInvocationContext extends js.Object {
  
  /**
    * <code>invocationContext</code> as passed in with the corresponding field in the connectOptions or
    * subscribeOptions.
    */
  var invocationContext: js.Any = js.native
}
object WithInvocationContext {
  
  @scala.inline
  def apply(invocationContext: js.Any): WithInvocationContext = {
    val __obj = js.Dynamic.literal(invocationContext = invocationContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithInvocationContext]
  }
  
  @scala.inline
  implicit class WithInvocationContextOps[Self <: WithInvocationContext] (val x: Self) extends AnyVal {
    
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
    def setInvocationContext(value: js.Any): Self = this.set("invocationContext", value.asInstanceOf[js.Any])
  }
}
