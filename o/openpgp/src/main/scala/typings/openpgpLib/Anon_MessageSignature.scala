package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageSignature extends js.Object {
  var message: openpgpLib.openpgpMod.messageNs.Message
  var signature: openpgpLib.openpgpMod.signatureNs.Signature
}

object Anon_MessageSignature {
  @scala.inline
  def apply(
    message: openpgpLib.openpgpMod.messageNs.Message,
    signature: openpgpLib.openpgpMod.signatureNs.Signature
  ): Anon_MessageSignature = {
    val __obj = js.Dynamic.literal(message = message, signature = signature)
  
    __obj.asInstanceOf[Anon_MessageSignature]
  }
}

