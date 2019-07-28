package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledJobRunInfo extends js.Object {
  val Cancelled: Boolean
  val CurrentStep: Double
  val LastRun: ITimestamp
  val LastRunErrors: String
  val LastRunSucceeded: Boolean
  val NextRun: ITimestamp
  val Running: Boolean
  val ScheduledJobOutputInfo: IScheduledJobOutputInfo
  val StepCompletionPercent: Double
}

object IScheduledJobRunInfo {
  @scala.inline
  def apply(
    Cancelled: Boolean,
    CurrentStep: Double,
    LastRun: ITimestamp,
    LastRunErrors: String,
    LastRunSucceeded: Boolean,
    NextRun: ITimestamp,
    Running: Boolean,
    ScheduledJobOutputInfo: IScheduledJobOutputInfo,
    StepCompletionPercent: Double
  ): IScheduledJobRunInfo = {
    val __obj = js.Dynamic.literal(Cancelled = Cancelled, CurrentStep = CurrentStep, LastRun = LastRun, LastRunErrors = LastRunErrors, LastRunSucceeded = LastRunSucceeded, NextRun = NextRun, Running = Running, ScheduledJobOutputInfo = ScheduledJobOutputInfo, StepCompletionPercent = StepCompletionPercent)
  
    __obj.asInstanceOf[IScheduledJobRunInfo]
  }
}

