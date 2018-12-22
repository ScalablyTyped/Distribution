package typings
package originalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original", JSImport.Namespace)
@js.native
object originalMod extends js.Object {
  def apply(url: java.lang.String | js.Object | originalLib.Anon_Host): java.lang.String = js.native
  /**
       * Check if the origins are the same.
       *
       * @param a URL or origin of a.
       * @param b URL or origin of b.
       * @returns true if origins are the same, false otherwise
       * @api public
       */
  def same(a: java.lang.String, b: java.lang.String): scala.Boolean = js.native
}

