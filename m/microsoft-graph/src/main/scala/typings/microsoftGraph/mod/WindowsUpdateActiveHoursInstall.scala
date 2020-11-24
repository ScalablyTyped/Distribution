package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsUpdateActiveHoursInstall extends WindowsUpdateInstallScheduleType {
  
  // Active Hours End
  var activeHoursEnd: js.UndefOr[String] = js.native
  
  // Active Hours Start
  var activeHoursStart: js.UndefOr[String] = js.native
}
object WindowsUpdateActiveHoursInstall {
  
  @scala.inline
  def apply(): WindowsUpdateActiveHoursInstall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUpdateActiveHoursInstall]
  }
  
  @scala.inline
  implicit class WindowsUpdateActiveHoursInstallOps[Self <: WindowsUpdateActiveHoursInstall] (val x: Self) extends AnyVal {
    
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
    def setActiveHoursEnd(value: String): Self = this.set("activeHoursEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveHoursEnd: Self = this.set("activeHoursEnd", js.undefined)
    
    @scala.inline
    def setActiveHoursStart(value: String): Self = this.set("activeHoursStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveHoursStart: Self = this.set("activeHoursStart", js.undefined)
  }
}
