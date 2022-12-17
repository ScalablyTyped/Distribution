package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathDiscussionnumberTeamidQueryDirectionPage extends StObject {
  
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [List discussion comments](https://docs.github.com/rest/reference/teams#list-discussion-comments) endpoint.
    *
    * List all comments on a team discussion. OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  var get: ParametersPathDiscussionnumberTeamidQueryDirectionPage
  
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Create a discussion comment](https://docs.github.com/rest/reference/teams#create-a-discussion-comment) endpoint.
    *
    * Creates a new comment on a team discussion. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * This endpoint triggers [notifications](https://docs.github.com/en/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  var post: ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjsonBody
}
object GetParametersPathDiscussionnumberTeamidQueryDirectionPage {
  
  inline def apply(
    get: ParametersPathDiscussionnumberTeamidQueryDirectionPage,
    post: ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjsonBody
  ): GetParametersPathDiscussionnumberTeamidQueryDirectionPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathDiscussionnumberTeamidQueryDirectionPage]
  }
  
  extension [Self <: GetParametersPathDiscussionnumberTeamidQueryDirectionPage](x: Self) {
    
    inline def setGet(value: ParametersPathDiscussionnumberTeamidQueryDirectionPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjsonBody): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
