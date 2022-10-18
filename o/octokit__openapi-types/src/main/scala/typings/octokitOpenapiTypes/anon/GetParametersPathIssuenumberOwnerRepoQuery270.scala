package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathIssuenumberOwnerRepoQuery270 extends StObject {
  
  /** Issue Comments are ordered by ascending ID. */
  var get: ParametersPathIssuenumberOwnerRepoQuery270
  
  /** This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details. */
  var post: Responses201403404410
}
object GetParametersPathIssuenumberOwnerRepoQuery270 {
  
  inline def apply(get: ParametersPathIssuenumberOwnerRepoQuery270, post: Responses201403404410): GetParametersPathIssuenumberOwnerRepoQuery270 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathIssuenumberOwnerRepoQuery270]
  }
  
  extension [Self <: GetParametersPathIssuenumberOwnerRepoQuery270](x: Self) {
    
    inline def setGet(value: ParametersPathIssuenumberOwnerRepoQuery270): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201403404410): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
