package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshMaterializedViewOptions extends js.Object {
  var concurrently: js.UndefOr[scala.Boolean] = js.undefined
  var data: js.UndefOr[scala.Boolean] = js.undefined
}

object RefreshMaterializedViewOptions {
  @scala.inline
  def apply(
    concurrently: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.UndefOr[scala.Boolean] = js.undefined
  ): RefreshMaterializedViewOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concurrently)) __obj.updateDynamic("concurrently")(concurrently)
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[RefreshMaterializedViewOptions]
  }
}

