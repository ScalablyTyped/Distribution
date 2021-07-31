package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetBranchEndpoint
import typings.octokitTypes.endpointsMod.ReposGetBranchResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `943` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetBranchEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetBranchResponseData]
}
object `943` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposGetBranchEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetBranchResponseData]
  ): `943` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`943`]
  }
  
  @scala.inline
  implicit class `943MutableBuilder`[Self <: `943`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ReposGetBranchEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetBranchResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
