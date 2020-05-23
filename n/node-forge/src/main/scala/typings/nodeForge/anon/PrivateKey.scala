package typings.nodeForge.anon

import typings.nodeForge.mod.pki.ed25519.NativeBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKey extends js.Object {
  var privateKey: NativeBuffer
  var publicKey: NativeBuffer
}

object PrivateKey {
  @scala.inline
  def apply(privateKey: NativeBuffer, publicKey: NativeBuffer): PrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKey]
  }
}

