package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathAlertnumberOwnerRepo extends StObject {
  
  /**
    * You must use an access token with the `security_events` scope to use this endpoint with private repositories.
    * You can also use tokens with the `public_repo` scope for public repositories only.
    * GitHub Apps must have **Dependabot alerts** read permission to use this endpoint.
    */
  var get: ParametersPathAlertnumberOwnerRepo
  
  /**
    * You must use an access token with the `security_events` scope to use this endpoint with private repositories.
    * You can also use tokens with the `public_repo` scope for public repositories only.
    * GitHub Apps must have **Dependabot alerts** write permission to use this endpoint.
    */
  var patch: RequestBodyContentApplicationjson481
}
object GetParametersPathAlertnumberOwnerRepo {
  
  inline def apply(get: ParametersPathAlertnumberOwnerRepo, patch: RequestBodyContentApplicationjson481): GetParametersPathAlertnumberOwnerRepo = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathAlertnumberOwnerRepo]
  }
  
  extension [Self <: GetParametersPathAlertnumberOwnerRepo](x: Self) {
    
    inline def setGet(value: ParametersPathAlertnumberOwnerRepo): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjson481): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
