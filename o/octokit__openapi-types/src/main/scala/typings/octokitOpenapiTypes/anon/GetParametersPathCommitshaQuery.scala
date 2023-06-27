package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathCommitshaQuery extends StObject {
  
  /**
    * List commit comments
    * @description Use the `:commit_sha` to specify the commit that will have its comments listed.
    */
  var get: ParametersPathCommitshaQuery
  
  /**
    * Create a commit comment
    * @description Create a comment for a commit using its `:commit_sha`.
    *
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  var post: RequestBodyContentApplicationjsonLine
}
object GetParametersPathCommitshaQuery {
  
  inline def apply(get: ParametersPathCommitshaQuery, post: RequestBodyContentApplicationjsonLine): GetParametersPathCommitshaQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathCommitshaQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathCommitshaQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathCommitshaQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonLine): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
