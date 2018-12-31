package typings
package mochaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha/lib/ms", JSImport.Namespace)
@js.native
object libMsMod extends js.Object {
  /**
    * Parse the given `str` and return milliseconds.
    *
    * @see {@link https://mochajs.org/api/module-milliseconds.html}
    * @see {@link https://mochajs.org/api/module-milliseconds.html#~parse}
    */
  def apply(`val`: java.lang.String): scala.Double = js.native
  /**
    * Format for `ms`.
    *
    * @see {@link https://mochajs.org/api/module-milliseconds.html}
    * @see {@link https://mochajs.org/api/module-milliseconds.html#~format}
    */
  def apply(`val`: scala.Double): java.lang.String = js.native
}

