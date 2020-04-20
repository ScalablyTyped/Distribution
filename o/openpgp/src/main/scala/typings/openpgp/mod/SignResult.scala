package typings.openpgp.mod

import typings.openpgp.mod.message.Message
import typings.openpgp.mod.signature.Signature
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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignResult]
  }
}

