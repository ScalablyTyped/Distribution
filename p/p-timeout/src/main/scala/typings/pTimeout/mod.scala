package typings.pTimeout

import typings.pTimeout.anon.ClearTimeout
import typings.std.Error
import typings.std.Promise
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ValueType, ReturnType](input: PromiseLike[ValueType], options: Options[ReturnType]): ClearablePromise[ValueType | ReturnType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClearablePromise[ValueType | ReturnType]]
  
  @JSImport("p-timeout", "TimeoutError")
  @js.native
  open class TimeoutError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    val name_TimeoutError: typings.pTimeout.pTimeoutStrings.TimeoutError = js.native
  }
  
  @js.native
  trait ClearablePromise[T]
    extends StObject
       with Promise[T] {
    
    /**
    	Clear the timeout.
    	*/
    def clear(): Unit = js.native
  }
  
  trait Options[ReturnType] extends StObject {
    
    /**
    	Custom implementations for the `setTimeout` and `clearTimeout` functions.
    	Useful for testing purposes, in particular to work around [`sinon.useFakeTimers()`](https://sinonjs.org/releases/latest/fake-timers/).
    	@example
    	```
    	import pTimeout from 'p-timeout';
    	import sinon from 'sinon';
    	const originalSetTimeout = setTimeout;
    	const originalClearTimeout = clearTimeout;
    	sinon.useFakeTimers();
    	// Use `pTimeout` without being affected by `sinon.useFakeTimers()`:
    	await pTimeout(doSomething(), {
    		milliseconds: 2000,
    		customTimers: {
    			setTimeout: originalSetTimeout,
    			clearTimeout: originalClearTimeout
    		}
    	});
    	```
    	*/
    val customTimers: js.UndefOr[ClearTimeout] = js.undefined
    
    /**
    	Do something other than rejecting with an error on timeout.
    	You could for example retry:
    	@example
    	```
    	import {setTimeout} from 'node:timers/promises';
    	import pTimeout from 'p-timeout';
    	const delayedPromise = () => setTimeout(200);
    	await pTimeout(delayedPromise(), {
    		milliseconds: 50,
    		fallback: () => {
    			return pTimeout(delayedPromise(), {
    				milliseconds: 300
    			});
    		},
    	});
    	```
    	*/
    var fallback: js.UndefOr[js.Function0[ReturnType | js.Promise[ReturnType]]] = js.undefined
    
    /**
    	Specify a custom error message or error.
    	If you do a custom error, it's recommended to sub-class `pTimeout.TimeoutError`.
    	*/
    var message: js.UndefOr[String | js.Error] = js.undefined
    
    /**
    	Milliseconds before timing out.
    	Passing `Infinity` will cause it to never time out.
    	*/
    var milliseconds: Double
    
    /**
    	You can abort the promise using [`AbortController`](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    	_Requires Node.js 16 or later._
    	@example
    	```
    	import pTimeout from 'p-timeout';
    	import delay from 'delay';
    	const delayedPromise = delay(3000);
    	const abortController = new AbortController();
    	setTimeout(() => {
    		abortController.abort();
    	}, 100);
    	await pTimeout(delayedPromise, {
    		milliseconds: 2000,
    		signal: abortController.signal
    	});
    	```
    	*/
    var signal: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.AbortSignal */ Any
      ] = js.undefined
  }
  object Options {
    
    inline def apply[ReturnType](milliseconds: Double): Options[ReturnType] = {
      val __obj = js.Dynamic.literal(milliseconds = milliseconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[ReturnType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], ReturnType] (val x: Self & Options[ReturnType]) extends AnyVal {
      
      inline def setCustomTimers(value: ClearTimeout): Self = StObject.set(x, "customTimers", value.asInstanceOf[js.Any])
      
      inline def setCustomTimersUndefined: Self = StObject.set(x, "customTimers", js.undefined)
      
      inline def setFallback(value: () => ReturnType | js.Promise[ReturnType]): Self = StObject.set(x, "fallback", js.Any.fromFunction0(value))
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setMessage(value: String | js.Error): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      inline def setSignal(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.AbortSignal */ Any
      ): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
}
