package typings.pTap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
    	Tap into a promise chain without affecting its value or state. Use this in a `.then()` method.
    	@param tapHandler - Any return value is ignored. Exceptions thrown in `tapHandler` are relayed back to the original promise chain. If `tapHandler` returns a `Promise`, it will be awaited before passing through the original value.
    	@returns A [thunk](https://en.wikipedia.org/wiki/Thunk) that returns a `Promise`.
    	@example
    	```
    	import pTap from 'p-tap';
    	Promise.resolve('unicorn')
    		.then(pTap(console.log)) // Logs `unicorn`
    		.then(value => {
    			// `value` is still `unicorn`
    		});
    	getUser()
    		.then(pTap(user => recordStatsAsync(user))) // Stats are saved about `user` async before the chain continues
    		.then(user => {
    			// `user` is the user from getUser(), not recordStatsAsync()
    		});
    	```
    	*/
    inline def apply[ValueType](tapHandler: js.Function1[/* value */ ValueType, Any]): js.Function1[/* value */ ValueType, js.Promise[ValueType]] = ^.asInstanceOf[js.Dynamic].apply(tapHandler.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ ValueType, js.Promise[ValueType]]]
    
    @JSImport("p-tap", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Tap into a promise chain without affecting its value or state. Use this in a `.catch()` method.
    	@param tapHandler - Any return value is ignored. Exceptions thrown in `tapHandler` are relayed back to the original promise chain. If `tapHandler` returns a `Promise`, it will be awaited before passing through the original value.
    	@returns A [thunk](https://en.wikipedia.org/wiki/Thunk) that returns a `Promise`.
    	@example
    	```
    	import pTap from 'p-tap';
    	Promise.resolve(() => doSomething())
    		.catch(pTap.catch(console.error)) // Prints any errors
    		.then(handleSuccess)
    		.catch(handleError);
    	```
    	*/
    inline def `catch`[ErrorType](tapHandler: js.Function1[/* error */ ErrorType, Any]): js.Function1[/* error */ ErrorType, js.Promise[scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("catch")(tapHandler.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* error */ ErrorType, js.Promise[scala.Nothing]]]
  }
}
