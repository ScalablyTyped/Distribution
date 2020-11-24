package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserSettings extends Entity {
  
  var contributionToContentDiscoveryAsOrganizationDisabled: js.UndefOr[Boolean] = js.native
  
  var contributionToContentDiscoveryDisabled: js.UndefOr[Boolean] = js.native
  
  var shiftPreferences: js.UndefOr[NullableOption[ShiftPreferences]] = js.native
}
object UserSettings {
  
  @scala.inline
  def apply(): UserSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSettings]
  }
  
  @scala.inline
  implicit class UserSettingsOps[Self <: UserSettings] (val x: Self) extends AnyVal {
    
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
    def setContributionToContentDiscoveryAsOrganizationDisabled(value: Boolean): Self = this.set("contributionToContentDiscoveryAsOrganizationDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContributionToContentDiscoveryAsOrganizationDisabled: Self = this.set("contributionToContentDiscoveryAsOrganizationDisabled", js.undefined)
    
    @scala.inline
    def setContributionToContentDiscoveryDisabled(value: Boolean): Self = this.set("contributionToContentDiscoveryDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContributionToContentDiscoveryDisabled: Self = this.set("contributionToContentDiscoveryDisabled", js.undefined)
    
    @scala.inline
    def setShiftPreferences(value: NullableOption[ShiftPreferences]): Self = this.set("shiftPreferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShiftPreferences: Self = this.set("shiftPreferences", js.undefined)
    
    @scala.inline
    def setShiftPreferencesNull: Self = this.set("shiftPreferences", null)
  }
}
