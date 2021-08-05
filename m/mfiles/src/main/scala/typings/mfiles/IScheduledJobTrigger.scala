package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScheduledJobTrigger extends StObject {
  
  var BeginDay: Double
  
  var BeginMonth: Double
  
  var BeginYear: Double
  
  def Clone(): IScheduledJobTrigger
  
  var EndDay: Double
  
  var EndMonth: Double
  
  var EndYear: Double
  
  var StartHour: Double
  
  var StartMinute: Double
  
  var Type: ITriggerType
  
  var ValidEndDate: Boolean
}
object IScheduledJobTrigger {
  
  inline def apply(
    BeginDay: Double,
    BeginMonth: Double,
    BeginYear: Double,
    Clone: () => IScheduledJobTrigger,
    EndDay: Double,
    EndMonth: Double,
    EndYear: Double,
    StartHour: Double,
    StartMinute: Double,
    Type: ITriggerType,
    ValidEndDate: Boolean
  ): IScheduledJobTrigger = {
    val __obj = js.Dynamic.literal(BeginDay = BeginDay.asInstanceOf[js.Any], BeginMonth = BeginMonth.asInstanceOf[js.Any], BeginYear = BeginYear.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), EndDay = EndDay.asInstanceOf[js.Any], EndMonth = EndMonth.asInstanceOf[js.Any], EndYear = EndYear.asInstanceOf[js.Any], StartHour = StartHour.asInstanceOf[js.Any], StartMinute = StartMinute.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], ValidEndDate = ValidEndDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScheduledJobTrigger]
  }
  
  extension [Self <: IScheduledJobTrigger](x: Self) {
    
    inline def setBeginDay(value: Double): Self = StObject.set(x, "BeginDay", value.asInstanceOf[js.Any])
    
    inline def setBeginMonth(value: Double): Self = StObject.set(x, "BeginMonth", value.asInstanceOf[js.Any])
    
    inline def setBeginYear(value: Double): Self = StObject.set(x, "BeginYear", value.asInstanceOf[js.Any])
    
    inline def setClone(value: () => IScheduledJobTrigger): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setEndDay(value: Double): Self = StObject.set(x, "EndDay", value.asInstanceOf[js.Any])
    
    inline def setEndMonth(value: Double): Self = StObject.set(x, "EndMonth", value.asInstanceOf[js.Any])
    
    inline def setEndYear(value: Double): Self = StObject.set(x, "EndYear", value.asInstanceOf[js.Any])
    
    inline def setStartHour(value: Double): Self = StObject.set(x, "StartHour", value.asInstanceOf[js.Any])
    
    inline def setStartMinute(value: Double): Self = StObject.set(x, "StartMinute", value.asInstanceOf[js.Any])
    
    inline def setType(value: ITriggerType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValidEndDate(value: Boolean): Self = StObject.set(x, "ValidEndDate", value.asInstanceOf[js.Any])
  }
}
