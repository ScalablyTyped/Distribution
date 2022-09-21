package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientJobs.anon.Accesstoken
import typings.maximMazurokGapiClientJobs.anon.Callback
import typings.maximMazurokGapiClientJobs.anon.Filter
import typings.maximMazurokGapiClientJobs.anon.Oauthtoken
import typings.maximMazurokGapiClientJobs.anon.Parent
import typings.maximMazurokGapiClientJobs.anon.PrettyPrint
import typings.maximMazurokGapiClientJobs.anon.QuotaUser
import typings.maximMazurokGapiClientJobs.anon.Resource
import typings.maximMazurokGapiClientJobs.anon.UpdateMask
import typings.maximMazurokGapiClientJobs.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobsResource extends StObject {
  
  def batchCreate(request: Callback, body: BatchCreateJobsRequest): Request[Operation] = js.native
  /** Begins executing a batch create jobs operation. */
  def batchCreate(request: Parent): Request[Operation] = js.native
  
  def batchDelete(request: Callback, body: BatchDeleteJobsRequest): Request[Operation] = js.native
  /** Begins executing a batch delete jobs operation. */
  def batchDelete(request: PrettyPrint): Request[Operation] = js.native
  
  def batchUpdate(request: Callback, body: BatchUpdateJobsRequest): Request[Operation] = js.native
  /** Begins executing a batch update jobs operation. */
  def batchUpdate(request: QuotaUser): Request[Operation] = js.native
  
  def create(request: Callback, body: Job): Request[Job] = js.native
  /** Creates a new job. Typically, the job becomes searchable within 10 seconds, but it may take up to 5 minutes. */
  def create(request: Resource): Request[Job] = js.native
  
  /** Deletes the specified job. Typically, the job becomes unsearchable within 10 seconds, but it may take up to 5 minutes. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Retrieves the specified job, whose status is OPEN or recently EXPIRED within the last 90 days. */
  def get(): Request[Job] = js.native
  def get(request: Accesstoken): Request[Job] = js.native
  
  /** Lists jobs by filter. */
  def list(): Request[ListJobsResponse] = js.native
  def list(request: Filter): Request[ListJobsResponse] = js.native
  
  def patch(request: Oauthtoken, body: Job): Request[Job] = js.native
  /** Updates specified job. Typically, updated contents become visible in search results within 10 seconds, but it may take up to 5 minutes. */
  def patch(request: UpdateMask): Request[Job] = js.native
  
  def search(request: Callback, body: SearchJobsRequest): Request[SearchJobsResponse] = js.native
  /**
    * Searches for jobs using the provided SearchJobsRequest. This call constrains the visibility of jobs present in the database, and only returns jobs that the caller has permission to
    * search against.
    */
  def search(request: UploadType): Request[SearchJobsResponse] = js.native
  
  def searchForAlert(request: Callback, body: SearchJobsRequest): Request[SearchJobsResponse] = js.native
  /**
    * Searches for jobs using the provided SearchJobsRequest. This API call is intended for the use case of targeting passive job seekers (for example, job seekers who have signed up to
    * receive email alerts about potential job opportunities), it has different algorithmic adjustments that are designed to specifically target passive job seekers. This call constrains
    * the visibility of jobs present in the database, and only returns jobs the caller has permission to search against.
    */
  def searchForAlert(request: UploadType): Request[SearchJobsResponse] = js.native
}
