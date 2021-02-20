package typings.mfiles

import typings.mfiles.MFiles.MFTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITriggerType extends StObject {
  
  def Clone(): ITriggerType = js.native
  
  val Daily: IDailyTrigger = js.native
  
  val MonthlyDOW: IMonthlyDOWTrigger = js.native
  
  val MonthlyDate: IMonthlyDateTrigger = js.native
  
  def SetDailyTrigger(DailyTrigger: IDailyTrigger): Unit = js.native
  
  def SetMonthlyDOW(MonthlyDOWTrigger: IMonthlyDOWTrigger): Unit = js.native
  
  def SetMonthlyDate(MonthlyDateTrigger: IMonthlyDateTrigger): Unit = js.native
  
  def SetWeekly(WeeklyTrigger: IWeeklyTrigger): Unit = js.native
  
  var Type: MFTriggerType = js.native
  
  val Weekly: IWeeklyTrigger = js.native
}
object ITriggerType {
  
  @scala.inline
  def apply(
    Clone: () => ITriggerType,
    Daily: IDailyTrigger,
    MonthlyDOW: IMonthlyDOWTrigger,
    MonthlyDate: IMonthlyDateTrigger,
    SetDailyTrigger: IDailyTrigger => Unit,
    SetMonthlyDOW: IMonthlyDOWTrigger => Unit,
    SetMonthlyDate: IMonthlyDateTrigger => Unit,
    SetWeekly: IWeeklyTrigger => Unit,
    Type: MFTriggerType,
    Weekly: IWeeklyTrigger
  ): ITriggerType = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Daily = Daily.asInstanceOf[js.Any], MonthlyDOW = MonthlyDOW.asInstanceOf[js.Any], MonthlyDate = MonthlyDate.asInstanceOf[js.Any], SetDailyTrigger = js.Any.fromFunction1(SetDailyTrigger), SetMonthlyDOW = js.Any.fromFunction1(SetMonthlyDOW), SetMonthlyDate = js.Any.fromFunction1(SetMonthlyDate), SetWeekly = js.Any.fromFunction1(SetWeekly), Type = Type.asInstanceOf[js.Any], Weekly = Weekly.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITriggerType]
  }
  
  @scala.inline
  implicit class ITriggerTypeMutableBuilder[Self <: ITriggerType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => ITriggerType): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDaily(value: IDailyTrigger): Self = StObject.set(x, "Daily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthlyDOW(value: IMonthlyDOWTrigger): Self = StObject.set(x, "MonthlyDOW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthlyDate(value: IMonthlyDateTrigger): Self = StObject.set(x, "MonthlyDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDailyTrigger(value: IDailyTrigger => Unit): Self = StObject.set(x, "SetDailyTrigger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMonthlyDOW(value: IMonthlyDOWTrigger => Unit): Self = StObject.set(x, "SetMonthlyDOW", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMonthlyDate(value: IMonthlyDateTrigger => Unit): Self = StObject.set(x, "SetMonthlyDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWeekly(value: IWeeklyTrigger => Unit): Self = StObject.set(x, "SetWeekly", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: MFTriggerType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekly(value: IWeeklyTrigger): Self = StObject.set(x, "Weekly", value.asInstanceOf[js.Any])
  }
}
