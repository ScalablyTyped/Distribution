package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScheduledJobRunInfo extends js.Object {
  
  val Cancelled: Boolean = js.native
  
  val CurrentStep: Double = js.native
  
  val LastRun: ITimestamp = js.native
  
  val LastRunErrors: String = js.native
  
  val LastRunSucceeded: Boolean = js.native
  
  val NextRun: ITimestamp = js.native
  
  val Running: Boolean = js.native
  
  val ScheduledJobOutputInfo: IScheduledJobOutputInfo = js.native
  
  val StepCompletionPercent: Double = js.native
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
  
  @scala.inline
  implicit class IScheduledJobRunInfoOps[Self <: IScheduledJobRunInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCancelled(value: Boolean): Self = this.set("Cancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentStep(value: Double): Self = this.set("CurrentStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRun(value: ITimestamp): Self = this.set("LastRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRunErrors(value: String): Self = this.set("LastRunErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRunSucceeded(value: Boolean): Self = this.set("LastRunSucceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextRun(value: ITimestamp): Self = this.set("NextRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunning(value: Boolean): Self = this.set("Running", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledJobOutputInfo(value: IScheduledJobOutputInfo): Self = this.set("ScheduledJobOutputInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepCompletionPercent(value: Double): Self = this.set("StepCompletionPercent", value.asInstanceOf[js.Any])
  }
}
