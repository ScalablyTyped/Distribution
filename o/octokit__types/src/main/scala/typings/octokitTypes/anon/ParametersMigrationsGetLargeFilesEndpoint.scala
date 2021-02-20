package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsGetLargeFilesEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetLargeFilesRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsGetLargeFilesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsGetLargeFilesEndpoint extends StObject {
  
  var parameters: MigrationsGetLargeFilesEndpoint = js.native
  
  var request: MigrationsGetLargeFilesRequestOptions = js.native
  
  var response: OctokitResponse[MigrationsGetLargeFilesResponseData] = js.native
}
object ParametersMigrationsGetLargeFilesEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsGetLargeFilesEndpoint,
    request: MigrationsGetLargeFilesRequestOptions,
    response: OctokitResponse[MigrationsGetLargeFilesResponseData]
  ): ParametersMigrationsGetLargeFilesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsGetLargeFilesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsGetLargeFilesEndpointMutableBuilder[Self <: ParametersMigrationsGetLargeFilesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsGetLargeFilesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsGetLargeFilesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsGetLargeFilesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
