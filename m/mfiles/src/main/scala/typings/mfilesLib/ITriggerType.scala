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

