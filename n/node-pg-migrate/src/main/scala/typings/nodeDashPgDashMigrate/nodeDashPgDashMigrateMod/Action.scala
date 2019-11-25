package typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.`NO ACTION`
  - typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.RESTRICT
  - typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.CASCADE
  - typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.`SET NULL`
  - typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.`SET DEFAULT`
*/
trait Action extends js.Object

object Action {
  @scala.inline
  def CASCADE: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.CASCADE = this.cast("CASCADE")
  @scala.inline
  def `NO ACTION`: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.`NO ACTION` = this.cast("NO ACTION")
  @scala.inline
  def RESTRICT: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.RESTRICT = this.cast("RESTRICT")
  @scala.inline
  def `SET DEFAULT`: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.`SET DEFAULT` = this.cast("SET DEFAULT")
  @scala.inline
  def `SET NULL`: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.`SET NULL` = this.cast("SET NULL")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

