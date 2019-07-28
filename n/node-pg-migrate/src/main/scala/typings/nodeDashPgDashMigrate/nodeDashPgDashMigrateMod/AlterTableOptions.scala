package typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.DISABLE
import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.ENABLE
import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.FORCE
import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.`NO FORCE`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlterTableOptions extends js.Object {
  var levelSecurity: DISABLE | ENABLE | FORCE | (`NO FORCE`)
}

object AlterTableOptions {
  @scala.inline
  def apply(levelSecurity: DISABLE | ENABLE | FORCE | (`NO FORCE`)): AlterTableOptions = {
    val __obj = js.Dynamic.literal(levelSecurity = levelSecurity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AlterTableOptions]
  }
}

