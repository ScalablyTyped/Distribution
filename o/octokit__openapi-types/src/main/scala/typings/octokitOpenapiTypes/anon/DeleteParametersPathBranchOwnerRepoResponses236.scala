package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathBranchOwnerRepoResponses236 extends StObject {
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removing admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  var delete: ParametersPathBranchOwnerRepoResponses236
  
  /** Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation. */
  var get: Responses200Content440
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Adding admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  var post: Responses200Content440
}
object DeleteParametersPathBranchOwnerRepoResponses236 {
  
  inline def apply(
    delete: ParametersPathBranchOwnerRepoResponses236,
    get: Responses200Content440,
    post: Responses200Content440
  ): DeleteParametersPathBranchOwnerRepoResponses236 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathBranchOwnerRepoResponses236]
  }
  
  extension [Self <: DeleteParametersPathBranchOwnerRepoResponses236](x: Self) {
    
    inline def setDelete(value: ParametersPathBranchOwnerRepoResponses236): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content440): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses200Content440): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
