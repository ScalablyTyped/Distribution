package typings.original

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original", JSImport.Namespace)
@js.native
object originalMod extends js.Object {
  def apply(url: String | js.Object | Anon_Host): String = js.native
  /**
    * Check if the origins are the same.
    *
    * @param a URL or origin of a.
    * @param b URL or origin of b.
    * @returns true if origins are the same, false otherwise
    * @api public
    */
  def same(a: String, b: String): Boolean = js.native
}

