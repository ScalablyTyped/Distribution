package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlannerChecklistItem extends StObject {
  
  // Value is true if the item is checked and false otherwise.
  var isChecked: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Read-only. User ID by which this is last modified.
  var lastModifiedBy: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  /**
    * Read-only. Date and time at which this is last modified. The Timestamp type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'
    */
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Used to set the relative order of items in the checklist. The format is defined as outlined here.
  var orderHint: js.UndefOr[NullableOption[String]] = js.native
  
  // Title of the checklist item
  var title: js.UndefOr[NullableOption[String]] = js.native
}
object PlannerChecklistItem {
  
  @scala.inline
  def apply(): PlannerChecklistItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerChecklistItem]
  }
  
  @scala.inline
  implicit class PlannerChecklistItemMutableBuilder[Self <: PlannerChecklistItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsChecked(value: NullableOption[Boolean]): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCheckedNull: Self = StObject.set(x, "isChecked", null)
    
    @scala.inline
    def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    @scala.inline
    def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setOrderHint(value: NullableOption[String]): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderHintNull: Self = StObject.set(x, "orderHint", null)
    
    @scala.inline
    def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
    
    @scala.inline
    def setTitle(value: NullableOption[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleNull: Self = StObject.set(x, "title", null)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
