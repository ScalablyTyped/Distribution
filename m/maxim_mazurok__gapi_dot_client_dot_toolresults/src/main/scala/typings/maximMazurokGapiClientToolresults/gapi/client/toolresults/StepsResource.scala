package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientToolresults.anon.ExecutionId
import typings.maximMazurokGapiClientToolresults.anon.HistoryId
import typings.maximMazurokGapiClientToolresults.anon.Locale
import typings.maximMazurokGapiClientToolresults.anon.QuotaUser
import typings.maximMazurokGapiClientToolresults.anon.RequestId
import typings.maximMazurokGapiClientToolresults.anon.Resource
import typings.maximMazurokGapiClientToolresults.anon.StepId
import typings.maximMazurokGapiClientToolresults.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepsResource extends js.Object {
  
  /**
    * Lists accessibility clusters for a given Step May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project -
    * INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if an argument in the request happens to be invalid; e.g. if the locale format is incorrect - NOT_FOUND - if
    * the containing Step does not exist
    */
  def accessibilityClusters(): Request[ListStepAccessibilityClustersResponse] = js.native
  def accessibilityClusters(request: Locale): Request[ListStepAccessibilityClustersResponse] = js.native
  
  /**
    * Creates a Step. The returned Step will have the id set. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to
    * project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the step is too large (more than 10Mib) - NOT_FOUND - if the containing Execution does not exist
    */
  def create(request: QuotaUser): Request[Step] = js.native
  def create(request: RequestId, body: Step): Request[Step] = js.native
  
  /**
    * Gets a Step. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is
    * malformed - NOT_FOUND - if the Step does not exist
    */
  def get(): Request[Step] = js.native
  def get(request: HistoryId): Request[Step] = js.native
  
  /** Retrieves a PerfMetricsSummary. May return any of the following error code(s): - NOT_FOUND - The specified PerfMetricsSummary does not exist */
  def getPerfMetricsSummary(): Request[PerfMetricsSummary] = js.native
  def getPerfMetricsSummary(request: HistoryId): Request[PerfMetricsSummary] = js.native
  
  /**
    * Lists Steps for a given Execution. The steps are sorted by creation_time in descending order. The step_id key will be used to order the steps with the same creation_time. May return
    * any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed -
    * FAILED_PRECONDITION - if an argument in the request happens to be invalid; e.g. if an attempt is made to list the children of a nonexistent Step - NOT_FOUND - if the containing
    * Execution does not exist
    */
  def list(): Request[ListStepsResponse] = js.native
  def list(request: ExecutionId): Request[ListStepsResponse] = js.native
  
  /**
    * Updates an existing Step with the supplied partial entity. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write
    * project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the requested state transition is illegal (e.g try to upload a duplicate xml file), if the
    * updated step is too large (more than 10Mib) - NOT_FOUND - if the containing Execution does not exist
    */
  def patch(request: Resource): Request[Step] = js.native
  def patch(request: StepId, body: Step): Request[Step] = js.native
  
  var perfMetricsSummary: PerfMetricsSummaryResource = js.native
  
  var perfSampleSeries: PerfSampleSeriesResource = js.native
  
  def publishXunitXmlFiles(request: HistoryId, body: PublishXunitXmlFilesRequest): Request[Step] = js.native
  /**
    * Publish xml files to an existing Step. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write project - INVALID_ARGUMENT
    * - if the request is malformed - FAILED_PRECONDITION - if the requested state transition is illegal, e.g try to upload a duplicate xml file or a file too large. - NOT_FOUND - if the
    * containing Execution does not exist
    */
  def publishXunitXmlFiles(request: UploadType): Request[Step] = js.native
  
  var testCases: TestCasesResource = js.native
  
  var thumbnails: ThumbnailsResource = js.native
}
