package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsCreateFromManifestEndpoint
import typings.octokitTypes.endpointsMod.AppsCreateFromManifestRequestOptions
import typings.octokitTypes.endpointsMod.AppsCreateFromManifestResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsCreateFromManifestEndpoint extends StObject {
  
  var parameters: AppsCreateFromManifestEndpoint = js.native
  
  var request: AppsCreateFromManifestRequestOptions = js.native
  
  var response: OctokitResponse[AppsCreateFromManifestResponseData] = js.native
}
object ParametersAppsCreateFromManifestEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsCreateFromManifestEndpoint,
    request: AppsCreateFromManifestRequestOptions,
    response: OctokitResponse[AppsCreateFromManifestResponseData]
  ): ParametersAppsCreateFromManifestEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsCreateFromManifestEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsCreateFromManifestEndpointMutableBuilder[Self <: ParametersAppsCreateFromManifestEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsCreateFromManifestEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsCreateFromManifestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsCreateFromManifestResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
