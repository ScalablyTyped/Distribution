package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleEntity extends StObject {
  
  var endDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var theme: js.UndefOr[ScheduleEntityTheme] = js.undefined
}
object ScheduleEntity {
  
  @scala.inline
  def apply(): ScheduleEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleEntity]
  }
  
  @scala.inline
  implicit class ScheduleEntityMutableBuilder[Self <: ScheduleEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    @scala.inline
    def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    @scala.inline
    def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    @scala.inline
    def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    @scala.inline
    def setTheme(value: ScheduleEntityTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
