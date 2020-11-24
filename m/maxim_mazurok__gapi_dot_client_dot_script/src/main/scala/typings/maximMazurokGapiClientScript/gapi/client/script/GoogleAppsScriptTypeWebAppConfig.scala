package typings.maximMazurokGapiClientScript.gapi.client.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsScriptTypeWebAppConfig extends js.Object {
  
  /** Who has permission to run the web app. */
  var access: js.UndefOr[String] = js.native
  
  /** Who to execute the web app as. */
  var executeAs: js.UndefOr[String] = js.native
}
object GoogleAppsScriptTypeWebAppConfig {
  
  @scala.inline
  def apply(): GoogleAppsScriptTypeWebAppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsScriptTypeWebAppConfig]
  }
  
  @scala.inline
  implicit class GoogleAppsScriptTypeWebAppConfigOps[Self <: GoogleAppsScriptTypeWebAppConfig] (val x: Self) extends AnyVal {
    
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
    def setAccess(value: String): Self = this.set("access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess: Self = this.set("access", js.undefined)
    
    @scala.inline
    def setExecuteAs(value: String): Self = this.set("executeAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecuteAs: Self = this.set("executeAs", js.undefined)
  }
}
