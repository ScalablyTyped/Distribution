package typings.plottable.memoizeMemoizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  def doLocked[T](fn: js.Function0[T]): T = js.native
  
  /**
    * Turn on perf logging. Useful for debugging.
    */
  def logPerformance(): this.type = js.native
}
object IMemoizedFunctionMethods {
  
  @scala.inline
  def apply(doLocked: js.Function0[js.Any] => js.Any, logPerformance: () => IMemoizedFunctionMethods): IMemoizedFunctionMethods = {
    val __obj = js.Dynamic.literal(doLocked = js.Any.fromFunction1(doLocked), logPerformance = js.Any.fromFunction0(logPerformance))
    __obj.asInstanceOf[IMemoizedFunctionMethods]
  }
  
  @scala.inline
  implicit class IMemoizedFunctionMethodsOps[Self <: IMemoizedFunctionMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDoLocked(value: js.Function0[js.Any] => js.Any): Self = this.set("doLocked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLogPerformance(value: () => IMemoizedFunctionMethods): Self = this.set("logPerformance", js.Any.fromFunction0(value))
  }
}
