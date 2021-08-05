package typings.pRetry

import org.scalablytyped.runtime.Instantiable1
import typings.retry.mod.OperationOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Returns a `Promise` that is fulfilled when calling `input` returns a fulfilled promise. If calling `input` returns a rejected promise, `input` is called again until the max retries are reached, it then rejects with the last rejection reason.
  	It doesn't retry on `TypeError` as that's a user error.
  	@param input - Receives the number of attempts as the first argument and is expected to return a `Promise` or any value.
  	@param options - Options are passed to the [`retry`](https://github.com/tim-kos/node-retry#retryoperationoptions) module.
  	@example
  	```
  	import pRetry = require('p-retry');
  	import fetch from 'node-fetch';
  	const run = async () => {
  		const response = await fetch('https://sindresorhus.com/unicorn');
  		// Abort retrying if the resource doesn't exist
  		if (response.status === 404) {
  			throw new pRetry.AbortError(response.statusText);
  		}
  		return response.blob();
  	};
  	(async () => {
  		console.log(await pRetry(run, {retries: 5}));
  		// With the `onFailedAttempt` option:
  		const result = await pRetry(run, {
  			onFailedAttempt: error => {
  				console.log(`Attempt ${error.attemptNumber} failed. There are ${error.retriesLeft} retries left.`);
  				// 1st request => Attempt 1 failed. There are 4 retries left.
  				// 2nd request => Attempt 2 failed. There are 3 retries left.
  				// …
  			},
  			retries: 5
  		});
  		console.log(result);
  	})();
  	```
  	*/
  inline def apply[T](input: js.Function1[/* attemptCount */ Double, js.Thenable[T] | T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def apply[T](input: js.Function1[/* attemptCount */ Double, js.Thenable[T] | T], options: Options): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @JSImport("p-retry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: remove this in the next major version
  @JSImport("p-retry", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pRetry */ js.Any = js.native
  
  @JSImport("p-retry", "AbortError")
  @js.native
  def AbortError: Instantiable1[/* message */ String | Error, AbortErrorClass] = js.native
  type AbortError = AbortErrorClass
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("p-retry", "AbortError")
  @js.native
  class AbortErrorCls protected ()
    extends StObject
       with AbortErrorClass {
    /**
    	Abort retrying and reject the promise.
    	@param message - Error message or custom error.
    	*/
    def this(message: String) = this()
    def this(message: Error) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override val name_AbortErrorClass: typings.pRetry.pRetryStrings.AbortError = js.native
    
    /* CompleteClass */
    override val originalError: Error = js.native
  }
  
  inline def AbortError_=(x: Instantiable1[/* message */ String | Error, AbortErrorClass]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AbortError")(x.asInstanceOf[js.Any])
  
  inline def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pRetry */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait AbortErrorClass
    extends StObject
       with Error {
    
    @JSName("name")
    val name_AbortErrorClass: typings.pRetry.pRetryStrings.AbortError
    
    val originalError: Error
  }
  object AbortErrorClass {
    
    inline def apply(message: String, originalError: Error): AbortErrorClass = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = "AbortError", originalError = originalError.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbortErrorClass]
    }
    
    extension [Self <: AbortErrorClass](x: Self) {
      
      inline def setName(value: typings.pRetry.pRetryStrings.AbortError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOriginalError(value: Error): Self = StObject.set(x, "originalError", value.asInstanceOf[js.Any])
    }
  }
  
  trait FailedAttemptError
    extends StObject
       with Error {
    
    val attemptNumber: Double
    
    val retriesLeft: Double
  }
  object FailedAttemptError {
    
    inline def apply(attemptNumber: Double, message: String, name: String, retriesLeft: Double): FailedAttemptError = {
      val __obj = js.Dynamic.literal(attemptNumber = attemptNumber.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], retriesLeft = retriesLeft.asInstanceOf[js.Any])
      __obj.asInstanceOf[FailedAttemptError]
    }
    
    extension [Self <: FailedAttemptError](x: Self) {
      
      inline def setAttemptNumber(value: Double): Self = StObject.set(x, "attemptNumber", value.asInstanceOf[js.Any])
      
      inline def setRetriesLeft(value: Double): Self = StObject.set(x, "retriesLeft", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options
    extends StObject
       with OperationOptions {
    
    /**
    		Callback invoked on each retry. Receives the error thrown by `input` as the first argument with properties `attemptNumber` and `retriesLeft` which indicate the current attempt number and the number of attempts left, respectively.
    		The `onFailedAttempt` function can return a promise. For example, to add a [delay](https://github.com/sindresorhus/delay):
    		```
    		import pRetry = require('p-retry');
    		import delay = require('delay');
    		const run = async () => { ... };
    		(async () => {
    			const result = await pRetry(run, {
    				onFailedAttempt: async error => {
    					console.log('Waiting for 1 second before retrying');
    					await delay(1000);
    				}
    			});
    		})();
    		```
    		If the `onFailedAttempt` function throws, all retries will be aborted and the original promise will reject with the thrown error.
    		*/
    val onFailedAttempt: js.UndefOr[js.Function1[/* error */ FailedAttemptError, Unit | js.Promise[Unit]]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOnFailedAttempt(value: /* error */ FailedAttemptError => Unit | js.Promise[Unit]): Self = StObject.set(x, "onFailedAttempt", js.Any.fromFunction1(value))
      
      inline def setOnFailedAttemptUndefined: Self = StObject.set(x, "onFailedAttempt", js.undefined)
    }
  }
}
