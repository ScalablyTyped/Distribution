package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreateForkEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateForkResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `909` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposCreateForkEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposCreateForkResponseData]
}
object `909` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposCreateForkEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreateForkResponseData]
  ): `909` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`909`]
  }
  
  extension [Self <: `909`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposCreateForkEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposCreateForkResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
