package typings.maximMazurokGapiClientScript.gapi.client.script

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientScript.anon.Fields
import typings.maximMazurokGapiClientScript.anon.Xgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptsResource extends js.Object {
  
  def run(request: Fields, body: ExecutionRequest): Request[Operation] = js.native
  /**
    * Runs a function in an Apps Script project. The script project must be deployed for use with the Apps Script API and the calling application must share the same Cloud Platform
    * project. This method requires authorization with an OAuth 2.0 token that includes at least one of the scopes listed in the [Authorization](#authorization-scopes) section; script
    * projects that do not require authorization cannot be executed through this API. To find the correct scopes to include in the authentication token, open the project in the script
    * editor, then select **File > Project properties** and click the **Scopes** tab. The error `403, PERMISSION_DENIED: The caller does not have permission` indicates that the Cloud
    * Platform project used to authorize the request is not the same as the one used by the script.
    */
  def run(request: Xgafv): Request[Operation] = js.native
}
