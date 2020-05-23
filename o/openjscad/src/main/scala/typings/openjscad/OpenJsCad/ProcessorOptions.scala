package typings.openjscad.OpenJsCad

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
    bgColor: js.UndefOr[Double] = js.undefined,
    color: js.Array[Double] = null,
    drawFaces: js.UndefOr[Boolean] = js.undefined,
    drawLines: js.UndefOr[Boolean] = js.undefined,
    noWebGL: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined,
    viewerheight: js.UndefOr[Double] = js.undefined,
    viewerheightratio: js.UndefOr[Double] = js.undefined,
    viewerwidth: js.UndefOr[Double] = js.undefined
  ): ProcessorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bgColor)) __obj.updateDynamic("bgColor")(bgColor.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(drawFaces)) __obj.updateDynamic("drawFaces")(drawFaces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawLines)) __obj.updateDynamic("drawLines")(drawLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noWebGL)) __obj.updateDynamic("noWebGL")(noWebGL.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewerheight)) __obj.updateDynamic("viewerheight")(viewerheight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewerheightratio)) __obj.updateDynamic("viewerheightratio")(viewerheightratio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewerwidth)) __obj.updateDynamic("viewerwidth")(viewerwidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessorOptions]
  }
}

