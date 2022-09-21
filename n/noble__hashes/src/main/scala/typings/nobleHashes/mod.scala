package typings.nobleHashes

import typings.nobleHashes.blake2Mod.BLAKE2
import typings.nobleHashes.blake2Mod.BlakeOpts
import typings.nobleHashes.utilsMod.Hash
import typings.nobleHashes.utilsMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object blake2b {
    
    inline def apply(msg: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def apply(msg: Input, opts: BlakeOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/blake2b", "blake2b")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/blake2b", "blake2b.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(opts: BlakeOpts): Hash[BLAKE2b_] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[Hash[BLAKE2b_]]
    
    @JSImport("@noble/hashes/blake2b", "blake2b.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait BLAKE2b_ extends BLAKE2[BLAKE2b_] {
    
    /* protected */ def set(
      v0l: Double,
      v0h: Double,
      v1l: Double,
      v1h: Double,
      v2l: Double,
      v2h: Double,
      v3l: Double,
      v3h: Double,
      v4l: Double,
      v4h: Double,
      v5l: Double,
      v5h: Double,
      v6l: Double,
      v6h: Double,
      v7l: Double,
      v7h: Double
    ): Unit = js.native
    
    /* private */ var v0h: Any = js.native
    
    /* private */ var v0l: Any = js.native
    
    /* private */ var v1h: Any = js.native
    
    /* private */ var v1l: Any = js.native
    
    /* private */ var v2h: Any = js.native
    
    /* private */ var v2l: Any = js.native
    
    /* private */ var v3h: Any = js.native
    
    /* private */ var v3l: Any = js.native
    
    /* private */ var v4h: Any = js.native
    
    /* private */ var v4l: Any = js.native
    
    /* private */ var v5h: Any = js.native
    
    /* private */ var v5l: Any = js.native
    
    /* private */ var v6h: Any = js.native
    
    /* private */ var v6l: Any = js.native
    
    /* private */ var v7h: Any = js.native
    
    /* private */ var v7l: Any = js.native
  }
}
