package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnProperties extends js.Object {
  var array: js.UndefOr[scala.Boolean] = js.undefined
  var auto_increment: js.UndefOr[scala.Boolean] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var length: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var nullable: js.UndefOr[scala.Boolean] = js.undefined
  var primary_key: js.UndefOr[nodalLib.nodalLibNumbers.`0` | nodalLib.nodalLibNumbers.`1` | scala.Boolean] = js.undefined
  var unique: js.UndefOr[nodalLib.nodalLibNumbers.`0` | nodalLib.nodalLibNumbers.`1` | scala.Boolean] = js.undefined
}

object IColumnProperties {
  @scala.inline
  def apply(
    array: js.UndefOr[scala.Boolean] = js.undefined,
    auto_increment: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: js.Any = null,
    length: scala.Int | scala.Double = null,
    nullable: js.UndefOr[scala.Boolean] = js.undefined,
    primary_key: nodalLib.nodalLibNumbers.`0` | nodalLib.nodalLibNumbers.`1` | scala.Boolean = null,
    unique: nodalLib.nodalLibNumbers.`0` | nodalLib.nodalLibNumbers.`1` | scala.Boolean = null
  ): IColumnProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(array)) __obj.updateDynamic("array")(array)
    if (!js.isUndefined(auto_increment)) __obj.updateDynamic("auto_increment")(auto_increment)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable)
    if (primary_key != null) __obj.updateDynamic("primary_key")(primary_key.asInstanceOf[js.Any])
    if (unique != null) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnProperties]
  }
}

