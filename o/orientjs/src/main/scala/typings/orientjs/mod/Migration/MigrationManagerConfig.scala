package typings.orientjs.mod.Migration

import typings.orientjs.mod.ODB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationManagerConfig extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var db: js.UndefOr[ODB] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object MigrationManagerConfig {
  @scala.inline
  def apply(className: String = null, db: ODB = null, dir: String = null, name: String = null): MigrationManagerConfig = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationManagerConfig]
  }
}

