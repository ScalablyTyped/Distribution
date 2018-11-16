package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated use `Mocha.Suite` instead. */
@js.native
trait ISuiteCallbackContext extends js.Object {
  /** @deprecated `.retries()` has additional overloads in `Mocha.Suite`. */
  def retries(n: scala.Double): this.type = js.native
  /** @deprecated `.slow()` has additional overloads in `Mocha.Suite`. */
  def slow(ms: scala.Double): this.type = js.native
  /** @deprecated `.timeout()` has additional overloads in `Mocha.Suite`. */
  def timeout(ms: java.lang.String): this.type = js.native
  /** @deprecated `.timeout()` has additional overloads in `Mocha.Suite`. */
  def timeout(ms: scala.Double): this.type = js.native
}

