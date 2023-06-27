package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathAlertnumberOwner extends StObject {
  
  /**
    * Get a Dependabot alert
    * @description You must use an access token with the `security_events` scope to use this endpoint with private repositories.
    * You can also use tokens with the `public_repo` scope for public repositories only.
    * GitHub Apps must have **Dependabot alerts** read permission to use this endpoint.
    */
  var get: ParametersPathAlertnumberOwner
  
  /**
    * Update a Dependabot alert
    * @description You must use an access token with the `security_events` scope to use this endpoint with private repositories.
    * You can also use tokens with the `public_repo` scope for public repositories only.
    * GitHub Apps must have **Dependabot alerts** write permission to use this endpoint.
    *
    * To use this endpoint, you must have access to security alerts for the repository. For more information, see "[Granting access to security alerts](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-security-and-analysis-settings-for-your-repository#granting-access-to-security-alerts)."
    */
  var patch: RequestBodyContentApplicationjsonDismissedreason
}
object GetParametersPathAlertnumberOwner {
  
  inline def apply(get: ParametersPathAlertnumberOwner, patch: RequestBodyContentApplicationjsonDismissedreason): GetParametersPathAlertnumberOwner = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathAlertnumberOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathAlertnumberOwner] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathAlertnumberOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonDismissedreason): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
