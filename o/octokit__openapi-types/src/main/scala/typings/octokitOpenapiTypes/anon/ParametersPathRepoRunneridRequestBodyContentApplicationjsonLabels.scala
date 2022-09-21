package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoRunneridRequestBodyContentApplicationjsonLabels extends StObject {
  
  var parameters: PathRepoRunnerid
  
  var requestBody: ContentApplicationjsonLabels
  
  var responses: `422Content418`
}
object ParametersPathRepoRunneridRequestBodyContentApplicationjsonLabels {
  
  inline def apply(
    parameters: PathRepoRunnerid,
    requestBody: ContentApplicationjsonLabels,
    responses: `422Content418`
  ): ParametersPathRepoRunneridRequestBodyContentApplicationjsonLabels = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoRunneridRequestBodyContentApplicationjsonLabels]
  }
  
  extension [Self <: ParametersPathRepoRunneridRequestBodyContentApplicationjsonLabels](x: Self) {
    
    inline def setParameters(value: PathRepoRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLabels): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Content418`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
