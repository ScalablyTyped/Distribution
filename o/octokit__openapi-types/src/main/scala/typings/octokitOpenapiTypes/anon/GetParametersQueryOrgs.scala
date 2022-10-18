package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryOrgs extends StObject {
  
  /**
    * List issues assigned to the authenticated user across all visible repositories including owned repositories, member
    * repositories, and organization repositories. You can use the `filter` query parameter to fetch issues that are not
    * necessarily assigned to you.
    *
    *
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://docs.github.com/rest/reference/pulls#list-pull-requests)" endpoint.
    */
  var get: ParametersQueryOrgs
}
object GetParametersQueryOrgs {
  
  inline def apply(get: ParametersQueryOrgs): GetParametersQueryOrgs = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryOrgs]
  }
  
  extension [Self <: GetParametersQueryOrgs](x: Self) {
    
    inline def setGet(value: ParametersQueryOrgs): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
