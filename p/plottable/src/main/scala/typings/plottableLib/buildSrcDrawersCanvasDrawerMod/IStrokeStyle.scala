package typings
package plottableLib.buildSrcDrawersCanvasDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrokeStyle extends js.Object {
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var `stroke-dasharray`: js.UndefOr[java.lang.String] = js.undefined
  var `stroke-opacity`: js.UndefOr[scala.Double] = js.undefined
  var `stroke-width`: js.UndefOr[scala.Double] = js.undefined
}

object IStrokeStyle {
  @scala.inline
  def apply(
    opacity: scala.Int | scala.Double = null,
    stroke: java.lang.String = null,
    `stroke-dasharray`: java.lang.String = null,
    `stroke-opacity`: scala.Int | scala.Double = null,
    `stroke-width`: scala.Int | scala.Double = null
  ): IStrokeStyle = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (`stroke-dasharray` != null) __obj.updateDynamic("stroke-dasharray")(`stroke-dasharray`)
    if (`stroke-opacity` != null) __obj.updateDynamic("stroke-opacity")(`stroke-opacity`.asInstanceOf[js.Any])
    if (`stroke-width` != null) __obj.updateDynamic("stroke-width")(`stroke-width`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStrokeStyle]
  }
}

