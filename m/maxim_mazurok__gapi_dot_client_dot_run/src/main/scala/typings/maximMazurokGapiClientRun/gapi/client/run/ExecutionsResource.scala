package typings.maximMazurokGapiClientRun.gapi.client.run

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRun.anon.Accesstoken
import typings.maximMazurokGapiClientRun.anon.Alt
import typings.maximMazurokGapiClientRun.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionsResource extends StObject {
  
  /** Delete an Execution. */
  def delete(): Request[GoogleLongrunningOperation] = js.native
  def delete(request: Callback): Request[GoogleLongrunningOperation] = js.native
  
  /** Gets information about a Execution. */
  def get(): Request[GoogleCloudRunV2Execution] = js.native
  def get(request: Accesstoken): Request[GoogleCloudRunV2Execution] = js.native
  
  /** List Executions from a Job. */
  def list(): Request[GoogleCloudRunV2ListExecutionsResponse] = js.native
  def list(request: Alt): Request[GoogleCloudRunV2ListExecutionsResponse] = js.native
  
  var tasks: TasksResource = js.native
}
