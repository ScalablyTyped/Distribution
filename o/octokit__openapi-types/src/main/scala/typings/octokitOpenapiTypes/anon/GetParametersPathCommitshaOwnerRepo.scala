package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathCommitshaOwnerRepo extends StObject {
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Returns all branches where the given commit SHA is the HEAD, or latest commit for the branch.
    */
  var get: ParametersPathCommitshaOwnerRepo
}
object GetParametersPathCommitshaOwnerRepo {
  
  inline def apply(get: ParametersPathCommitshaOwnerRepo): GetParametersPathCommitshaOwnerRepo = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathCommitshaOwnerRepo]
  }
  
  extension [Self <: GetParametersPathCommitshaOwnerRepo](x: Self) {
    
    inline def setGet(value: ParametersPathCommitshaOwnerRepo): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
