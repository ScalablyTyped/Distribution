package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathBranchResponses102 extends StObject {
  
  /**
    * Delete branch protection
    * @description Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  var delete: ParametersPathBranchResponses102
  
  /**
    * Get branch protection
    * @description Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  var get: Responses200Content208
  
  /**
    * Update branch protection
    * @description Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Protecting a branch requires admin or owner permissions to the repository.
    *
    * **Note**: Passing new arrays of `users` and `teams` replaces their previous values.
    *
    * **Note**: The list of users, apps, and teams in total is limited to 100 items.
    */
  var put: RequestBodyContentApplicationjsonAllowdeletions
}
object DeleteParametersPathBranchResponses102 {
  
  inline def apply(
    delete: ParametersPathBranchResponses102,
    get: Responses200Content208,
    put: RequestBodyContentApplicationjsonAllowdeletions
  ): DeleteParametersPathBranchResponses102 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathBranchResponses102]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathBranchResponses102] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathBranchResponses102): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content208): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContentApplicationjsonAllowdeletions): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
