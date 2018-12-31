package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionCreateAssignment extends js.Object {
  var AssignedTo: IUserOrUserGroupIDExs
  var Deadline: scala.Boolean
  var DeadlineInDays: scala.Double
  var Description: java.lang.String
  var MonitoredBy: IUserOrUserGroupIDExs
  var Title: java.lang.String
  def Clone(): IActionCreateAssignment
}

