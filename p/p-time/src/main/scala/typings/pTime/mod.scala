package typings.pTime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
    	Measure the time a promise takes to resolve.
    	@param asyncFunction - Promise-returning/async function.
    	@returns A decorated version of `asyncFunction`.
    	@example
    	```
    	import pTime from 'p-time';
    	import execa from 'execa';
    	const promise = pTime(execa)('sleep', ['1']);
    	await promise;
    	console.log(promise.time);
    	//=> 1016
    	```
    	*/
    inline def apply[ArgumentsType /* <: js.Array[Any] */, ReturnType](asyncFunction: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType]]): js.Function1[/* arguments */ ArgumentsType, PromiseWithTime[ReturnType]] = ^.asInstanceOf[js.Dynamic].apply(asyncFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arguments */ ArgumentsType, PromiseWithTime[ReturnType]]]
    
    @JSImport("p-time", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Measure the time a promise takes to resolve. Logs the elapsed time.
    	@param asyncFunction - Promise-returning/async function.
    	@returns A decorated version of `asyncFunction`.
    	*/
    inline def log[ArgumentsType /* <: js.Array[Any] */, ReturnType](asyncFunction: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType]]): js.Function1[/* arguments */ ArgumentsType, PromiseWithTime[ReturnType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(asyncFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arguments */ ArgumentsType, PromiseWithTime[ReturnType]]]
  }
  
  @js.native
  trait PromiseWithTime[ValueType]
    extends js.Promise[ValueType] {
    
    /**
    	The elapsed time in milliseconds.
    	*/
    val time: js.UndefOr[Double] = js.native
  }
}
