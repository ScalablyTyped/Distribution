package typings.orientjs.orientjsMod.Migration

import typings.orientjs.orientjsMod.ODB
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
    if (className != null) __obj.updateDynamic("className")(className)
    if (db != null) __obj.updateDynamic("db")(db)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MigrationManagerConfig]
  }
}

