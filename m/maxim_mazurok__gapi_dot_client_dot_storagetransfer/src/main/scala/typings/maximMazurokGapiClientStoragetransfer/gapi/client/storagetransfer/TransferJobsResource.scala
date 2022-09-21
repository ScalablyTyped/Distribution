package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientStoragetransfer.anon.Filter
import typings.maximMazurokGapiClientStoragetransfer.anon.JobName
import typings.maximMazurokGapiClientStoragetransfer.anon.Oauthtoken
import typings.maximMazurokGapiClientStoragetransfer.anon.PrettyPrint
import typings.maximMazurokGapiClientStoragetransfer.anon.QuotaUser
import typings.maximMazurokGapiClientStoragetransfer.anon.Resource
import typings.maximMazurokGapiClientStoragetransfer.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferJobsResource extends StObject {
  
  /** Creates a transfer job that runs periodically. */
  def create(request: Oauthtoken): Request[TransferJob] = js.native
  def create(request: PrettyPrint, body: TransferJob): Request[TransferJob] = js.native
  
  /** Gets a transfer job. */
  def get(): Request[TransferJob] = js.native
  def get(request: JobName): Request[TransferJob] = js.native
  
  /** Lists transfer jobs. */
  def list(): Request[ListTransferJobsResponse] = js.native
  def list(request: Filter): Request[ListTransferJobsResponse] = js.native
  
  /**
    * Updates a transfer job. Updating a job's transfer spec does not affect transfer operations that are running already. **Note:** The job's status field can be modified using this RPC
    * (for example, to set a job's status to DELETED, DISABLED, or ENABLED).
    */
  def patch(request: QuotaUser): Request[TransferJob] = js.native
  def patch(request: UploadType, body: UpdateTransferJobRequest): Request[TransferJob] = js.native
  
  /**
    * Attempts to start a new TransferOperation for the current TransferJob. A TransferJob has a maximum of one active TransferOperation. If this method is called while a
    * TransferOperation is active, an error will be returned.
    */
  def run(request: Resource): Request[Operation] = js.native
  def run(request: UploadType, body: RunTransferJobRequest): Request[Operation] = js.native
}
