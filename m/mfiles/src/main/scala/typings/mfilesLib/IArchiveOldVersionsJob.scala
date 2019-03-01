package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArchiveOldVersionsJob extends js.Object {
  var AtLeastNDaysOlder: scala.Double
  var AtLeastNVersionsOlder: scala.Double
  var CheckedInBefore: ITimestamp
  var Flags: mfilesLib.MFilesNs.MFExportContentFlag
  var Impersonation: IImpersonation
  var MarkedForArchiving: scala.Boolean
  var NoVersionTag: scala.Boolean
  var TargetLocation: java.lang.String
  var UseAtLeastNDaysOlder: scala.Boolean
  var UseAtLeastNVersionsOlder: scala.Boolean
  var UseCheckedInBefore: scala.Boolean
  def Clone(): IArchiveOldVersionsJob
}

object IArchiveOldVersionsJob {
  @scala.inline
  def apply(
    AtLeastNDaysOlder: scala.Double,
    AtLeastNVersionsOlder: scala.Double,
    CheckedInBefore: ITimestamp,
    Clone: js.Function0[IArchiveOldVersionsJob],
    Flags: mfilesLib.MFilesNs.MFExportContentFlag,
    Impersonation: IImpersonation,
    MarkedForArchiving: scala.Boolean,
    NoVersionTag: scala.Boolean,
    TargetLocation: java.lang.String,
    UseAtLeastNDaysOlder: scala.Boolean,
    UseAtLeastNVersionsOlder: scala.Boolean,
    UseCheckedInBefore: scala.Boolean
  ): IArchiveOldVersionsJob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AtLeastNDaysOlder")(AtLeastNDaysOlder)
    __obj.updateDynamic("AtLeastNVersionsOlder")(AtLeastNVersionsOlder)
    __obj.updateDynamic("CheckedInBefore")(CheckedInBefore)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Flags")(Flags)
    __obj.updateDynamic("Impersonation")(Impersonation)
    __obj.updateDynamic("MarkedForArchiving")(MarkedForArchiving)
    __obj.updateDynamic("NoVersionTag")(NoVersionTag)
    __obj.updateDynamic("TargetLocation")(TargetLocation)
    __obj.updateDynamic("UseAtLeastNDaysOlder")(UseAtLeastNDaysOlder)
    __obj.updateDynamic("UseAtLeastNVersionsOlder")(UseAtLeastNVersionsOlder)
    __obj.updateDynamic("UseCheckedInBefore")(UseCheckedInBefore)
    __obj.asInstanceOf[IArchiveOldVersionsJob]
  }
}

