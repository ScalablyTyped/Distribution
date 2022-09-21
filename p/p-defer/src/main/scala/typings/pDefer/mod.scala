package typings.pDefer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-defer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ValueType](): DeferredPromise[ValueType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[DeferredPromise[ValueType]]
  
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
    def reject(reason: Any): Unit = js.native
    
    /**
    	Resolves the promise with a value or the result of another promise.
    	@param value - The value to resolve the promise with.
    	*/
    def resolve(): Unit = js.native
    def resolve(value: ValueType): Unit = js.native
    def resolve(value: js.Thenable[ValueType]): Unit = js.native
  }
}
