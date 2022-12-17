package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgPackagenamePackagetype extends StObject {
  
  var parameters: PathOrgPackagenamePackagetype
  
  var responses: `200ContentApplicationjsonDeletedat`
}
object ParametersPathOrgPackagenamePackagetype {
  
  inline def apply(parameters: PathOrgPackagenamePackagetype, responses: `200ContentApplicationjsonDeletedat`): ParametersPathOrgPackagenamePackagetype = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgPackagenamePackagetype]
  }
  
  extension [Self <: ParametersPathOrgPackagenamePackagetype](x: Self) {
    
    inline def setParameters(value: PathOrgPackagenamePackagetype): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDeletedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
