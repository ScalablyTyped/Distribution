package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath607RequestBodyContentApplicationjsonNameParentteamid extends StObject {
  
  var parameters: Path607
  
  var requestBody: ContentApplicationjsonNameParentteamid
  
  var responses: `200201403`
}
object ParametersPath607RequestBodyContentApplicationjsonNameParentteamid {
  
  inline def apply(parameters: Path607, requestBody: ContentApplicationjsonNameParentteamid, responses: `200201403`): ParametersPath607RequestBodyContentApplicationjsonNameParentteamid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath607RequestBodyContentApplicationjsonNameParentteamid]
  }
  
  extension [Self <: ParametersPath607RequestBodyContentApplicationjsonNameParentteamid](x: Self) {
    
    inline def setParameters(value: Path607): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNameParentteamid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200201403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
