package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathBranchResponses9 extends StObject {
  
  /**
    * Delete admin branch protection
    * @description Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removing admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  var delete: ParametersPathBranchResponses9
  
  /**
    * Get admin branch protection
    * @description Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  var get: Responses200Content210
  
  /**
    * Set admin branch protection
    * @description Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Adding admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  var post: Responses200Content210
}
object DeleteParametersPathBranchResponses9 {
  
  inline def apply(delete: ParametersPathBranchResponses9, get: Responses200Content210, post: Responses200Content210): DeleteParametersPathBranchResponses9 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathBranchResponses9]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathBranchResponses9] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathBranchResponses9): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content210): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses200Content210): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
