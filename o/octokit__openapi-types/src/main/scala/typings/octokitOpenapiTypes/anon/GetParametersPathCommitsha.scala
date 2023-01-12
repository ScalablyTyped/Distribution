package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathCommitsha extends StObject {
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Returns all branches where the given commit SHA is the HEAD, or latest commit for the branch.
    */
  var get: ParametersPathCommitsha
}
object GetParametersPathCommitsha {
  
  inline def apply(get: ParametersPathCommitsha): GetParametersPathCommitsha = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathCommitsha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathCommitsha] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathCommitsha): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
