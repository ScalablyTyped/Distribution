package typings.playcanvas

import typings.playcanvas.playcanvasStrings.asset
import typings.playcanvas.playcanvasStrings.boolean
import typings.playcanvas.playcanvasStrings.curve
import typings.playcanvas.playcanvasStrings.entity
import typings.playcanvas.playcanvasStrings.json
import typings.playcanvas.playcanvasStrings.number
import typings.playcanvas.playcanvasStrings.rgb
import typings.playcanvas.playcanvasStrings.rgba
import typings.playcanvas.playcanvasStrings.string
import typings.playcanvas.playcanvasStrings.vec2
import typings.playcanvas.playcanvasStrings.vec3
import typings.playcanvas.playcanvasStrings.vec4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArray extends js.Object {
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
  var step: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: boolean | number | string | json | asset | entity | rgb | rgba | vec2 | vec3 | vec4 | curve
}

object AnonArray {
  @scala.inline
  def apply(
    `type`: boolean | number | string | json | asset | entity | rgb | rgba | vec2 | vec3 | vec4 | curve,
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
    step: Int | Double = null,
    title: String = null
  ): AnonArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(array)) __obj.updateDynamic("array")(array.asInstanceOf[js.Any])
    if (assetType != null) __obj.updateDynamic("assetType")(assetType.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (curves != null) __obj.updateDynamic("curves")(curves.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArray]
  }
}

