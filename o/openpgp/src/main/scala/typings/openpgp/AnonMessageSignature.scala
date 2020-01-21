package typings.openpgp

import typings.openpgp.mod.message.Message
import typings.openpgp.mod.signature.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessageSignature extends js.Object {
  var message: Message
  var signature: Signature
}

object AnonMessageSignature {
  @scala.inline
  def apply(message: Message, signature: Signature): AnonMessageSignature = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMessageSignature]
  }
}

