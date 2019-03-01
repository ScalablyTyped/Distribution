package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropIndexOptionsEn extends js.Object {
  var concurrently: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object DropIndexOptionsEn {
  @scala.inline
  def apply(concurrently: js.UndefOr[scala.Boolean] = js.undefined, name: java.lang.String = null): DropIndexOptionsEn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concurrently)) __obj.updateDynamic("concurrently")(concurrently)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DropIndexOptionsEn]
  }
}

