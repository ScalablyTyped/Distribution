package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributesArgs extends js.Object {
  var array: js.UndefOr[scala.Boolean] = js.undefined
  var assetType: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var curves: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var enum: js.UndefOr[js.Array[js.Object]] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var placeholder: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: AttributesType
}

object AttributesArgs {
  @scala.inline
  def apply(
    `type`: AttributesType,
    array: js.UndefOr[scala.Boolean] = js.undefined,
    assetType: java.lang.String = null,
    color: java.lang.String = null,
    curves: js.Array[java.lang.String] = null,
    default: js.Any = null,
    description: java.lang.String = null,
    enum: js.Array[js.Object] = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    placeholder: java.lang.String | js.Array[java.lang.String] = null,
    precision: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    title: java.lang.String = null
  ): AttributesArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(array)) __obj.updateDynamic("array")(array)
    if (assetType != null) __obj.updateDynamic("assetType")(assetType)
    if (color != null) __obj.updateDynamic("color")(color)
    if (curves != null) __obj.updateDynamic("curves")(curves)
    if (default != null) __obj.updateDynamic("default")(default)
    if (description != null) __obj.updateDynamic("description")(description)
    if (enum != null) __obj.updateDynamic("enum")(enum)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[AttributesArgs]
  }
}

