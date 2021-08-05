package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ProjectsListForRepoEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `837` extends StObject {
  
  var parameters: RequestParameters & (Omit[ProjectsListForRepoEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ProjectsListForRepoResponseData]
}
object `837` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ProjectsListForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsListForRepoResponseData]
  ): `837` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`837`]
  }
  
  extension [Self <: `837`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ProjectsListForRepoEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ProjectsListForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
