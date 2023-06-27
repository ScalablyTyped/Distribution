package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterOperatorSchema
  extends StObject
     with Entity {
  
  var arity: js.UndefOr[ScopeOperatorType] = js.undefined
  
  var multivaluedComparisonType: js.UndefOr[ScopeOperatorMultiValuedComparisonType] = js.undefined
  
  var supportedAttributeTypes: js.UndefOr[js.Array[AttributeType]] = js.undefined
}
object FilterOperatorSchema {
  
  inline def apply(): FilterOperatorSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOperatorSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterOperatorSchema] (val x: Self) extends AnyVal {
    
    inline def setArity(value: ScopeOperatorType): Self = StObject.set(x, "arity", value.asInstanceOf[js.Any])
    
    inline def setArityUndefined: Self = StObject.set(x, "arity", js.undefined)
    
    inline def setMultivaluedComparisonType(value: ScopeOperatorMultiValuedComparisonType): Self = StObject.set(x, "multivaluedComparisonType", value.asInstanceOf[js.Any])
    
    inline def setMultivaluedComparisonTypeUndefined: Self = StObject.set(x, "multivaluedComparisonType", js.undefined)
    
    inline def setSupportedAttributeTypes(value: js.Array[AttributeType]): Self = StObject.set(x, "supportedAttributeTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedAttributeTypesUndefined: Self = StObject.set(x, "supportedAttributeTypes", js.undefined)
    
    inline def setSupportedAttributeTypesVarargs(value: AttributeType*): Self = StObject.set(x, "supportedAttributeTypes", js.Array(value*))
  }
}
