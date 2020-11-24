package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindow extends js.Object {
  
  /** Daily cycle. */
  var dailyCycle: js.UndefOr[DailyCycle] = js.native
  
  /** Weekly cycle. */
  var weeklyCycle: js.UndefOr[WeeklyCycle] = js.native
}
object MaintenanceWindow {
  
  @scala.inline
  def apply(): MaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindow]
  }
  
  @scala.inline
  implicit class MaintenanceWindowOps[Self <: MaintenanceWindow] (val x: Self) extends AnyVal {
    
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
    def setDailyCycle(value: DailyCycle): Self = this.set("dailyCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDailyCycle: Self = this.set("dailyCycle", js.undefined)
    
    @scala.inline
    def setWeeklyCycle(value: WeeklyCycle): Self = this.set("weeklyCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeeklyCycle: Self = this.set("weeklyCycle", js.undefined)
  }
}
