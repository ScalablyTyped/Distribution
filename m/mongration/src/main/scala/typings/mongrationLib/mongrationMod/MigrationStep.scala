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

