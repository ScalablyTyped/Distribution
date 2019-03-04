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

object IScheduledJobRunInfo {
  @scala.inline
  def apply(
    Cancelled: scala.Boolean,
    CurrentStep: scala.Double,
    LastRun: ITimestamp,
    LastRunErrors: java.lang.String,
    LastRunSucceeded: scala.Boolean,
    NextRun: ITimestamp,
    Running: scala.Boolean,
    ScheduledJobOutputInfo: IScheduledJobOutputInfo,
    StepCompletionPercent: scala.Double
  ): IScheduledJobRunInfo = {
    val __obj = js.Dynamic.literal(Cancelled = Cancelled, CurrentStep = CurrentStep, LastRun = LastRun, LastRunErrors = LastRunErrors, LastRunSucceeded = LastRunSucceeded, NextRun = NextRun, Running = Running, ScheduledJobOutputInfo = ScheduledJobOutputInfo, StepCompletionPercent = StepCompletionPercent)
  
    __obj.asInstanceOf[IScheduledJobRunInfo]
  }
}

