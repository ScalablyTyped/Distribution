package typings.pReflect

import typings.pReflect.pReflectBooleans.`false`
import typings.pReflect.pReflectBooleans.`true`
import typings.pReflect.pReflectStrings.fulfilled
import typings.pReflect.pReflectStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-reflect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ValueType](promise: js.Thenable[ValueType]): js.Promise[PromiseResult[ValueType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PromiseResult[ValueType]]]
  
  inline def isFulfilled[T](promiseResult: PromiseResult[T]): /* is p-reflect.p-reflect.PromiseFulfilledResult<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFulfilled")(promiseResult.asInstanceOf[js.Any]).asInstanceOf[/* is p-reflect.p-reflect.PromiseFulfilledResult<T> */ Boolean]
  
  inline def isRejected[T](promiseResult: PromiseResult[T]): /* is p-reflect.p-reflect.PromiseRejectedResult */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRejected")(promiseResult.asInstanceOf[js.Any]).asInstanceOf[/* is p-reflect.p-reflect.PromiseRejectedResult */ Boolean]
  
  trait PromiseFulfilledResult[ValueType]
    extends StObject
       with PromiseResult[ValueType] {
    
    var isFulfilled: `true`
    
    var isRejected: `false`
    
    var status: fulfilled
    
    var value: ValueType
  }
  object PromiseFulfilledResult {
    
    inline def apply[ValueType](value: ValueType): PromiseFulfilledResult[ValueType] = {
      val __obj = js.Dynamic.literal(isFulfilled = true, isRejected = false, status = "fulfilled", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromiseFulfilledResult[ValueType]]
    }
    
    extension [Self <: PromiseFulfilledResult[?], ValueType](x: Self & PromiseFulfilledResult[ValueType]) {
      
      inline def setIsFulfilled(value: `true`): Self = StObject.set(x, "isFulfilled", value.asInstanceOf[js.Any])
      
      inline def setIsRejected(value: `false`): Self = StObject.set(x, "isRejected", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: fulfilled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PromiseRejectedResult
    extends StObject
       with PromiseResult[Any] {
    
    var isFulfilled: `false`
    
    var isRejected: `true`
    
    var reason: Any
    
    var status: rejected
  }
  object PromiseRejectedResult {
    
    inline def apply(reason: Any): PromiseRejectedResult = {
      val __obj = js.Dynamic.literal(isFulfilled = false, isRejected = true, reason = reason.asInstanceOf[js.Any], status = "rejected")
      __obj.asInstanceOf[PromiseRejectedResult]
    }
    
    extension [Self <: PromiseRejectedResult](x: Self) {
      
      inline def setIsFulfilled(value: `false`): Self = StObject.set(x, "isFulfilled", value.asInstanceOf[js.Any])
      
      inline def setIsRejected(value: `true`): Self = StObject.set(x, "isRejected", value.asInstanceOf[js.Any])
      
      inline def setReason(value: Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: rejected): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pReflect.mod.PromiseFulfilledResult[ValueType]
    - typings.pReflect.mod.PromiseRejectedResult
  */
  trait PromiseResult[ValueType] extends StObject
  object PromiseResult {
    
    inline def PromiseFulfilledResult[ValueType](value: ValueType): typings.pReflect.mod.PromiseFulfilledResult[ValueType] = {
      val __obj = js.Dynamic.literal(isFulfilled = true, isRejected = false, status = "fulfilled", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pReflect.mod.PromiseFulfilledResult[ValueType]]
    }
    
    inline def PromiseRejectedResult(reason: Any): typings.pReflect.mod.PromiseRejectedResult = {
      val __obj = js.Dynamic.literal(isFulfilled = false, isRejected = true, reason = reason.asInstanceOf[js.Any], status = "rejected")
      __obj.asInstanceOf[typings.pReflect.mod.PromiseRejectedResult]
    }
  }
}
