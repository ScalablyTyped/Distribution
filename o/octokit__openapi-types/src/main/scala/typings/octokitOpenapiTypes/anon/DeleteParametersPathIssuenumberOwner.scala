package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathIssuenumberOwner extends StObject {
  
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE /repositories/:repository_id/issues/:issue_number/reactions/:reaction_id`.
    *
    * Delete a reaction to an [issue](https://docs.github.com/rest/reference/issues/).
    */
  var delete: ParametersPathIssuenumberOwner
}
object DeleteParametersPathIssuenumberOwner {
  
  inline def apply(delete: ParametersPathIssuenumberOwner): DeleteParametersPathIssuenumberOwner = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathIssuenumberOwner]
  }
  
  extension [Self <: DeleteParametersPathIssuenumberOwner](x: Self) {
    
    inline def setDelete(value: ParametersPathIssuenumberOwner): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
