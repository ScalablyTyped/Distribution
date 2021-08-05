package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListLabelsForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListLabelsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `744` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesListLabelsForRepoEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesListLabelsForRepoResponseData]
}
object `744` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[IssuesListLabelsForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListLabelsForRepoResponseData]
  ): `744` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`744`]
  }
  
  extension [Self <: `744`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[IssuesListLabelsForRepoEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesListLabelsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
