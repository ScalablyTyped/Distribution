package typings.mfiles

import typings.mfiles.MFilesNs.MFTriggerWeekDay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWeeklyTrigger extends js.Object {
  var DaysOfTheWeek: MFTriggerWeekDay
  var WeeksInterval: Double
}

object IWeeklyTrigger {
  @scala.inline
  def apply(DaysOfTheWeek: MFTriggerWeekDay, WeeksInterval: Double): IWeeklyTrigger = {
    val __obj = js.Dynamic.literal(DaysOfTheWeek = DaysOfTheWeek, WeeksInterval = WeeksInterval)
  
    __obj.asInstanceOf[IWeeklyTrigger]
  }
}

