package typings.nodeForge

import typings.nodeForge.mod.pki.ed25519.NativeBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrivateKey extends js.Object {
  var privateKey: NativeBuffer
  var publicKey: NativeBuffer
}

object AnonPrivateKey {
  @scala.inline
  def apply(privateKey: NativeBuffer, publicKey: NativeBuffer): AnonPrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPrivateKey]
  }
}

