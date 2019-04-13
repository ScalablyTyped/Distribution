package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ScheduledJobTriggers")
@js.native
class ScheduledJobTriggers ()
  extends mfilesLib.IScheduledJobTriggers {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override def Add(Index: scala.Double, ScheduledJobTrigger: mfilesLib.IScheduledJobTrigger): scala.Unit = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IScheduledJobTriggers = js.native
  /* CompleteClass */
  override def Item(Index: scala.Double): mfilesLib.IScheduledJobTrigger = js.native
  /* CompleteClass */
  override def Remove(Index: scala.Double): scala.Unit = js.native
}

@JSGlobal("MFiles.ScheduledJobTriggers")
@js.native
object ScheduledJobTriggers
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IScheduledJobTriggers]

