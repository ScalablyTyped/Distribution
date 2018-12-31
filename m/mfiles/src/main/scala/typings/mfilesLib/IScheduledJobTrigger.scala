package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledJobTrigger extends js.Object {
  var BeginDay: scala.Double
  var BeginMonth: scala.Double
  var BeginYear: scala.Double
  var EndDay: scala.Double
  var EndMonth: scala.Double
  var EndYear: scala.Double
  var StartHour: scala.Double
  var StartMinute: scala.Double
  var Type: ITriggerType
  var ValidEndDate: scala.Boolean
  def Clone(): IScheduledJobTrigger
}

