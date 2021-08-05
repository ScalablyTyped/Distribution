package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsScriptTypeWebAppConfig extends StObject {
  
  /** Who has permission to run the web app. */
  var access: js.UndefOr[String] = js.undefined
  
  /** Who to execute the web app as. */
  var executeAs: js.UndefOr[String] = js.undefined
}
object GoogleAppsScriptTypeWebAppConfig {
  
  inline def apply(): GoogleAppsScriptTypeWebAppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsScriptTypeWebAppConfig]
  }
  
  extension [Self <: GoogleAppsScriptTypeWebAppConfig](x: Self) {
    
    inline def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    inline def setExecuteAs(value: String): Self = StObject.set(x, "executeAs", value.asInstanceOf[js.Any])
    
    inline def setExecuteAsUndefined: Self = StObject.set(x, "executeAs", js.undefined)
  }
}
