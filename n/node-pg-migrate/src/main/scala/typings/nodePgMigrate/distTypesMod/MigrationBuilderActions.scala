package typings.nodePgMigrate.distTypesMod

import typings.nodePgMigrate.nodePgMigrateBooleans.`false`
import typings.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationBuilderActions extends js.Object {
  var down: js.UndefOr[MigrationAction | `false`] = js.undefined
  var shorthands: js.UndefOr[ColumnDefinitions] = js.undefined
  var up: js.UndefOr[MigrationAction | `false`] = js.undefined
}

object MigrationBuilderActions {
  @scala.inline
  def apply(
    down: MigrationAction | `false` = null,
    shorthands: ColumnDefinitions = null,
    up: MigrationAction | `false` = null
  ): MigrationBuilderActions = {
    val __obj = js.Dynamic.literal()
    if (down != null) __obj.updateDynamic("down")(down.asInstanceOf[js.Any])
    if (shorthands != null) __obj.updateDynamic("shorthands")(shorthands.asInstanceOf[js.Any])
    if (up != null) __obj.updateDynamic("up")(up.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationBuilderActions]
  }
}

