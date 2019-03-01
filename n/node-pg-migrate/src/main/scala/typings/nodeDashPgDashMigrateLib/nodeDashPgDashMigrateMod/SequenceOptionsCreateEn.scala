package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceOptionsCreateEn extends js.Object {
  var ifNotExists: js.UndefOr[scala.Boolean] = js.undefined
  var temporary: js.UndefOr[scala.Boolean] = js.undefined
}

object SequenceOptionsCreateEn {
  @scala.inline
  def apply(
    ifNotExists: js.UndefOr[scala.Boolean] = js.undefined,
    temporary: js.UndefOr[scala.Boolean] = js.undefined
  ): SequenceOptionsCreateEn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists)
    if (!js.isUndefined(temporary)) __obj.updateDynamic("temporary")(temporary)
    __obj.asInstanceOf[SequenceOptionsCreateEn]
  }
}

