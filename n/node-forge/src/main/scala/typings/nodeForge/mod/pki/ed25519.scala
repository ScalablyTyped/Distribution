package typings.nodeForge.mod.pki

import typings.node.bufferMod.global.Buffer
import typings.nodeForge.anon.PrivateKeyBinaryBuffer
import typings.nodeForge.anon.PrivateKeyBytes
import typings.nodeForge.anon.Seed
import typings.nodeForge.mod.asn1.Asn1
import typings.nodeForge.mod.md.MessageDigest
import typings.nodeForge.mod.util.ByteBuffer
import typings.nodeForge.nodeForgeStrings.binary
import typings.nodeForge.nodeForgeStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ed25519 {
  
  @JSImport("node-forge", "pki.ed25519")
  @js.native
  val ^ : js.Any = js.native
  
  object constants {
    
    @JSImport("node-forge", "pki.ed25519.constants.HASH_BYTE_LENGTH")
    @js.native
    val HASH_BYTE_LENGTH: /* 64 */ Double = js.native
    
    @JSImport("node-forge", "pki.ed25519.constants.PRIVATE_KEY_BYTE_LENGTH")
    @js.native
    val PRIVATE_KEY_BYTE_LENGTH: /* 64 */ Double = js.native
    
    @JSImport("node-forge", "pki.ed25519.constants.PUBLIC_KEY_BYTE_LENGTH")
    @js.native
    val PUBLIC_KEY_BYTE_LENGTH: /* 32 */ Double = js.native
    
    @JSImport("node-forge", "pki.ed25519.constants.SEED_BYTE_LENGTH")
    @js.native
    val SEED_BYTE_LENGTH: /* 32 */ Double = js.native
    
    @JSImport("node-forge", "pki.ed25519.constants.SIGN_BYTE_LENGTH")
    @js.native
    val SIGN_BYTE_LENGTH: /* 64 */ Double = js.native
  }
  
  // generateKeyPair does not currently accept `util.ByteBuffer` as the seed.
  inline def generateKeyPair(): typings.nodeForge.anon.PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")().asInstanceOf[typings.nodeForge.anon.PrivateKey]
  inline def generateKeyPair(options: Seed): typings.nodeForge.anon.PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(options.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.anon.PrivateKey]
  
  inline def privateKeyFromAsn1(obj: Asn1): PrivateKeyBytes = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyFromAsn1")(obj.asInstanceOf[js.Any]).asInstanceOf[PrivateKeyBytes]
  
  inline def publicKeyFromAsn1(obj: Asn1): NativeBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyFromAsn1")(obj.asInstanceOf[js.Any]).asInstanceOf[NativeBuffer]
  
  inline def publicKeyFromPrivateKey(options: PrivateKeyBinaryBuffer): NativeBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyFromPrivateKey")(options.asInstanceOf[js.Any]).asInstanceOf[NativeBuffer]
  
  inline def sign(options: ToNativeBufferParameters & PrivateKeyBinaryBuffer): NativeBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any]).asInstanceOf[NativeBuffer]
  
  inline def verify(options: ToNativeBufferParameters & typings.nodeForge.anon.PublicKey): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  // `string`s will be converted by toNativeBuffer with `encoding: 'binary'`
  type BinaryBuffer = NativeBuffer | ByteBuffer | String
  
  type Key = NativeBuffer
  
  type NativeBuffer = Buffer | js.typedarray.Uint8Array
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeForge.anon.Md
    - typings.nodeForge.anon.Message
    - typings.nodeForge.anon.Encoding
  */
  trait ToNativeBufferParameters extends StObject
  object ToNativeBufferParameters {
    
    inline def Encoding(encoding: binary | utf8, message: String): typings.nodeForge.anon.Encoding = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeForge.anon.Encoding]
    }
    
    inline def Md(md: MessageDigest): typings.nodeForge.anon.Md = {
      val __obj = js.Dynamic.literal(md = md.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeForge.anon.Md]
    }
    
    inline def Message(message: NativeBuffer | ByteBuffer): typings.nodeForge.anon.Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeForge.anon.Message]
    }
  }
}
