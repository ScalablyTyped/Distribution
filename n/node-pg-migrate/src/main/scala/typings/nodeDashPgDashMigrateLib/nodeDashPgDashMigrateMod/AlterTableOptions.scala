package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlterTableOptions extends js.Object {
  var levelSecurity: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.DISABLE | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.ENABLE | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.FORCE | (nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.`NO FORCE`)
}

object AlterTableOptions {
  @scala.inline
  def apply(
    levelSecurity: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.DISABLE | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.ENABLE | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.FORCE | (nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.`NO FORCE`)
  ): AlterTableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("levelSecurity")(levelSecurity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlterTableOptions]
  }
}

