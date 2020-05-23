package typings.openseadragon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultZoomLevel extends js.Object {
  var animationTime: js.UndefOr[Double] = js.undefined
  var defaultZoomLevel: js.UndefOr[Double] = js.undefined
  var degrees: js.UndefOr[Double] = js.undefined
  var homeFillsViewer: js.UndefOr[Boolean] = js.undefined
  var margins: js.Object
  var maxZoomLevel: js.UndefOr[Double] = js.undefined
  var maxZoomPixelRatio: js.UndefOr[Double] = js.undefined
  var minZoomImageRatio: js.UndefOr[Double] = js.undefined
  var minZoomLevel: js.UndefOr[Double] = js.undefined
  var springStiffness: js.UndefOr[Double] = js.undefined
  var visibilityRatio: js.UndefOr[Double] = js.undefined
  var wrapHorizontal: js.UndefOr[Boolean] = js.undefined
  var wrapVertical: js.UndefOr[Boolean] = js.undefined
}

object DefaultZoomLevel {
  @scala.inline
  def apply(
    margins: js.Object,
    animationTime: js.UndefOr[Double] = js.undefined,
    defaultZoomLevel: js.UndefOr[Double] = js.undefined,
    degrees: js.UndefOr[Double] = js.undefined,
    homeFillsViewer: js.UndefOr[Boolean] = js.undefined,
    maxZoomLevel: js.UndefOr[Double] = js.undefined,
    maxZoomPixelRatio: js.UndefOr[Double] = js.undefined,
    minZoomImageRatio: js.UndefOr[Double] = js.undefined,
    minZoomLevel: js.UndefOr[Double] = js.undefined,
    springStiffness: js.UndefOr[Double] = js.undefined,
    visibilityRatio: js.UndefOr[Double] = js.undefined,
    wrapHorizontal: js.UndefOr[Boolean] = js.undefined,
    wrapVertical: js.UndefOr[Boolean] = js.undefined
  ): DefaultZoomLevel = {
    val __obj = js.Dynamic.literal(margins = margins.asInstanceOf[js.Any])
    if (!js.isUndefined(animationTime)) __obj.updateDynamic("animationTime")(animationTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultZoomLevel)) __obj.updateDynamic("defaultZoomLevel")(defaultZoomLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(degrees)) __obj.updateDynamic("degrees")(degrees.get.asInstanceOf[js.Any])
    if (!js.isUndefined(homeFillsViewer)) __obj.updateDynamic("homeFillsViewer")(homeFillsViewer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoomLevel)) __obj.updateDynamic("maxZoomLevel")(maxZoomLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoomPixelRatio)) __obj.updateDynamic("maxZoomPixelRatio")(maxZoomPixelRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoomImageRatio)) __obj.updateDynamic("minZoomImageRatio")(minZoomImageRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoomLevel)) __obj.updateDynamic("minZoomLevel")(minZoomLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(springStiffness)) __obj.updateDynamic("springStiffness")(springStiffness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visibilityRatio)) __obj.updateDynamic("visibilityRatio")(visibilityRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapHorizontal)) __obj.updateDynamic("wrapHorizontal")(wrapHorizontal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapVertical)) __obj.updateDynamic("wrapVertical")(wrapVertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultZoomLevel]
  }
}

