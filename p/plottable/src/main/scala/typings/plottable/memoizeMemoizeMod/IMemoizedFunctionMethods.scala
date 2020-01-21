package typings.plottable.memoizeMemoizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMemoizedFunctionMethods extends js.Object {
  /**
    * Lock the memoization to always return the cached
    * property during the duration of fn. This lets you
    * bypass the performance hit of signing when you
    * know the fn will not mutate the inputs.
    *
    * Be sure to force the memoization to the value
    * you want before calling this!
    *
    * @param fn
    */
  def doLocked[T](fn: js.Function0[T]): T
  /**
    * Turn on perf logging. Useful for debugging.
    */
  def logPerformance(): this.type
}

object IMemoizedFunctionMethods {
  @scala.inline
  def apply(doLocked: js.Function0[js.Any] => js.Any, logPerformance: () => IMemoizedFunctionMethods): IMemoizedFunctionMethods = {
    val __obj = js.Dynamic.literal(doLocked = js.Any.fromFunction1(doLocked), logPerformance = js.Any.fromFunction0(logPerformance))
  
    __obj.asInstanceOf[IMemoizedFunctionMethods]
  }
}

