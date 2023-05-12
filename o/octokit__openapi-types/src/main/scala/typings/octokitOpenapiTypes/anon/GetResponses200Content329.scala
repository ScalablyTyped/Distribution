package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content329 extends StObject {
  
  /**
    * List releases
    * @description This returns a list of releases, which does not include regular Git tags that have not been associated with a release. To get a list of Git tags, use the [Repository Tags API](https://docs.github.com/rest/reference/repos#list-repository-tags).
    *
    * Information about published releases are available to everyone. Only users with push access will receive listings for draft releases.
    */
  var get: Responses200Content329
  
  /**
    * Create a release
    * @description Users with push access to the repository can create a release.
    *
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  var post: RequestBodyContentApplicationjsonDiscussioncategoryname
}
object GetResponses200Content329 {
  
  inline def apply(get: Responses200Content329, post: RequestBodyContentApplicationjsonDiscussioncategoryname): GetResponses200Content329 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content329]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content329] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content329): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonDiscussioncategoryname): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
