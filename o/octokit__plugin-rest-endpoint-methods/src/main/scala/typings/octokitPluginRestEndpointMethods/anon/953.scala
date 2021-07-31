package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetCommunityProfileMetricsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCommunityProfileMetricsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `953` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetCommunityProfileMetricsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetCommunityProfileMetricsResponseData]
}
object `953` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposGetCommunityProfileMetricsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetCommunityProfileMetricsResponseData]
  ): `953` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`953`]
  }
  
  @scala.inline
  implicit class `953MutableBuilder`[Self <: `953`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[ReposGetCommunityProfileMetricsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCommunityProfileMetricsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
