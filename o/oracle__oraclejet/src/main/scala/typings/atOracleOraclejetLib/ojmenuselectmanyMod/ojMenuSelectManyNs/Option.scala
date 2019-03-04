package typings
package atOracleOraclejetLib.ojmenuselectmanyMod.ojMenuSelectManyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Option extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var label: java.lang.String
  var value: js.Any
}

object Option {
  @scala.inline
  def apply(
    label: java.lang.String,
    value: js.Any,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null
  ): Option = {
    val __obj = js.Dynamic.literal(label = label, value = value)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Option]
  }
}

