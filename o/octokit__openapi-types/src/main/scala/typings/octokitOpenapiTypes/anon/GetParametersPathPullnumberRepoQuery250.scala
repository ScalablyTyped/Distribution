package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathPullnumberRepoQuery250 extends StObject {
  
  /** Lists a maximum of 250 commits for a pull request. To receive a complete commit list for pull requests with more than 250 commits, use the [List commits](https://docs.github.com/rest/reference/repos#list-commits) endpoint. */
  var get: ParametersPathPullnumberRepoQuery250
}
object GetParametersPathPullnumberRepoQuery250 {
  
  inline def apply(get: ParametersPathPullnumberRepoQuery250): GetParametersPathPullnumberRepoQuery250 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathPullnumberRepoQuery250]
  }
  
  extension [Self <: GetParametersPathPullnumberRepoQuery250](x: Self) {
    
    inline def setGet(value: ParametersPathPullnumberRepoQuery250): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
