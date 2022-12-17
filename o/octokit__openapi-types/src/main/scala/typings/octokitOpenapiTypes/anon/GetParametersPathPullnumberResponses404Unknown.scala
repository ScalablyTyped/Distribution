package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathPullnumberResponses404Unknown extends StObject {
  
  var get: ParametersPathPullnumberResponses404Unknown
  
  /** This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details. */
  var put: RequestBodyContent305
}
object GetParametersPathPullnumberResponses404Unknown {
  
  inline def apply(get: ParametersPathPullnumberResponses404Unknown, put: RequestBodyContent305): GetParametersPathPullnumberResponses404Unknown = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathPullnumberResponses404Unknown]
  }
  
  extension [Self <: GetParametersPathPullnumberResponses404Unknown](x: Self) {
    
    inline def setGet(value: ParametersPathPullnumberResponses404Unknown): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContent305): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
