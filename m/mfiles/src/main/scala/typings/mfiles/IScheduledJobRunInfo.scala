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
    val __obj = js.Dynamic.literal(Cancelled = Cancelled.asInstanceOf[js.Any], CurrentStep = CurrentStep.asInstanceOf[js.Any], LastRun = LastRun.asInstanceOf[js.Any], LastRunErrors = LastRunErrors.asInstanceOf[js.Any], LastRunSucceeded = LastRunSucceeded.asInstanceOf[js.Any], NextRun = NextRun.asInstanceOf[js.Any], Running = Running.asInstanceOf[js.Any], ScheduledJobOutputInfo = ScheduledJobOutputInfo.asInstanceOf[js.Any], StepCompletionPercent = StepCompletionPercent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IScheduledJobRunInfo]
  }
}

