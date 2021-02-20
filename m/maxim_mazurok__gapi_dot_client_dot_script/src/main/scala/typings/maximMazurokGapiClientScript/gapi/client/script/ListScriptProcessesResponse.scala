package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListScriptProcessesResponse extends StObject {
  
  /** Token for the next page of results. If empty, there are no more pages remaining. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of processes matching request parameters. */
  var processes: js.UndefOr[js.Array[GoogleAppsScriptTypeProcess]] = js.native
}
object ListScriptProcessesResponse {
  
  @scala.inline
  def apply(): ListScriptProcessesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListScriptProcessesResponse]
  }
  
  @scala.inline
  implicit class ListScriptProcessesResponseMutableBuilder[Self <: ListScriptProcessesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setProcesses(value: js.Array[GoogleAppsScriptTypeProcess]): Self = StObject.set(x, "processes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessesUndefined: Self = StObject.set(x, "processes", js.undefined)
    
    @scala.inline
    def setProcessesVarargs(value: GoogleAppsScriptTypeProcess*): Self = StObject.set(x, "processes", js.Array(value :_*))
  }
}
