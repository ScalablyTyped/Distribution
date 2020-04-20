package typings.openpgp

import typings.openpgp.mod.signature.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSignatureSignature extends js.Object {
  var signature: Signature
}

object AnonSignatureSignature {
  @scala.inline
  def apply(signature: Signature): AnonSignatureSignature = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSignatureSignature]
  }
}

