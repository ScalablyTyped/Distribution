package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientServiceusage.anon.Alt
import typings.maximMazurokGapiClientServiceusage.anon.Fields
import typings.maximMazurokGapiClientServiceusage.anon.Filter
import typings.maximMazurokGapiClientServiceusage.anon.Key
import typings.maximMazurokGapiClientServiceusage.anon.Name
import typings.maximMazurokGapiClientServiceusage.anon.Names
import typings.maximMazurokGapiClientServiceusage.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicesResource extends js.Object {
  
  /**
    * Enable multiple services on a project. The operation is atomic: if enabling any service fails, then the entire batch fails, and no state changes occur. To enable a single service,
    * use the `EnableService` method instead.
    */
  def batchEnable(request: Fields): Request[Operation] = js.native
  def batchEnable(request: Key, body: BatchEnableServicesRequest): Request[Operation] = js.native
  
  /** Returns the service configurations and enabled states for a given list of services. */
  def batchGet(): Request[BatchGetServicesResponse] = js.native
  def batchGet(request: Names): Request[BatchGetServicesResponse] = js.native
  
  def disable(request: Alt, body: DisableServiceRequest): Request[Operation] = js.native
  /**
    * Disable a service so that it can no longer be used with a project. This prevents unintended usage that may cause unexpected billing charges or security leaks. It is not valid to
    * call the disable method on a service that is not currently enabled. Callers will receive a `FAILED_PRECONDITION` status if the target service is not currently enabled.
    */
  def disable(request: Name): Request[Operation] = js.native
  
  def enable(request: Alt, body: EnableServiceRequest): Request[Operation] = js.native
  /** Enable a service so that it can be used with a project. */
  def enable(request: Oauthtoken): Request[Operation] = js.native
  
  /** Returns the service configuration and enabled state for a given service. */
  def get(): Request[GoogleApiServiceusageV1Service] = js.native
  def get(request: Alt): Request[GoogleApiServiceusageV1Service] = js.native
  
  /**
    * List all services available to the specified project, and the current state of those services with respect to the project. The list includes all public services, all services for
    * which the calling user has the `servicemanagement.services.bind` permission, and all services that have already been enabled on the project. The list can be filtered to only include
    * services in a specific state, for example to only include services enabled on the project. WARNING: If you need to query enabled services frequently or across an organization, you
    * should use [Cloud Asset Inventory API](https://cloud.google.com/asset-inventory/docs/apis), which provides higher throughput and richer filtering capability.
    */
  def list(): Request[ListServicesResponse] = js.native
  def list(request: Filter): Request[ListServicesResponse] = js.native
}
