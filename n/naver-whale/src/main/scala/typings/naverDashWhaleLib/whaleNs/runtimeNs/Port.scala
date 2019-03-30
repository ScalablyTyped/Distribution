package typings
package naverDashWhaleLib.whaleNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Port extends js.Object {
  var name: java.lang.String
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onDisconnect: chromeLib.chromeNs.runtimeNs.PortDisconnectEvent
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onMessage: chromeLib.chromeNs.runtimeNs.PortMessageEvent
  /**
    * Optional.
    * This property will only be present on ports passed to onConnect/onConnectExternal listeners.
    */
  var sender: js.UndefOr[chromeLib.chromeNs.runtimeNs.MessageSender] = js.undefined
  def disconnect(): scala.Unit
  def postMessage(message: js.Object): scala.Unit
}

object Port {
  @scala.inline
  def apply(
    disconnect: () => scala.Unit,
    name: java.lang.String,
    onDisconnect: chromeLib.chromeNs.runtimeNs.PortDisconnectEvent,
    onMessage: chromeLib.chromeNs.runtimeNs.PortMessageEvent,
    postMessage: js.Object => scala.Unit,
    sender: chromeLib.chromeNs.runtimeNs.MessageSender = null
  ): Port = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), name = name, onDisconnect = onDisconnect, onMessage = onMessage, postMessage = js.Any.fromFunction1(postMessage))
    if (sender != null) __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[Port]
  }
}

