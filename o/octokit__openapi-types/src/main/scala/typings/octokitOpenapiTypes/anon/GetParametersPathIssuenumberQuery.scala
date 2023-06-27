package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathIssuenumberQuery extends StObject {
  
  /**
    * List issue comments
    * @description You can use the REST API to list comments on issues and pull requests. Every pull request is an issue, but not every issue is a pull request.
    *
    * Issue comments are ordered by ascending ID.
    */
  var get: ParametersPathIssuenumberQuery
  
  /**
    * Create an issue comment
    * @description
    * You can use the REST API to create comments on issues and pull requests. Every pull request is an issue, but not every issue is a pull request.
    *
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications).
    * Creating content too quickly using this endpoint may result in secondary rate limiting.
    * See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)"
    * and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)"
    * for details.
    */
  var post: Responses404410422
}
object GetParametersPathIssuenumberQuery {
  
  inline def apply(get: ParametersPathIssuenumberQuery, post: Responses404410422): GetParametersPathIssuenumberQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathIssuenumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathIssuenumberQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathIssuenumberQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses404410422): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
