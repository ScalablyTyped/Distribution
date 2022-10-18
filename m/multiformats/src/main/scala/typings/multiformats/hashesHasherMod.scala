package typings.multiformats

import typings.multiformats.anon.Encode
import typings.multiformats.distTypesSrcHashesHasherMod.Await
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object hashesHasherMod {
  
  @JSImport("multiformats/hashes/hasher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("multiformats/hashes/hasher", "Hasher")
  @js.native
  open class Hasher[Name /* <: String */, Code /* <: Double */] protected ()
    extends typings.multiformats.distTypesSrcHashesHasherMod.Hasher[Name, Code] {
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
  }
  
  inline def from[Name /* <: String */, Code /* <: Double */](hasNameCodeEncode: Encode[Name, Code]): typings.multiformats.distTypesSrcHashesHasherMod.Hasher[Name, Code] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(hasNameCodeEncode.asInstanceOf[js.Any]).asInstanceOf[typings.multiformats.distTypesSrcHashesHasherMod.Hasher[Name, Code]]
}
