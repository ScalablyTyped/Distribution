package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataMessage extends js.Object {
  var data: java.lang.String | ReadableStream[java.lang.String]
  var message: openpgpLib.openpgpMod.messageNs.Message
  var signature: java.lang.String | ReadableStream[java.lang.String] | openpgpLib.openpgpMod.signatureNs.Signature
}

object Anon_DataMessage {
  @scala.inline
  def apply(
    data: java.lang.String | ReadableStream[java.lang.String],
    message: openpgpLib.openpgpMod.messageNs.Message,
    signature: java.lang.String | ReadableStream[java.lang.String] | openpgpLib.openpgpMod.signatureNs.Signature
  ): Anon_DataMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message, signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataMessage]
  }
}

