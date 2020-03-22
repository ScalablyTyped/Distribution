package typings.nodePgMigrate.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodePgMigrate.nodePgMigrateStrings.up
  - typings.nodePgMigrate.nodePgMigrateStrings.down
*/
trait MigrationDirection extends js.Object

object MigrationDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def down: typings.nodePgMigrate.nodePgMigrateStrings.down = this.cast("down")
  @scala.inline
  def up: typings.nodePgMigrate.nodePgMigrateStrings.up = this.cast("up")
}

