package typings.pLog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
    	Log the value of a promise. Use this in a `.then()` method.
    	@param logger - The logger to use. Any return value or exception is ignored. Default: `console.log`.
    	@returns A [thunk](https://en.wikipedia.org/wiki/Thunk) that returns a `Promise`.
    	@example
    	```
    	import pLog from 'p-log';
    	Promise.resolve('unicorn')
    		.then(pLog()) // Logs `unicorn`
    		.then(value => {
    			// `value` is still `unicorn`
    		});
    	```
    	*/
    inline def apply[ValueType](): js.Function1[/* value */ ValueType, js.Promise[ValueType]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function1[/* value */ ValueType, js.Promise[ValueType]]]
    inline def apply[ValueType](logger: Logger[ValueType]): js.Function1[/* value */ ValueType, js.Promise[ValueType]] = ^.asInstanceOf[js.Dynamic].apply(logger.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ ValueType, js.Promise[ValueType]]]
    
    @JSImport("p-log", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Log the error of a promise. Use this in a `.catch()` method.
    	@param logger - The logger to use. Any return value or exception is ignored. Default: `console.log`.
    	@returns A [thunk](https://en.wikipedia.org/wiki/Thunk) that returns a `Promise`.
    	@example
    	```
    	import pLog from 'p-log';
    	Promise.resolve()
    		.then(() => {
    			throw new Error('pony');
    		})
    		.catch(pLog.catch()) // Logs `Error: pony`
    		.catch(error => {
    			// `error` is still `Error: pony`
    		});
    	```
    	*/
    inline def `catch`(): js.Function1[/* error */ Any, js.Promise[scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("catch")().asInstanceOf[js.Function1[/* error */ Any, js.Promise[scala.Nothing]]]
    inline def `catch`(logger: Logger[Any]): js.Function1[/* error */ Any, js.Promise[scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("catch")(logger.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* error */ Any, js.Promise[scala.Nothing]]]
  }
  
  type Logger[T] = js.Function1[/* message */ T, Unit]
}
