package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenShiftItem
  extends StObject
     with ShiftItem {
  
  // Count of the number of slots for the given open shift.
  var openSlotCount: js.UndefOr[Double] = js.undefined
}
object OpenShiftItem {
  
  inline def apply(): OpenShiftItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenShiftItem]
  }
  
  extension [Self <: OpenShiftItem](x: Self) {
    
    inline def setOpenSlotCount(value: Double): Self = StObject.set(x, "openSlotCount", value.asInstanceOf[js.Any])
    
    inline def setOpenSlotCountUndefined: Self = StObject.set(x, "openSlotCount", js.undefined)
  }
}
