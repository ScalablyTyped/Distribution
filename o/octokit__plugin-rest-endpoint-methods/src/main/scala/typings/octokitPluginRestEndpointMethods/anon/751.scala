package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesSetLabelsEndpoint
import typings.octokitTypes.endpointsMod.IssuesSetLabelsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `751` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesSetLabelsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesSetLabelsResponseData]
}
object `751` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[IssuesSetLabelsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesSetLabelsResponseData]
  ): `751` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`751`]
  }
  
  extension [Self <: `751`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[IssuesSetLabelsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesSetLabelsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
