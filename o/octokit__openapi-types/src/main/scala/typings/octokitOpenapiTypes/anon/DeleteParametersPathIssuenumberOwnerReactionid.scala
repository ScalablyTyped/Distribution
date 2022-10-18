package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathIssuenumberOwnerReactionid extends StObject {
  
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE /repositories/:repository_id/issues/:issue_number/reactions/:reaction_id`.
    *
    * Delete a reaction to an [issue](https://docs.github.com/rest/reference/issues/).
    */
  var delete: ParametersPathIssuenumberOwnerReactionid
}
object DeleteParametersPathIssuenumberOwnerReactionid {
  
  inline def apply(delete: ParametersPathIssuenumberOwnerReactionid): DeleteParametersPathIssuenumberOwnerReactionid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathIssuenumberOwnerReactionid]
  }
  
  extension [Self <: DeleteParametersPathIssuenumberOwnerReactionid](x: Self) {
    
    inline def setDelete(value: ParametersPathIssuenumberOwnerReactionid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
