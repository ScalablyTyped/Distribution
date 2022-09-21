package typings.nobleHashes

import typings.nobleHashes.sha2Mod.SHA2
import typings.nobleHashes.utilsMod.Hash
import typings.nobleHashes.utilsMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sha1Mod {
  
  object sha1 {
    
    inline def apply(message: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha1", "sha1")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/sha1", "sha1.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(): Hash[SHA1_] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Hash[SHA1_]]
    
    @JSImport("@noble/hashes/sha1", "sha1.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SHA1_ extends SHA2[SHA1_] {
    
    /* private */ var A: Any = js.native
    
    /* private */ var B: Any = js.native
    
    /* private */ var C: Any = js.native
    
    /* private */ var D: Any = js.native
    
    /* private */ var E: Any = js.native
    
    /* protected */ def set(A: Double, B: Double, C: Double, D: Double, E: Double): Unit = js.native
  }
}
