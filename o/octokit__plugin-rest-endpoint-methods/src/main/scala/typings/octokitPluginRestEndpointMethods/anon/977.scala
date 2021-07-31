package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListBranchesEndpoint
import typings.octokitTypes.endpointsMod.ReposListBranchesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `977` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposListBranchesEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposListBranchesResponseData]
}
object `977` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposListBranchesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListBranchesResponseData]
  ): `977` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`977`]
  }
  
  @scala.inline
  implicit class `977MutableBuilder`[Self <: `977`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ReposListBranchesEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListBranchesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
