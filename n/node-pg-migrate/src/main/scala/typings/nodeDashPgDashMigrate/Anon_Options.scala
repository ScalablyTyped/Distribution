package typings.nodeDashPgDashMigrate

import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.LikeOptions
import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var options: js.UndefOr[LikeOptions] = js.undefined
  var table: Name
}

object Anon_Options {
  @scala.inline
  def apply(table: Name, options: LikeOptions = null): Anon_Options = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Options]
  }
}

