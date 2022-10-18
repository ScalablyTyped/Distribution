package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgOwner extends StObject {
  
  var parameters: PathOrgOwner
  
  var responses: `200ContentApplicationjsonCompareurl`
}
object ParametersPathOrgOwner {
  
  inline def apply(parameters: PathOrgOwner, responses: `200ContentApplicationjsonCompareurl`): ParametersPathOrgOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgOwner]
  }
  
  extension [Self <: ParametersPathOrgOwner](x: Self) {
    
    inline def setParameters(value: PathOrgOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCompareurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
