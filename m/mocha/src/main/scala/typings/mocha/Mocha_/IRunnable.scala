package typings.mocha.Mocha_

import typings.mocha.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Runnable` class. */
/** @deprecated use `Mocha.Runnable` instead. */
@js.native
trait IRunnable extends EventEmitter {
  var async: Boolean = js.native
  var duration: js.UndefOr[Double] = js.native
  /** @deprecated `.fn` has type `Func | AsyncFunc` in `Mocha.Runnable`. */
  var fn: js.UndefOr[js.Function] = js.native
  var sync: Boolean = js.native
  var timedOut: Boolean = js.native
  var title: String = js.native
  def timeout(n: String): this.type = js.native
  /** @deprecated `.timeout()` has additional overloads in `Mocha.Runnable`. */
  def timeout(n: Double): this.type = js.native
}

