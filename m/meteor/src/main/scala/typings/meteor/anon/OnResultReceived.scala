package typings.meteor.anon

import typings.meteor.EJSONable
import typings.meteor.EJSONableProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnResultReceived[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */] extends StObject {
  
  /**
    * (Client only) if true, don't send this method again on reload, simply call the callback an error with the error code 'invocation-failed'.
    */
  var noRetry: js.UndefOr[Boolean] = js.undefined
  
  var onResultReceived: js.UndefOr[
    js.Function2[
      /* error */ js.UndefOr[js.Error | typings.meteor.Meteor.Error], 
      /* result */ js.UndefOr[Result], 
      Unit
    ]
  ] = js.undefined
  
  var returnStubValue: js.UndefOr[Boolean] = js.undefined
  
  var throwStubExceptions: js.UndefOr[Boolean] = js.undefined
  
  @JSName("wait")
  var wait_FOnResultReceived: js.UndefOr[Boolean] = js.undefined
}
object OnResultReceived {
  
  inline def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](): OnResultReceived[Result] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnResultReceived[Result]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnResultReceived[?], Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */] (val x: Self & OnResultReceived[Result]) extends AnyVal {
    
    inline def setNoRetry(value: Boolean): Self = StObject.set(x, "noRetry", value.asInstanceOf[js.Any])
    
    inline def setNoRetryUndefined: Self = StObject.set(x, "noRetry", js.undefined)
    
    inline def setOnResultReceived(
      value: (/* error */ js.UndefOr[js.Error | typings.meteor.Meteor.Error], /* result */ js.UndefOr[Result]) => Unit
    ): Self = StObject.set(x, "onResultReceived", js.Any.fromFunction2(value))
    
    inline def setOnResultReceivedUndefined: Self = StObject.set(x, "onResultReceived", js.undefined)
    
    inline def setReturnStubValue(value: Boolean): Self = StObject.set(x, "returnStubValue", value.asInstanceOf[js.Any])
    
    inline def setReturnStubValueUndefined: Self = StObject.set(x, "returnStubValue", js.undefined)
    
    inline def setThrowStubExceptions(value: Boolean): Self = StObject.set(x, "throwStubExceptions", value.asInstanceOf[js.Any])
    
    inline def setThrowStubExceptionsUndefined: Self = StObject.set(x, "throwStubExceptions", js.undefined)
    
    inline def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    
    inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
  }
}
