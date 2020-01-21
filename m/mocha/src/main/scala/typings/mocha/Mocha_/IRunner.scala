package typings.mocha.Mocha_

import typings.mocha.NodeJS.EventEmitter
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Runner` class. */
/** @deprecated use `Mocha.Runner` instead. */
@js.native
trait IRunner extends EventEmitter {
  var asyncOnly: js.UndefOr[Boolean] = js.native
  var failures: Double = js.native
  var forbidOnly: js.UndefOr[Boolean] = js.native
  var forbidPending: js.UndefOr[Boolean] = js.native
  var fullStackTrace: js.UndefOr[Boolean] = js.native
  var ignoreLeaks: js.UndefOr[Boolean] = js.native
  var started: Boolean = js.native
  var stats: js.UndefOr[IStats] = js.native
  /** @deprecated `.suite` has type `Mocha.Suite` in `Mocha.Runner`. */
  var suite: ISuite = js.native
  var total: Double = js.native
  def abort(): this.type = js.native
  /** @deprecated `.globals()` has different overloads in `Mocha.Runner`. */
  def globals(arr: js.Array[String]): this.type | js.Array[String] = js.native
  def grep(re: RegExp, invert: Boolean): this.type = js.native
  /** @deprecated Parameter `suite` has type `Mocha.Suite` in `Mocha.Runner`. */
  def grepTotal(suite: ISuite): Double = js.native
  def run(): this.type = js.native
  def run(fn: js.Function1[/* failures */ Double, Unit]): this.type = js.native
}

