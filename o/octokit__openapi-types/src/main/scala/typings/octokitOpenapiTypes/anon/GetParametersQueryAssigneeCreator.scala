package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryAssigneeCreator extends StObject {
  
  /**
    * List issues in a repository.
    *
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://docs.github.com/rest/reference/pulls#list-pull-requests)" endpoint.
    */
  var get: ParametersQueryAssigneeCreator
  
  /**
    * Any user with pull access to a repository can create an issue. If [issues are disabled in the repository](https://docs.github.com/articles/disabling-issues/), the API returns a `410 Gone` status.
    *
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  var post: Responses410422503
}
object GetParametersQueryAssigneeCreator {
  
  inline def apply(get: ParametersQueryAssigneeCreator, post: Responses410422503): GetParametersQueryAssigneeCreator = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryAssigneeCreator]
  }
  
  extension [Self <: GetParametersQueryAssigneeCreator](x: Self) {
    
    inline def setGet(value: ParametersQueryAssigneeCreator): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses410422503): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
