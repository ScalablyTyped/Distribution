package typings.meteor.anon

import typings.meteor.EJSONable
import typings.meteor.EJSONableProperty
import typings.meteor.globalError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnStubValue[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */] extends StObject {
  
  var onResultReceived: js.UndefOr[
    js.Function2[
      /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error], 
      /* result */ js.UndefOr[Result], 
      Unit
    ]
  ] = js.undefined
  
  var returnStubValue: js.UndefOr[Boolean] = js.undefined
  
  var throwStubExceptions: js.UndefOr[Boolean] = js.undefined
  
  @JSName("wait")
  var wait_FReturnStubValue: js.UndefOr[Boolean] = js.undefined
}
object ReturnStubValue {
  
  @scala.inline
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](): ReturnStubValue[Result] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnStubValue[Result]]
  }
  
  @scala.inline
  implicit class ReturnStubValueMutableBuilder[Self <: ReturnStubValue[?], Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */] (val x: Self & ReturnStubValue[Result]) extends AnyVal {
    
    @scala.inline
    def setOnResultReceived(
      value: (/* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error], /* result */ js.UndefOr[Result]) => Unit
    ): Self = StObject.set(x, "onResultReceived", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnResultReceivedUndefined: Self = StObject.set(x, "onResultReceived", js.undefined)
    
    @scala.inline
    def setReturnStubValue(value: Boolean): Self = StObject.set(x, "returnStubValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnStubValueUndefined: Self = StObject.set(x, "returnStubValue", js.undefined)
    
    @scala.inline
    def setThrowStubExceptions(value: Boolean): Self = StObject.set(x, "throwStubExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowStubExceptionsUndefined: Self = StObject.set(x, "throwStubExceptions", js.undefined)
    
    @scala.inline
    def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
  }
}
