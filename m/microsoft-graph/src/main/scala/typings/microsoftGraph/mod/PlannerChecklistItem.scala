package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlannerChecklistItem extends StObject {
  
  // Value is true if the item is checked and false otherwise.
  var isChecked: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Read-only. User ID by which this is last modified.
  var lastModifiedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * Read-only. Date and time at which this is last modified. The Timestamp type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Used to set the relative order of items in the checklist. The format is defined as outlined here.
  var orderHint: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Title of the checklist item
  var title: js.UndefOr[NullableOption[String]] = js.undefined
}
object PlannerChecklistItem {
  
  inline def apply(): PlannerChecklistItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerChecklistItem]
  }
  
  extension [Self <: PlannerChecklistItem](x: Self) {
    
    inline def setIsChecked(value: NullableOption[Boolean]): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
    
    inline def setIsCheckedNull: Self = StObject.set(x, "isChecked", null)
    
    inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
    
    inline def setLastModifiedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setOrderHint(value: NullableOption[String]): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
    
    inline def setOrderHintNull: Self = StObject.set(x, "orderHint", null)
    
    inline def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
    
    inline def setTitle(value: NullableOption[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
