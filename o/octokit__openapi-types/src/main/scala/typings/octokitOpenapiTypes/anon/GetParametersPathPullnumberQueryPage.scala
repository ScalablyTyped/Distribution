package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathPullnumberQueryPage extends StObject {
  
  /** Lists a maximum of 250 commits for a pull request. To receive a complete commit list for pull requests with more than 250 commits, use the [List commits](https://docs.github.com/rest/reference/repos#list-commits) endpoint. */
  var get: ParametersPathPullnumberQueryPage
}
object GetParametersPathPullnumberQueryPage {
  
  inline def apply(get: ParametersPathPullnumberQueryPage): GetParametersPathPullnumberQueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathPullnumberQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathPullnumberQueryPage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathPullnumberQueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
