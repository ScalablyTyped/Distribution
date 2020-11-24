package typings.maximMazurokGapiClientScript.gapi.client.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsScriptTypeExecutionApiEntryPoint extends js.Object {
  
  /** The entry point's configuration. */
  var entryPointConfig: js.UndefOr[GoogleAppsScriptTypeExecutionApiConfig] = js.native
}
object GoogleAppsScriptTypeExecutionApiEntryPoint {
  
  @scala.inline
  def apply(): GoogleAppsScriptTypeExecutionApiEntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsScriptTypeExecutionApiEntryPoint]
  }
  
  @scala.inline
  implicit class GoogleAppsScriptTypeExecutionApiEntryPointOps[Self <: GoogleAppsScriptTypeExecutionApiEntryPoint] (val x: Self) extends AnyVal {
    
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
    def setEntryPointConfig(value: GoogleAppsScriptTypeExecutionApiConfig): Self = this.set("entryPointConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntryPointConfig: Self = this.set("entryPointConfig", js.undefined)
  }
}
