package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonEnvironments extends StObject {
  
  /**
    * Lists the environments for a repository.
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: Responses200ContentApplicationjsonEnvironments
}
object GetResponses200ContentApplicationjsonEnvironments {
  
  inline def apply(get: Responses200ContentApplicationjsonEnvironments): GetResponses200ContentApplicationjsonEnvironments = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonEnvironments]
  }
  
  extension [Self <: GetResponses200ContentApplicationjsonEnvironments](x: Self) {
    
    inline def setGet(value: Responses200ContentApplicationjsonEnvironments): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
