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
    Clone: js.Function0[ITriggerType],
    Daily: IDailyTrigger,
    MonthlyDOW: IMonthlyDOWTrigger,
    MonthlyDate: IMonthlyDateTrigger,
    SetDailyTrigger: js.Function1[IDailyTrigger, scala.Unit],
    SetMonthlyDOW: js.Function1[IMonthlyDOWTrigger, scala.Unit],
    SetMonthlyDate: js.Function1[IMonthlyDateTrigger, scala.Unit],
    SetWeekly: js.Function1[IWeeklyTrigger, scala.Unit],
    Type: mfilesLib.MFilesNs.MFTriggerType,
    Weekly: IWeeklyTrigger
  ): ITriggerType = {
    val __obj = js.Dynamic.literal(Clone = Clone, Daily = Daily, MonthlyDOW = MonthlyDOW, MonthlyDate = MonthlyDate, SetDailyTrigger = SetDailyTrigger, SetMonthlyDOW = SetMonthlyDOW, SetMonthlyDate = SetMonthlyDate, SetWeekly = SetWeekly, Type = Type, Weekly = Weekly)
  
    __obj.asInstanceOf[ITriggerType]
  }
}

