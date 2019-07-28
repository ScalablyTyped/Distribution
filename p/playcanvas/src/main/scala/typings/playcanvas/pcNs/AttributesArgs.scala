package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributesArgs extends js.Object {
  var array: js.UndefOr[Boolean] = js.undefined
  var assetType: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var curves: js.UndefOr[js.Array[String]] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var enum: js.UndefOr[js.Array[js.Object]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var placeholder: js.UndefOr[String | js.Array[String]] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: AttributesType
}

object AttributesArgs {
  @scala.inline
  def apply(
    `type`: AttributesType,
    array: js.UndefOr[Boolean] = js.undefined,
    assetType: String = null,
    color: String = null,
    curves: js.Array[String] = null,
    default: js.Any = null,
    description: String = null,
    enum: js.Array[js.Object] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    placeholder: String | js.Array[String] = null,
    precision: Int | Double = null,
    size: Int | Double = null,
    title: String = null
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

