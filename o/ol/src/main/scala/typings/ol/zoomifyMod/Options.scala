package typings.ol.zoomifyMod

import typings.ol.extentMod.Extent
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import typings.ol.sourceSourceMod.AttributionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var extent: js.UndefOr[Extent] = js.undefined
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  var size: Size
  var tierSizeCalculation: js.UndefOr[String] = js.undefined
  var tilePixelRatio: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Double] = js.undefined
  var transition: js.UndefOr[Double] = js.undefined
  var url: String
  var zDirection: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    size: Size,
    url: String,
    attributions: AttributionLike = null,
    cacheSize: Int | Double = null,
    crossOrigin: String = null,
    extent: Extent = null,
    projection: ProjectionLike = null,
    reprojectionErrorThreshold: Int | Double = null,
    tierSizeCalculation: String = null,
    tilePixelRatio: Int | Double = null,
    tileSize: Int | Double = null,
    transition: Int | Double = null,
    zDirection: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (tierSizeCalculation != null) __obj.updateDynamic("tierSizeCalculation")(tierSizeCalculation.asInstanceOf[js.Any])
    if (tilePixelRatio != null) __obj.updateDynamic("tilePixelRatio")(tilePixelRatio.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (zDirection != null) __obj.updateDynamic("zDirection")(zDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

