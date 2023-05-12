package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryFilter extends StObject {
  
  /**
    * List organization issues assigned to the authenticated user
    * @description List issues in an organization assigned to the authenticated user.
    *
    * **Note**: GitHub's REST API considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://docs.github.com/rest/reference/pulls#list-pull-requests)" endpoint.
    */
  var get: ParametersQueryFilter
}
object GetParametersQueryFilter {
  
  inline def apply(get: ParametersQueryFilter): GetParametersQueryFilter = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryFilter] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryFilter): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
