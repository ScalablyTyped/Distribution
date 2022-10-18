package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathAssigneeOwnerRepo extends StObject {
  
  /**
    * Checks if a user has permission to be assigned to an issue in this repository.
    *
    * If the `assignee` can be assigned to issues in the repository, a `204` header with no content is returned.
    *
    * Otherwise a `404` status code is returned.
    */
  var get: ParametersPathAssigneeOwnerRepo
}
object GetParametersPathAssigneeOwnerRepo {
  
  inline def apply(get: ParametersPathAssigneeOwnerRepo): GetParametersPathAssigneeOwnerRepo = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathAssigneeOwnerRepo]
  }
  
  extension [Self <: GetParametersPathAssigneeOwnerRepo](x: Self) {
    
    inline def setGet(value: ParametersPathAssigneeOwnerRepo): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
