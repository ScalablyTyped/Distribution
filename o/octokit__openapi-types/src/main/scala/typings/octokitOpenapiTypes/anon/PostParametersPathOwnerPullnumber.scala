package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathOwnerPullnumber extends StObject {
  
  /**
    * Creates a reply to a review comment for a pull request. For the `comment_id`, provide the ID of the review comment you are replying to. This must be the ID of a _top-level review comment_, not a reply to that comment. Replies to replies are not supported.
    *
    * This endpoint triggers [notifications](https://docs.github.com/en/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  var post: ParametersPathOwnerPullnumber
}
object PostParametersPathOwnerPullnumber {
  
  inline def apply(post: ParametersPathOwnerPullnumber): PostParametersPathOwnerPullnumber = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathOwnerPullnumber]
  }
  
  extension [Self <: PostParametersPathOwnerPullnumber](x: Self) {
    
    inline def setPost(value: ParametersPathOwnerPullnumber): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
