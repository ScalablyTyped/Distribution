package typings.maximMazurokGapiClientRun.gapi.client.run

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRun.anon.Accesstoken
import typings.maximMazurokGapiClientRun.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TasksResource extends StObject {
  
  /** Gets information about a Task. */
  def get(): Request[GoogleCloudRunV2Task] = js.native
  def get(request: Accesstoken): Request[GoogleCloudRunV2Task] = js.native
  
  /** List Tasks from an Execution of a Job. */
  def list(): Request[GoogleCloudRunV2ListTasksResponse] = js.native
  def list(request: Alt): Request[GoogleCloudRunV2ListTasksResponse] = js.native
}
