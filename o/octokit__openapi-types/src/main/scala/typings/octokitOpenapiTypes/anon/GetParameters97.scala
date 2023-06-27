package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters97 extends StObject {
  
  /**
    * List pending organization invitations
    * @description The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, or `hiring_manager`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.
    */
  var get: Parameters97
  
  /**
    * Create an organization invitation
    * @description Invite people to an organization by using their GitHub user ID or their email address. In order to create invitations in an organization, the authenticated user must be an organization owner.
    *
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  var post: Responses201Content98
}
object GetParameters97 {
  
  inline def apply(get: Parameters97, post: Responses201Content98): GetParameters97 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters97]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters97] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters97): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content98): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
