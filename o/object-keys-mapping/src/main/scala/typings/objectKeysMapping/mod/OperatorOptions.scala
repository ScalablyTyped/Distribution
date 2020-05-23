package typings.objectKeysMapping.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatorOptions extends js.Object {
  var camelcase: js.UndefOr[Boolean] = js.undefined
  var mapping: js.UndefOr[js.Object] = js.undefined
}

object OperatorOptions {
  @scala.inline
  def apply(camelcase: js.UndefOr[Boolean] = js.undefined, mapping: js.Object = null): OperatorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(camelcase)) __obj.updateDynamic("camelcase")(camelcase.get.asInstanceOf[js.Any])
    if (mapping != null) __obj.updateDynamic("mapping")(mapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperatorOptions]
  }
}

