package typings
package mongrationLib.mongrationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationStep extends js.Object {
  var down: js.UndefOr[
    js.Function2[
      /* db */ mongodbLib.mongodbMod.Db, 
      /* cb */ js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var id: java.lang.String
  def up(db: mongodbLib.mongodbMod.Db, cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]): scala.Unit
}

object MigrationStep {
  @scala.inline
  def apply(
    id: java.lang.String,
    up: js.Function2[
      mongodbLib.mongodbMod.Db, 
      js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit], 
      scala.Unit
    ],
    down: js.Function2[
      /* db */ mongodbLib.mongodbMod.Db, 
      /* cb */ js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit], 
      scala.Unit
    ] = null
  ): MigrationStep = {
    val __obj = js.Dynamic.literal(id = id, up = up)
    if (down != null) __obj.updateDynamic("down")(down)
    __obj.asInstanceOf[MigrationStep]
  }
}

