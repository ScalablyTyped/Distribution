package typings
package nodeDashForgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrivateKeyNativeBuffer extends js.Object {
  var privateKey: nodeDashForgeLib.nodeDashForgeMod.pkiNs.ed25519Ns.NativeBuffer
}

object Anon_PrivateKeyNativeBuffer {
  @scala.inline
  def apply(privateKey: nodeDashForgeLib.nodeDashForgeMod.pkiNs.ed25519Ns.NativeBuffer): Anon_PrivateKeyNativeBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PrivateKeyNativeBuffer]
  }
}

