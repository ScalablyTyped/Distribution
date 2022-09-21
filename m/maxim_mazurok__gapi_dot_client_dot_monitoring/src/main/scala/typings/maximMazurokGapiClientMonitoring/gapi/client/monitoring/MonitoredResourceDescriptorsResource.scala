package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMonitoring.anon.Callback
import typings.maximMazurokGapiClientMonitoring.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoredResourceDescriptorsResource extends StObject {
  
  /** Gets a single monitored resource descriptor. */
  def get(): Request[MonitoredResourceDescriptor] = js.native
  def get(request: Callback): Request[MonitoredResourceDescriptor] = js.native
  
  /** Lists monitored resource descriptors that match a filter. */
  def list(): Request[ListMonitoredResourceDescriptorsResponse] = js.native
  def list(request: PageSize): Request[ListMonitoredResourceDescriptorsResponse] = js.native
}
