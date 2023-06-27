package typings.nobleHashes

import typings.nobleHashes.utilsMod.Hash
import typings.nobleHashes.utilsMod.HashXOF
import typings.nobleHashes.utilsMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sha3Mod {
  
  @JSImport("@noble/hashes/sha3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@noble/hashes/sha3", "Keccak")
  @js.native
  open class Keccak protected () extends HashXOF[Keccak] {
    def this(blockLen: Double, suffix: Double, outputLen: Double) = this()
    def this(blockLen: Double, suffix: Double, outputLen: Double, enableXOF: Boolean) = this()
    def this(blockLen: Double, suffix: Double, outputLen: Double, enableXOF: Boolean, rounds: Double) = this()
    def this(blockLen: Double, suffix: Double, outputLen: Double, enableXOF: Unit, rounds: Double) = this()
    
    /* protected */ var destroyed: Boolean = js.native
    
    /* protected */ var enableXOF: Boolean = js.native
    
    /* protected */ def finish(): Unit = js.native
    
    /* protected */ var finished: Boolean = js.native
    
    /* protected */ def keccak(): Unit = js.native
    
    /* protected */ var pos: Double = js.native
    
    /* protected */ var posOut: Double = js.native
    
    /* protected */ var rounds: Double = js.native
    
    /* protected */ var state: js.typedarray.Uint8Array = js.native
    
    /* protected */ var state32: js.typedarray.Uint32Array = js.native
    
    var suffix: Double = js.native
    
    /* protected */ def writeInto(out: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
  
  object keccak224 {
    
    inline def apply(msg: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3", "keccak_224")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/sha3", "keccak_224.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(): Hash[Keccak] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Hash[Keccak]]
    
    @JSImport("@noble/hashes/sha3", "keccak_224.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  object keccak256 {
    
    inline def apply(msg: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3", "keccak_256")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/sha3", "keccak_256.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(): Hash[Keccak] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Hash[Keccak]]
    
    @JSImport("@noble/hashes/sha3", "keccak_256.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  object keccak384 {
    
    inline def apply(msg: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3", "keccak_384")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/sha3", "keccak_384.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(): Hash[Keccak] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Hash[Keccak]]
    
    @JSImport("@noble/hashes/sha3", "keccak_384.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  object keccak512 {
    
    inline def apply(msg: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3", "keccak_512")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/sha3", "keccak_512.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(): Hash[Keccak] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Hash[Keccak]]
    
    @JSImport("@noble/hashes/sha3", "keccak_512.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  inline def keccakP(s: js.typedarray.Uint32Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("keccakP")(s.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def keccakP(s: js.typedarray.Uint32Array, rounds: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("keccakP")(s.asInstanceOf[js.Any], rounds.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object sha3224 {
    
    inline def apply(msg: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3", "sha3_224")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/sha3", "sha3_224.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(): Hash[Keccak] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Hash[Keccak]]
    
    @JSImport("@noble/hashes/sha3", "sha3_224.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  object sha3256 {
    
    inline def apply(msg: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3", "sha3_256")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/sha3", "sha3_256.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(): Hash[Keccak] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Hash[Keccak]]
    
    @JSImport("@noble/hashes/sha3", "sha3_256.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  object sha3384 {
    
    inline def apply(msg: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3", "sha3_384")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/sha3", "sha3_384.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(): Hash[Keccak] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Hash[Keccak]]
    
    @JSImport("@noble/hashes/sha3", "sha3_384.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  object sha3512 {
    
    inline def apply(msg: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3", "sha3_512")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/sha3", "sha3_512.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(): Hash[Keccak] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Hash[Keccak]]
    
    @JSImport("@noble/hashes/sha3", "sha3_512.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  object shake128 {
    
    inline def apply(msg: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def apply(msg: Input, opts: ShakeOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3", "shake128")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/sha3", "shake128.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(opts: ShakeOpts): HashXOF[HashXOF[Keccak]] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[HashXOF[HashXOF[Keccak]]]
    
    @JSImport("@noble/hashes/sha3", "shake128.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  object shake256 {
    
    inline def apply(msg: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def apply(msg: Input, opts: ShakeOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3", "shake256")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/sha3", "shake256.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(opts: ShakeOpts): HashXOF[HashXOF[Keccak]] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[HashXOF[HashXOF[Keccak]]]
    
    @JSImport("@noble/hashes/sha3", "shake256.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  trait ShakeOpts extends StObject {
    
    var dkLen: js.UndefOr[Double] = js.undefined
  }
  object ShakeOpts {
    
    inline def apply(): ShakeOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShakeOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShakeOpts] (val x: Self) extends AnyVal {
      
      inline def setDkLen(value: Double): Self = StObject.set(x, "dkLen", value.asInstanceOf[js.Any])
      
      inline def setDkLenUndefined: Self = StObject.set(x, "dkLen", js.undefined)
    }
  }
}
