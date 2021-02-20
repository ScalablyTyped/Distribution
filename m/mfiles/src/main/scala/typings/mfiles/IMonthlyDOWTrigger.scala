package typings.mfiles

import typings.mfiles.MFiles.MFTriggerMonth
import typings.mfiles.MFiles.MFTriggerWeekDay
import typings.mfiles.MFiles.MFTriggerWeekOfMonth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMonthlyDOWTrigger extends StObject {
  
  var DaysOfTheWeek: MFTriggerWeekDay = js.native
  
  var Months: MFTriggerMonth = js.native
  
  var WhichWeek: MFTriggerWeekOfMonth = js.native
}
object IMonthlyDOWTrigger {
  
  @scala.inline
  def apply(DaysOfTheWeek: MFTriggerWeekDay, Months: MFTriggerMonth, WhichWeek: MFTriggerWeekOfMonth): IMonthlyDOWTrigger = {
    val __obj = js.Dynamic.literal(DaysOfTheWeek = DaysOfTheWeek.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], WhichWeek = WhichWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMonthlyDOWTrigger]
  }
  
  @scala.inline
  implicit class IMonthlyDOWTriggerMutableBuilder[Self <: IMonthlyDOWTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaysOfTheWeek(value: MFTriggerWeekDay): Self = StObject.set(x, "DaysOfTheWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonths(value: MFTriggerMonth): Self = StObject.set(x, "Months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhichWeek(value: MFTriggerWeekOfMonth): Self = StObject.set(x, "WhichWeek", value.asInstanceOf[js.Any])
  }
}
