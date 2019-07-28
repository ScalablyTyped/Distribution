package typings.openpgp

import typings.openpgp.openpgpMod.messageNs.Message
import typings.openpgp.openpgpMod.signatureNs.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataMessage extends js.Object {
  var data: String | ReadableStream[String]
  var message: Message
  var signature: String | ReadableStream[String] | Signature
}

object Anon_DataMessage {
  @scala.inline
  def apply(
    data: String | ReadableStream[String],
    message: Message,
    signature: String | ReadableStream[String] | Signature
  ): Anon_DataMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message, signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataMessage]
  }
}

