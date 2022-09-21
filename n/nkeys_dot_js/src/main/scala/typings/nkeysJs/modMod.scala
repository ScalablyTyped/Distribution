package typings.nkeysJs

import typings.nkeysJs.nkeysMod.KeyPair
import typings.nkeysJs.nkeysMod.NKeysErrorCode
import typings.nkeysJs.nkeysMod.Prefix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modMod {
  
  @JSImport("nkeys.js/lib/mod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nkeys.js/lib/mod", "NKeysError")
  @js.native
  open class NKeysError protected ()
    extends typings.nkeysJs.nkeysMod.NKeysError {
    /**
      * @param {NKeysErrorCode} code
      * @param {Error} [chainedError]
      * @constructor
      *
      * @api private
      */
    def this(code: NKeysErrorCode) = this()
    def this(code: NKeysErrorCode, chainedError: js.Error) = this()
  }
  
  @JSImport("nkeys.js/lib/mod", "NKeysErrorCode")
  @js.native
  object NKeysErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nkeysJs.nkeysMod.NKeysErrorCode & String] = js.native
    
    /* "nkeys: api error" */ val ApiError: typings.nkeysJs.nkeysMod.NKeysErrorCode.ApiError & String = js.native
    
    /* "nkeys: cannot sign, no private key available" */ val CannotSign: typings.nkeysJs.nkeysMod.NKeysErrorCode.CannotSign & String = js.native
    
    /* "nkeys: pair is cleared" */ val ClearedPair: typings.nkeysJs.nkeysMod.NKeysErrorCode.ClearedPair & String = js.native
    
    /* "nkeys: invalid checksum" */ val InvalidChecksum: typings.nkeysJs.nkeysMod.NKeysErrorCode.InvalidChecksum & String = js.native
    
    /* "nkeys: invalid encoded key" */ val InvalidEncoding: typings.nkeysJs.nkeysMod.NKeysErrorCode.InvalidEncoding & String = js.native
    
    /* "nkeys: invalid key" */ val InvalidKey: typings.nkeysJs.nkeysMod.NKeysErrorCode.InvalidKey & String = js.native
    
    /* "nkeys: invalid prefix byte" */ val InvalidPrefixByte: typings.nkeysJs.nkeysMod.NKeysErrorCode.InvalidPrefixByte & String = js.native
    
    /* "nkeys: invalid public key" */ val InvalidPublicKey: typings.nkeysJs.nkeysMod.NKeysErrorCode.InvalidPublicKey & String = js.native
    
    /* "nkeys: invalid seed" */ val InvalidSeed: typings.nkeysJs.nkeysMod.NKeysErrorCode.InvalidSeed & String = js.native
    
    /* "nkeys: invalid seed length" */ val InvalidSeedLen: typings.nkeysJs.nkeysMod.NKeysErrorCode.InvalidSeedLen & String = js.native
    
    /* "nkeys: signature verification failed" */ val InvalidSignature: typings.nkeysJs.nkeysMod.NKeysErrorCode.InvalidSignature & String = js.native
    
    /* "nkeys: no seed or private key available" */ val PublicKeyOnly: typings.nkeysJs.nkeysMod.NKeysErrorCode.PublicKeyOnly & String = js.native
    
    /* "nkeys: serialization error" */ val SerializationError: typings.nkeysJs.nkeysMod.NKeysErrorCode.SerializationError & String = js.native
  }
  
  @JSImport("nkeys.js/lib/mod", "Prefix")
  @js.native
  object Prefix extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.nkeysJs.nkeysMod.Prefix & Double] = js.native
    
    /* 0 */ val Account: typings.nkeysJs.nkeysMod.Prefix.Account & Double = js.native
    
    /* 16 */ val Cluster: typings.nkeysJs.nkeysMod.Prefix.Cluster & Double = js.native
    
    /* 112 */ val Operator: typings.nkeysJs.nkeysMod.Prefix.Operator & Double = js.native
    
    /* 120 */ val Private: typings.nkeysJs.nkeysMod.Prefix.Private & Double = js.native
    
    /* 144 */ val Seed: typings.nkeysJs.nkeysMod.Prefix.Seed & Double = js.native
    
    /* 104 */ val Server: typings.nkeysJs.nkeysMod.Prefix.Server & Double = js.native
    
    /* 160 */ val User: typings.nkeysJs.nkeysMod.Prefix.User & Double = js.native
  }
  
  inline def createAccount(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")().asInstanceOf[KeyPair]
  
  inline def createOperator(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("createOperator")().asInstanceOf[KeyPair]
  
  inline def createPair(prefix: Prefix): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("createPair")(prefix.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
  inline def createUser(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("createUser")().asInstanceOf[KeyPair]
  
  inline def decode(b64str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(b64str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encode(bytes: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fromPublic(src: String): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPublic")(src.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
  inline def fromSeed(src: js.typedarray.Uint8Array): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSeed")(src.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
}
