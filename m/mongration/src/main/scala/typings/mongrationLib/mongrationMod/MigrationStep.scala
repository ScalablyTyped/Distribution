package typings
package mongrationLib.mongrationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationStep extends js.Object {
  var down: js.UndefOr[
    js.Function2[
      /* db */ mongodbLib.mongodbMod.Db, 
      /* cb */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var id: java.lang.String
  def up(db: mongodbLib.mongodbMod.Db, cb: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit
}

object MigrationStep {
  @scala.inline
  def apply(
    id: java.lang.String,
    up: (mongodbLib.mongodbMod.Db, js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) => scala.Unit,
    down: (/* db */ mongodbLib.mongodbMod.Db, /* cb */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) => scala.Unit = null
  ): MigrationStep = {
    val __obj = js.Dynamic.literal(id = id, up = js.Any.fromFunction2(up))
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction2(down))
    __obj.asInstanceOf[MigrationStep]
  }
}

