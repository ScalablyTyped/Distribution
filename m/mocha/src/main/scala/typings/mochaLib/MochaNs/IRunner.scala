package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Runner` class. */
/** @deprecated use `Mocha.Runner` instead. */
@js.native
trait IRunner
  extends mochaLib.NodeJSNs.EventEmitter {
  var asyncOnly: js.UndefOr[scala.Boolean] = js.native
  var failures: scala.Double = js.native
  var forbidOnly: js.UndefOr[scala.Boolean] = js.native
  var forbidPending: js.UndefOr[scala.Boolean] = js.native
  var fullStackTrace: js.UndefOr[scala.Boolean] = js.native
  var ignoreLeaks: js.UndefOr[scala.Boolean] = js.native
  var started: scala.Boolean = js.native
  var stats: js.UndefOr[IStats] = js.native
  /** @deprecated `.suite` has type `Mocha.Suite` in `Mocha.Runner`. */
  var suite: ISuite = js.native
  var total: scala.Double = js.native
  def abort(): this.type = js.native
  /** @deprecated `.globals()` has different overloads in `Mocha.Runner`. */
  def globals(arr: js.Array[java.lang.String]): this.type | js.Array[java.lang.String] = js.native
  def grep(re: stdLib.RegExp, invert: scala.Boolean): this.type = js.native
  /** @deprecated Parameter `suite` has type `Mocha.Suite` in `Mocha.Runner`. */
  def grepTotal(suite: ISuite): scala.Double = js.native
  def run(): this.type = js.native
  def run(fn: js.Function1[/* failures */ scala.Double, scala.Unit]): this.type = js.native
}

