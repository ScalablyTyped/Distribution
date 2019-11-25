package typings.nodeDashForge.nodeDashForgeMod.pki

import typings.node.Buffer
import typings.nodeDashForge.Anon_PrivateKey
import typings.nodeDashForge.Anon_PrivateKeyBinaryBuffer
import typings.nodeDashForge.Anon_PublicKey
import typings.nodeDashForge.Anon_Seed
import typings.nodeDashForge.nodeDashForgeMod.pki.ed25519.NativeBuffer
import typings.nodeDashForge.nodeDashForgeMod.pki.ed25519.ToNativeBufferParameters
import typings.nodeDashForge.nodeDashForgeMod.util.ByteBuffer
import typings.nodeDashForge.nodeDashForgeNumbers.`32`
import typings.nodeDashForge.nodeDashForgeNumbers.`64`
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki.ed25519")
@js.native
object ed25519 extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.nodeDashForge.Anon_Message
    - typings.nodeDashForge.Anon_Binary
  */
  trait ToNativeBufferParameters extends js.Object
  
  // generateKeyPair does not currently accept `util.ByteBuffer` as the seed.
  def generateKeyPair(): Anon_PrivateKey = js.native
  def generateKeyPair(options: Anon_Seed): Anon_PrivateKey = js.native
  def publicKeyFromPrivateKey(options: Anon_PrivateKeyBinaryBuffer): NativeBuffer = js.native
  def sign(options: ToNativeBufferParameters with Anon_PrivateKeyBinaryBuffer): NativeBuffer = js.native
  def verify(options: ToNativeBufferParameters with Anon_PublicKey): Boolean = js.native
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

