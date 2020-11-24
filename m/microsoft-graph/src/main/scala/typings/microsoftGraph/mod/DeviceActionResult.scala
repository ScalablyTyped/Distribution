package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceActionResult extends js.Object {
  
  // Action name
  var actionName: js.UndefOr[NullableOption[String]] = js.native
  
  // State of the action. Possible values are: none, pending, canceled, active, done, failed, notSupported.
  var actionState: js.UndefOr[ActionState] = js.native
  
  // Time the action state was last updated
  var lastUpdatedDateTime: js.UndefOr[String] = js.native
  
  // Time the action was initiated
  var startDateTime: js.UndefOr[String] = js.native
}
object DeviceActionResult {
  
  @scala.inline
  def apply(): DeviceActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceActionResult]
  }
  
  @scala.inline
  implicit class DeviceActionResultOps[Self <: DeviceActionResult] (val x: Self) extends AnyVal {
    
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
    def setActionName(value: NullableOption[String]): Self = this.set("actionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionName: Self = this.set("actionName", js.undefined)
    
    @scala.inline
    def setActionNameNull: Self = this.set("actionName", null)
    
    @scala.inline
    def setActionState(value: ActionState): Self = this.set("actionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionState: Self = this.set("actionState", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: String): Self = this.set("lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDateTime: Self = this.set("lastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setStartDateTime(value: String): Self = this.set("startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateTime: Self = this.set("startDateTime", js.undefined)
  }
}
