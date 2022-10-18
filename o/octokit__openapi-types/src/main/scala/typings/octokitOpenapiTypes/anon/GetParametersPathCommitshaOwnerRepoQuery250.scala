package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathCommitshaOwnerRepoQuery250 extends StObject {
  
  /** Use the `:commit_sha` to specify the commit that will have its comments listed. */
  var get: ParametersPathCommitshaOwnerRepoQuery250
  
  /**
    * Create a comment for a commit using its `:commit_sha`.
    *
    * This endpoint triggers [notifications](https://docs.github.com/en/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  var post: Responses201Content467HeadersLocation
}
object GetParametersPathCommitshaOwnerRepoQuery250 {
  
  inline def apply(get: ParametersPathCommitshaOwnerRepoQuery250, post: Responses201Content467HeadersLocation): GetParametersPathCommitshaOwnerRepoQuery250 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathCommitshaOwnerRepoQuery250]
  }
  
  extension [Self <: GetParametersPathCommitshaOwnerRepoQuery250](x: Self) {
    
    inline def setGet(value: ParametersPathCommitshaOwnerRepoQuery250): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content467HeadersLocation): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
