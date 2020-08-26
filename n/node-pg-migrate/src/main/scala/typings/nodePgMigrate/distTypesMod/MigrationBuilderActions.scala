package typings.nodePgMigrate.distTypesMod

import typings.nodePgMigrate.nodePgMigrateBooleans.`false`
import typings.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationBuilderActions extends js.Object {
  var down: js.UndefOr[MigrationAction | `false`] = js.native
  var shorthands: js.UndefOr[ColumnDefinitions] = js.native
  var up: js.UndefOr[MigrationAction | `false`] = js.native
}

object MigrationBuilderActions {
  @scala.inline
  def apply(): MigrationBuilderActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationBuilderActions]
  }
  @scala.inline
  implicit class MigrationBuilderActionsOps[Self <: MigrationBuilderActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDownFunction2(
      value: (/* pgm */ MigrationBuilder, /* run */ js.UndefOr[js.Function0[Unit]]) => js.Promise[Unit] | Unit
    ): Self = this.set("down", js.Any.fromFunction2(value))
    @scala.inline
    def setDown(value: MigrationAction | `false`): Self = this.set("down", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
    @scala.inline
    def setShorthands(value: ColumnDefinitions): Self = this.set("shorthands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShorthands: Self = this.set("shorthands", js.undefined)
    @scala.inline
    def setUpFunction2(
      value: (/* pgm */ MigrationBuilder, /* run */ js.UndefOr[js.Function0[Unit]]) => js.Promise[Unit] | Unit
    ): Self = this.set("up", js.Any.fromFunction2(value))
    @scala.inline
    def setUp(value: MigrationAction | `false`): Self = this.set("up", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUp: Self = this.set("up", js.undefined)
  }
  
}

