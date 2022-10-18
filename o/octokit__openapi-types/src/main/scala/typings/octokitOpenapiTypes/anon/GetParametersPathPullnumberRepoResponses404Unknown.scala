package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathPullnumberRepoResponses404Unknown extends StObject {
  
  var get: ParametersPathPullnumberRepoResponses404Unknown
  
  /** This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details. */
  var put: Responses404405
}
object GetParametersPathPullnumberRepoResponses404Unknown {
  
  inline def apply(get: ParametersPathPullnumberRepoResponses404Unknown, put: Responses404405): GetParametersPathPullnumberRepoResponses404Unknown = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathPullnumberRepoResponses404Unknown]
  }
  
  extension [Self <: GetParametersPathPullnumberRepoResponses404Unknown](x: Self) {
    
    inline def setGet(value: ParametersPathPullnumberRepoResponses404Unknown): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses404405): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
