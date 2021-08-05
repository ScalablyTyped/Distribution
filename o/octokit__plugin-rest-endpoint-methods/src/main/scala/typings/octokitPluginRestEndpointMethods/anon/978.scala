package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListBranchesForHeadCommitEndpoint
import typings.octokitTypes.endpointsMod.ReposListBranchesForHeadCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `978` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposListBranchesForHeadCommitEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposListBranchesForHeadCommitResponseData]
}
object `978` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposListBranchesForHeadCommitEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListBranchesForHeadCommitResponseData]
  ): `978` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`978`]
  }
  
  extension [Self <: `978`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ReposListBranchesForHeadCommitEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListBranchesForHeadCommitResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
