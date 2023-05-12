package typings.nobleHashes

import typings.nobleHashes.sha2Mod.SHA2
import typings.nobleHashes.utilsMod.Hash
import typings.nobleHashes.utilsMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sha512Mod {
  
  @JSImport("@noble/hashes/sha512", "SHA512")
  @js.native
  open class SHA512_ () extends SHA2[SHA512_] {
    
    var Ah: Double = js.native
    
    var Al: Double = js.native
    
    var Bh: Double = js.native
    
    var Bl: Double = js.native
    
    var Ch: Double = js.native
    
    var Cl: Double = js.native
    
    var Dh: Double = js.native
    
    var Dl: Double = js.native
    
    var Eh: Double = js.native
    
    var El: Double = js.native
    
    var Fh: Double = js.native
    
    var Fl: Double = js.native
    
    var Gh: Double = js.native
    
    var Gl: Double = js.native
    
    var Hh: Double = js.native
    
    var Hl: Double = js.native
    
    /* protected */ def set(
      Ah: Double,
      Al: Double,
      Bh: Double,
      Bl: Double,
      Ch: Double,
      Cl: Double,
      Dh: Double,
      Dl: Double,
      Eh: Double,
      El: Double,
      Fh: Double,
      Fl: Double,
      Gh: Double,
      Gl: Double,
      Hh: Double,
      Hl: Double
    ): Unit = js.native
  }
  
  object sha384 {
    
    inline def apply(message: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha512", "sha384")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/sha512", "sha384.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(): Hash[SHA512_] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Hash[SHA512_]]
    
    @JSImport("@noble/hashes/sha512", "sha384.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  object sha512 {
    
    inline def apply(message: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha512", "sha512")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/sha512", "sha512.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(): Hash[SHA512_] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Hash[SHA512_]]
    
    @JSImport("@noble/hashes/sha512", "sha512.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  object sha512224 {
    
    inline def apply(message: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha512", "sha512_224")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/sha512", "sha512_224.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(): Hash[SHA512_] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Hash[SHA512_]]
    
    @JSImport("@noble/hashes/sha512", "sha512_224.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
  
  object sha512256 {
    
    inline def apply(message: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/hashes/sha512", "sha512_256")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/sha512", "sha512_256.blockLen")
    @js.native
    def blockLen: Double = js.native
    inline def blockLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockLen")(x.asInstanceOf[js.Any])
    
    inline def create(): Hash[SHA512_] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Hash[SHA512_]]
    
    @JSImport("@noble/hashes/sha512", "sha512_256.outputLen")
    @js.native
    def outputLen: Double = js.native
    inline def outputLen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputLen")(x.asInstanceOf[js.Any])
  }
}
