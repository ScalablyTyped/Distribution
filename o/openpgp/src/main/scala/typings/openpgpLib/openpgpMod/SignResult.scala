package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignResult extends js.Object {
  var data: java.lang.String | openpgpLib.ReadableStream[java.lang.String] | openpgpLib.NodeStream
  var message: openpgpLib.openpgpMod.messageNs.Message
  var signature: java.lang.String | openpgpLib.ReadableStream[java.lang.String] | openpgpLib.NodeStream | openpgpLib.openpgpMod.signatureNs.Signature
}

object SignResult {
  @scala.inline
  def apply(
    data: java.lang.String | openpgpLib.ReadableStream[java.lang.String] | openpgpLib.NodeStream,
    message: openpgpLib.openpgpMod.messageNs.Message,
    signature: java.lang.String | openpgpLib.ReadableStream[java.lang.String] | openpgpLib.NodeStream | openpgpLib.openpgpMod.signatureNs.Signature
  ): SignResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message, signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SignResult]
  }
}

