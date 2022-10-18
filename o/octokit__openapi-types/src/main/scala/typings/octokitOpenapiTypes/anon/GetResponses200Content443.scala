package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content443 extends StObject {
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Disables the ability to restrict who can push to this branch.
    */
  var delete: ParametersPathBranchOwnerRepoResponses
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists who has access to this protected branch.
    *
    * **Note**: Users, apps, and teams `restrictions` are only available for organization-owned repositories.
    */
  var get: Responses200Content443
}
object GetResponses200Content443 {
  
  inline def apply(delete: ParametersPathBranchOwnerRepoResponses, get: Responses200Content443): GetResponses200Content443 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content443]
  }
  
  extension [Self <: GetResponses200Content443](x: Self) {
    
    inline def setDelete(value: ParametersPathBranchOwnerRepoResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content443): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
