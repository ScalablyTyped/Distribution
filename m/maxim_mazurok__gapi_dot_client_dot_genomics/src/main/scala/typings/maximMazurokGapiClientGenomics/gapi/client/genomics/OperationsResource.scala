package typings.maximMazurokGapiClientGenomics.gapi.client.genomics

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGenomics.anon.Callback
import typings.maximMazurokGapiClientGenomics.anon.Fields
import typings.maximMazurokGapiClientGenomics.anon.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationsResource extends StObject {
  
  /**
    * Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. Clients may use
    * Operations.GetOperation or Operations.ListOperations to check whether the cancellation succeeded or the operation completed despite cancellation. Authorization requires the
    * following [Google IAM](https://cloud.google.com/iam) permission: * `genomics.operations.cancel`
    */
  def cancel(request: Callback): Request[js.Object] = js.native
  def cancel(request: Fields, body: CancelOperationRequest): Request[js.Object] = js.native
  
  /**
    * Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service. Authorization requires
    * the following [Google IAM](https://cloud.google.com/iam) permission: * `genomics.operations.get`
    */
  def get(): Request[Operation] = js.native
  def get(request: Fields): Request[Operation] = js.native
  
  /**
    * Lists operations that match the specified filter in the request. Authorization requires the following [Google IAM](https://cloud.google.com/iam) permission: *
    * `genomics.operations.list`
    */
  def list(): Request[ListOperationsResponse] = js.native
  def list(request: Filter): Request[ListOperationsResponse] = js.native
}
