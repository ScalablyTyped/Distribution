package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledJobRunInfo extends js.Object {
  val Cancelled: scala.Boolean
  val CurrentStep: scala.Double
  val LastRun: ITimestamp
  val LastRunErrors: java.lang.String
  val LastRunSucceeded: scala.Boolean
  val NextRun: ITimestamp
  val Running: scala.Boolean
  val ScheduledJobOutputInfo: IScheduledJobOutputInfo
  val StepCompletionPercent: scala.Double
}

