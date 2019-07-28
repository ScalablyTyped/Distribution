package typings.openjscad.OpenJsCadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessorOptions extends IViewerOptions {
  var verbose: js.UndefOr[Boolean] = js.undefined
  var viewerheight: js.UndefOr[Double] = js.undefined
  var viewerheightratio: js.UndefOr[Double] = js.undefined
  var viewerwidth: js.UndefOr[Double] = js.undefined
}

object ProcessorOptions {
  @scala.inline
  def apply(
    bgColor: Int | Double = null,
    color: js.Array[Double] = null,
    drawFaces: js.UndefOr[Boolean] = js.undefined,
    drawLines: js.UndefOr[Boolean] = js.undefined,
    noWebGL: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined,
    viewerheight: Int | Double = null,
    viewerheightratio: Int | Double = null,
    viewerwidth: Int | Double = null
  ): ProcessorOptions = {
    val __obj = js.Dynamic.literal()
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(drawFaces)) __obj.updateDynamic("drawFaces")(drawFaces)
    if (!js.isUndefined(drawLines)) __obj.updateDynamic("drawLines")(drawLines)
    if (!js.isUndefined(noWebGL)) __obj.updateDynamic("noWebGL")(noWebGL)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    if (viewerheight != null) __obj.updateDynamic("viewerheight")(viewerheight.asInstanceOf[js.Any])
    if (viewerheightratio != null) __obj.updateDynamic("viewerheightratio")(viewerheightratio.asInstanceOf[js.Any])
    if (viewerwidth != null) __obj.updateDynamic("viewerwidth")(viewerwidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessorOptions]
  }
}

