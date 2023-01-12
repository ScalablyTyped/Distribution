package typings.noteflightClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Every document method returns an object called a Promise, which can accept one or more callback functions via its done() method.
  */
trait DocumentMethodPromise[Result] extends StObject {
  
  /**
    * To wait for a method to complete or to obtain its return value if it has one,
    * call done() on the Promise object returned by the method and pass a callback that will receive the return value of the method (if any).
    */
  def done(
    callback: js.Function1[/* result */ Result, Unit | (js.Array[js.Function1[/* result */ Result, Unit]])]
  ): DocumentMethodPromise[Result]
  
  /**
    * Internal function that stores the callback functions as passed through the done() method.
    */
  var doneCallbacks: js.Array[js.Array[js.Function1[/* result */ Result, Unit]]]
  
  /**
    * Internal function that runs the callback functions as passed through the done() method.
    */
  def success(result: Result): Unit
}
object DocumentMethodPromise {
  
  inline def apply[Result](
    done: js.Function1[/* result */ Result, Unit | (js.Array[js.Function1[/* result */ Result, Unit]])] => DocumentMethodPromise[Result],
    doneCallbacks: js.Array[js.Array[js.Function1[/* result */ Result, Unit]]],
    success: Result => Unit
  ): DocumentMethodPromise[Result] = {
    val __obj = js.Dynamic.literal(done = js.Any.fromFunction1(done), doneCallbacks = doneCallbacks.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[DocumentMethodPromise[Result]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentMethodPromise[?], Result] (val x: Self & DocumentMethodPromise[Result]) extends AnyVal {
    
    inline def setDone(
      value: js.Function1[/* result */ Result, Unit | (js.Array[js.Function1[/* result */ Result, Unit]])] => DocumentMethodPromise[Result]
    ): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
    
    inline def setDoneCallbacks(value: js.Array[js.Array[js.Function1[/* result */ Result, Unit]]]): Self = StObject.set(x, "doneCallbacks", value.asInstanceOf[js.Any])
    
    inline def setDoneCallbacksVarargs(value: (js.Array[js.Function1[/* result */ Result, Unit]])*): Self = StObject.set(x, "doneCallbacks", js.Array(value*))
    
    inline def setSuccess(value: Result => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
