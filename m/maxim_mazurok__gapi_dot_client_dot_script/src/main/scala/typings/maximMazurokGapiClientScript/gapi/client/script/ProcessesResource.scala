package typings.maximMazurokGapiClientScript.gapi.client.script

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientScript.anon.Accesstoken
import typings.maximMazurokGapiClientScript.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessesResource extends js.Object {
  
  /** List information about processes made by or on behalf of a user, such as process type and current status. */
  def list(): Request[ListUserProcessesResponse] = js.native
  def list(request: Accesstoken): Request[ListUserProcessesResponse] = js.native
  
  /** List information about a script's executed processes, such as process type and current status. */
  def listScriptProcesses(): Request[ListScriptProcessesResponse] = js.native
  def listScriptProcesses(request: Alt): Request[ListScriptProcessesResponse] = js.native
}
