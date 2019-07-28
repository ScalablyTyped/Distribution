package typings.naverDashWhale.whaleNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Port extends js.Object {
  var name: String
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onDisconnect: typings.chrome.chromeNs.runtimeNs.PortDisconnectEvent
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onMessage: typings.chrome.chromeNs.runtimeNs.PortMessageEvent
  /**
    * Optional.
    * This property will only be present on ports passed to onConnect/onConnectExternal listeners.
    */
  var sender: js.UndefOr[typings.chrome.chromeNs.runtimeNs.MessageSender] = js.undefined
  def disconnect(): Unit
  def postMessage(message: js.Object): Unit
}

object Port {
  @scala.inline
  def apply(
    disconnect: () => Unit,
    name: String,
    onDisconnect: typings.chrome.chromeNs.runtimeNs.PortDisconnectEvent,
    onMessage: typings.chrome.chromeNs.runtimeNs.PortMessageEvent,
    postMessage: js.Object => Unit,
    sender: typings.chrome.chromeNs.runtimeNs.MessageSender = null
  ): Port = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), name = name, onDisconnect = onDisconnect, onMessage = onMessage, postMessage = js.Any.fromFunction1(postMessage))
    if (sender != null) __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[Port]
  }
}

