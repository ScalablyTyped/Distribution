package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMonitoring.anon.Accesstoken
import typings.maximMazurokGapiClientMonitoring.anon.Alt
import typings.maximMazurokGapiClientMonitoring.anon.Callback
import typings.maximMazurokGapiClientMonitoring.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeSeriesResource extends StObject {
  
  /**
    * Creates or adds data to one or more time series. The response is empty if all time series in the request were written. If any time series could not be written, a corresponding
    * failure message is included in the error response.
    */
  def create(request: Alt): Request[js.Object] = js.native
  def create(request: Callback, body: CreateTimeSeriesRequest): Request[js.Object] = js.native
  
  /**
    * Creates or adds data to one or more service time series. A service time series is a time series for a metric from a Google Cloud service. The response is empty if all time series in
    * the request were written. If any time series could not be written, a corresponding failure message is included in the error response. This endpoint rejects writes to user-defined
    * metrics. This method is only for use by Google Cloud services. Use projects.timeSeries.create instead.
    */
  def createService(request: Alt): Request[js.Object] = js.native
  def createService(request: Callback, body: CreateTimeSeriesRequest): Request[js.Object] = js.native
  
  /** Lists time series that match a filter. */
  def list(): Request[ListTimeSeriesResponse] = js.native
  def list(request: Accesstoken): Request[ListTimeSeriesResponse] = js.native
  
  def query(request: Callback, body: QueryTimeSeriesRequest): Request[QueryTimeSeriesResponse] = js.native
  /** Queries time series using Monitoring Query Language. */
  def query(request: Fields): Request[QueryTimeSeriesResponse] = js.native
}
