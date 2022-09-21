package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathIssuenumber extends StObject {
  
  /**
    * The API returns a [`301 Moved Permanently` status](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-redirects-redirects) if the issue was
    * [transferred](https://docs.github.com/articles/transferring-an-issue-to-another-repository/) to another repository. If
    * the issue was transferred to or deleted from a repository where the authenticated user lacks read access, the API
    * returns a `404 Not Found` status. If the issue was deleted from a repository where the authenticated user has read
    * access, the API returns a `410 Gone` status. To receive webhook events for transferred and deleted issues, subscribe
    * to the [`issues`](https://docs.github.com/webhooks/event-payloads/#issues) webhook.
    *
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://docs.github.com/rest/reference/pulls#list-pull-requests)" endpoint.
    */
  var get: ParametersPathIssuenumber
  
  /** Issue owners and users with push access can edit an issue. */
  var patch: RequestBodyContentApplicationjsonMilestone
}
object GetParametersPathIssuenumber {
  
  inline def apply(get: ParametersPathIssuenumber, patch: RequestBodyContentApplicationjsonMilestone): GetParametersPathIssuenumber = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathIssuenumber]
  }
  
  extension [Self <: GetParametersPathIssuenumber](x: Self) {
    
    inline def setGet(value: ParametersPathIssuenumber): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonMilestone): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
