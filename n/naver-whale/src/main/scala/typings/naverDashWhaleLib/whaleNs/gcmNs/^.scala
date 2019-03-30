package typings
package naverDashWhaleLib.whaleNs.gcmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.gcm")
@js.native
object ^ extends js.Object {
  var MAX_MESSAGE_SIZE: scala.Double = js.native
  var onMessage: chromeLib.chromeNs.gcmNs.MessageReceptionEvent = js.native
  var onMessagesDeleted: chromeLib.chromeNs.gcmNs.MessageDeletionEvent = js.native
  var onSendError: chromeLib.chromeNs.gcmNs.GcmErrorEvent = js.native
  def register(
    senderIds: js.Array[java.lang.String],
    callback: js.Function1[/* registrationId */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def send(
    message: chromeLib.chromeNs.gcmNs.OutgoingMessage,
    callback: js.Function1[/* messageId */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def unregister(callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

