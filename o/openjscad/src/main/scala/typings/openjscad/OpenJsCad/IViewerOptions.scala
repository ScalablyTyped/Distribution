package typings.openjscad.OpenJsCad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewerOptions extends js.Object {
  var bgColor: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[js.Array[Double]] = js.undefined
  var drawFaces: js.UndefOr[Boolean] = js.undefined
  var drawLines: js.UndefOr[Boolean] = js.undefined
  var noWebGL: js.UndefOr[Boolean] = js.undefined
}

object IViewerOptions {
  @scala.inline
  def apply(
    bgColor: Int | Double = null,
    color: js.Array[Double] = null,
    drawFaces: js.UndefOr[Boolean] = js.undefined,
    drawLines: js.UndefOr[Boolean] = js.undefined,
    noWebGL: js.UndefOr[Boolean] = js.undefined
  ): IViewerOptions = {
    val __obj = js.Dynamic.literal()
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(drawFaces)) __obj.updateDynamic("drawFaces")(drawFaces.asInstanceOf[js.Any])
    if (!js.isUndefined(drawLines)) __obj.updateDynamic("drawLines")(drawLines.asInstanceOf[js.Any])
    if (!js.isUndefined(noWebGL)) __obj.updateDynamic("noWebGL")(noWebGL.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewerOptions]
  }
}

