package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListScriptProcessesResponse extends StObject {
  
  /** Token for the next page of results. If empty, there are no more pages remaining. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** List of processes matching request parameters. */
  var processes: js.UndefOr[js.Array[GoogleAppsScriptTypeProcess]] = js.undefined
}
object ListScriptProcessesResponse {
  
  inline def apply(): ListScriptProcessesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListScriptProcessesResponse]
  }
  
  extension [Self <: ListScriptProcessesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProcesses(value: js.Array[GoogleAppsScriptTypeProcess]): Self = StObject.set(x, "processes", value.asInstanceOf[js.Any])
    
    inline def setProcessesUndefined: Self = StObject.set(x, "processes", js.undefined)
    
    inline def setProcessesVarargs(value: GoogleAppsScriptTypeProcess*): Self = StObject.set(x, "processes", js.Array(value*))
  }
}
