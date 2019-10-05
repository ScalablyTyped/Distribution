package typings.openpgp.openpgpMod

import typings.openpgp.NodeStream
import typings.openpgp.ReadableStream
import typings.openpgp.openpgpMod.message.Message
import typings.openpgp.openpgpMod.signature.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignResult extends js.Object {
  var data: String | ReadableStream[String] | NodeStream
  var message: Message
  var signature: String | ReadableStream[String] | NodeStream | Signature
}

object SignResult {
  @scala.inline
  def apply(
    data: String | ReadableStream[String] | NodeStream,
    message: Message,
    signature: String | ReadableStream[String] | NodeStream | Signature
  ): SignResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message, signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SignResult]
  }
}

