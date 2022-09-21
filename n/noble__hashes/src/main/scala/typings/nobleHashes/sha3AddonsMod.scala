package typings.nobleHashes

import typings.nobleHashes.sha3Mod.Keccak
import typings.nobleHashes.sha3Mod.ShakeOpts
import typings.nobleHashes.utilsMod.Hash
import typings.nobleHashes.utilsMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sha3AddonsMod {
  
  @JSImport("@noble/hashes/sha3-addons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object cshake128 {
    
    inline def apply(msg: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def apply(msg: Input, opts: cShakeOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3-addons", "cshake128")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/sha3-addons", "cshake128.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(opts: cShakeOpts): Hash[Keccak] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[Hash[Keccak]]
    
    @JSImport("@noble/hashes/sha3-addons", "cshake128.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  object cshake256 {
    
    inline def apply(msg: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def apply(msg: Input, opts: cShakeOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3-addons", "cshake256")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/sha3-addons", "cshake256.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(opts: cShakeOpts): Hash[Keccak] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[Hash[Keccak]]
    
    @JSImport("@noble/hashes/sha3-addons", "cshake256.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  object k12 {
    
    inline def apply(msg: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def apply(msg: Input, opts: KangarooOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3-addons", "k12")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/sha3-addons", "k12.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(opts: KangarooOpts): Hash[KangarooTwelve] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[Hash[KangarooTwelve]]
    
    @JSImport("@noble/hashes/sha3-addons", "k12.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  inline def keccakprg(): KeccakPRG_ = ^.asInstanceOf[js.Dynamic].applyDynamic("keccakprg")().asInstanceOf[KeccakPRG_]
  inline def keccakprg(capacity: Double): KeccakPRG_ = ^.asInstanceOf[js.Dynamic].applyDynamic("keccakprg")(capacity.asInstanceOf[js.Any]).asInstanceOf[KeccakPRG_]
  
  object kmac128 {
    
    inline def apply(key: Input, message: Input): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    inline def apply(key: Input, message: Input, opts: cShakeOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], message.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3-addons", "kmac128")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(key: Input): KMAC = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(key.asInstanceOf[js.Any]).asInstanceOf[KMAC]
    inline def create(key: Input, opts: cShakeOpts): KMAC = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(key.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[KMAC]
  }
  
  object kmac128xof {
    
    inline def apply(key: Input, message: Input): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    inline def apply(key: Input, message: Input, opts: cShakeOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], message.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3-addons", "kmac128xof")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(key: Input): KMAC = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(key.asInstanceOf[js.Any]).asInstanceOf[KMAC]
    inline def create(key: Input, opts: cShakeOpts): KMAC = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(key.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[KMAC]
  }
  
  object kmac256 {
    
    inline def apply(key: Input, message: Input): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    inline def apply(key: Input, message: Input, opts: cShakeOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], message.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3-addons", "kmac256")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(key: Input): KMAC = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(key.asInstanceOf[js.Any]).asInstanceOf[KMAC]
    inline def create(key: Input, opts: cShakeOpts): KMAC = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(key.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[KMAC]
  }
  
  object kmac256xof {
    
    inline def apply(key: Input, message: Input): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    inline def apply(key: Input, message: Input, opts: cShakeOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], message.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3-addons", "kmac256xof")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(key: Input): KMAC = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(key.asInstanceOf[js.Any]).asInstanceOf[KMAC]
    inline def create(key: Input, opts: cShakeOpts): KMAC = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(key.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[KMAC]
  }
  
  object m14 {
    
    inline def apply(msg: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def apply(msg: Input, opts: KangarooOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3-addons", "m14")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/sha3-addons", "m14.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(opts: KangarooOpts): Hash[KangarooTwelve] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[Hash[KangarooTwelve]]
    
    @JSImport("@noble/hashes/sha3-addons", "m14.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  object parallelhash128 {
    
    inline def apply(message: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def apply(message: Input, opts: ParallelOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3-addons", "parallelhash128")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): ParallelHash = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ParallelHash]
    inline def create(opts: ParallelOpts): ParallelHash = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[ParallelHash]
  }
  
  object parallelhash128xof {
    
    inline def apply(message: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def apply(message: Input, opts: ParallelOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3-addons", "parallelhash128xof")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): ParallelHash = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ParallelHash]
    inline def create(opts: ParallelOpts): ParallelHash = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[ParallelHash]
  }
  
  object parallelhash256 {
    
    inline def apply(message: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def apply(message: Input, opts: ParallelOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3-addons", "parallelhash256")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): ParallelHash = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ParallelHash]
    inline def create(opts: ParallelOpts): ParallelHash = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[ParallelHash]
  }
  
  object parallelhash256xof {
    
    inline def apply(message: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def apply(message: Input, opts: ParallelOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3-addons", "parallelhash256xof")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): ParallelHash = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ParallelHash]
    inline def create(opts: ParallelOpts): ParallelHash = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[ParallelHash]
  }
  
  object tuplehash128 {
    
    inline def apply(messages: js.Array[Input]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(messages.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def apply(messages: js.Array[Input], opts: cShakeOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(messages.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3-addons", "tuplehash128")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): TupleHash = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TupleHash]
    inline def create(opts: cShakeOpts): TupleHash = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[TupleHash]
  }
  
  object tuplehash128xof {
    
    inline def apply(messages: js.Array[Input]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(messages.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def apply(messages: js.Array[Input], opts: cShakeOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(messages.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3-addons", "tuplehash128xof")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): TupleHash = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TupleHash]
    inline def create(opts: cShakeOpts): TupleHash = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[TupleHash]
  }
  
  object tuplehash256 {
    
    inline def apply(messages: js.Array[Input]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(messages.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def apply(messages: js.Array[Input], opts: cShakeOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(messages.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3-addons", "tuplehash256")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): TupleHash = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TupleHash]
    inline def create(opts: cShakeOpts): TupleHash = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[TupleHash]
  }
  
  object tuplehash256xof {
    
    inline def apply(messages: js.Array[Input]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(messages.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def apply(messages: js.Array[Input], opts: cShakeOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(messages.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha3-addons", "tuplehash256xof")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): TupleHash = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TupleHash]
    inline def create(opts: cShakeOpts): TupleHash = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[TupleHash]
  }
  
  @js.native
  trait KMAC extends Keccak {
    
    def _cloneInto(to: KMAC): KMAC = js.native
  }
  
  trait KangarooOpts extends StObject {
    
    var dkLen: js.UndefOr[Double] = js.undefined
    
    var personalization: js.UndefOr[Input] = js.undefined
  }
  object KangarooOpts {
    
    inline def apply(): KangarooOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KangarooOpts]
    }
    
    extension [Self <: KangarooOpts](x: Self) {
      
      inline def setDkLen(value: Double): Self = StObject.set(x, "dkLen", value.asInstanceOf[js.Any])
      
      inline def setDkLenUndefined: Self = StObject.set(x, "dkLen", js.undefined)
      
      inline def setPersonalization(value: Input): Self = StObject.set(x, "personalization", value.asInstanceOf[js.Any])
      
      inline def setPersonalizationUndefined: Self = StObject.set(x, "personalization", js.undefined)
    }
  }
  
  @js.native
  trait KangarooTwelve extends Keccak {
    
    def _cloneInto(to: KangarooTwelve): KangarooTwelve = js.native
    
    val chunkLen: /* 8192 */ Double = js.native
    
    /* private */ var chunkPos: Any = js.native
    
    /* private */ var chunksDone: Any = js.native
    
    /* private */ var leafHash: Any = js.native
    
    /* protected */ var leafLen: Double = js.native
    
    /* private */ var personalization: Any = js.native
  }
  
  @js.native
  trait KeccakPRG_ extends Keccak {
    
    def _cloneInto(to: KeccakPRG_): KeccakPRG_ = js.native
    
    def feed(data: Input): this.type = js.native
    
    def fetch(bytes: Double): js.typedarray.Uint8Array = js.native
    
    def forget(): Unit = js.native
    
    /* protected */ var rate: Double = js.native
  }
  
  @js.native
  trait ParallelHash extends Keccak {
    
    def _cloneInto(to: ParallelHash): ParallelHash = js.native
    
    /* private */ var chunkLen: Any = js.native
    
    /* private */ var chunkPos: Any = js.native
    
    /* private */ var chunksDone: Any = js.native
    
    /* protected */ def leafCons(): Hash[Keccak] = js.native
    
    /* private */ var leafHash: Any = js.native
  }
  
  trait ParallelOpts
    extends StObject
       with cShakeOpts {
    
    var blockLen: js.UndefOr[Double] = js.undefined
  }
  object ParallelOpts {
    
    inline def apply(): ParallelOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParallelOpts]
    }
    
    extension [Self <: ParallelOpts](x: Self) {
      
      inline def setBlockLen(value: Double): Self = StObject.set(x, "blockLen", value.asInstanceOf[js.Any])
      
      inline def setBlockLenUndefined: Self = StObject.set(x, "blockLen", js.undefined)
    }
  }
  
  @js.native
  trait TupleHash extends Keccak {
    
    def _cloneInto(to: TupleHash): TupleHash = js.native
  }
  
  trait cShakeOpts
    extends StObject
       with ShakeOpts {
    
    var NISTfn: js.UndefOr[Input] = js.undefined
    
    var personalization: js.UndefOr[Input] = js.undefined
  }
  object cShakeOpts {
    
    inline def apply(): cShakeOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[cShakeOpts]
    }
    
    extension [Self <: cShakeOpts](x: Self) {
      
      inline def setNISTfn(value: Input): Self = StObject.set(x, "NISTfn", value.asInstanceOf[js.Any])
      
      inline def setNISTfnUndefined: Self = StObject.set(x, "NISTfn", js.undefined)
      
      inline def setPersonalization(value: Input): Self = StObject.set(x, "personalization", value.asInstanceOf[js.Any])
      
      inline def setPersonalizationUndefined: Self = StObject.set(x, "personalization", js.undefined)
    }
  }
}
