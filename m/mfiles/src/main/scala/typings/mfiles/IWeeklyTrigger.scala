package typings.mfiles

import typings.mfiles.MFiles.MFTriggerWeekDay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWeeklyTrigger extends StObject {
  
  var DaysOfTheWeek: MFTriggerWeekDay
  
  var WeeksInterval: Double
}
object IWeeklyTrigger {
  
  inline def apply(DaysOfTheWeek: MFTriggerWeekDay, WeeksInterval: Double): IWeeklyTrigger = {
    val __obj = js.Dynamic.literal(DaysOfTheWeek = DaysOfTheWeek.asInstanceOf[js.Any], WeeksInterval = WeeksInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWeeklyTrigger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWeeklyTrigger] (val x: Self) extends AnyVal {
    
    inline def setDaysOfTheWeek(value: MFTriggerWeekDay): Self = StObject.set(x, "DaysOfTheWeek", value.asInstanceOf[js.Any])
    
    inline def setWeeksInterval(value: Double): Self = StObject.set(x, "WeeksInterval", value.asInstanceOf[js.Any])
  }
}
