package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITriggerType extends js.Object {
  val Daily: IDailyTrigger
  val MonthlyDOW: IMonthlyDOWTrigger
  val MonthlyDate: IMonthlyDateTrigger
  var Type: mfilesLib.MFilesNs.MFTriggerType
  val Weekly: IWeeklyTrigger
  def Clone(): ITriggerType
  def SetDailyTrigger(DailyTrigger: IDailyTrigger): scala.Unit
  def SetMonthlyDOW(MonthlyDOWTrigger: IMonthlyDOWTrigger): scala.Unit
  def SetMonthlyDate(MonthlyDateTrigger: IMonthlyDateTrigger): scala.Unit
  def SetWeekly(WeeklyTrigger: IWeeklyTrigger): scala.Unit
}

object ITriggerType {
  @scala.inline
  def apply(
    Clone: () => ITriggerType,
    Daily: IDailyTrigger,
    MonthlyDOW: IMonthlyDOWTrigger,
    MonthlyDate: IMonthlyDateTrigger,
    SetDailyTrigger: IDailyTrigger => scala.Unit,
    SetMonthlyDOW: IMonthlyDOWTrigger => scala.Unit,
    SetMonthlyDate: IMonthlyDateTrigger => scala.Unit,
    SetWeekly: IWeeklyTrigger => scala.Unit,
    Type: mfilesLib.MFilesNs.MFTriggerType,
    Weekly: IWeeklyTrigger
  ): ITriggerType = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Daily = Daily, MonthlyDOW = MonthlyDOW, MonthlyDate = MonthlyDate, SetDailyTrigger = js.Any.fromFunction1(SetDailyTrigger), SetMonthlyDOW = js.Any.fromFunction1(SetMonthlyDOW), SetMonthlyDate = js.Any.fromFunction1(SetMonthlyDate), SetWeekly = js.Any.fromFunction1(SetWeekly), Type = Type, Weekly = Weekly)
  
    __obj.asInstanceOf[ITriggerType]
  }
}

