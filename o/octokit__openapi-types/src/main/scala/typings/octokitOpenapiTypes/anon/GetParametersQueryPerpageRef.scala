package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPerpageRef extends StObject {
  
  /**
    * Lists all instances of the specified code scanning alert.
    * You must use an access token with the `security_events` scope to use this endpoint with private repos,
    * the `public_repo` scope also grants permission to read security events on public repos only.
    * GitHub Apps must have the `security_events` read permission to use this endpoint.
    */
  var get: ParametersQueryPerpageRef
}
object GetParametersQueryPerpageRef {
  
  inline def apply(get: ParametersQueryPerpageRef): GetParametersQueryPerpageRef = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPerpageRef]
  }
  
  extension [Self <: GetParametersQueryPerpageRef](x: Self) {
    
    inline def setGet(value: ParametersQueryPerpageRef): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
