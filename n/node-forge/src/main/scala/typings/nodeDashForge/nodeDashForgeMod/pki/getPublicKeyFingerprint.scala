package typings.nodeDashForge.nodeDashForgeMod.pki

import typings.nodeDashForge.nodeDashForgeMod.Bytes
import typings.nodeDashForge.nodeDashForgeMod.Hex
import typings.nodeDashForge.nodeDashForgeMod.util.ByteStringBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki.getPublicKeyFingerprint")
@js.native
object getPublicKeyFingerprint extends js.Object {
  def apply(publicKey: PublicKey): ByteStringBuffer = js.native
  def apply(publicKey: PublicKey, options: BinaryFingerprintOptions): Bytes = js.native
  def apply(publicKey: PublicKey, options: ByteBufferFingerprintOptions): ByteStringBuffer = js.native
  def apply(publicKey: PublicKey, options: HexFingerprintOptions): Hex = js.native
}

