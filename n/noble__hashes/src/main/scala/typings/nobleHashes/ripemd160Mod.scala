package typings.nobleHashes

import typings.nobleHashes.sha2Mod.SHA2
import typings.nobleHashes.utilsMod.Hash
import typings.nobleHashes.utilsMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ripemd160Mod {
  
  @JSImport("@noble/hashes/ripemd160", "RIPEMD160")
  @js.native
  open class RIPEMD160_ () extends SHA2[RIPEMD160_] {
    
    /* private */ var h0: Any = js.native
    
    /* private */ var h1: Any = js.native
    
    /* private */ var h2: Any = js.native
    
    /* private */ var h3: Any = js.native
    
    /* private */ var h4: Any = js.native
    
    /* protected */ def set(h0: Double, h1: Double, h2: Double, h3: Double, h4: Double): Unit = js.native
  }
  
  object ripemd160 {
    
    inline def apply(msg: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/ripemd160", "ripemd160")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/ripemd160", "ripemd160.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(): Hash[RIPEMD160_] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Hash[RIPEMD160_]]
    
    @JSImport("@noble/hashes/ripemd160", "ripemd160.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
}
