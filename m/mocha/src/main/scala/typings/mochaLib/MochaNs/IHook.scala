package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated use `Mocha.Hook` instead. */
@js.native
trait IHook extends IRunnable {
  /** @deprecated `.ctx` has type `Mocha.Context` in `Mocha.Runnable`. */
  var ctx: js.UndefOr[IContext] = js.native
  /** @deprecated `.parent` has type `Mocha.Suite` in `Mocha.Runnable`. */
  var parent: js.UndefOr[ISuite] = js.native
  var `type`: mochaLib.mochaLibStrings.hook = js.native
  /** @deprecated `.error()` has additional overloads in `Mocha.Hook`. */
  def error(err: nodeLib.Error): scala.Unit = js.native
}

