package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsScriptTypeExecutionApiEntryPoint extends StObject {
  
  /** The entry point's configuration. */
  var entryPointConfig: js.UndefOr[GoogleAppsScriptTypeExecutionApiConfig] = js.undefined
}
object GoogleAppsScriptTypeExecutionApiEntryPoint {
  
  inline def apply(): GoogleAppsScriptTypeExecutionApiEntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsScriptTypeExecutionApiEntryPoint]
  }
  
  extension [Self <: GoogleAppsScriptTypeExecutionApiEntryPoint](x: Self) {
    
    inline def setEntryPointConfig(value: GoogleAppsScriptTypeExecutionApiConfig): Self = StObject.set(x, "entryPointConfig", value.asInstanceOf[js.Any])
    
    inline def setEntryPointConfigUndefined: Self = StObject.set(x, "entryPointConfig", js.undefined)
  }
}
