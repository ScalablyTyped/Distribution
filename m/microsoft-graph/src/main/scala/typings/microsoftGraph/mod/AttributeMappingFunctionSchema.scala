package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeMappingFunctionSchema
  extends StObject
     with Entity {
  
  var parameters: js.UndefOr[NullableOption[js.Array[AttributeMappingParameterSchema]]] = js.undefined
}
object AttributeMappingFunctionSchema {
  
  inline def apply(): AttributeMappingFunctionSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeMappingFunctionSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeMappingFunctionSchema] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: NullableOption[js.Array[AttributeMappingParameterSchema]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: AttributeMappingParameterSchema*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
