package typings.pCatchIf

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Conditional promise catch handler.
  	@param predicate - Specify either an `Error` constructor, array of `Error` constructors, `boolean`, or function that returns a promise for a `boolean` or a `boolean`. If the function returns a promise, it's awaited.
  	@param catchHandler - Called if `predicate` passes. This is what you would normally pass to `.catch()`.
  	@returns A [thunk](https://en.wikipedia.org/wiki/Thunk) that returns a `Promise`.
  	@example
  	```
  	import pCatchIf = require('p-catch-if');
  	// Error constructor
  	getData().catch(pCatchIf(TimeoutError, () => retry(getData)));
  	// Multiple error constructors
  	getData().catch(pCatchIf([NetworkError, TimeoutError], () => retry(getData)));
  	// Boolean
  	getData().catch(pCatchIf(isProduction, error => recordError(error)));
  	// Function
  	const hasUnicornMessage = error => error.message.includes('unicorn');
  	getData().catch(pCatchIf(hasUnicornMessage, console.error));
  	// Promise-returning function
  	const handler = error => sendError(error).then(checkResults);
  	getData().catch(pCatchIf(handler, console.error));
  	// Can also be nested
  	const validateMessage = error => error.message === 'Too many rainbows';
  	getData().catch(pCatchIf(UnicornError, pCatchIf(validateMessage, console.error)));
  	```
  	*/
  inline def apply[T](predicate: Predicate, catchHandler: js.Function1[/* error */ Error, T]): js.Function1[/* error */ Error, T] = (^.asInstanceOf[js.Dynamic].apply(predicate.asInstanceOf[js.Any], catchHandler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* error */ Error, T]]
  
  @JSImport("p-catch-if", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pCatchIf<T>(
  // 	predicate: pCatchIf.Predicate,
  // 	catchHandler: (error: Error) => T
  // ): (error: Error) => T;
  // export = pCatchIf;
  @JSImport("p-catch-if", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pCatchIf */ js.Any = js.native
  inline def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pCatchIf */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @js.native
  trait ErrorConstructor
    extends StObject
       with Instantiable0[Error]
       with Instantiable1[/* message */ String, Error]
  
  type Predicate = ErrorConstructor | js.Array[ErrorConstructor] | Boolean | (js.Function1[/* error */ Error, Boolean | js.Thenable[Boolean]])
}
