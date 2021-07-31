package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientStoragetransfer.anon.Name
import typings.maximMazurokGapiClientStoragetransfer.anon.Oauthtoken
import typings.maximMazurokGapiClientStoragetransfer.anon.PageSize
import typings.maximMazurokGapiClientStoragetransfer.anon.PrettyPrint
import typings.maximMazurokGapiClientStoragetransfer.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferOperationsResource extends StObject {
  
  /**
    * Cancels a transfer. Use the transferOperations.get method to check if the cancellation succeeded or if the operation completed despite the `cancel` request. When you cancel an
    * operation, the currently running transfer is interrupted. For recurring transfer jobs, the next instance of the transfer job will still run. For example, if your job is configured
    * to run every day at 1pm and you cancel Monday's operation at 1:05pm, Monday's transfer will stop. However, a transfer job will still be attempted on Tuesday. This applies only to
    * currently running operations. If an operation is not currently running, `cancel` does nothing. *Caution:* Canceling a transfer job can leave your data in an unknown state. We
    * recommend that you restore the state at both the destination and the source after the `cancel` request completes so that your data is in a consistent state. When you cancel a job,
    * the next job computes a delta of files and may repair any inconsistent state. For instance, if you run a job every day, and today's job found 10 new files and transferred five files
    * before you canceled the job, tomorrow's transfer operation will compute a new delta with the five files that were not copied today plus any new files discovered tomorrow.
    */
  def cancel(request: Name): Request[js.Object] = js.native
  def cancel(request: Oauthtoken, body: CancelOperationRequest): Request[js.Object] = js.native
  
  /** Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service. */
  def get(): Request[Operation] = js.native
  def get(request: Oauthtoken): Request[Operation] = js.native
  
  /** Lists transfer operations. */
  def list(): Request[ListOperationsResponse] = js.native
  def list(request: PageSize): Request[ListOperationsResponse] = js.native
  
  def pause(request: Oauthtoken, body: PauseTransferOperationRequest): Request[js.Object] = js.native
  /** Pauses a transfer operation. */
  def pause(request: PrettyPrint): Request[js.Object] = js.native
  
  def resume(request: Oauthtoken, body: ResumeTransferOperationRequest): Request[js.Object] = js.native
  /** Resumes a transfer operation that is paused. */
  def resume(request: QuotaUser): Request[js.Object] = js.native
}
