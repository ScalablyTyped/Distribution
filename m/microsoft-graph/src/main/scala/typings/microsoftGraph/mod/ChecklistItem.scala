package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChecklistItem
  extends StObject
     with Entity {
  
  // The date and time when the checklistItem was finished.
  var checkedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The date and time when the checklistItem was created.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // Field indicating the title of checklistItem.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // State indicating whether the item is checked off or not.
  var isChecked: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object ChecklistItem {
  
  inline def apply(): ChecklistItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChecklistItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChecklistItem] (val x: Self) extends AnyVal {
    
    inline def setCheckedDateTime(value: NullableOption[String]): Self = StObject.set(x, "checkedDateTime", value.asInstanceOf[js.Any])
    
    inline def setCheckedDateTimeNull: Self = StObject.set(x, "checkedDateTime", null)
    
    inline def setCheckedDateTimeUndefined: Self = StObject.set(x, "checkedDateTime", js.undefined)
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIsChecked(value: NullableOption[Boolean]): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
    
    inline def setIsCheckedNull: Self = StObject.set(x, "isChecked", null)
    
    inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
  }
}
