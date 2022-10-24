package typings.multiformats

import typings.multiformats.anon.Encode
import typings.multiformats.distTypesSrcHashesInterfaceMod.MultihashDigest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcHashesHasherMod {
  
  @JSImport("multiformats/dist/types/src/hashes/hasher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("multiformats/dist/types/src/hashes/hasher", "Hasher")
  @js.native
  open class Hasher[Name /* <: String */, Code /* <: Double */] protected ()
    extends StObject
       with typings.multiformats.distTypesSrcHashesInterfaceMod.MultihashHasher[Double] {
    /**
      *
      * @param {Name} name
      * @param {Code} code
      * @param {(input: Uint8Array) => Await<Uint8Array>} encode
      */
    def this(
      name: Name,
      code: Code,
      encode: js.Function1[/* input */ js.typedarray.Uint8Array, Await[js.typedarray.Uint8Array]]
    ) = this()
    
    /**
      * Code of the multihash
      */
    /* CompleteClass */
    var code: Double = js.native
    @JSName("code")
    var code_Hasher: Code = js.native
    
    /**
      * Takes binary `input` and returns it (multi) hash digest. Return value is
      * either promise of a digest or a digest. This way general use can `await`
      * while performance critical code may asses return value to decide whether
      * await is needed.
      *
      * @param {Uint8Array} input
      */
    /* CompleteClass */
    override def digest(input: js.typedarray.Uint8Array): js.Promise[MultihashDigest[Double]] | MultihashDigest[Double] = js.native
    
    def encode(input: js.typedarray.Uint8Array): Await[js.typedarray.Uint8Array] = js.native
    
    /**
      * Name of the multihash
      */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_Hasher: Name = js.native
  }
  
  inline def from[Name /* <: String */, Code /* <: Double */](param0: Encode[Name, Code]): Hasher[Name, Code] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(param0.asInstanceOf[js.Any]).asInstanceOf[Hasher[Name, Code]]
  
  type Await[T] = js.Promise[T] | T
  
  type MultihashHasher[Alg /* <: Double */] = typings.multiformats.distTypesSrcHashesInterfaceMod.MultihashHasher[Double]
}
