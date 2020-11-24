package typings.maximMazurokGapiClientLogging.gapi.client.logging

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientLogging.anon.Fields
import typings.maximMazurokGapiClientLogging.anon.KeyMetricName
import typings.maximMazurokGapiClientLogging.anon.KeyOauthtoken
import typings.maximMazurokGapiClientLogging.anon.MetricName
import typings.maximMazurokGapiClientLogging.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricsResource extends js.Object {
  
  /** Creates a logs-based metric. */
  def create(request: KeyOauthtoken): Request[LogMetric] = js.native
  def create(request: UploadType, body: LogMetric): Request[LogMetric] = js.native
  
  /** Deletes a logs-based metric. */
  def delete(): Request[js.Object] = js.native
  def delete(request: MetricName): Request[js.Object] = js.native
  
  /** Gets a logs-based metric. */
  def get(): Request[LogMetric] = js.native
  def get(request: MetricName): Request[LogMetric] = js.native
  
  /** Lists logs-based metrics. */
  def list(): Request[ListLogMetricsResponse] = js.native
  def list(request: Fields): Request[ListLogMetricsResponse] = js.native
  
  /** Creates or updates a logs-based metric. */
  def update(request: KeyMetricName): Request[LogMetric] = js.native
  def update(request: MetricName, body: LogMetric): Request[LogMetric] = js.native
}
