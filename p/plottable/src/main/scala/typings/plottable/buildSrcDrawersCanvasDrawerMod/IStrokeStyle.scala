package typings.plottable.buildSrcDrawersCanvasDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrokeStyle extends js.Object {
  var opacity: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
  var `stroke-dasharray`: js.UndefOr[String] = js.undefined
  var `stroke-opacity`: js.UndefOr[Double] = js.undefined
  var `stroke-width`: js.UndefOr[Double] = js.undefined
}

object IStrokeStyle {
  @scala.inline
  def apply(
    opacity: Int | Double = null,
    stroke: String = null,
    `stroke-dasharray`: String = null,
    `stroke-opacity`: Int | Double = null,
    `stroke-width`: Int | Double = null
  ): IStrokeStyle = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`stroke-dasharray` != null) __obj.updateDynamic("stroke-dasharray")(`stroke-dasharray`.asInstanceOf[js.Any])
    if (`stroke-opacity` != null) __obj.updateDynamic("stroke-opacity")(`stroke-opacity`.asInstanceOf[js.Any])
    if (`stroke-width` != null) __obj.updateDynamic("stroke-width")(`stroke-width`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStrokeStyle]
  }
}

