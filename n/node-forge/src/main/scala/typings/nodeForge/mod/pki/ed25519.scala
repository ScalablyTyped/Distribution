package typings.nodeForge.mod.pki

import typings.node.Buffer
import typings.nodeForge.anon.PrivateKeyBinaryBuffer
import typings.nodeForge.anon.Seed
import typings.nodeForge.mod.util.ByteBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki.ed25519")
@js.native
object ed25519 extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.nodeForge.anon.Message
    - typings.nodeForge.anon.Encoding
  */
  trait ToNativeBufferParameters extends js.Object
  
  // generateKeyPair does not currently accept `util.ByteBuffer` as the seed.
  def generateKeyPair(): typings.nodeForge.anon.PrivateKey = js.native
  def generateKeyPair(options: Seed): typings.nodeForge.anon.PrivateKey = js.native
  def publicKeyFromPrivateKey(options: PrivateKeyBinaryBuffer): NativeBuffer = js.native
  def sign(options: ToNativeBufferParameters with PrivateKeyBinaryBuffer): NativeBuffer = js.native
  def verify(options: ToNativeBufferParameters with typings.nodeForge.anon.PublicKey): Boolean = js.native
  @js.native
  object constants extends js.Object {
    val HASH_BYTE_LENGTH: /* 64 */ Double = js.native
    val PRIVATE_KEY_BYTE_LENGTH: /* 64 */ Double = js.native
    val PUBLIC_KEY_BYTE_LENGTH: /* 32 */ Double = js.native
    val SEED_BYTE_LENGTH: /* 32 */ Double = js.native
    val SIGN_BYTE_LENGTH: /* 64 */ Double = js.native
  }
  
  // `string`s will be converted by toNativeBuffer with `encoding: 'binary'`
  type BinaryBuffer = NativeBuffer | ByteBuffer | String
  type Key = NativeBuffer
  type NativeBuffer = Buffer | Uint8Array
}

