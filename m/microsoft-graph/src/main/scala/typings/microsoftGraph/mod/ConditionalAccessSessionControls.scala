package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalAccessSessionControls extends js.Object {
  
  /**
    * Session control to enforce application restrictions. Only Exchange Online and Sharepoint Online support this session
    * control.
    */
  var applicationEnforcedRestrictions: js.UndefOr[NullableOption[ApplicationEnforcedRestrictionsSessionControl]] = js.native
  
  // Session control to apply cloud app security.
  var cloudAppSecurity: js.UndefOr[NullableOption[CloudAppSecuritySessionControl]] = js.native
  
  /**
    * Session control to define whether to persist cookies or not. All apps should be selected for this session control to
    * work correctly.
    */
  var persistentBrowser: js.UndefOr[NullableOption[PersistentBrowserSessionControl]] = js.native
  
  // Session control to enforce signin frequency.
  var signInFrequency: js.UndefOr[NullableOption[SignInFrequencySessionControl]] = js.native
}
object ConditionalAccessSessionControls {
  
  @scala.inline
  def apply(): ConditionalAccessSessionControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessSessionControls]
  }
  
  @scala.inline
  implicit class ConditionalAccessSessionControlsOps[Self <: ConditionalAccessSessionControls] (val x: Self) extends AnyVal {
    
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
    def setApplicationEnforcedRestrictions(value: NullableOption[ApplicationEnforcedRestrictionsSessionControl]): Self = this.set("applicationEnforcedRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationEnforcedRestrictions: Self = this.set("applicationEnforcedRestrictions", js.undefined)
    
    @scala.inline
    def setApplicationEnforcedRestrictionsNull: Self = this.set("applicationEnforcedRestrictions", null)
    
    @scala.inline
    def setCloudAppSecurity(value: NullableOption[CloudAppSecuritySessionControl]): Self = this.set("cloudAppSecurity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudAppSecurity: Self = this.set("cloudAppSecurity", js.undefined)
    
    @scala.inline
    def setCloudAppSecurityNull: Self = this.set("cloudAppSecurity", null)
    
    @scala.inline
    def setPersistentBrowser(value: NullableOption[PersistentBrowserSessionControl]): Self = this.set("persistentBrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistentBrowser: Self = this.set("persistentBrowser", js.undefined)
    
    @scala.inline
    def setPersistentBrowserNull: Self = this.set("persistentBrowser", null)
    
    @scala.inline
    def setSignInFrequency(value: NullableOption[SignInFrequencySessionControl]): Self = this.set("signInFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignInFrequency: Self = this.set("signInFrequency", js.undefined)
    
    @scala.inline
    def setSignInFrequencyNull: Self = this.set("signInFrequency", null)
  }
}
