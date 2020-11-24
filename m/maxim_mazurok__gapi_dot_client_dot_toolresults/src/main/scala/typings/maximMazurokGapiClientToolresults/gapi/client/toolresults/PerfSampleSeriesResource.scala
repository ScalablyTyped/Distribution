package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientToolresults.anon.Filter
import typings.maximMazurokGapiClientToolresults.anon.HistoryId
import typings.maximMazurokGapiClientToolresults.anon.Oauthtoken
import typings.maximMazurokGapiClientToolresults.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerfSampleSeriesResource extends js.Object {
  
  def create(request: HistoryId, body: PerfSampleSeries): Request[PerfSampleSeries] = js.native
  /**
    * Creates a PerfSampleSeries. May return any of the following error code(s): - ALREADY_EXISTS - PerfMetricSummary already exists for the given Step - NOT_FOUND - The containing Step
    * does not exist
    */
  def create(request: PrettyPrint): Request[PerfSampleSeries] = js.native
  
  /** Gets a PerfSampleSeries. May return any of the following error code(s): - NOT_FOUND - The specified PerfSampleSeries does not exist */
  def get(): Request[PerfSampleSeries] = js.native
  def get(request: Oauthtoken): Request[PerfSampleSeries] = js.native
  
  /**
    * Lists PerfSampleSeries for a given Step. The request provides an optional filter which specifies one or more PerfMetricsType to include in the result; if none returns all. The
    * resulting PerfSampleSeries are sorted by ids. May return any of the following canonical error codes: - NOT_FOUND - The containing Step does not exist
    */
  def list(): Request[ListPerfSampleSeriesResponse] = js.native
  def list(request: Filter): Request[ListPerfSampleSeriesResponse] = js.native
  
  var samples: SamplesResource = js.native
}
