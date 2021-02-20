package typings.pDefer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Create a deferred promise.
  @example
  ```
  import pDefer = require('p-defer');
  function delay(ms) {
  	const deferred = pDefer();
  	setTimeout(deferred.resolve, ms, '🦄');
  	return deferred.promise;
  }
  (async () => {
  	console.log(await delay(100));
  	//=> '🦄'
  })();
  ```
  */
  @JSImport("p-defer", JSImport.Namespace)
  @js.native
  def apply[ValueType](): DeferredPromise[ValueType] = js.native
  
  @js.native
  trait DeferredPromise[ValueType] extends StObject {
    
    /**
    		The deferred promise.
    		*/
    var promise: js.Promise[ValueType] = js.native
    
    /**
    		Reject the promise with a provided reason or error.
    		@param reason - The reason or error to reject the promise with.
    		*/
    def reject(): Unit = js.native
    def reject(reason: js.Any): Unit = js.native
    
    /**
    		Resolves the promise with a value or the result of another promise.
    		@param value - The value to resolve the promise with.
    		*/
    def resolve(): Unit = js.native
    def resolve(value: ValueType): Unit = js.native
    def resolve(value: js.Thenable[ValueType]): Unit = js.native
  }
}
