package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ArchiveOldVersionsJob")
@js.native
class ArchiveOldVersionsJob ()
  extends mfilesLib.IArchiveOldVersionsJob {
  /* CompleteClass */
  override var AtLeastNDaysOlder: scala.Double = js.native
  /* CompleteClass */
  override var AtLeastNVersionsOlder: scala.Double = js.native
  /* CompleteClass */
  override var CheckedInBefore: mfilesLib.ITimestamp = js.native
  /* CompleteClass */
  override var Flags: MFExportContentFlag = js.native
  /* CompleteClass */
  override var Impersonation: mfilesLib.IImpersonation = js.native
  /* CompleteClass */
  override var MarkedForArchiving: scala.Boolean = js.native
  /* CompleteClass */
  override var NoVersionTag: scala.Boolean = js.native
  /* CompleteClass */
  override var TargetLocation: java.lang.String = js.native
  /* CompleteClass */
  override var UseAtLeastNDaysOlder: scala.Boolean = js.native
  /* CompleteClass */
  override var UseAtLeastNVersionsOlder: scala.Boolean = js.native
  /* CompleteClass */
  override var UseCheckedInBefore: scala.Boolean = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IArchiveOldVersionsJob = js.native
}

