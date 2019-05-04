package typings
package atPhosphorCoreutilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/coreutils/lib/uuid", JSImport.Namespace)
@js.native
object libUuidMod extends js.Object {
  @JSName("UUID")
  @js.native
  object UUIDNs extends js.Object {
    /**
      * A function which generates UUID v4 identifiers.
      *
      * @returns A new UUID v4 string.
      *
      * #### Notes
      * This implementation complies with RFC 4122.
      *
      * This uses `Random.getRandomValues()` for random bytes, which in
      * turn will use the underlying `crypto` module of the platform if
      * it is available. The fallback for randomness is `Math.random`.
      */
    def uuid4(): java.lang.String = js.native
  }
  
}

