package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryEcosystem extends StObject {
  
  /**
    * You must use an access token with the `security_events` scope to use this endpoint with private repositories.
    * You can also use tokens with the `public_repo` scope for public repositories only.
    * GitHub Apps must have **Dependabot alerts** read permission to use this endpoint.
    */
  var get: ParametersQueryEcosystem
}
object GetParametersQueryEcosystem {
  
  inline def apply(get: ParametersQueryEcosystem): GetParametersQueryEcosystem = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryEcosystem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryEcosystem] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryEcosystem): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
