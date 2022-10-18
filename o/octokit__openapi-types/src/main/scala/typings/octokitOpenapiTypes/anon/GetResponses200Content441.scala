package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content441 extends StObject {
  
  /** Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation. */
  var delete: ParametersPathBranchOwnerRepoResponses236
  
  /** Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation. */
  var get: Responses200Content441
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Updating pull request review enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    *
    * **Note**: Passing new arrays of `users` and `teams` replaces their previous values.
    */
  var patch: Responses200Content441422
}
object GetResponses200Content441 {
  
  inline def apply(
    delete: ParametersPathBranchOwnerRepoResponses236,
    get: Responses200Content441,
    patch: Responses200Content441422
  ): GetResponses200Content441 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content441]
  }
  
  extension [Self <: GetResponses200Content441](x: Self) {
    
    inline def setDelete(value: ParametersPathBranchOwnerRepoResponses236): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content441): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content441422): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
