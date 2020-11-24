package typings.nodeForge.mod.pki

import typings.nodeForge.mod.Bytes
import typings.nodeForge.mod.Hex
import typings.nodeForge.mod.util.ByteStringBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-forge", "pki.getPublicKeyFingerprint")
@js.native
object getPublicKeyFingerprint extends js.Object {
  
  def apply(publicKey: PublicKey): ByteStringBuffer = js.native
  def apply(publicKey: PublicKey, options: BinaryFingerprintOptions): Bytes = js.native
  def apply(publicKey: PublicKey, options: ByteBufferFingerprintOptions): ByteStringBuffer = js.native
  def apply(publicKey: PublicKey, options: HexFingerprintOptions): Hex = js.native
}
