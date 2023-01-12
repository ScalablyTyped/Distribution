package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaffAvailabilityItem extends StObject {
  
  // Each item in this collection indicates a slot and the status of the staff member.
  var availabilityItems: js.UndefOr[NullableOption[js.Array[AvailabilityItem]]] = js.undefined
  
  // The ID of the staff member.
  var staffId: js.UndefOr[NullableOption[String]] = js.undefined
}
object StaffAvailabilityItem {
  
  inline def apply(): StaffAvailabilityItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaffAvailabilityItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StaffAvailabilityItem] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityItems(value: NullableOption[js.Array[AvailabilityItem]]): Self = StObject.set(x, "availabilityItems", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityItemsNull: Self = StObject.set(x, "availabilityItems", null)
    
    inline def setAvailabilityItemsUndefined: Self = StObject.set(x, "availabilityItems", js.undefined)
    
    inline def setAvailabilityItemsVarargs(value: AvailabilityItem*): Self = StObject.set(x, "availabilityItems", js.Array(value*))
    
    inline def setStaffId(value: NullableOption[String]): Self = StObject.set(x, "staffId", value.asInstanceOf[js.Any])
    
    inline def setStaffIdNull: Self = StObject.set(x, "staffId", null)
    
    inline def setStaffIdUndefined: Self = StObject.set(x, "staffId", js.undefined)
  }
}
