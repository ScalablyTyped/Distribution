package typings.pahoMqtt.mod._Global_.Paho.MQTT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithInvocationContext extends js.Object {
  /**
    * <code>invocationContext</code> as passed in with the corresponding field in the connectOptions or
    * subscribeOptions.
    */
  var invocationContext: js.Any
}

object WithInvocationContext {
  @scala.inline
  def apply(invocationContext: js.Any): WithInvocationContext = {
    val __obj = js.Dynamic.literal(invocationContext = invocationContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithInvocationContext]
  }
}

