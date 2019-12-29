package typings.pDashLimit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-limit", JSImport.Namespace)
@js.native
object pDashLimitMod extends js.Object {
  @js.native
  trait Limit extends js.Object {
    /**
    	 * The number of promises that are currently running.
    	 */
    val activeCount: Double = js.native
    /**
    	 * The number of promises that are waiting to run (i.e. their internal `fn` was not called yet).
    	 */
    val pendingCount: Double = js.native
    /**
    	 * @param fn - Promise-returning/async function.
    	 * @param arguments - Any arguments to pass through to `fn`. Support for passing arguments on to the `fn` is provided in order to be able to avoid creating unnecessary closures. You probably don't need this optimization unless you're pushing a lot of functions.
    	 * @returns The promise returned by calling `fn(...arguments)`.
    	 */
    def apply[Arguments /* <: js.Array[_] */, ReturnType](
      fn: js.Function1[/* arguments */ Arguments, js.Thenable[ReturnType] | ReturnType],
      /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param arguments because its type Arguments is not an array type */ arguments: Arguments
    ): js.Promise[ReturnType] = js.native
  }
  
  def default(concurrency: Double): Limit = js.native
}

