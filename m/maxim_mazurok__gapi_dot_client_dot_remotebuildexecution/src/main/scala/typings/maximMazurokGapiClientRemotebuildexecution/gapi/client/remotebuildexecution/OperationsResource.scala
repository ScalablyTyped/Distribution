package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRemotebuildexecution.anon.Name
import typings.maximMazurokGapiClientRemotebuildexecution.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationsResource extends StObject {
  
  /**
    * Wait for an execution operation to complete. When the client initially makes the request, the server immediately responds with the current status of the execution. The server will
    * leave the request stream open until the operation completes, and then respond with the completed operation. The server MAY choose to stream additional updates as execution
    * progresses, such as to provide an update as to the state of the execution.
    */
  def waitExecution(request: Name): Request[GoogleLongrunningOperation] = js.native
  def waitExecution(request: QuotaUser, body: BuildBazelRemoteExecutionV2WaitExecutionRequest): Request[GoogleLongrunningOperation] = js.native
}
