package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ScheduledJobRunInfo")
@js.native
class ScheduledJobRunInfo ()
  extends mfilesLib.IScheduledJobRunInfo {
  /* CompleteClass */
  override val Cancelled: scala.Boolean = js.native
  /* CompleteClass */
  override val CurrentStep: scala.Double = js.native
  /* CompleteClass */
  override val LastRun: mfilesLib.ITimestamp = js.native
  /* CompleteClass */
  override val LastRunErrors: java.lang.String = js.native
  /* CompleteClass */
  override val LastRunSucceeded: scala.Boolean = js.native
  /* CompleteClass */
  override val NextRun: mfilesLib.ITimestamp = js.native
  /* CompleteClass */
  override val Running: scala.Boolean = js.native
  /* CompleteClass */
  override val ScheduledJobOutputInfo: mfilesLib.IScheduledJobOutputInfo = js.native
  /* CompleteClass */
  override val StepCompletionPercent: scala.Double = js.native
}

@JSGlobal("MFiles.ScheduledJobRunInfo")
@js.native
object ScheduledJobRunInfo
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IScheduledJobRunInfo]

