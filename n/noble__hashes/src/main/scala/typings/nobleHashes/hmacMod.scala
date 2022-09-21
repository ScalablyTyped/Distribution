package typings.nobleHashes

import typings.nobleHashes.utilsMod.CHash
import typings.nobleHashes.utilsMod.Hash
import typings.nobleHashes.utilsMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hmacMod {
  
  object hmac {
    
    inline def apply(hash: CHash, key: Input, message: Input): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/hmac", "hmac")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(hash: CHash, key: Input): HMAC_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[HMAC_[Any]]
  }
  
  @js.native
  trait HMAC_[T /* <: Hash[T] */] extends Hash[HMAC_[T]] {
    
    /* private */ var destroyed: Any = js.native
    
    /* private */ var finished: Any = js.native
    
    var iHash: T = js.native
    
    var oHash: T = js.native
  }
}
