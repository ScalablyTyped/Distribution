package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class OpenShiftItemMutableBuilder[Self <: OpenShiftItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenSlotCount(value: Double): Self = StObject.set(x, "openSlotCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenSlotCountUndefined: Self = StObject.set(x, "openSlotCount", js.undefined)
  }
}
