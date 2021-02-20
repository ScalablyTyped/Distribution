package typings.mfiles

import typings.mfiles.MFiles.MFTriggerWeekDay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWeeklyTrigger extends StObject {
  
  var DaysOfTheWeek: MFTriggerWeekDay = js.native
  
  var WeeksInterval: Double = js.native
}
object IWeeklyTrigger {
  
  @scala.inline
  def apply(DaysOfTheWeek: MFTriggerWeekDay, WeeksInterval: Double): IWeeklyTrigger = {
    val __obj = js.Dynamic.literal(DaysOfTheWeek = DaysOfTheWeek.asInstanceOf[js.Any], WeeksInterval = WeeksInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWeeklyTrigger]
  }
  
  @scala.inline
  implicit class IWeeklyTriggerMutableBuilder[Self <: IWeeklyTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaysOfTheWeek(value: MFTriggerWeekDay): Self = StObject.set(x, "DaysOfTheWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeeksInterval(value: Double): Self = StObject.set(x, "WeeksInterval", value.asInstanceOf[js.Any])
  }
}
