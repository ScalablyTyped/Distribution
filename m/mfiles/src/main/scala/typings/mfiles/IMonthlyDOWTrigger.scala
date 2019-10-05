package typings.mfiles

import typings.mfiles.MFiles.MFTriggerMonth
import typings.mfiles.MFiles.MFTriggerWeekDay
import typings.mfiles.MFiles.MFTriggerWeekOfMonth
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

