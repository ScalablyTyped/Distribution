package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #region Deprecations
/** @deprecated use `Mocha.Context` instead. */
@js.native
trait IContext extends js.Object {
  var test: js.UndefOr[IRunnable] = js.native
  /** @deprecated `.enableTimeouts()` has additional overloads in `Mocha.Context`. */
  /** @deprecated `.enableTimeouts()` returns `this` in `Mocha.Context`. */
  def enableTimeouts(enableTimeouts: scala.Boolean): IContext = js.native
  def retries(): scala.Double = js.native
  /** @deprecated `.retries()` returns `this` in `Mocha.Context`. */
  def retries(retries: scala.Double): IContext = js.native
  def runnable(): js.UndefOr[IRunnable] = js.native
  /** @deprecated `.runnable()` returns `this` in `Mocha.Context`. */
  def runnable(runnable: IRunnable): IContext = js.native
  /** @deprecated `.skip()` returns `never` in `Mocha.Context`. */
  def skip(): IContext = js.native
  /** @deprecated `.slow()` has additional overloads in `Mocha.Context`. */
  /** @deprecated `.slow()` returns `this` in `Mocha.Context`. */
  def slow(slow: scala.Double): IContext = js.native
  def timeout(): scala.Double = js.native
  /** @deprecated `.timeout()` returns `this` in `Mocha.Context`. */
  def timeout(timeout: scala.Double): IContext = js.native
}

