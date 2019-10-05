package typings.nodeDashForge

import typings.nodeDashForge.nodeDashForgeMod.pki.ed25519.NativeBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrivateKey extends js.Object {
  var privateKey: NativeBuffer
  var publicKey: NativeBuffer
}

object Anon_PrivateKey {
  @scala.inline
  def apply(privateKey: NativeBuffer, publicKey: NativeBuffer): Anon_PrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PrivateKey]
  }
}

