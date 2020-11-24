package typings.mem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mem", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply[FunctionToMemoize /* <: AnyFunction */, CacheKeyType](fn: FunctionToMemoize): FunctionToMemoize = js.native
  def apply[FunctionToMemoize /* <: AnyFunction */, CacheKeyType](fn: FunctionToMemoize, hasCacheKeyCacheMaxAge: Options[FunctionToMemoize, CacheKeyType]): FunctionToMemoize = js.native
  
  /**
    Clear all cached data of a memoized function.
    
    @param fn - Memoized function.
    */
  def clear(fn: AnyFunction): Unit = js.native
}
