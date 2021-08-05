package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsResponse201Data
import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposCreateOrUpdateFileContentsEndpoint extends StObject {
  
  var parameters: ReposCreateOrUpdateFileContentsEndpoint
  
  var request: ReposCreateOrUpdateFileContentsRequestOptions
  
  var response: OctokitResponse[
    ReposCreateOrUpdateFileContentsResponseData | ReposCreateOrUpdateFileContentsResponse201Data
  ]
}
object ParametersReposCreateOrUpdateFileContentsEndpoint {
  
  inline def apply(
    parameters: ReposCreateOrUpdateFileContentsEndpoint,
    request: ReposCreateOrUpdateFileContentsRequestOptions,
    response: OctokitResponse[
      ReposCreateOrUpdateFileContentsResponseData | ReposCreateOrUpdateFileContentsResponse201Data
    ]
  ): ParametersReposCreateOrUpdateFileContentsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateOrUpdateFileContentsEndpoint]
  }
  
  extension [Self <: ParametersReposCreateOrUpdateFileContentsEndpoint](x: Self) {
    
    inline def setParameters(value: ReposCreateOrUpdateFileContentsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposCreateOrUpdateFileContentsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(
      value: OctokitResponse[
          ReposCreateOrUpdateFileContentsResponseData | ReposCreateOrUpdateFileContentsResponse201Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
