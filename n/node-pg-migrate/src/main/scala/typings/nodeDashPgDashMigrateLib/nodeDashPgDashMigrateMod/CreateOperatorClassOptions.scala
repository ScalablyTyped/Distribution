package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOperatorClassOptions extends js.Object {
  var default: js.UndefOr[scala.Boolean] = js.undefined
  var family: js.UndefOr[java.lang.String] = js.undefined
}

object CreateOperatorClassOptions {
  @scala.inline
  def apply(default: js.UndefOr[scala.Boolean] = js.undefined, family: java.lang.String = null): CreateOperatorClassOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (family != null) __obj.updateDynamic("family")(family)
    __obj.asInstanceOf[CreateOperatorClassOptions]
  }
}

