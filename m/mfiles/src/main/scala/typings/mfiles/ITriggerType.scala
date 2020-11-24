package typings.mfiles

import typings.mfiles.MFiles.MFTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITriggerType extends js.Object {
  
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
  implicit class ITriggerTypeOps[Self <: ITriggerType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClone(value: () => ITriggerType): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDaily(value: IDailyTrigger): Self = this.set("Daily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthlyDOW(value: IMonthlyDOWTrigger): Self = this.set("MonthlyDOW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthlyDate(value: IMonthlyDateTrigger): Self = this.set("MonthlyDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDailyTrigger(value: IDailyTrigger => Unit): Self = this.set("SetDailyTrigger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMonthlyDOW(value: IMonthlyDOWTrigger => Unit): Self = this.set("SetMonthlyDOW", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMonthlyDate(value: IMonthlyDateTrigger => Unit): Self = this.set("SetMonthlyDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWeekly(value: IWeeklyTrigger => Unit): Self = this.set("SetWeekly", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: MFTriggerType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekly(value: IWeeklyTrigger): Self = this.set("Weekly", value.asInstanceOf[js.Any])
  }
}
