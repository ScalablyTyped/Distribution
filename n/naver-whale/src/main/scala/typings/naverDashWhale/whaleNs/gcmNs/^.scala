package typings.naverDashWhale.whaleNs.gcmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.gcm")
@js.native
object ^ extends js.Object {
  var MAX_MESSAGE_SIZE: Double = js.native
  var onMessage: typings.chrome.chromeNs.gcmNs.MessageReceptionEvent = js.native
  var onMessagesDeleted: typings.chrome.chromeNs.gcmNs.MessageDeletionEvent = js.native
  var onSendError: typings.chrome.chromeNs.gcmNs.GcmErrorEvent = js.native
  def register(senderIds: js.Array[String], callback: js.Function1[/* registrationId */ String, Unit]): Unit = js.native
  def send(
    message: typings.chrome.chromeNs.gcmNs.OutgoingMessage,
    callback: js.Function1[/* messageId */ String, Unit]
  ): Unit = js.native
  def unregister(callback: js.Function0[Unit]): Unit = js.native
}

