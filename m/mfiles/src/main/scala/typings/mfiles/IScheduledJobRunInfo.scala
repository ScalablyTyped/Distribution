package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScheduledJobRunInfo extends StObject {
  
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
  implicit class IScheduledJobRunInfoMutableBuilder[Self <: IScheduledJobRunInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelled(value: Boolean): Self = StObject.set(x, "Cancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentStep(value: Double): Self = StObject.set(x, "CurrentStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRun(value: ITimestamp): Self = StObject.set(x, "LastRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRunErrors(value: String): Self = StObject.set(x, "LastRunErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRunSucceeded(value: Boolean): Self = StObject.set(x, "LastRunSucceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextRun(value: ITimestamp): Self = StObject.set(x, "NextRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunning(value: Boolean): Self = StObject.set(x, "Running", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledJobOutputInfo(value: IScheduledJobOutputInfo): Self = StObject.set(x, "ScheduledJobOutputInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepCompletionPercent(value: Double): Self = StObject.set(x, "StepCompletionPercent", value.asInstanceOf[js.Any])
  }
}
