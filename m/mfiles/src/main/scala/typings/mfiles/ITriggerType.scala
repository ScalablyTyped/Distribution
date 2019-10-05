package typings.mfiles

import typings.mfiles.MFiles.MFTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITriggerType extends js.Object {
  val Daily: IDailyTrigger
  val MonthlyDOW: IMonthlyDOWTrigger
  val MonthlyDate: IMonthlyDateTrigger
  var Type: MFTriggerType
  val Weekly: IWeeklyTrigger
  def Clone(): ITriggerType
  def SetDailyTrigger(DailyTrigger: IDailyTrigger): Unit
  def SetMonthlyDOW(MonthlyDOWTrigger: IMonthlyDOWTrigger): Unit
  def SetMonthlyDate(MonthlyDateTrigger: IMonthlyDateTrigger): Unit
  def SetWeekly(WeeklyTrigger: IWeeklyTrigger): Unit
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
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Daily = Daily, MonthlyDOW = MonthlyDOW, MonthlyDate = MonthlyDate, SetDailyTrigger = js.Any.fromFunction1(SetDailyTrigger), SetMonthlyDOW = js.Any.fromFunction1(SetMonthlyDOW), SetMonthlyDate = js.Any.fromFunction1(SetMonthlyDate), SetWeekly = js.Any.fromFunction1(SetWeekly), Type = Type, Weekly = Weekly)
  
    __obj.asInstanceOf[ITriggerType]
  }
}

