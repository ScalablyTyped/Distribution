package typings.mfiles

import typings.mfiles.MFilesNs.MFTriggerMonth
import typings.mfiles.MFilesNs.MFTriggerWeekDay
import typings.mfiles.MFilesNs.MFTriggerWeekOfMonth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMonthlyDOWTrigger extends js.Object {
  var DaysOfTheWeek: MFTriggerWeekDay
  var Months: MFTriggerMonth
  var WhichWeek: MFTriggerWeekOfMonth
}

object IMonthlyDOWTrigger {
  @scala.inline
  def apply(DaysOfTheWeek: MFTriggerWeekDay, Months: MFTriggerMonth, WhichWeek: MFTriggerWeekOfMonth): IMonthlyDOWTrigger = {
    val __obj = js.Dynamic.literal(DaysOfTheWeek = DaysOfTheWeek, Months = Months, WhichWeek = WhichWeek)
  
    __obj.asInstanceOf[IMonthlyDOWTrigger]
  }
}

