package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPromisePromiseMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(executor: js.Function2[/* arg0 */ js.Function0[Any], /* arg1 */ js.Function0[Any], Any]): Unit = ^.asInstanceOf[js.Dynamic].apply(executor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/promise/Promise", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Promise {
    def this(executor: js.Function2[/* arg0 */ js.Function0[Any], /* arg1 */ js.Function0[Any], Any]) = this()
    
    /* CompleteClass */
    override def `catch`(onRejected: js.Function1[/* arg0 */ Any, Any]): Promise = js.native
    
    /* CompleteClass */
    override def `finally`(handler: js.Function1[/* arg0 */ Any, Any]): Promise = js.native
    
    /* private */ /* CompleteClass */
    var listeners_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var logger_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var reject_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var resolve_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var state_ : Any = js.native
    
    /* CompleteClass */
    override def `then`(onFulfilled: js.Function1[/* arg0 */ Any, Any], onRejected: js.Function1[/* arg0 */ Any, Any]): Promise = js.native
    
    /* private */ /* CompleteClass */
    var value_ : Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/promise/Promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(promises: js.Array[Promise]): Promise = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(promises.asInstanceOf[js.Any]).asInstanceOf[Promise]
  
  inline def processEventQueue(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("processEventQueue")().asInstanceOf[Unit]
  
  inline def reject(reason: Any): Promise = ^.asInstanceOf[js.Dynamic].applyDynamic("reject")(reason.asInstanceOf[js.Any]).asInstanceOf[Promise]
  
  inline def resolve(value: Any): Promise = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any]).asInstanceOf[Promise]
  
  trait Promise extends StObject {
    
    def `catch`(onRejected: js.Function1[/* arg0 */ Any, Any]): Promise
    
    def `finally`(handler: js.Function1[/* arg0 */ Any, Any]): Promise
    
    /* private */ var listeners_ : Any
    
    /* private */ var logger_ : Any
    
    /* private */ var reject_ : Any
    
    /* private */ var resolve_ : Any
    
    /* private */ var state_ : Any
    
    def `then`(onFulfilled: js.Function1[/* arg0 */ Any, Any], onRejected: js.Function1[/* arg0 */ Any, Any]): Promise
    
    /* private */ var value_ : Any
  }
  object Promise {
    
    inline def apply(
      `catch`: js.Function1[/* arg0 */ Any, Any] => Promise,
      `finally`: js.Function1[/* arg0 */ Any, Any] => Promise,
      listeners_ : Any,
      logger_ : Any,
      reject_ : Any,
      resolve_ : Any,
      state_ : Any,
      `then`: (js.Function1[/* arg0 */ Any, Any], js.Function1[/* arg0 */ Any, Any]) => Promise,
      value_ : Any
    ): Promise = {
      val __obj = js.Dynamic.literal(listeners_ = listeners_.asInstanceOf[js.Any], logger_ = logger_.asInstanceOf[js.Any], reject_ = reject_.asInstanceOf[js.Any], resolve_ = resolve_.asInstanceOf[js.Any], state_ = state_.asInstanceOf[js.Any], value_ = value_.asInstanceOf[js.Any])
      __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
      __obj.updateDynamic("finally")(js.Any.fromFunction1(`finally`))
      __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
      __obj.asInstanceOf[Promise]
    }
    
    extension [Self <: Promise](x: Self) {
      
      inline def setCatch(value: js.Function1[/* arg0 */ Any, Any] => Promise): Self = StObject.set(x, "catch", js.Any.fromFunction1(value))
      
      inline def setFinally(value: js.Function1[/* arg0 */ Any, Any] => Promise): Self = StObject.set(x, "finally", js.Any.fromFunction1(value))
      
      inline def setListeners_(value: Any): Self = StObject.set(x, "listeners_", value.asInstanceOf[js.Any])
      
      inline def setLogger_(value: Any): Self = StObject.set(x, "logger_", value.asInstanceOf[js.Any])
      
      inline def setReject_(value: Any): Self = StObject.set(x, "reject_", value.asInstanceOf[js.Any])
      
      inline def setResolve_(value: Any): Self = StObject.set(x, "resolve_", value.asInstanceOf[js.Any])
      
      inline def setState_(value: Any): Self = StObject.set(x, "state_", value.asInstanceOf[js.Any])
      
      inline def setThen(value: (js.Function1[/* arg0 */ Any, Any], js.Function1[/* arg0 */ Any, Any]) => Promise): Self = StObject.set(x, "then", js.Any.fromFunction2(value))
      
      inline def setValue_(value: Any): Self = StObject.set(x, "value_", value.asInstanceOf[js.Any])
    }
  }
}
