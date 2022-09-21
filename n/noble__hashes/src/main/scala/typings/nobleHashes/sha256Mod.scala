package typings.nobleHashes

import typings.nobleHashes.sha2Mod.SHA2
import typings.nobleHashes.utilsMod.Hash
import typings.nobleHashes.utilsMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sha256Mod {
  
  object sha256 {
    
    inline def apply(message: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha256", "sha256")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/sha256", "sha256.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(): Hash[SHA256_] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Hash[SHA256_]]
    
    @JSImport("@noble/hashes/sha256", "sha256.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SHA256_ extends SHA2[SHA256_] {
    
    /* private */ var A: Any = js.native
    
    /* private */ var B: Any = js.native
    
    /* private */ var C: Any = js.native
    
    /* private */ var D: Any = js.native
    
    /* private */ var E: Any = js.native
    
    /* private */ var F: Any = js.native
    
    /* private */ var G: Any = js.native
    
    /* private */ var H: Any = js.native
    
    /* protected */ def set(A: Double, B: Double, C: Double, D: Double, E: Double, F: Double, G: Double, H: Double): Unit = js.native
  }
}
