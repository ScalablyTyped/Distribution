package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryDirectionEcosystem extends StObject {
  
  /**
    * You must use an access token with the `security_events` scope to use this endpoint with private repositories.
    * You can also use tokens with the `public_repo` scope for public repositories only.
    * GitHub Apps must have **Dependabot alerts** read permission to use this endpoint.
    */
  var get: ParametersQueryDirectionEcosystem
}
object GetParametersQueryDirectionEcosystem {
  
  inline def apply(get: ParametersQueryDirectionEcosystem): GetParametersQueryDirectionEcosystem = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryDirectionEcosystem]
  }
  
  extension [Self <: GetParametersQueryDirectionEcosystem](x: Self) {
    
    inline def setGet(value: ParametersQueryDirectionEcosystem): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
