package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWeeklyTrigger extends js.Object {
  var DaysOfTheWeek: mfilesLib.MFilesNs.MFTriggerWeekDay
  var WeeksInterval: scala.Double
}

object IWeeklyTrigger {
  @scala.inline
  def apply(DaysOfTheWeek: mfilesLib.MFilesNs.MFTriggerWeekDay, WeeksInterval: scala.Double): IWeeklyTrigger = {
    val __obj = js.Dynamic.literal(DaysOfTheWeek = DaysOfTheWeek, WeeksInterval = WeeksInterval)
  
    __obj.asInstanceOf[IWeeklyTrigger]
  }
}

