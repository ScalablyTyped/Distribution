package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgSecretnameQuery451 extends StObject {
  
  var parameters: PathOrgSecretnameQuery451
  
  var responses: `200ContentApplicationjson452`
}
object ParametersPathOrgSecretnameQuery451 {
  
  inline def apply(parameters: PathOrgSecretnameQuery451, responses: `200ContentApplicationjson452`): ParametersPathOrgSecretnameQuery451 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgSecretnameQuery451]
  }
  
  extension [Self <: ParametersPathOrgSecretnameQuery451](x: Self) {
    
    inline def setParameters(value: PathOrgSecretnameQuery451): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson452`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
