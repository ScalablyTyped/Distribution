package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MicrosoftStoreForBusinessAppAssignmentSettings extends MobileAppAssignmentSettings {
  
  // Whether or not to use device execution context for Microsoft Store for Business mobile app.
  var useDeviceContext: js.UndefOr[Boolean] = js.native
}
object MicrosoftStoreForBusinessAppAssignmentSettings {
  
  @scala.inline
  def apply(): MicrosoftStoreForBusinessAppAssignmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MicrosoftStoreForBusinessAppAssignmentSettings]
  }
  
  @scala.inline
  implicit class MicrosoftStoreForBusinessAppAssignmentSettingsOps[Self <: MicrosoftStoreForBusinessAppAssignmentSettings] (val x: Self) extends AnyVal {
    
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
    def setUseDeviceContext(value: Boolean): Self = this.set("useDeviceContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDeviceContext: Self = this.set("useDeviceContext", js.undefined)
  }
}
