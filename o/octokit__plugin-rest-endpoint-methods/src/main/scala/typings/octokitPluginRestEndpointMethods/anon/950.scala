package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetCommitActivityStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCommitActivityStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `950` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetCommitActivityStatsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetCommitActivityStatsResponseData]
}
object `950` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposGetCommitActivityStatsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetCommitActivityStatsResponseData]
  ): `950` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`950`]
  }
  
  @scala.inline
  implicit class `950MutableBuilder`[Self <: `950`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[ReposGetCommitActivityStatsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCommitActivityStatsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
