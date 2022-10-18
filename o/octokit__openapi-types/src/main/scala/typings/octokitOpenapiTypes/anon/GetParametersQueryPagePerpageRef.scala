package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPagePerpageRef extends StObject {
  
  /**
    * Lists all instances of the specified code scanning alert.
    * You must use an access token with the `security_events` scope to use this endpoint with private repos,
    * the `public_repo` scope also grants permission to read security events on public repos only.
    * GitHub Apps must have the `security_events` read permission to use this endpoint.
    */
  var get: ParametersQueryPagePerpageRef
}
object GetParametersQueryPagePerpageRef {
  
  inline def apply(get: ParametersQueryPagePerpageRef): GetParametersQueryPagePerpageRef = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPagePerpageRef]
  }
  
  extension [Self <: GetParametersQueryPagePerpageRef](x: Self) {
    
    inline def setGet(value: ParametersQueryPagePerpageRef): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
