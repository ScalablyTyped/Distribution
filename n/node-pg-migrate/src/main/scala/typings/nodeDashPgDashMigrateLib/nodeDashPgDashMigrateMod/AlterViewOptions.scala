package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlterViewOptions extends js.Object {
  var checkOption: js.UndefOr[
    scala.Null | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibNumbers.`false` | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.CASCADED | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.LOCAL
  ] = js.undefined
}

object AlterViewOptions {
  @scala.inline
  def apply(
    checkOption: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibNumbers.`false` | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.CASCADED | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.LOCAL = null
  ): AlterViewOptions = {
    val __obj = js.Dynamic.literal()
    if (checkOption != null) __obj.updateDynamic("checkOption")(checkOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlterViewOptions]
  }
}

