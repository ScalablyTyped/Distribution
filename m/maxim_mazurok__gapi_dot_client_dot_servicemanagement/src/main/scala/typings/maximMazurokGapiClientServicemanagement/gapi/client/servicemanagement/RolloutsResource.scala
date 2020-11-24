package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientServicemanagement.anon.Fields
import typings.maximMazurokGapiClientServicemanagement.anon.Filter
import typings.maximMazurokGapiClientServicemanagement.anon.QuotaUser
import typings.maximMazurokGapiClientServicemanagement.anon.RolloutId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RolloutsResource extends js.Object {
  
  def create(request: Fields, body: Rollout): Request[Operation] = js.native
  /**
    * Creates a new service configuration rollout. Based on rollout, the Google Service Management will roll out the service configurations to different backend services. For example, the
    * logging configuration will be pushed to Google Cloud Logging. Please note that any previous pending and running Rollouts and associated Operations will be automatically cancelled so
    * that the latest Rollout will not be blocked by previous Rollouts. Only the 100 most recent (in any state) and the last 10 successful (if not already part of the set of 100 most
    * recent) rollouts are kept for each service. The rest will be deleted eventually. Operation
    */
  def create(request: QuotaUser): Request[Operation] = js.native
  
  /** Gets a service configuration rollout. */
  def get(): Request[Rollout] = js.native
  def get(request: RolloutId): Request[Rollout] = js.native
  
  /** Lists the history of the service configuration rollouts for a managed service, from the newest to the oldest. */
  def list(): Request[ListServiceRolloutsResponse] = js.native
  def list(request: Filter): Request[ListServiceRolloutsResponse] = js.native
}
