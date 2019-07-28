package typings.nodeDashForge

import typings.nodeDashForge.nodeDashForgeMod.pkiNs.ed25519Ns.NativeBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrivateKeyNativeBuffer extends js.Object {
  var privateKey: NativeBuffer
}

object Anon_PrivateKeyNativeBuffer {
  @scala.inline
  def apply(privateKey: NativeBuffer): Anon_PrivateKeyNativeBuffer = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PrivateKeyNativeBuffer]
  }
}

