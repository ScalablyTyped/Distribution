package typings.nodal.mod

import typings.nodal.nodalNumbers.`0`
import typings.nodal.nodalNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnProperties extends js.Object {
  var array: js.UndefOr[Boolean] = js.undefined
  var auto_increment: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var length: js.UndefOr[Double | Null] = js.undefined
  var nullable: js.UndefOr[Boolean] = js.undefined
  var primary_key: js.UndefOr[`0` | `1` | Boolean] = js.undefined
  var unique: js.UndefOr[`0` | `1` | Boolean] = js.undefined
}

object IColumnProperties {
  @scala.inline
  def apply(
    array: js.UndefOr[Boolean] = js.undefined,
    auto_increment: js.UndefOr[Boolean] = js.undefined,
    defaultValue: js.Any = null,
    length: js.UndefOr[Null | Double] = js.undefined,
    nullable: js.UndefOr[Boolean] = js.undefined,
    primary_key: `0` | `1` | Boolean = null,
    unique: `0` | `1` | Boolean = null
  ): IColumnProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(array)) __obj.updateDynamic("array")(array.get.asInstanceOf[js.Any])
    if (!js.isUndefined(auto_increment)) __obj.updateDynamic("auto_increment")(auto_increment.get.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable.get.asInstanceOf[js.Any])
    if (primary_key != null) __obj.updateDynamic("primary_key")(primary_key.asInstanceOf[js.Any])
    if (unique != null) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnProperties]
  }
}

