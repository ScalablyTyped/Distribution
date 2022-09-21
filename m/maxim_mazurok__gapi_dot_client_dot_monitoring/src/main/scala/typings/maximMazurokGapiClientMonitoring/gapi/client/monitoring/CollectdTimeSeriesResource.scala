package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMonitoring.anon.Callback
import typings.maximMazurokGapiClientMonitoring.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectdTimeSeriesResource extends StObject {
  
  def create(request: Callback, body: CreateCollectdTimeSeriesRequest): Request[CreateCollectdTimeSeriesResponse] = js.native
  /** Cloud Monitoring Agent only: Creates a new time series.This method is only for use by the Cloud Monitoring Agent. Use projects.timeSeries.create instead. */
  def create(request: PrettyPrint): Request[CreateCollectdTimeSeriesResponse] = js.native
}
