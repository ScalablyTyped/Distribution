package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRunneridResponses200ContentApplicationjsonLabelsTotalcount extends StObject {
  
  var parameters: PathOrgRunnerid
  
  var responses: `200ContentApplicationjsonLabelsTotalcount`
}
object ParametersPathOrgRunneridResponses200ContentApplicationjsonLabelsTotalcount {
  
  inline def apply(parameters: PathOrgRunnerid, responses: `200ContentApplicationjsonLabelsTotalcount`): ParametersPathOrgRunneridResponses200ContentApplicationjsonLabelsTotalcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRunneridResponses200ContentApplicationjsonLabelsTotalcount]
  }
  
  extension [Self <: ParametersPathOrgRunneridResponses200ContentApplicationjsonLabelsTotalcount](x: Self) {
    
    inline def setParameters(value: PathOrgRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonLabelsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
