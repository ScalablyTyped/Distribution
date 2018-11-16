package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Runnable` class. */
/** @deprecated use `Mocha.Runnable` instead. */
@js.native
trait IRunnable
  extends mochaLib.NodeJSNs.EventEmitter {
  var async: scala.Boolean = js.native
  var duration: js.UndefOr[scala.Double] = js.native
  /** @deprecated `.fn` has type `Func | AsyncFunc` in `Mocha.Runnable`. */
  var fn: js.UndefOr[js.Function] = js.native
  var sync: scala.Boolean = js.native
  var timedOut: scala.Boolean = js.native
  var title: java.lang.String = js.native
  /** @deprecated `.timeout()` has additional overloads in `Mocha.Runnable`. */
  def timeout(n: java.lang.String): this.type = js.native
  /** @deprecated `.timeout()` has additional overloads in `Mocha.Runnable`. */
  def timeout(n: scala.Double): this.type = js.native
}

