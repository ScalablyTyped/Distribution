package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidNumberRequestBodyContentApplicationjsonParentteamid extends StObject {
  
  var parameters: PathTeamidNumber
  
  var requestBody: ContentApplicationjsonParentteamid
  
  var responses: `200201403`
}
object ParametersPathTeamidNumberRequestBodyContentApplicationjsonParentteamid {
  
  inline def apply(
    parameters: PathTeamidNumber,
    requestBody: ContentApplicationjsonParentteamid,
    responses: `200201403`
  ): ParametersPathTeamidNumberRequestBodyContentApplicationjsonParentteamid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidNumberRequestBodyContentApplicationjsonParentteamid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamidNumberRequestBodyContentApplicationjsonParentteamid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonParentteamid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200201403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
