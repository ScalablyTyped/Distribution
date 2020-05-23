package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IScheduledJobOutputInfo
import typings.mfiles.IScheduledJobRunInfo
import typings.mfiles.ITimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ScheduledJobRunInfo")
@js.native
class ScheduledJobRunInfo () extends IScheduledJobRunInfo {
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

@JSGlobal("MFiles.ScheduledJobRunInfo")
@js.native
object ScheduledJobRunInfo extends Instantiable0[IScheduledJobRunInfo]

