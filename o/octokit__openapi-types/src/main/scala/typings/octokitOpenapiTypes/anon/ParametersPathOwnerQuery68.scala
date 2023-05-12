package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerQuery68 extends StObject {
  
  var parameters: PathOwnerQuery68
  
  var responses: `200ContentApplicationjsonTotalcountVariables`
}
object ParametersPathOwnerQuery68 {
  
  inline def apply(parameters: PathOwnerQuery68, responses: `200ContentApplicationjsonTotalcountVariables`): ParametersPathOwnerQuery68 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerQuery68]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerQuery68] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerQuery68): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTotalcountVariables`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
