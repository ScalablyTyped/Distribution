package typings.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodePgMigrate.nodePgMigrateStrings.`NO ACTION`
  - typings.nodePgMigrate.nodePgMigrateStrings.RESTRICT
  - typings.nodePgMigrate.nodePgMigrateStrings.CASCADE
  - typings.nodePgMigrate.nodePgMigrateStrings.`SET NULL`
  - typings.nodePgMigrate.nodePgMigrateStrings.`SET DEFAULT`
*/
trait Action extends js.Object

object Action {
  @scala.inline
  def CASCADE: typings.nodePgMigrate.nodePgMigrateStrings.CASCADE = this.cast("CASCADE")
  @scala.inline
  def `NO ACTION`: typings.nodePgMigrate.nodePgMigrateStrings.`NO ACTION` = this.cast("NO ACTION")
  @scala.inline
  def RESTRICT: typings.nodePgMigrate.nodePgMigrateStrings.RESTRICT = this.cast("RESTRICT")
  @scala.inline
  def `SET DEFAULT`: typings.nodePgMigrate.nodePgMigrateStrings.`SET DEFAULT` = this.cast("SET DEFAULT")
  @scala.inline
  def `SET NULL`: typings.nodePgMigrate.nodePgMigrateStrings.`SET NULL` = this.cast("SET NULL")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

