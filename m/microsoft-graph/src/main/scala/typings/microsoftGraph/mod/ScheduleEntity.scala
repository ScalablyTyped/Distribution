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
  
  inline def apply(): ScheduleEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleEntity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduleEntity] (val x: Self) extends AnyVal {
    
    inline def setEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setTheme(value: ScheduleEntityTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
