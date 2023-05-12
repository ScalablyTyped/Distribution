package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathAssigneeIssuenumber extends StObject {
  
  /**
    * Check if a user can be assigned to a issue
    * @description Checks if a user has permission to be assigned to a specific issue.
    *
    * If the `assignee` can be assigned to this issue, a `204` status code with no content is returned.
    *
    * Otherwise a `404` status code is returned.
    */
  var get: ParametersPathAssigneeIssuenumber
}
object GetParametersPathAssigneeIssuenumber {
  
  inline def apply(get: ParametersPathAssigneeIssuenumber): GetParametersPathAssigneeIssuenumber = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathAssigneeIssuenumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathAssigneeIssuenumber] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathAssigneeIssuenumber): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
