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

