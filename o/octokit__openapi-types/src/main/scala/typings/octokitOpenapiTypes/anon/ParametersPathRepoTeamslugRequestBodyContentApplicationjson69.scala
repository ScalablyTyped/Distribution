package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoTeamslugRequestBodyContentApplicationjson69 extends StObject {
  
  var parameters: PathRepoTeamslug
  
  var requestBody: ContentApplicationjson69
}
object ParametersPathRepoTeamslugRequestBodyContentApplicationjson69 {
  
  inline def apply(parameters: PathRepoTeamslug, requestBody: ContentApplicationjson69): ParametersPathRepoTeamslugRequestBodyContentApplicationjson69 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoTeamslugRequestBodyContentApplicationjson69]
  }
  
  extension [Self <: ParametersPathRepoTeamslugRequestBodyContentApplicationjson69](x: Self) {
    
    inline def setParameters(value: PathRepoTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson69): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
