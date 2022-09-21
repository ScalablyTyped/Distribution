package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringRunneridNumber extends StObject {
  
  var parameters: PathOrgStringRunneridNumber
  
  var responses: `200ContentApplicationjsonOs`
}
object ParametersPathOrgStringRunneridNumber {
  
  inline def apply(parameters: PathOrgStringRunneridNumber, responses: `200ContentApplicationjsonOs`): ParametersPathOrgStringRunneridNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringRunneridNumber]
  }
  
  extension [Self <: ParametersPathOrgStringRunneridNumber](x: Self) {
    
    inline def setParameters(value: PathOrgStringRunneridNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOs`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
