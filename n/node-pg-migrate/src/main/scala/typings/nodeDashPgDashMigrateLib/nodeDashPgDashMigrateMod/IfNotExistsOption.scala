package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfNotExistsOption extends js.Object {
  var ifNotExists: js.UndefOr[scala.Boolean] = js.undefined
}

object IfNotExistsOption {
  @scala.inline
  def apply(ifNotExists: js.UndefOr[scala.Boolean] = js.undefined): IfNotExistsOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists)
    __obj.asInstanceOf[IfNotExistsOption]
  }
}

