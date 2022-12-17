package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidNumberRequestBodyContentApplicationjsonPrivate extends StObject {
  
  var parameters: PathTeamidNumber
  
  var requestBody: ContentApplicationjsonPrivate
  
  var responses: `201ContentApplicationjsonCommentscount`
}
object ParametersPathTeamidNumberRequestBodyContentApplicationjsonPrivate {
  
  inline def apply(
    parameters: PathTeamidNumber,
    requestBody: ContentApplicationjsonPrivate,
    responses: `201ContentApplicationjsonCommentscount`
  ): ParametersPathTeamidNumberRequestBodyContentApplicationjsonPrivate = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidNumberRequestBodyContentApplicationjsonPrivate]
  }
  
  extension [Self <: ParametersPathTeamidNumberRequestBodyContentApplicationjsonPrivate](x: Self) {
    
    inline def setParameters(value: PathTeamidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPrivate): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonCommentscount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
