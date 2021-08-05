package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsGetOrgInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsGetOrgInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `631` extends StObject {
  
  var parameters: RequestParameters & (Omit[AppsGetOrgInstallationEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[AppsGetOrgInstallationResponseData]
}
object `631` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[AppsGetOrgInstallationEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsGetOrgInstallationResponseData]
  ): `631` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`631`]
  }
  
  extension [Self <: `631`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[AppsGetOrgInstallationEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[AppsGetOrgInstallationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
