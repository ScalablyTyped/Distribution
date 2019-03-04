package typings
package nodeDashForgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrivateKey extends js.Object {
  var privateKey: nodeDashForgeLib.nodeDashForgeMod.pkiNs.ed25519Ns.NativeBuffer
  var publicKey: nodeDashForgeLib.nodeDashForgeMod.pkiNs.ed25519Ns.NativeBuffer
}

object Anon_PrivateKey {
  @scala.inline
  def apply(
    privateKey: nodeDashForgeLib.nodeDashForgeMod.pkiNs.ed25519Ns.NativeBuffer,
    publicKey: nodeDashForgeLib.nodeDashForgeMod.pkiNs.ed25519Ns.NativeBuffer
  ): Anon_PrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PrivateKey]
  }
}

