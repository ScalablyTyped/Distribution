package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses401403 extends StObject {
  
  /**
    * List repositories that an app installation can access.
    *
    * You must use an [installation access token](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
    */
  var get: Responses401403
}
object GetResponses401403 {
  
  inline def apply(get: Responses401403): GetResponses401403 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses401403]
  }
  
  extension [Self <: GetResponses401403](x: Self) {
    
    inline def setGet(value: Responses401403): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
