package typings
package objectDashKeysDashMappingLib.objectDashKeysDashMappingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatorOptions extends js.Object {
  var camelcase: js.UndefOr[scala.Boolean] = js.undefined
  var mapping: js.UndefOr[js.Object] = js.undefined
}

object OperatorOptions {
  @scala.inline
  def apply(camelcase: js.UndefOr[scala.Boolean] = js.undefined, mapping: js.Object = null): OperatorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(camelcase)) __obj.updateDynamic("camelcase")(camelcase)
    if (mapping != null) __obj.updateDynamic("mapping")(mapping)
    __obj.asInstanceOf[OperatorOptions]
  }
}

