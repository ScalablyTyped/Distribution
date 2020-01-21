package typings.nodeForge

import typings.nodeForge.mod.pki.ed25519.BinaryBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPublicKey extends js.Object {
  var publicKey: BinaryBuffer
  var signature: BinaryBuffer
}

object AnonPublicKey {
  @scala.inline
  def apply(publicKey: BinaryBuffer, signature: BinaryBuffer): AnonPublicKey = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPublicKey]
  }
}

