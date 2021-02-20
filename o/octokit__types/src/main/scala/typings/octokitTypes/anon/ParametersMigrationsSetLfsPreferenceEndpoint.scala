package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsSetLfsPreferenceEndpoint
import typings.octokitTypes.endpointsMod.MigrationsSetLfsPreferenceRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsSetLfsPreferenceResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsSetLfsPreferenceEndpoint extends StObject {
  
  var parameters: MigrationsSetLfsPreferenceEndpoint = js.native
  
  var request: MigrationsSetLfsPreferenceRequestOptions = js.native
  
  var response: OctokitResponse[MigrationsSetLfsPreferenceResponseData] = js.native
}
object ParametersMigrationsSetLfsPreferenceEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsSetLfsPreferenceEndpoint,
    request: MigrationsSetLfsPreferenceRequestOptions,
    response: OctokitResponse[MigrationsSetLfsPreferenceResponseData]
  ): ParametersMigrationsSetLfsPreferenceEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsSetLfsPreferenceEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsSetLfsPreferenceEndpointMutableBuilder[Self <: ParametersMigrationsSetLfsPreferenceEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsSetLfsPreferenceEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsSetLfsPreferenceRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsSetLfsPreferenceResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
