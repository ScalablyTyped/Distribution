package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTranscoder.anon.Accesstoken
import typings.maximMazurokGapiClientTranscoder.anon.Alt
import typings.maximMazurokGapiClientTranscoder.anon.Callback
import typings.maximMazurokGapiClientTranscoder.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobsResource extends js.Object {
  
  /** Creates a job in the specified region. */
  def create(request: Accesstoken): Request[Job] = js.native
  def create(request: Alt, body: Job): Request[Job] = js.native
  
  /** Deletes a job. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Returns the job data. */
  def get(): Request[Job] = js.native
  def get(request: Callback): Request[Job] = js.native
  
  /** Lists jobs in the specified region. */
  def list(): Request[ListJobsResponse] = js.native
  def list(request: Fields): Request[ListJobsResponse] = js.native
}
