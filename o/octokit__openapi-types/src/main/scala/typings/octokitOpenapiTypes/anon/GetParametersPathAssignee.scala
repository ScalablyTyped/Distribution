package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathAssignee extends StObject {
  
  /**
    * Checks if a user has permission to be assigned to an issue in this repository.
    *
    * If the `assignee` can be assigned to issues in the repository, a `204` header with no content is returned.
    *
    * Otherwise a `404` status code is returned.
    */
  var get: ParametersPathAssignee
}
object GetParametersPathAssignee {
  
  inline def apply(get: ParametersPathAssignee): GetParametersPathAssignee = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathAssignee]
  }
  
  extension [Self <: GetParametersPathAssignee](x: Self) {
    
    inline def setGet(value: ParametersPathAssignee): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
