package typings.nobleHashes

import typings.nobleHashes.blake2Mod.BLAKE2
import typings.nobleHashes.utilsMod.Hash
import typings.nobleHashes.utilsMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blake3Mod {
  
  object blake3 {
    
    inline def apply(msg: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def apply(msg: Input, opts: Blake3Opts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/blake3", "blake3")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/blake3", "blake3.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(opts: Blake3Opts): Hash[BLAKE3_] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[Hash[BLAKE3_]]
    
    @JSImport("@noble/hashes/blake3", "blake3.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.nobleHashes.utilsMod.Hash because Already inherited
  - typings.nobleHashes.utilsMod.HashXOF because var conflicts: blockLen, outputLen. Inlined xof, xofInto */ @js.native
  trait BLAKE3_ extends BLAKE2[BLAKE3_] {
    
    /* private */ var IV: Any = js.native
    
    /* private */ var b2Compress: Any = js.native
    
    /* private */ var b2CompressOut: Any = js.native
    
    /* private */ var bufferOut: Any = js.native
    
    /* private */ var bufferOut32: Any = js.native
    
    /* private */ var chunkOut: Any = js.native
    
    /* private */ var chunkPos: Any = js.native
    
    /* private */ var chunksDone: Any = js.native
    
    /* protected */ def compress(buf: js.typedarray.Uint32Array): Unit = js.native
    /* protected */ def compress(buf: js.typedarray.Uint32Array, bufPos: Double): Unit = js.native
    /* protected */ def compress(buf: js.typedarray.Uint32Array, bufPos: Unit, isLast: Boolean): Unit = js.native
    
    /* private */ var enableXOF: Any = js.native
    
    /* protected */ def finish(): Unit = js.native
    
    /* private */ var flags: Any = js.native
    
    /* private */ var posOut: Any = js.native
    
    /* protected */ def set(): Unit = js.native
    
    /* private */ var stack: Any = js.native
    
    /* private */ var state: Any = js.native
    
    /* private */ var writeInto: Any = js.native
    
    def xof(bytes: Double): js.typedarray.Uint8Array = js.native
    
    def xofInto(out: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
  
  trait Blake3Opts extends StObject {
    
    var context: js.UndefOr[Input] = js.undefined
    
    var dkLen: js.UndefOr[Double] = js.undefined
    
    var key: js.UndefOr[Input] = js.undefined
  }
  object Blake3Opts {
    
    inline def apply(): Blake3Opts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Blake3Opts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Blake3Opts] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Input): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDkLen(value: Double): Self = StObject.set(x, "dkLen", value.asInstanceOf[js.Any])
      
      inline def setDkLenUndefined: Self = StObject.set(x, "dkLen", js.undefined)
      
      inline def setKey(value: Input): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}
