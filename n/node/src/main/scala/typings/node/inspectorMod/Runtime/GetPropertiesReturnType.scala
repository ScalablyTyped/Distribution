package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPropertiesReturnType extends StObject {
  
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.native
  
  /**
    * Internal object properties (only of the element itself).
    */
  var internalProperties: js.UndefOr[js.Array[InternalPropertyDescriptor]] = js.native
  
  /**
    * Object properties.
    */
  var result: js.Array[PropertyDescriptor] = js.native
}
object GetPropertiesReturnType {
  
  @scala.inline
  def apply(result: js.Array[PropertyDescriptor]): GetPropertiesReturnType = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropertiesReturnType]
  }
  
  @scala.inline
  implicit class GetPropertiesReturnTypeMutableBuilder[Self <: GetPropertiesReturnType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExceptionDetails(value: ExceptionDetails): Self = StObject.set(x, "exceptionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionDetailsUndefined: Self = StObject.set(x, "exceptionDetails", js.undefined)
    
    @scala.inline
    def setInternalProperties(value: js.Array[InternalPropertyDescriptor]): Self = StObject.set(x, "internalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalPropertiesUndefined: Self = StObject.set(x, "internalProperties", js.undefined)
    
    @scala.inline
    def setInternalPropertiesVarargs(value: InternalPropertyDescriptor*): Self = StObject.set(x, "internalProperties", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: js.Array[PropertyDescriptor]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: PropertyDescriptor*): Self = StObject.set(x, "result", js.Array(value :_*))
  }
}
