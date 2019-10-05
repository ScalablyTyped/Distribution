package typings.openpgp

import typings.openpgp.openpgpMod.message.Message
import typings.openpgp.openpgpMod.signature.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageSignature extends js.Object {
  var message: Message
  var signature: Signature
}

object Anon_MessageSignature {
  @scala.inline
  def apply(message: Message, signature: Signature): Anon_MessageSignature = {
    val __obj = js.Dynamic.literal(message = message, signature = signature)
  
    __obj.asInstanceOf[Anon_MessageSignature]
  }
}

