package typings.nodeForge.anon

import typings.nodeForge.mod.pki.ed25519.BinaryBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKey extends js.Object {
  var publicKey: BinaryBuffer
  var signature: BinaryBuffer
}

object PublicKey {
  @scala.inline
  def apply(publicKey: BinaryBuffer, signature: BinaryBuffer): PublicKey = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
}

