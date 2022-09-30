package typings.pRetry

import typings.std.AbortSignal
import typings.std.Error
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-retry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](input: js.Function1[/* attemptCount */ Double, PromiseLike[T] | T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def default[T](input: js.Function1[/* attemptCount */ Double, PromiseLike[T] | T], options: Options): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @JSImport("p-retry", "AbortError")
  @js.native
  open class AbortError protected ()
    extends StObject
       with Error {
    /**
    	Abort retrying and reject the promise.
    	@param message - An error message or a custom error.
    	*/
    def this(message: String) = this()
    def this(message: js.Error) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    val name_AbortError: typings.pRetry.pRetryStrings.AbortError = js.native
    
    val originalError: js.Error = js.native
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
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped retry.retry.WrapOptions | std.Array<number> */ trait Options extends StObject {
    
    /**
    	Callback invoked on each retry. Receives the error thrown by `input` as the first argument with properties `attemptNumber` and `retriesLeft` which indicate the current attempt number and the number of attempts left, respectively.
    	The `onFailedAttempt` function can return a promise. For example, to add a [delay](https://github.com/sindresorhus/delay):
    	```
    	import pRetry from 'p-retry';
    	import delay from 'delay';
    	const run = async () => { ... };
    	const result = await pRetry(run, {
    		onFailedAttempt: async error => {
    			console.log('Waiting for 1 second before retrying');
    			await delay(1000);
    		}
    	});
    	```
    	If the `onFailedAttempt` function throws, all retries will be aborted and the original promise will reject with the thrown error.
    	*/
    val onFailedAttempt: js.UndefOr[js.Function1[/* error */ FailedAttemptError, Unit | js.Promise[Unit]]] = js.undefined
    
    /**
    	You can abort retrying using [`AbortController`](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    	When `AbortController.abort(reason)` is called, the promise will be rejected with `reason` as the error message.
    	*Requires Node.js 16 or later.*
    	```
    	import pRetry from 'p-retry';
    	const run = async () => { … };
    	const controller = new AbortController();
    	cancelButton.addEventListener('click', () => {
    		controller.abort('User clicked cancel button');
    	});
    	try {
    		await pRetry(run, {signal: controller.signal});
    	} catch (error) {
    		console.log(error.message);
    		//=> 'User clicked cancel button'
    	}
    	```
    	*/
    val signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOnFailedAttempt(value: /* error */ FailedAttemptError => Unit | js.Promise[Unit]): Self = StObject.set(x, "onFailedAttempt", js.Any.fromFunction1(value))
      
      inline def setOnFailedAttemptUndefined: Self = StObject.set(x, "onFailedAttempt", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
}
