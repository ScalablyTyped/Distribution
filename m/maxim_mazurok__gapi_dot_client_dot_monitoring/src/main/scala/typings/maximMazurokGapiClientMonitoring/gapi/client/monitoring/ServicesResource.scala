package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMonitoring.anon.Callback
import typings.maximMazurokGapiClientMonitoring.anon.FilterKey
import typings.maximMazurokGapiClientMonitoring.anon.Oauthtoken
import typings.maximMazurokGapiClientMonitoring.anon.OauthtokenParent
import typings.maximMazurokGapiClientMonitoring.anon.OauthtokenPrettyPrint
import typings.maximMazurokGapiClientMonitoring.anon.ServiceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicesResource extends StObject {
  
  def create(request: OauthtokenParent, body: Service): Request[Service] = js.native
  /** Create a Service. */
  def create(request: ServiceId): Request[Service] = js.native
  
  /** Soft delete this Service. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Get the named Service. */
  def get(): Request[Service] = js.native
  def get(request: Callback): Request[Service] = js.native
  
  /** List Services for this Metrics Scope. */
  def list(): Request[ListServicesResponse] = js.native
  def list(request: FilterKey): Request[ListServicesResponse] = js.native
  
  /** Update this Service. */
  def patch(request: OauthtokenPrettyPrint): Request[Service] = js.native
  def patch(request: Oauthtoken, body: Service): Request[Service] = js.native
  
  var serviceLevelObjectives: ServiceLevelObjectivesResource = js.native
}
