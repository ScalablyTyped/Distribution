package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsScriptTypeWebAppEntryPoint extends StObject {
  
  /** The entry point's configuration. */
  var entryPointConfig: js.UndefOr[GoogleAppsScriptTypeWebAppConfig] = js.undefined
  
  /** The URL for the web application. */
  var url: js.UndefOr[String] = js.undefined
}
object GoogleAppsScriptTypeWebAppEntryPoint {
  
  inline def apply(): GoogleAppsScriptTypeWebAppEntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsScriptTypeWebAppEntryPoint]
  }
  
  extension [Self <: GoogleAppsScriptTypeWebAppEntryPoint](x: Self) {
    
    inline def setEntryPointConfig(value: GoogleAppsScriptTypeWebAppConfig): Self = StObject.set(x, "entryPointConfig", value.asInstanceOf[js.Any])
    
    inline def setEntryPointConfigUndefined: Self = StObject.set(x, "entryPointConfig", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
