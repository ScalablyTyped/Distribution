package typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.btree
import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.gin
import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.gist
import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.hash
import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.spgist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIndexOptions extends js.Object {
  var concurrently: js.UndefOr[Boolean] = js.undefined
  var method: js.UndefOr[btree | hash | gist | spgist | gin] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opclass: js.UndefOr[String] = js.undefined
  var unique: js.UndefOr[Boolean] = js.undefined
  var where: js.UndefOr[String] = js.undefined
}

object CreateIndexOptions {
  @scala.inline
  def apply(
    concurrently: js.UndefOr[Boolean] = js.undefined,
    method: btree | hash | gist | spgist | gin = null,
    name: String = null,
    opclass: String = null,
    unique: js.UndefOr[Boolean] = js.undefined,
    where: String = null
  ): CreateIndexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concurrently)) __obj.updateDynamic("concurrently")(concurrently.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (opclass != null) __obj.updateDynamic("opclass")(opclass.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexOptions]
  }
}

