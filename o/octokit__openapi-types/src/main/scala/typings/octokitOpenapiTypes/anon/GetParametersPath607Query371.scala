package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath607Query371 extends StObject {
  
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List discussions`](https://docs.github.com/rest/reference/teams#list-discussions) endpoint.
    *
    * List all discussions on a team's page. OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  var get: ParametersPath607Query371
  
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Create a discussion`](https://docs.github.com/rest/reference/teams#create-a-discussion) endpoint.
    *
    * Creates a new discussion post on a team's page. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * This endpoint triggers [notifications](https://docs.github.com/en/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  var post: ParametersPath607RequestBodyContentApplicationjsonPrivate
}
object GetParametersPath607Query371 {
  
  inline def apply(get: ParametersPath607Query371, post: ParametersPath607RequestBodyContentApplicationjsonPrivate): GetParametersPath607Query371 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath607Query371]
  }
  
  extension [Self <: GetParametersPath607Query371](x: Self) {
    
    inline def setGet(value: ParametersPath607Query371): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: ParametersPath607RequestBodyContentApplicationjsonPrivate): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
