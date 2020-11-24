package typings.maximMazurokGapiClientScript.gapi.client.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsScriptTypeAddOnEntryPoint extends js.Object {
  
  /** The add-on's required list of supported container types. */
  var addOnType: js.UndefOr[String] = js.native
  
  /** The add-on's optional description. */
  var description: js.UndefOr[String] = js.native
  
  /** The add-on's optional help URL. */
  var helpUrl: js.UndefOr[String] = js.native
  
  /** The add-on's required post install tip URL. */
  var postInstallTipUrl: js.UndefOr[String] = js.native
  
  /** The add-on's optional report issue URL. */
  var reportIssueUrl: js.UndefOr[String] = js.native
  
  /** The add-on's required title. */
  var title: js.UndefOr[String] = js.native
}
object GoogleAppsScriptTypeAddOnEntryPoint {
  
  @scala.inline
  def apply(): GoogleAppsScriptTypeAddOnEntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsScriptTypeAddOnEntryPoint]
  }
  
  @scala.inline
  implicit class GoogleAppsScriptTypeAddOnEntryPointOps[Self <: GoogleAppsScriptTypeAddOnEntryPoint] (val x: Self) extends AnyVal {
    
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
    def setAddOnType(value: String): Self = this.set("addOnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddOnType: Self = this.set("addOnType", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setHelpUrl(value: String): Self = this.set("helpUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelpUrl: Self = this.set("helpUrl", js.undefined)
    
    @scala.inline
    def setPostInstallTipUrl(value: String): Self = this.set("postInstallTipUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostInstallTipUrl: Self = this.set("postInstallTipUrl", js.undefined)
    
    @scala.inline
    def setReportIssueUrl(value: String): Self = this.set("reportIssueUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportIssueUrl: Self = this.set("reportIssueUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
