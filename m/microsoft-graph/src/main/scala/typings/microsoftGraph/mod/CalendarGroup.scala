package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarGroup
  extends StObject
     with Entity {
  
  // The calendars in the calendar group. Navigation property. Read-only. Nullable.
  var calendars: js.UndefOr[NullableOption[js.Array[Calendar]]] = js.undefined
  
  /**
    * Identifies the version of the calendar group. Every time the calendar group is changed, ChangeKey changes as well. This
    * allows Exchange to apply changes to the correct version of the object. Read-only.
    */
  var changeKey: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The class identifier. Read-only.
  var classId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The group name.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
}
object CalendarGroup {
  
  @scala.inline
  def apply(): CalendarGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarGroup]
  }
  
  @scala.inline
  implicit class CalendarGroupMutableBuilder[Self <: CalendarGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendars(value: NullableOption[js.Array[Calendar]]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarsNull: Self = StObject.set(x, "calendars", null)
    
    @scala.inline
    def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
    
    @scala.inline
    def setCalendarsVarargs(value: Calendar*): Self = StObject.set(x, "calendars", js.Array(value :_*))
    
    @scala.inline
    def setChangeKey(value: NullableOption[String]): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeKeyNull: Self = StObject.set(x, "changeKey", null)
    
    @scala.inline
    def setChangeKeyUndefined: Self = StObject.set(x, "changeKey", js.undefined)
    
    @scala.inline
    def setClassId(value: NullableOption[String]): Self = StObject.set(x, "classId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassIdNull: Self = StObject.set(x, "classId", null)
    
    @scala.inline
    def setClassIdUndefined: Self = StObject.set(x, "classId", js.undefined)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
