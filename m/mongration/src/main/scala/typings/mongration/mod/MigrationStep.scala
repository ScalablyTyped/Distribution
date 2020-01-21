package typings.mongration.mod

import typings.mongodb.mod.Db
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationStep extends js.Object {
  var down: js.UndefOr[
    js.Function2[/* db */ Db, /* cb */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
  ] = js.undefined
  var id: String
  def up(db: Db, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit
}

object MigrationStep {
  @scala.inline
  def apply(
    id: String,
    up: (Db, js.Function1[/* err */ js.UndefOr[Error], Unit]) => Unit,
    down: (/* db */ Db, /* cb */ js.Function1[/* err */ js.UndefOr[Error], Unit]) => Unit = null
  ): MigrationStep = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], up = js.Any.fromFunction2(up))
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction2(down))
    __obj.asInstanceOf[MigrationStep]
  }
}

