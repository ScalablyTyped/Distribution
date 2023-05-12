package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRequestBodyContentApplicationjsonTeamreviewers extends StObject {
  
  /** Remove requested reviewers from a pull request */
  var delete: RequestBodyContentApplicationjsonTeamreviewers
  
  /**
    * Get all requested reviewers for a pull request
    * @description Gets the users or teams whose review is requested for a pull request. Once a requested reviewer submits a review, they are no longer considered a requested reviewer. Their review will instead be returned by the [List reviews for a pull request](https://docs.github.com/rest/pulls/reviews#list-reviews-for-a-pull-request) operation.
    */
  var get: Responses200Content322
  
  /**
    * Request reviewers for a pull request
    * @description This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  var post: Responses201Content323
}
object DeleteRequestBodyContentApplicationjsonTeamreviewers {
  
  inline def apply(
    delete: RequestBodyContentApplicationjsonTeamreviewers,
    get: Responses200Content322,
    post: Responses201Content323
  ): DeleteRequestBodyContentApplicationjsonTeamreviewers = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRequestBodyContentApplicationjsonTeamreviewers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRequestBodyContentApplicationjsonTeamreviewers] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: RequestBodyContentApplicationjsonTeamreviewers): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content322): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content323): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
