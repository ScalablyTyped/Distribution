package typings.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureSignature extends js.Object {
  var signature: typings.openpgp.mod.signature.Signature
}

object SignatureSignature {
  @scala.inline
  def apply(signature: typings.openpgp.mod.signature.Signature): SignatureSignature = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureSignature]
  }
}

