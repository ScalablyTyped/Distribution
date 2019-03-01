package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceOptionsAlterEn extends js.Object {
  var restart: js.UndefOr[scala.Double | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibNumbers.`true`] = js.undefined
}

object SequenceOptionsAlterEn {
  @scala.inline
  def apply(restart: scala.Double | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibNumbers.`true` = null): SequenceOptionsAlterEn = {
    val __obj = js.Dynamic.literal()
    if (restart != null) __obj.updateDynamic("restart")(restart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceOptionsAlterEn]
  }
}

