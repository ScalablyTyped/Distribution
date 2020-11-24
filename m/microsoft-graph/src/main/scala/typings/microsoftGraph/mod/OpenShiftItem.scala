package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenShiftItem extends ShiftItem {
  
  // Count of the number of slots for the given open shift.
  var openSlotCount: js.UndefOr[Double] = js.native
}
object OpenShiftItem {
  
  @scala.inline
  def apply(): OpenShiftItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenShiftItem]
  }
  
  @scala.inline
  implicit class OpenShiftItemOps[Self <: OpenShiftItem] (val x: Self) extends AnyVal {
    
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
    def setOpenSlotCount(value: Double): Self = this.set("openSlotCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenSlotCount: Self = this.set("openSlotCount", js.undefined)
  }
}
