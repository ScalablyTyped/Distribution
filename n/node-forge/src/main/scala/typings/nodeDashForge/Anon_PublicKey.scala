package typings.nodeDashForge

import typings.nodeDashForge.nodeDashForgeMod.pki.ed25519.BinaryBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PublicKey extends js.Object {
  var publicKey: BinaryBuffer
  var signature: BinaryBuffer
}

object Anon_PublicKey {
  @scala.inline
  def apply(publicKey: BinaryBuffer, signature: BinaryBuffer): Anon_PublicKey = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PublicKey]
  }
}

