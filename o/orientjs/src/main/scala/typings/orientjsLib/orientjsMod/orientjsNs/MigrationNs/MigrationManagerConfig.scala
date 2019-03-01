package typings
package orientjsLib.orientjsMod.orientjsNs.MigrationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationManagerConfig extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var db: js.UndefOr[orientjsLib.orientjsMod.orientjsNs.Db] = js.undefined
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object MigrationManagerConfig {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    db: orientjsLib.orientjsMod.orientjsNs.Db = null,
    dir: java.lang.String = null,
    name: java.lang.String = null
  ): MigrationManagerConfig = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (db != null) __obj.updateDynamic("db")(db)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MigrationManagerConfig]
  }
}

