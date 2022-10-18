package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonInstallationsTotalcount extends StObject {
  
  /** Lists all GitHub Apps in an organization. The installation count includes all GitHub Apps installed on repositories in the organization. You must be an organization owner with `admin:read` scope to use this endpoint. */
  var get: Responses200ContentApplicationjsonInstallationsTotalcount
}
object GetResponses200ContentApplicationjsonInstallationsTotalcount {
  
  inline def apply(get: Responses200ContentApplicationjsonInstallationsTotalcount): GetResponses200ContentApplicationjsonInstallationsTotalcount = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonInstallationsTotalcount]
  }
  
  extension [Self <: GetResponses200ContentApplicationjsonInstallationsTotalcount](x: Self) {
    
    inline def setGet(value: Responses200ContentApplicationjsonInstallationsTotalcount): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
