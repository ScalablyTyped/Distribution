package typings.nobleHashes

import typings.nobleHashes.anon.V0
import typings.nobleHashes.blake2Mod.BLAKE2
import typings.nobleHashes.blake2Mod.BlakeOpts
import typings.nobleHashes.utilsMod.Hash
import typings.nobleHashes.utilsMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blake2sMod {
  
  @JSImport("@noble/hashes/blake2s", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@noble/hashes/blake2s", "IV")
  @js.native
  val IV: js.typedarray.Uint32Array = js.native
  
  object blake2s {
    
    inline def apply(msg: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def apply(msg: Input, opts: BlakeOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/blake2s", "blake2s")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/blake2s", "blake2s.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(opts: BlakeOpts): Hash[BLAKE2s_] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[Hash[BLAKE2s_]]
    
    @JSImport("@noble/hashes/blake2s", "blake2s.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  inline def compress(
    s: js.typedarray.Uint8Array,
    offset: Double,
    msg: js.typedarray.Uint32Array,
    rounds: Double,
    v0: Double,
    v1: Double,
    v2: Double,
    v3: Double,
    v4: Double,
    v5: Double,
    v6: Double,
    v7: Double,
    v8: Double,
    v9: Double,
    v10: Double,
    v11: Double,
    v12: Double,
    v13: Double,
    v14: Double,
    v15: Double
  ): V0 = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(s.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], rounds.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], v8.asInstanceOf[js.Any], v9.asInstanceOf[js.Any], v10.asInstanceOf[js.Any], v11.asInstanceOf[js.Any], v12.asInstanceOf[js.Any], v13.asInstanceOf[js.Any], v14.asInstanceOf[js.Any], v15.asInstanceOf[js.Any])).asInstanceOf[V0]
  
  @js.native
  trait BLAKE2s_ extends BLAKE2[BLAKE2s_] {
    
    /* protected */ def set(v0: Double, v1: Double, v2: Double, v3: Double, v4: Double, v5: Double, v6: Double, v7: Double): Unit = js.native
    
    /* private */ var v0: Any = js.native
    
    /* private */ var v1: Any = js.native
    
    /* private */ var v2: Any = js.native
    
    /* private */ var v3: Any = js.native
    
    /* private */ var v4: Any = js.native
    
    /* private */ var v5: Any = js.native
    
    /* private */ var v6: Any = js.native
    
    /* private */ var v7: Any = js.native
  }
}
