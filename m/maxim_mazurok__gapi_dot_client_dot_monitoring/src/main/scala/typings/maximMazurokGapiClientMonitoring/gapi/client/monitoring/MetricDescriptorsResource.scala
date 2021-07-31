package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMonitoring.anon.Alt
import typings.maximMazurokGapiClientMonitoring.anon.PageSize
import typings.maximMazurokGapiClientMonitoring.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricDescriptorsResource extends StObject {
  
  def create(request: Alt, body: MetricDescriptor): Request[MetricDescriptor] = js.native
  /** Creates a new metric descriptor. User-created metric descriptors define custom metrics (https://cloud.google.com/monitoring/custom-metrics). */
  def create(request: Resource): Request[MetricDescriptor] = js.native
  
  /** Deletes a metric descriptor. Only user-created custom metrics (https://cloud.google.com/monitoring/custom-metrics) can be deleted. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Gets a single metric descriptor. This method does not require a Workspace. */
  def get(): Request[MetricDescriptor] = js.native
  def get(request: Alt): Request[MetricDescriptor] = js.native
  
  /** Lists metric descriptors that match a filter. This method does not require a Workspace. */
  def list(): Request[ListMetricDescriptorsResponse] = js.native
  def list(request: PageSize): Request[ListMetricDescriptorsResponse] = js.native
}
