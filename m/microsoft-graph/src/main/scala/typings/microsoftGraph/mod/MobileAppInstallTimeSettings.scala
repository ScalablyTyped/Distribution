package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileAppInstallTimeSettings extends js.Object {
  
  // The time at which the app should be installed.
  var deadlineDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The time at which the app should be available for installation.
  var startDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Whether the local device time or UTC time should be used when determining the available and deadline times.
  var useLocalTime: js.UndefOr[Boolean] = js.native
}
object MobileAppInstallTimeSettings {
  
  @scala.inline
  def apply(): MobileAppInstallTimeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileAppInstallTimeSettings]
  }
  
  @scala.inline
  implicit class MobileAppInstallTimeSettingsOps[Self <: MobileAppInstallTimeSettings] (val x: Self) extends AnyVal {
    
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
    def setDeadlineDateTime(value: NullableOption[String]): Self = this.set("deadlineDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadlineDateTime: Self = this.set("deadlineDateTime", js.undefined)
    
    @scala.inline
    def setDeadlineDateTimeNull: Self = this.set("deadlineDateTime", null)
    
    @scala.inline
    def setStartDateTime(value: NullableOption[String]): Self = this.set("startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateTime: Self = this.set("startDateTime", js.undefined)
    
    @scala.inline
    def setStartDateTimeNull: Self = this.set("startDateTime", null)
    
    @scala.inline
    def setUseLocalTime(value: Boolean): Self = this.set("useLocalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLocalTime: Self = this.set("useLocalTime", js.undefined)
  }
}
