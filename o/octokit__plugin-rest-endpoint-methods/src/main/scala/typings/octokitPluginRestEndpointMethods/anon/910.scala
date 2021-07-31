package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreateInOrgEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `910` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposCreateInOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposCreateInOrgResponseData]
}
object `910` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposCreateInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreateInOrgResponseData]
  ): `910` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`910`]
  }
  
  @scala.inline
  implicit class `910MutableBuilder`[Self <: `910`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ReposCreateInOrgEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
