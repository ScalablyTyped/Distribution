package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShiftItem extends ScheduleEntity {
  
  /**
    * An incremental part of a shift which can cover details of when and where an employee is during their shift. For
    * example, an assignment or a scheduled break or lunch. Required.
    */
  var activities: js.UndefOr[NullableOption[js.Array[ShiftActivity]]] = js.native
  
  // The shift label of the shiftItem.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The shift notes for the shiftItem.
  var notes: js.UndefOr[NullableOption[String]] = js.native
}
object ShiftItem {
  
  @scala.inline
  def apply(): ShiftItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShiftItem]
  }
  
  @scala.inline
  implicit class ShiftItemMutableBuilder[Self <: ShiftItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivities(value: NullableOption[js.Array[ShiftActivity]]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesNull: Self = StObject.set(x, "activities", null)
    
    @scala.inline
    def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    @scala.inline
    def setActivitiesVarargs(value: ShiftActivity*): Self = StObject.set(x, "activities", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setNotes(value: NullableOption[String]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesNull: Self = StObject.set(x, "notes", null)
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
  }
}
