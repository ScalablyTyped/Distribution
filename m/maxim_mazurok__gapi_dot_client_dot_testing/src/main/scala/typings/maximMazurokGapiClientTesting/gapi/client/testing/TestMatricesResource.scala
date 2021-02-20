package typings.maximMazurokGapiClientTesting.gapi.client.testing

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTesting.anon.Callback
import typings.maximMazurokGapiClientTesting.anon.Fields
import typings.maximMazurokGapiClientTesting.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestMatricesResource extends StObject {
  
  /**
    * Cancels unfinished test executions in a test matrix. This call returns immediately and cancellation proceeds asynchronously. If the matrix is already final, this operation will have
    * no effect. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is
    * malformed - NOT_FOUND - if the Test Matrix does not exist
    */
  def cancel(): Request[CancelTestMatrixResponse] = js.native
  def cancel(request: Callback): Request[CancelTestMatrixResponse] = js.native
  
  /**
    * Creates and runs a matrix of tests according to the given specifications. Unsupported environments will be returned in the state UNSUPPORTED. A test matrix is limited to use at most
    * 2000 devices in parallel. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the
    * request is malformed or if the matrix tries to use too many simultaneous devices.
    */
  def create(request: Fields): Request[TestMatrix] = js.native
  def create(request: Key, body: TestMatrix): Request[TestMatrix] = js.native
  
  /**
    * Checks the status of a test matrix. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT -
    * if the request is malformed - NOT_FOUND - if the Test Matrix does not exist
    */
  def get(): Request[TestMatrix] = js.native
  def get(request: Callback): Request[TestMatrix] = js.native
}
