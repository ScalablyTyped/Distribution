package typings.mfiles.global.MFiles

import typings.mfiles.IScheduledJobOutputInfo
import typings.mfiles.IScheduledJobRunInfo
import typings.mfiles.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ScheduledJobRunInfo")
@js.native
class ScheduledJobRunInfo ()
  extends StObject
     with IScheduledJobRunInfo {
  
  /* CompleteClass */
  override val Cancelled: Boolean = js.native
  
  /* CompleteClass */
  override val CurrentStep: Double = js.native
  
  /* CompleteClass */
  override val LastRun: ITimestamp = js.native
  
  /* CompleteClass */
  override val LastRunErrors: String = js.native
  
  /* CompleteClass */
  override val LastRunSucceeded: Boolean = js.native
  
  /* CompleteClass */
  override val NextRun: ITimestamp = js.native
  
  /* CompleteClass */
  override val Running: Boolean = js.native
  
  /* CompleteClass */
  override val ScheduledJobOutputInfo: IScheduledJobOutputInfo = js.native
  
  /* CompleteClass */
  override val StepCompletionPercent: Double = js.native
}
