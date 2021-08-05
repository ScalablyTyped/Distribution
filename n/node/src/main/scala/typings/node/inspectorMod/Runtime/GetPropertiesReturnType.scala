package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPropertiesReturnType extends StObject {
  
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.undefined
  
  /**
    * Internal object properties (only of the element itself).
    */
  var internalProperties: js.UndefOr[js.Array[InternalPropertyDescriptor]] = js.undefined
  
  /**
    * Object properties.
    */
  var result: js.Array[PropertyDescriptor]
}
object GetPropertiesReturnType {
  
  inline def apply(result: js.Array[PropertyDescriptor]): GetPropertiesReturnType = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropertiesReturnType]
  }
  
  extension [Self <: GetPropertiesReturnType](x: Self) {
    
    inline def setExceptionDetails(value: ExceptionDetails): Self = StObject.set(x, "exceptionDetails", value.asInstanceOf[js.Any])
    
    inline def setExceptionDetailsUndefined: Self = StObject.set(x, "exceptionDetails", js.undefined)
    
    inline def setInternalProperties(value: js.Array[InternalPropertyDescriptor]): Self = StObject.set(x, "internalProperties", value.asInstanceOf[js.Any])
    
    inline def setInternalPropertiesUndefined: Self = StObject.set(x, "internalProperties", js.undefined)
    
    inline def setInternalPropertiesVarargs(value: InternalPropertyDescriptor*): Self = StObject.set(x, "internalProperties", js.Array(value :_*))
    
    inline def setResult(value: js.Array[PropertyDescriptor]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: PropertyDescriptor*): Self = StObject.set(x, "result", js.Array(value :_*))
  }
}
