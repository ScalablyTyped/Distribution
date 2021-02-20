package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMonitoring.anon.Alt
import typings.maximMazurokGapiClientMonitoring.anon.FilterKey
import typings.maximMazurokGapiClientMonitoring.anon.Key
import typings.maximMazurokGapiClientMonitoring.anon.OauthtokenPrettyPrint
import typings.maximMazurokGapiClientMonitoring.anon.ParentPrettyPrint
import typings.maximMazurokGapiClientMonitoring.anon.ServiceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicesResource extends StObject {
  
  def create(request: ParentPrettyPrint, body: Service): Request[Service] = js.native
  /** Create a Service. */
  def create(request: ServiceId): Request[Service] = js.native
  
  /** Soft delete this Service. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Get the named Service. */
  def get(): Request[Service] = js.native
  def get(request: Alt): Request[Service] = js.native
  
  /** List Services for this workspace. */
  def list(): Request[ListServicesResponse] = js.native
  def list(request: FilterKey): Request[ListServicesResponse] = js.native
  
  def patch(request: Key, body: Service): Request[Service] = js.native
  /** Update this Service. */
  def patch(request: OauthtokenPrettyPrint): Request[Service] = js.native
  
  var serviceLevelObjectives: ServiceLevelObjectivesResource = js.native
}
