package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath292Responses200ContentApplicationjsonRunnersTotalcount extends StObject {
  
  /** Lists all self-hosted runners configured in a repository. You must authenticate using an access token with the `repo` scope to use this endpoint. */
  var get: ParametersPath292Responses200ContentApplicationjsonRunnersTotalcount
}
object GetParametersPath292Responses200ContentApplicationjsonRunnersTotalcount {
  
  inline def apply(get: ParametersPath292Responses200ContentApplicationjsonRunnersTotalcount): GetParametersPath292Responses200ContentApplicationjsonRunnersTotalcount = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath292Responses200ContentApplicationjsonRunnersTotalcount]
  }
  
  extension [Self <: GetParametersPath292Responses200ContentApplicationjsonRunnersTotalcount](x: Self) {
    
    inline def setGet(value: ParametersPath292Responses200ContentApplicationjsonRunnersTotalcount): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
