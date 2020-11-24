package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientServicemanagement.anon.Callback
import typings.maximMazurokGapiClientServicemanagement.anon.ConfigId
import typings.maximMazurokGapiClientServicemanagement.anon.Fields
import typings.maximMazurokGapiClientServicemanagement.anon.Key
import typings.maximMazurokGapiClientServicemanagement.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigsResource extends js.Object {
  
  /**
    * Creates a new service configuration (version) for a managed service. This method only stores the service configuration. To roll out the service configuration to backend systems
    * please call CreateServiceRollout. Only the 100 most recent service configurations and ones referenced by existing rollouts are kept for each service. The rest will be deleted
    * eventually.
    */
  def create(request: Callback): Request[Service] = js.native
  def create(request: Fields, body: Service): Request[Service] = js.native
  
  /** Gets a service configuration (version) for a managed service. */
  def get(): Request[Service] = js.native
  def get(request: ConfigId): Request[Service] = js.native
  
  /** Lists the history of the service configuration for a managed service, from the newest to the oldest. */
  def list(): Request[ListServiceConfigsResponse] = js.native
  def list(request: Key): Request[ListServiceConfigsResponse] = js.native
  
  def submit(request: Fields, body: SubmitConfigSourceRequest): Request[Operation] = js.native
  /**
    * Creates a new service configuration (version) for a managed service based on user-supplied configuration source files (for example: OpenAPI Specification). This method stores the
    * source configurations as well as the generated service configuration. To rollout the service configuration to other services, please call CreateServiceRollout. Only the 100 most
    * recent configuration sources and ones referenced by existing service configurtions are kept for each service. The rest will be deleted eventually. Operation
    */
  def submit(request: Oauthtoken): Request[Operation] = js.native
}
