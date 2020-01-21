package typings.nodeForge.mod.ssh

import typings.nodeForge.mod.Hex
import typings.nodeForge.mod.pki.PublicKey
import typings.nodeForge.mod.util.ByteStringBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "ssh.getPublicKeyFingerprint")
@js.native
object getPublicKeyFingerprint extends js.Object {
  /**
    * @description Gets the SSH fingerprint for the given public key
    */
  def apply(publicKey: PublicKey): ByteStringBuffer | Hex | String = js.native
  def apply(publicKey: PublicKey, options: FingerprintOptions): ByteStringBuffer | Hex | String = js.native
}

