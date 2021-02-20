package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsMergeEndpoint
import typings.octokitTypes.endpointsMod.PullsMergeResponse405Data
import typings.octokitTypes.endpointsMod.PullsMergeResponse409Data
import typings.octokitTypes.endpointsMod.PullsMergeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `864` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsMergeEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsMergeResponseData | PullsMergeResponse405Data | PullsMergeResponse409Data] = js.native
}
object `864` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsMergeEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsMergeResponseData | PullsMergeResponse405Data | PullsMergeResponse409Data]
  ): `864` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`864`]
  }
  
  @scala.inline
  implicit class `864MutableBuilder`[Self <: `864`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[PullsMergeEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[PullsMergeResponseData | PullsMergeResponse405Data | PullsMergeResponse409Data]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
