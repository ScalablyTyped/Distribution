package typings.multiformats

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object digestMod {
  
  @JSImport("multiformats/types/src/hashes/digest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("multiformats/types/src/hashes/digest", "Digest")
  @js.native
  open class Digest[Code /* <: Double */, Size /* <: Double */] protected ()
    extends StObject
       with typings.multiformats.hashesInterfaceMod.MultihashDigest[Double] {
    /**
      * Creates a multihash digest.
      * @param {Code} code
      * @param {Size} size
      * @param {Uint8Array} digest
      * @param {Uint8Array} bytes
      */
    def this(code: Code, size: Size, digest: js.typedarray.Uint8Array, bytes: js.typedarray.Uint8Array) = this()
    
    /**
      * Binary representation of this multihash digest.
      */
    /* CompleteClass */
    var bytes: js.typedarray.Uint8Array = js.native
    
    /**
      * Code of the multihash
      */
    /* CompleteClass */
    var code: Double = js.native
    @JSName("code")
    var code_Digest: Code = js.native
    
    /**
      * Raw digest (without a hashing algorithm info)
      */
    /* CompleteClass */
    var digest: js.typedarray.Uint8Array = js.native
    
    /**
      * byte length of the `this.digest`
      */
    /* CompleteClass */
    var size: Double = js.native
    @JSName("size")
    var size_Digest: Size = js.native
  }
  
  inline def create[Code /* <: Double */](code: Code, digest: js.typedarray.Uint8Array): Digest[Code, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(code.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Digest[Code, Double]]
  
  inline def decode(multihash: js.typedarray.Uint8Array): MultihashDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(multihash.asInstanceOf[js.Any]).asInstanceOf[MultihashDigest]
  
  inline def equals_(a: MultihashDigest, b: MultihashDigest): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type MultihashDigest = typings.multiformats.hashesInterfaceMod.MultihashDigest[Double]
}
