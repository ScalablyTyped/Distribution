package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsDeleteInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsDeleteInstallationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameters extends StObject {
  
  var parameters: AppsDeleteInstallationEndpoint = js.native
  
  var request: AppsDeleteInstallationRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object Parameters {
  
  @scala.inline
  def apply(
    parameters: AppsDeleteInstallationEndpoint,
    request: AppsDeleteInstallationRequestOptions,
    response: OctokitResponse[_]
  ): Parameters = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
  
  @scala.inline
  implicit class ParametersMutableBuilder[Self <: Parameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsDeleteInstallationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsDeleteInstallationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
