package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsScriptTypeExecutionApiConfig extends StObject {
  
  /** Who has permission to run the API executable. */
  var access: js.UndefOr[String] = js.undefined
}
object GoogleAppsScriptTypeExecutionApiConfig {
  
  inline def apply(): GoogleAppsScriptTypeExecutionApiConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsScriptTypeExecutionApiConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAppsScriptTypeExecutionApiConfig] (val x: Self) extends AnyVal {
    
    inline def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
  }
}
