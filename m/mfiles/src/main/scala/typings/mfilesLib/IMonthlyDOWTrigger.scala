package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMonthlyDOWTrigger extends js.Object {
  var DaysOfTheWeek: mfilesLib.MFilesNs.MFTriggerWeekDay
  var Months: mfilesLib.MFilesNs.MFTriggerMonth
  var WhichWeek: mfilesLib.MFilesNs.MFTriggerWeekOfMonth
}

object IMonthlyDOWTrigger {
  @scala.inline
  def apply(
    DaysOfTheWeek: mfilesLib.MFilesNs.MFTriggerWeekDay,
    Months: mfilesLib.MFilesNs.MFTriggerMonth,
    WhichWeek: mfilesLib.MFilesNs.MFTriggerWeekOfMonth
  ): IMonthlyDOWTrigger = {
    val __obj = js.Dynamic.literal(DaysOfTheWeek = DaysOfTheWeek, Months = Months, WhichWeek = WhichWeek)
  
    __obj.asInstanceOf[IMonthlyDOWTrigger]
  }
}

