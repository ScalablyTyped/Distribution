package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIndexOptions extends js.Object {
  var concurrently: js.UndefOr[scala.Boolean] = js.undefined
  var method: js.UndefOr[
    nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.btree | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.hash | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.gist | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.spgist | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.gin
  ] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var opclass: js.UndefOr[java.lang.String] = js.undefined
  var unique: js.UndefOr[scala.Boolean] = js.undefined
  var where: js.UndefOr[java.lang.String] = js.undefined
}

object CreateIndexOptions {
  @scala.inline
  def apply(
    concurrently: js.UndefOr[scala.Boolean] = js.undefined,
    method: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.btree | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.hash | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.gist | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.spgist | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.gin = null,
    name: java.lang.String = null,
    opclass: java.lang.String = null,
    unique: js.UndefOr[scala.Boolean] = js.undefined,
    where: java.lang.String = null
  ): CreateIndexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concurrently)) __obj.updateDynamic("concurrently")(concurrently)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (opclass != null) __obj.updateDynamic("opclass")(opclass)
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[CreateIndexOptions]
  }
}

