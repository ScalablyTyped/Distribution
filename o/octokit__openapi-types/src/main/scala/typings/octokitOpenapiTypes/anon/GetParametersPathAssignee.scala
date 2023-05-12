package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathAssignee extends StObject {
  
  /**
    * Check if a user can be assigned
    * @description Checks if a user has permission to be assigned to an issue in this repository.
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathAssignee] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathAssignee): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
