package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutubereporting.anon.Callback
import typings.maximMazurokGapiClientYoutubereporting.anon.Fields
import typings.maximMazurokGapiClientYoutubereporting.anon.IncludeSystemManaged
import typings.maximMazurokGapiClientYoutubereporting.anon.JobId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobsResource extends js.Object {
  
  /** Creates a job and returns it. */
  def create(request: Callback): Request[Job] = js.native
  def create(request: Fields, body: Job): Request[Job] = js.native
  
  /** Deletes a job. */
  def delete(): Request[js.Object] = js.native
  def delete(request: JobId): Request[js.Object] = js.native
  
  /** Gets a job. */
  def get(): Request[Job] = js.native
  def get(request: JobId): Request[Job] = js.native
  
  /** Lists jobs. */
  def list(): Request[ListJobsResponse] = js.native
  def list(request: IncludeSystemManaged): Request[ListJobsResponse] = js.native
  
  var reports: ReportsResource = js.native
}
