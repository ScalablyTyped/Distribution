package typings
package pDashLimitLib.pDashLimitMod.pLimitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Limit extends js.Object {
  /**
    * The number of promises that are currently running.
    */
  val activeCount: scala.Double = js.native
  /**
    * The number of promises that are waiting to run (i.e. their internal `fn` was not called yet).
    */
  val pendingCount: scala.Double = js.native
  /**
    * Returns the promise returned by calling `fn(...args)`.
    *
    * @param fn Promise-returning/async function.
    * @param args Any arguments to pass through to `fn`.
    * Support for passing arguments on to the `fn` is provided in order to be able to avoid
    * creating unnecessary closures. You probably don't need this optimization unless you're
    * pushing a lot of functions.
    */
  def apply[TArgs /* <: js.Array[_] */, R](
    fn: js.Function1[/* args */ TArgs, js.Thenable[R] | R],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): js.Promise[R] = js.native
}

