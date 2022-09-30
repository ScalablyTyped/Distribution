package typings.pDebounce

import typings.pDebounce.mod.pDebounce.Options
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
    	[Debounce](https://css-tricks.com/debouncing-throttling-explained-examples/) promise-returning & async functions.
    	@param fn - Promise-returning/async function to debounce.
    	@param wait - Milliseconds to wait before calling `fn`.
    	@returns A function that delays calling `fn` until after `wait` milliseconds have elapsed since the last time it was called.
    	@example
    	```
    	import pDebounce from 'p-debounce';
    	const expensiveCall = async input => input;
    	const debouncedFn = pDebounce(expensiveCall, 200);
    	for (const number of [1, 2, 3]) {
    		console.log(await debouncedFn(number));
    	}
    	//=> 3
    	//=> 3
    	//=> 3
    	```
    	*/
    inline def apply[ArgumentsType /* <: js.Array[Any] */, ReturnType](
      fn: js.Function1[/* arguments */ ArgumentsType, PromiseLike[ReturnType] | ReturnType],
      wait: Double
    ): js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]]]
    inline def apply[ArgumentsType /* <: js.Array[Any] */, ReturnType](
      fn: js.Function1[/* arguments */ ArgumentsType, PromiseLike[ReturnType] | ReturnType],
      wait: Double,
      options: Options
    ): js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]]]
    
    @JSImport("p-debounce", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Execute `function_` unless a previous call is still pending, in which case, return the pending promise. Useful, for example, to avoid processing extra button clicks if the previous one is not complete.
    	@param function_ - Promise-returning/async function to debounce.
    	@example
    	```
    	import {setTimeout as delay} from 'timers/promises';
    	import pDebounce from 'p-debounce';
    	const expensiveCall = async value => {
    		await delay(200);
    		return value;
    	}
    	const debouncedFn = pDebounce.promise(expensiveCall);
    	for (const number of [1, 2, 3]) {
    		console.log(await debouncedFn(number));
    	}
    	//=> 1
    	//=> 2
    	//=> 3
    	```
    	*/
    inline def promise[ArgumentsType /* <: js.Array[Any] */, ReturnType](function_ : js.Function1[/* arguments */ ArgumentsType, PromiseLike[ReturnType] | ReturnType]): js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("promise")(function_.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]]]
  }
  
  object pDebounce {
    
    trait Options extends StObject {
      
      /**
      		Call the `fn` on the [leading edge of the timeout](https://css-tricks.com/debouncing-throttling-explained-examples/#article-header-id-1). Meaning immediately, instead of waiting for `wait` milliseconds.
      		@default false
      		*/
      val before: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setBefore(value: Boolean): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
        
        inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      }
    }
  }
}
