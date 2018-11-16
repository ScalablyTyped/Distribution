package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated use `Mocha.Context` instead. */
@js.native
trait ITestCallbackContext
  extends /* index */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /** @deprecated `.retries()` has additional overloads in `Mocha.Context`. */
  def retries(n: scala.Double): this.type = js.native
  /** @deprecated `.skip()` returns `never` in `Mocha.Context`. */
  def skip(): this.type = js.native
  /** @deprecated `.slow()` has additional overloads in `Mocha.Context`. */
  def slow(ms: scala.Double): this.type = js.native
  /** @deprecated `.timeout()` has additional overloads in `Mocha.Context`. */
  def timeout(ms: java.lang.String): this.type = js.native
  /** @deprecated `.timeout()` has additional overloads in `Mocha.Context`. */
  def timeout(ms: scala.Double): this.type = js.native
}

