package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileAppAssignment extends Entity {
  
  /**
    * The install intent defined by the admin. Possible values are: available, required, uninstall,
    * availableWithoutEnrollment.
    */
  var intent: js.UndefOr[InstallIntent] = js.native
  
  // The settings for target assignment defined by the admin.
  var settings: js.UndefOr[NullableOption[MobileAppAssignmentSettings]] = js.native
  
  // The target group assignment defined by the admin.
  var target: js.UndefOr[NullableOption[DeviceAndAppManagementAssignmentTarget]] = js.native
}
object MobileAppAssignment {
  
  @scala.inline
  def apply(): MobileAppAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileAppAssignment]
  }
  
  @scala.inline
  implicit class MobileAppAssignmentOps[Self <: MobileAppAssignment] (val x: Self) extends AnyVal {
    
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
    def setIntent(value: InstallIntent): Self = this.set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntent: Self = this.set("intent", js.undefined)
    
    @scala.inline
    def setSettings(value: NullableOption[MobileAppAssignmentSettings]): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    
    @scala.inline
    def setSettingsNull: Self = this.set("settings", null)
    
    @scala.inline
    def setTarget(value: NullableOption[DeviceAndAppManagementAssignmentTarget]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
  }
}
