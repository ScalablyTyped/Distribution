package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsScriptTypeAddOnEntryPoint extends StObject {
  
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
  implicit class GoogleAppsScriptTypeAddOnEntryPointMutableBuilder[Self <: GoogleAppsScriptTypeAddOnEntryPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOnType(value: String): Self = StObject.set(x, "addOnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddOnTypeUndefined: Self = StObject.set(x, "addOnType", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setHelpUrl(value: String): Self = StObject.set(x, "helpUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpUrlUndefined: Self = StObject.set(x, "helpUrl", js.undefined)
    
    @scala.inline
    def setPostInstallTipUrl(value: String): Self = StObject.set(x, "postInstallTipUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostInstallTipUrlUndefined: Self = StObject.set(x, "postInstallTipUrl", js.undefined)
    
    @scala.inline
    def setReportIssueUrl(value: String): Self = StObject.set(x, "reportIssueUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportIssueUrlUndefined: Self = StObject.set(x, "reportIssueUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
