package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMonitoring.anon.Alt
import typings.maximMazurokGapiClientMonitoring.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectdTimeSeriesResource extends StObject {
  
  def create(request: Alt, body: CreateCollectdTimeSeriesRequest): Request[CreateCollectdTimeSeriesResponse] = js.native
  /** Stackdriver Monitoring Agent only: Creates a new time series.This method is only for use by the Stackdriver Monitoring Agent. Use projects.timeSeries.create instead. */
  def create(request: Name): Request[CreateCollectdTimeSeriesResponse] = js.native
}
