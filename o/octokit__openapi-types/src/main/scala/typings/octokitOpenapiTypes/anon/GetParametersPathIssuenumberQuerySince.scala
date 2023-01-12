package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathIssuenumberQuerySince extends StObject {
  
  /** Issue Comments are ordered by ascending ID. */
  var get: ParametersPathIssuenumberQuerySince
  
  /** This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details. */
  var post: Responses404410422
}
object GetParametersPathIssuenumberQuerySince {
  
  inline def apply(get: ParametersPathIssuenumberQuerySince, post: Responses404410422): GetParametersPathIssuenumberQuerySince = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathIssuenumberQuerySince]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathIssuenumberQuerySince] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathIssuenumberQuerySince): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses404410422): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
