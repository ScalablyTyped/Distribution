package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptResult extends js.Object {
  var data: java.lang.String | openpgpLib.ReadableStream[java.lang.String]
  var message: openpgpLib.openpgpMod.messageNs.Message
  var sessionKey: openpgpLib.Anon_AeadAlgorithm
  var signature: java.lang.String | openpgpLib.ReadableStream[java.lang.String] | openpgpLib.openpgpMod.signatureNs.Signature
}

object EncryptResult {
  @scala.inline
  def apply(
    data: java.lang.String | openpgpLib.ReadableStream[java.lang.String],
    message: openpgpLib.openpgpMod.messageNs.Message,
    sessionKey: openpgpLib.Anon_AeadAlgorithm,
    signature: java.lang.String | openpgpLib.ReadableStream[java.lang.String] | openpgpLib.openpgpMod.signatureNs.Signature
  ): EncryptResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message, sessionKey = sessionKey, signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EncryptResult]
  }
}

