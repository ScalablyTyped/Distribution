package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Suite` class. */
/** @deprecated use `Mocha.Suite` instead. */
@js.native
trait ISuite extends js.Object {
  /** @deprecated `.ctx` has type `Mocha.Context` in `Mocha.Suite`. */
  var ctx: IContext = js.native
  /** @deprecated `.parent` has type `Mocha.Suite | undefined` in `Mocha.Suite`. */
  var parent: js.UndefOr[ISuite] = js.native
  var root: scala.Boolean = js.native
  /** @deprecated `.suites` has type `Mocha.Suite[]` in `Mocha.Suite`. */
  var suites: js.Array[ISuite] = js.native
  /** @deprecated `.tests` has type `Mocha.Test[]` in `Mocha.Suite`. */
  var tests: js.Array[ITest] = js.native
  var title: java.lang.String = js.native
  def bail(): scala.Boolean = js.native
  /** @deprecated `.bail()` returns `this` in `Mocha.Suite`. */
  def bail(bail: scala.Boolean): ISuite = js.native
  def fullTitle(): java.lang.String = js.native
  def retries(): scala.Double = js.native
  /** @deprecated `.retries()` returns `this` in `Mocha.Suite`. */
  def retries(retries: scala.Double): ISuite = js.native
  def slow(): scala.Double = js.native
  /** @deprecated `.slow()` returns `this` in `Mocha.Suite`. */
  def slow(slow: scala.Double): ISuite = js.native
  def timeout(): scala.Double = js.native
  /** @deprecated `.timeout()` returns `this` in `Mocha.Suite`. */
  def timeout(timeout: scala.Double): ISuite = js.native
}

