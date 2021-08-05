package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForOrgEndpoint
import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `716` extends StObject {
  
  var parameters: RequestParameters & (Omit[InteractionsSetRestrictionsForOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[InteractionsSetRestrictionsForOrgResponseData]
}
object `716` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[InteractionsSetRestrictionsForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[InteractionsSetRestrictionsForOrgResponseData]
  ): `716` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`716`]
  }
  
  extension [Self <: `716`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[InteractionsSetRestrictionsForOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[InteractionsSetRestrictionsForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
