package typings.multiformats

import typings.multiformats.distTypesSrcHashesDigestMod.MultihashDigest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object hashesDigestMod {
  
  @JSImport("multiformats/hashes/digest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("multiformats/hashes/digest", "Digest")
  @js.native
  open class Digest[Code /* <: Double */, Size /* <: Double */] protected ()
    extends typings.multiformats.distTypesSrcHashesDigestMod.Digest[Code, Size] {
    /**
      * Creates a multihash digest.
      *
      * @param {Code} code
      * @param {Size} size
      * @param {Uint8Array} digest
      * @param {Uint8Array} bytes
      */
    def this(code: Code, size: Size, digest: js.typedarray.Uint8Array, bytes: js.typedarray.Uint8Array) = this()
  }
  
  inline def create[Code /* <: Double */](code: Code, digest: js.typedarray.Uint8Array): typings.multiformats.distTypesSrcHashesDigestMod.Digest[Code, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(code.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[typings.multiformats.distTypesSrcHashesDigestMod.Digest[Code, Double]]
  
  inline def decode(multihash: js.typedarray.Uint8Array): MultihashDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(multihash.asInstanceOf[js.Any]).asInstanceOf[MultihashDigest]
  
  inline def equals_(a: MultihashDigest, b: Any): /* is multiformats.multiformats/dist/types/src/hashes/interface.MultihashDigest<number> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[/* is multiformats.multiformats/dist/types/src/hashes/interface.MultihashDigest<number> */ Boolean]
}
