package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsScriptTypeWebAppEntryPoint extends StObject {
  
  /** The entry point's configuration. */
  var entryPointConfig: js.UndefOr[GoogleAppsScriptTypeWebAppConfig] = js.native
  
  /** The URL for the web application. */
  var url: js.UndefOr[String] = js.native
}
object GoogleAppsScriptTypeWebAppEntryPoint {
  
  @scala.inline
  def apply(): GoogleAppsScriptTypeWebAppEntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsScriptTypeWebAppEntryPoint]
  }
  
  @scala.inline
  implicit class GoogleAppsScriptTypeWebAppEntryPointMutableBuilder[Self <: GoogleAppsScriptTypeWebAppEntryPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntryPointConfig(value: GoogleAppsScriptTypeWebAppConfig): Self = StObject.set(x, "entryPointConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPointConfigUndefined: Self = StObject.set(x, "entryPointConfig", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
