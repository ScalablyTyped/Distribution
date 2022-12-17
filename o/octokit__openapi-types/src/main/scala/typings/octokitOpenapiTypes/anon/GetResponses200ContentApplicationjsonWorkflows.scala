package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonWorkflows extends StObject {
  
  /** Lists the workflows in a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. */
  var get: Responses200ContentApplicationjsonWorkflows
}
object GetResponses200ContentApplicationjsonWorkflows {
  
  inline def apply(get: Responses200ContentApplicationjsonWorkflows): GetResponses200ContentApplicationjsonWorkflows = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonWorkflows]
  }
  
  extension [Self <: GetResponses200ContentApplicationjsonWorkflows](x: Self) {
    
    inline def setGet(value: Responses200ContentApplicationjsonWorkflows): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
