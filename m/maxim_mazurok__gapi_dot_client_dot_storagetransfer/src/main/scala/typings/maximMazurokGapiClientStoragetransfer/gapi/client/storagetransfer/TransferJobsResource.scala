package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientStoragetransfer.anon.Alt
import typings.maximMazurokGapiClientStoragetransfer.anon.Callback
import typings.maximMazurokGapiClientStoragetransfer.anon.Fields
import typings.maximMazurokGapiClientStoragetransfer.anon.Filter
import typings.maximMazurokGapiClientStoragetransfer.anon.JobName
import typings.maximMazurokGapiClientStoragetransfer.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferJobsResource extends StObject {
  
  /** Creates a transfer job that runs periodically. */
  def create(request: Alt): Request[TransferJob] = js.native
  def create(request: Callback, body: TransferJob): Request[TransferJob] = js.native
  
  /** Gets a transfer job. */
  def get(): Request[TransferJob] = js.native
  def get(request: Fields): Request[TransferJob] = js.native
  
  /** Lists transfer jobs. */
  def list(): Request[ListTransferJobsResponse] = js.native
  def list(request: Filter): Request[ListTransferJobsResponse] = js.native
  
  /**
    * Updates a transfer job. Updating a job's transfer spec does not affect transfer operations that are running already. **Note:** The job's status field can be modified using this RPC
    * (for example, to set a job's status to DELETED, DISABLED, or ENABLED).
    */
  def patch(request: JobName): Request[TransferJob] = js.native
  def patch(request: Key, body: UpdateTransferJobRequest): Request[TransferJob] = js.native
}
