package typings.maximMazurokGapiClientScript.gapi.client.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsScriptTypeWebAppEntryPoint extends js.Object {
  
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
  implicit class GoogleAppsScriptTypeWebAppEntryPointOps[Self <: GoogleAppsScriptTypeWebAppEntryPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntryPointConfig(value: GoogleAppsScriptTypeWebAppConfig): Self = this.set("entryPointConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntryPointConfig: Self = this.set("entryPointConfig", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
