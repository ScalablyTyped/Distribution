package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathBranchResponses extends StObject {
  
  /**
    * Remove status check protection
    * @description Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  var delete: ParametersPathBranchResponses
  
  /**
    * Get status checks protection
    * @description Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  var get: Responses200Content212
  
  /**
    * Update status check protection
    * @description Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Updating required status checks requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  var patch: Responses200Content212404
}
object DeleteParametersPathBranchResponses {
  
  inline def apply(
    delete: ParametersPathBranchResponses,
    get: Responses200Content212,
    patch: Responses200Content212404
  ): DeleteParametersPathBranchResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathBranchResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathBranchResponses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathBranchResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content212): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content212404): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
