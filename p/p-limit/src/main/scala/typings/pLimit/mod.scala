package typings.pLimit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Run multiple promise-returning & async functions with limited concurrency.
  @param concurrency - Concurrency limit. Minimum: `1`.
  @returns A `limit` function.
  */
  @scala.inline
  def apply(concurrency: Double): Limit = ^.asInstanceOf[js.Dynamic].apply(concurrency.asInstanceOf[js.Any]).asInstanceOf[Limit]
  
  @JSImport("p-limit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Limit extends StObject {
    
    /**
    		@param fn - Promise-returning/async function.
    		@param arguments - Any arguments to pass through to `fn`. Support for passing arguments on to the `fn` is provided in order to be able to avoid creating unnecessary closures. You probably don't need this optimization unless you're pushing a lot of functions.
    		@returns The promise returned by calling `fn(...arguments)`.
    		*/
    def apply[Arguments /* <: js.Array[js.Any] */, ReturnType](
      fn: js.Function1[/* arguments */ Arguments, js.Thenable[ReturnType] | ReturnType],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arguments because its type Arguments is not an array type */ arguments: Arguments
    ): js.Promise[ReturnType] = js.native
    
    /**
    		The number of promises that are currently running.
    		*/
    val activeCount: Double = js.native
    
    /**
    		Discard pending promises that are waiting to run.
    		This might be useful if you want to teardown the queue at the end of your program's lifecycle or discard any function calls referencing an intermediary state of your app.
    		Note: This does not cancel promises that are already running.
    		*/
    def clearQueue(): Unit = js.native
    
    /**
    		The number of promises that are waiting to run (i.e. their internal `fn` was not called yet).
    		*/
    val pendingCount: Double = js.native
  }
}
