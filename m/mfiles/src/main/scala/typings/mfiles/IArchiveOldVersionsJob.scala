package typings.mfiles

import typings.mfiles.MFilesNs.MFExportContentFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArchiveOldVersionsJob extends js.Object {
  var AtLeastNDaysOlder: Double
  var AtLeastNVersionsOlder: Double
  var CheckedInBefore: ITimestamp
  var Flags: MFExportContentFlag
  var Impersonation: IImpersonation
  var MarkedForArchiving: Boolean
  var NoVersionTag: Boolean
  var TargetLocation: String
  var UseAtLeastNDaysOlder: Boolean
  var UseAtLeastNVersionsOlder: Boolean
  var UseCheckedInBefore: Boolean
  def Clone(): IArchiveOldVersionsJob
}

object IArchiveOldVersionsJob {
  @scala.inline
  def apply(
    AtLeastNDaysOlder: Double,
    AtLeastNVersionsOlder: Double,
    CheckedInBefore: ITimestamp,
    Clone: () => IArchiveOldVersionsJob,
    Flags: MFExportContentFlag,
    Impersonation: IImpersonation,
    MarkedForArchiving: Boolean,
    NoVersionTag: Boolean,
    TargetLocation: String,
    UseAtLeastNDaysOlder: Boolean,
    UseAtLeastNVersionsOlder: Boolean,
    UseCheckedInBefore: Boolean
  ): IArchiveOldVersionsJob = {
    val __obj = js.Dynamic.literal(AtLeastNDaysOlder = AtLeastNDaysOlder, AtLeastNVersionsOlder = AtLeastNVersionsOlder, CheckedInBefore = CheckedInBefore, Clone = js.Any.fromFunction0(Clone), Flags = Flags, Impersonation = Impersonation, MarkedForArchiving = MarkedForArchiving, NoVersionTag = NoVersionTag, TargetLocation = TargetLocation, UseAtLeastNDaysOlder = UseAtLeastNDaysOlder, UseAtLeastNVersionsOlder = UseAtLeastNVersionsOlder, UseCheckedInBefore = UseCheckedInBefore)
  
    __obj.asInstanceOf[IArchiveOldVersionsJob]
  }
}

