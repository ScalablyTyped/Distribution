package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMonitoring.anon.AggregationalignmentPeriod
import typings.maximMazurokGapiClientMonitoring.anon.Alt
import typings.maximMazurokGapiClientMonitoring.anon.AltCallback
import typings.maximMazurokGapiClientMonitoring.anon.CallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeSeriesResource extends js.Object {
  
  /**
    * Creates or adds data to one or more time series. The response is empty if all time series in the request were written. If any time series could not be written, a corresponding
    * failure message is included in the error response.
    */
  def create(request: AltCallback): Request[js.Object] = js.native
  def create(request: Alt, body: CreateTimeSeriesRequest): Request[js.Object] = js.native
  
  /** Lists time series that match a filter. This method does not require a Workspace. */
  def list(): Request[ListTimeSeriesResponse] = js.native
  def list(request: AggregationalignmentPeriod): Request[ListTimeSeriesResponse] = js.native
  
  def query(request: Alt, body: QueryTimeSeriesRequest): Request[QueryTimeSeriesResponse] = js.native
  /** Queries time series using Monitoring Query Language. This method does not require a Workspace. */
  def query(request: CallbackFields): Request[QueryTimeSeriesResponse] = js.native
}
