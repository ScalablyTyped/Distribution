package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsScriptTypeExecutionApiConfig extends StObject {
  
  /** Who has permission to run the API executable. */
  var access: js.UndefOr[String] = js.native
}
object GoogleAppsScriptTypeExecutionApiConfig {
  
  @scala.inline
  def apply(): GoogleAppsScriptTypeExecutionApiConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsScriptTypeExecutionApiConfig]
  }
  
  @scala.inline
  implicit class GoogleAppsScriptTypeExecutionApiConfigMutableBuilder[Self <: GoogleAppsScriptTypeExecutionApiConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
  }
}
