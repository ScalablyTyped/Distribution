package typings.openpgp

import typings.openpgp.mod.ReadableStream
import typings.openpgp.mod.message.Message
import typings.openpgp.mod.signature.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataMessage extends js.Object {
  var data: String | ReadableStream[String]
  var message: Message
  var signature: String | ReadableStream[String] | Signature
}

object AnonDataMessage {
  @scala.inline
  def apply(
    data: String | ReadableStream[String],
    message: Message,
    signature: String | ReadableStream[String] | Signature
  ): AnonDataMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataMessage]
  }
}

