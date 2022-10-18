package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content571 extends StObject {
  
  /**
    * This returns a list of releases, which does not include regular Git tags that have not been associated with a release. To get a list of Git tags, use the [Repository Tags API](https://docs.github.com/rest/reference/repos#list-repository-tags).
    *
    * Information about published releases are available to everyone. Only users with push access will receive listings for draft releases.
    */
  var get: Responses200Content571
  
  /**
    * Users with push access to the repository can create a release.
    *
    * This endpoint triggers [notifications](https://docs.github.com/en/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  var post: Responses201Content572
}
object GetResponses200Content571 {
  
  inline def apply(get: Responses200Content571, post: Responses201Content572): GetResponses200Content571 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content571]
  }
  
  extension [Self <: GetResponses200Content571](x: Self) {
    
    inline def setGet(value: Responses200Content571): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content572): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
