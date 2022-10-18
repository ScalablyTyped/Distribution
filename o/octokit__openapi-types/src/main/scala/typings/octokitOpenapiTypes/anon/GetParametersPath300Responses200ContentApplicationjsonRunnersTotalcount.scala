package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath300Responses200ContentApplicationjsonRunnersTotalcount extends StObject {
  
  /**
    * Lists all self-hosted runners configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: ParametersPath300Responses200ContentApplicationjsonRunnersTotalcount
}
object GetParametersPath300Responses200ContentApplicationjsonRunnersTotalcount {
  
  inline def apply(get: ParametersPath300Responses200ContentApplicationjsonRunnersTotalcount): GetParametersPath300Responses200ContentApplicationjsonRunnersTotalcount = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath300Responses200ContentApplicationjsonRunnersTotalcount]
  }
  
  extension [Self <: GetParametersPath300Responses200ContentApplicationjsonRunnersTotalcount](x: Self) {
    
    inline def setGet(value: ParametersPath300Responses200ContentApplicationjsonRunnersTotalcount): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
