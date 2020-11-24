package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientJobs.anon.Alt
import typings.maximMazurokGapiClientJobs.anon.Fields
import typings.maximMazurokGapiClientJobs.anon.Filter
import typings.maximMazurokGapiClientJobs.anon.Oauthtoken
import typings.maximMazurokGapiClientJobs.anon.Parent
import typings.maximMazurokGapiClientJobs.anon.PrettyPrint
import typings.maximMazurokGapiClientJobs.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobsResource extends js.Object {
  
  def batchDelete(request: Alt, body: BatchDeleteJobsRequest): Request[js.Object] = js.native
  /** Deletes a list of Jobs by filter. */
  def batchDelete(request: Oauthtoken): Request[js.Object] = js.native
  
  def create(request: Alt, body: CreateJobRequest): Request[Job] = js.native
  /** Creates a new job. Typically, the job becomes searchable within 10 seconds, but it may take up to 5 minutes. */
  def create(request: Parent): Request[Job] = js.native
  
  /** Deletes the specified job. Typically, the job becomes unsearchable within 10 seconds, but it may take up to 5 minutes. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Fields): Request[js.Object] = js.native
  
  /** Retrieves the specified job, whose status is OPEN or recently EXPIRED within the last 90 days. */
  def get(): Request[Job] = js.native
  def get(request: Fields): Request[Job] = js.native
  
  /** Lists jobs by filter. */
  def list(): Request[ListJobsResponse] = js.native
  def list(request: Filter): Request[ListJobsResponse] = js.native
  
  def patch(request: Fields, body: UpdateJobRequest): Request[Job] = js.native
  /** Updates specified job. Typically, updated contents become visible in search results within 10 seconds, but it may take up to 5 minutes. */
  def patch(request: PrettyPrint): Request[Job] = js.native
  
  def search(request: Alt, body: SearchJobsRequest): Request[SearchJobsResponse] = js.native
  /**
    * Searches for jobs using the provided SearchJobsRequest. This call constrains the visibility of jobs present in the database, and only returns jobs that the caller has permission to
    * search against.
    */
  def search(request: QuotaUser): Request[SearchJobsResponse] = js.native
  
  def searchForAlert(request: Alt, body: SearchJobsRequest): Request[SearchJobsResponse] = js.native
  /**
    * Searches for jobs using the provided SearchJobsRequest. This API call is intended for the use case of targeting passive job seekers (for example, job seekers who have signed up to
    * receive email alerts about potential job opportunities), and has different algorithmic adjustments that are targeted to passive job seekers. This call constrains the visibility of
    * jobs present in the database, and only returns jobs the caller has permission to search against.
    */
  def searchForAlert(request: QuotaUser): Request[SearchJobsResponse] = js.native
}
