package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathAlertnumberQuery extends StObject {
  
  /**
    * List instances of a code scanning alert
    * @description Lists all instances of the specified code scanning alert.
    * You must use an access token with the `security_events` scope to use this endpoint with private repos,
    * the `public_repo` scope also grants permission to read security events on public repos only.
    * GitHub Apps must have the `security_events` read permission to use this endpoint.
    */
  var get: ParametersPathAlertnumberQuery
}
object GetParametersPathAlertnumberQuery {
  
  inline def apply(get: ParametersPathAlertnumberQuery): GetParametersPathAlertnumberQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathAlertnumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathAlertnumberQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathAlertnumberQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
