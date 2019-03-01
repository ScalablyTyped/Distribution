package typings
package nodeDashPgDashMigrateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var options: js.UndefOr[nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.LikeOptions] = js.undefined
  var table: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.Name
}

object Anon_Options {
  @scala.inline
  def apply(
    table: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.Name,
    options: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.LikeOptions = null
  ): Anon_Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Options]
  }
}

