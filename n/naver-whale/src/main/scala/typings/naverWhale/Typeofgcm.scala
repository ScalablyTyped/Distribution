package typings.naverWhale

import typings.chrome.chrome.gcm.GcmErrorEvent
import typings.chrome.chrome.gcm.MessageDeletionEvent
import typings.chrome.chrome.gcm.MessageReceptionEvent
import typings.chrome.chrome.gcm.OutgoingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofgcm extends js.Object {
  var MAX_MESSAGE_SIZE: Double
  var onMessage: MessageReceptionEvent
  var onMessagesDeleted: MessageDeletionEvent
  var onSendError: GcmErrorEvent
  def register(senderIds: js.Array[String], callback: js.Function1[/* registrationId */ String, Unit]): Unit
  def send(message: OutgoingMessage, callback: js.Function1[/* messageId */ String, Unit]): Unit
  def unregister(callback: js.Function0[Unit]): Unit
}

object Typeofgcm {
  @scala.inline
  def apply(
    MAX_MESSAGE_SIZE: Double,
    onMessage: MessageReceptionEvent,
    onMessagesDeleted: MessageDeletionEvent,
    onSendError: GcmErrorEvent,
    register: (js.Array[String], js.Function1[/* registrationId */ String, Unit]) => Unit,
    send: (OutgoingMessage, js.Function1[/* messageId */ String, Unit]) => Unit,
    unregister: js.Function0[Unit] => Unit
  ): Typeofgcm = {
    val __obj = js.Dynamic.literal(MAX_MESSAGE_SIZE = MAX_MESSAGE_SIZE.asInstanceOf[js.Any], onMessage = onMessage.asInstanceOf[js.Any], onMessagesDeleted = onMessagesDeleted.asInstanceOf[js.Any], onSendError = onSendError.asInstanceOf[js.Any], register = js.Any.fromFunction2(register), send = js.Any.fromFunction2(send), unregister = js.Any.fromFunction1(unregister))
  
    __obj.asInstanceOf[Typeofgcm]
  }
}

