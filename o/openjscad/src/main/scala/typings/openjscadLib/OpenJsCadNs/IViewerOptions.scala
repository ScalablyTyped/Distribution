package typings
package openjscadLib.OpenJsCadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewerOptions extends js.Object {
  var bgColor: js.UndefOr[scala.Double] = js.undefined
  var color: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var drawFaces: js.UndefOr[scala.Boolean] = js.undefined
  var drawLines: js.UndefOr[scala.Boolean] = js.undefined
  var noWebGL: js.UndefOr[scala.Boolean] = js.undefined
}

object IViewerOptions {
  @scala.inline
  def apply(
    bgColor: scala.Int | scala.Double = null,
    color: js.Array[scala.Double] = null,
    drawFaces: js.UndefOr[scala.Boolean] = js.undefined,
    drawLines: js.UndefOr[scala.Boolean] = js.undefined,
    noWebGL: js.UndefOr[scala.Boolean] = js.undefined
  ): IViewerOptions = {
    val __obj = js.Dynamic.literal()
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(drawFaces)) __obj.updateDynamic("drawFaces")(drawFaces)
    if (!js.isUndefined(drawLines)) __obj.updateDynamic("drawLines")(drawLines)
    if (!js.isUndefined(noWebGL)) __obj.updateDynamic("noWebGL")(noWebGL)
    __obj.asInstanceOf[IViewerOptions]
  }
}

