package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GistsListCommentsEndpoint
import typings.octokitTypes.endpointsMod.GistsListCommentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `687` extends StObject {
  
  var parameters: RequestParameters & (Omit[GistsListCommentsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[GistsListCommentsResponseData]
}
object `687` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[GistsListCommentsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsListCommentsResponseData]
  ): `687` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`687`]
  }
  
  @scala.inline
  implicit class `687MutableBuilder`[Self <: `687`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[GistsListCommentsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListCommentsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
