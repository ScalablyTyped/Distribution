package typings.mocha.Mocha_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated use `Mocha.Suite` instead. */
@js.native
trait ISuiteCallbackContext extends js.Object {
  /** @deprecated `.retries()` has additional overloads in `Mocha.Suite`. */
  def retries(n: Double): this.type = js.native
  /** @deprecated `.slow()` has additional overloads in `Mocha.Suite`. */
  def slow(ms: Double): this.type = js.native
  def timeout(ms: String): this.type = js.native
  /** @deprecated `.timeout()` has additional overloads in `Mocha.Suite`. */
  def timeout(ms: Double): this.type = js.native
}

