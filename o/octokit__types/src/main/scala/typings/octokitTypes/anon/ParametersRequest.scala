package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsRevokeGrantForApplicationEndpoint
import typings.octokitTypes.endpointsMod.AppsRevokeGrantForApplicationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersRequest extends StObject {
  
  var parameters: AppsRevokeGrantForApplicationEndpoint = js.native
  
  var request: AppsRevokeGrantForApplicationRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersRequest {
  
  @scala.inline
  def apply(
    parameters: AppsRevokeGrantForApplicationEndpoint,
    request: AppsRevokeGrantForApplicationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersRequest = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersRequest]
  }
  
  @scala.inline
  implicit class ParametersRequestMutableBuilder[Self <: ParametersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsRevokeGrantForApplicationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsRevokeGrantForApplicationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
