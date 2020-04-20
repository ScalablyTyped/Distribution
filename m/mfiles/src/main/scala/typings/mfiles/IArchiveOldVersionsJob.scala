package typings.mfiles

import typings.mfiles.MFiles.MFExportContentFlag
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
    val __obj = js.Dynamic.literal(AtLeastNDaysOlder = AtLeastNDaysOlder.asInstanceOf[js.Any], AtLeastNVersionsOlder = AtLeastNVersionsOlder.asInstanceOf[js.Any], CheckedInBefore = CheckedInBefore.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Flags = Flags.asInstanceOf[js.Any], Impersonation = Impersonation.asInstanceOf[js.Any], MarkedForArchiving = MarkedForArchiving.asInstanceOf[js.Any], NoVersionTag = NoVersionTag.asInstanceOf[js.Any], TargetLocation = TargetLocation.asInstanceOf[js.Any], UseAtLeastNDaysOlder = UseAtLeastNDaysOlder.asInstanceOf[js.Any], UseAtLeastNVersionsOlder = UseAtLeastNVersionsOlder.asInstanceOf[js.Any], UseCheckedInBefore = UseCheckedInBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArchiveOldVersionsJob]
  }
}

