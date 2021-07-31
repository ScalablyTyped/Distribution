package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsScriptTypeExecutionApiEntryPoint extends StObject {
  
  /** The entry point's configuration. */
  var entryPointConfig: js.UndefOr[GoogleAppsScriptTypeExecutionApiConfig] = js.undefined
}
object GoogleAppsScriptTypeExecutionApiEntryPoint {
  
  @scala.inline
  def apply(): GoogleAppsScriptTypeExecutionApiEntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsScriptTypeExecutionApiEntryPoint]
  }
  
  @scala.inline
  implicit class GoogleAppsScriptTypeExecutionApiEntryPointMutableBuilder[Self <: GoogleAppsScriptTypeExecutionApiEntryPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntryPointConfig(value: GoogleAppsScriptTypeExecutionApiConfig): Self = StObject.set(x, "entryPointConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPointConfigUndefined: Self = StObject.set(x, "entryPointConfig", js.undefined)
  }
}
