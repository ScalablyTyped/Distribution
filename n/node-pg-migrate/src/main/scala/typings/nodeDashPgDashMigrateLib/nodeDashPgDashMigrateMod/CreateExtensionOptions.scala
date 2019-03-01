package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateExtensionOptions extends js.Object {
  var ifNotExists: js.UndefOr[scala.Boolean] = js.undefined
  var schema: js.UndefOr[java.lang.String] = js.undefined
}

object CreateExtensionOptions {
  @scala.inline
  def apply(ifNotExists: js.UndefOr[scala.Boolean] = js.undefined, schema: java.lang.String = null): CreateExtensionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[CreateExtensionOptions]
  }
}

