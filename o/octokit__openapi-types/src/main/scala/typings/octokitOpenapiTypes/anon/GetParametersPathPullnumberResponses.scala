package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathPullnumberResponses extends StObject {
  
  /** Check if a pull request has been merged */
  var get: ParametersPathPullnumberResponses
  
  /**
    * Merge a pull request
    * @description This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  var put: Responses405
}
object GetParametersPathPullnumberResponses {
  
  inline def apply(get: ParametersPathPullnumberResponses, put: Responses405): GetParametersPathPullnumberResponses = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathPullnumberResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathPullnumberResponses] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathPullnumberResponses): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses405): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
