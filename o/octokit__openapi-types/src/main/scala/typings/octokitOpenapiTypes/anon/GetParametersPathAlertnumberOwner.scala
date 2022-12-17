package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathAlertnumberOwner extends StObject {
  
  /**
    * You must use an access token with the `security_events` scope to use this endpoint with private repositories.
    * You can also use tokens with the `public_repo` scope for public repositories only.
    * GitHub Apps must have **Dependabot alerts** read permission to use this endpoint.
    */
  var get: ParametersPathAlertnumberOwner
  
  /**
    * You must use an access token with the `security_events` scope to use this endpoint with private repositories.
    * You can also use tokens with the `public_repo` scope for public repositories only.
    * GitHub Apps must have **Dependabot alerts** write permission to use this endpoint.
    */
  var patch: RequestBodyContentApplicationjsonDismissedreason
}
object GetParametersPathAlertnumberOwner {
  
  inline def apply(get: ParametersPathAlertnumberOwner, patch: RequestBodyContentApplicationjsonDismissedreason): GetParametersPathAlertnumberOwner = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathAlertnumberOwner]
  }
  
  extension [Self <: GetParametersPathAlertnumberOwner](x: Self) {
    
    inline def setGet(value: ParametersPathAlertnumberOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonDismissedreason): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
