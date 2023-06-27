package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeMappingSource extends StObject {
  
  var expression: js.UndefOr[NullableOption[String]] = js.undefined
  
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  var parameters: js.UndefOr[NullableOption[js.Array[StringKeyAttributeMappingSourceValuePair]]] = js.undefined
  
  var `type`: js.UndefOr[AttributeMappingSourceType] = js.undefined
}
object AttributeMappingSource {
  
  inline def apply(): AttributeMappingSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeMappingSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeMappingSource] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: NullableOption[String]): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionNull: Self = StObject.set(x, "expression", null)
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameters(value: NullableOption[js.Array[StringKeyAttributeMappingSourceValuePair]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: StringKeyAttributeMappingSourceValuePair*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setType(value: AttributeMappingSourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
