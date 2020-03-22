package typings.nodeForge.mod.pki

import typings.node.Buffer
import typings.nodeForge.AnonPrivateKey
import typings.nodeForge.AnonPrivateKeyBinaryBuffer
import typings.nodeForge.AnonPublicKey
import typings.nodeForge.AnonSeed
import typings.nodeForge.mod.util.ByteBuffer
import typings.nodeForge.nodeForgeNumbers.`32`
import typings.nodeForge.nodeForgeNumbers.`64`
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki.ed25519")
@js.native
object ed25519 extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.nodeForge.AnonMessage
    - typings.nodeForge.AnonEncoding
  */
  trait ToNativeBufferParameters extends js.Object
  
  // generateKeyPair does not currently accept `util.ByteBuffer` as the seed.
  def generateKeyPair(): AnonPrivateKey = js.native
  def generateKeyPair(options: AnonSeed): AnonPrivateKey = js.native
  def publicKeyFromPrivateKey(options: AnonPrivateKeyBinaryBuffer): NativeBuffer = js.native
  def sign(options: ToNativeBufferParameters with AnonPrivateKeyBinaryBuffer): NativeBuffer = js.native
  def verify(options: ToNativeBufferParameters with AnonPublicKey): Boolean = js.native
  @js.native
  object constants extends js.Object {
    val HASH_BYTE_LENGTH: `64` = js.native
    val PRIVATE_KEY_BYTE_LENGTH: `64` = js.native
    val PUBLIC_KEY_BYTE_LENGTH: `32` = js.native
    val SEED_BYTE_LENGTH: `32` = js.native
    val SIGN_BYTE_LENGTH: `64` = js.native
  }
  
  // `string`s will be converted by toNativeBuffer with `encoding: 'binary'`
  type BinaryBuffer = NativeBuffer | ByteBuffer | String
  type Key = NativeBuffer
  type NativeBuffer = Buffer | Uint8Array
}

