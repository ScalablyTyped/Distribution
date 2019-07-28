package typings.ol.sourceBingMapsMod

import typings.ol.tileMod.LoadFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cacheSize: js.UndefOr[Double] = js.undefined
  var culture: js.UndefOr[String] = js.undefined
  var hidpi: js.UndefOr[Boolean] = js.undefined
  var imagerySet: String
  var key: String
  var maxZoom: js.UndefOr[Double] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  var tileLoadFunction: js.UndefOr[LoadFunction] = js.undefined
  var transition: js.UndefOr[Double] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    imagerySet: String,
    key: String,
    cacheSize: Int | Double = null,
    culture: String = null,
    hidpi: js.UndefOr[Boolean] = js.undefined,
    maxZoom: Int | Double = null,
    reprojectionErrorThreshold: Int | Double = null,
    tileLoadFunction: LoadFunction = null,
    transition: Int | Double = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(imagerySet = imagerySet, key = key)
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (!js.isUndefined(hidpi)) __obj.updateDynamic("hidpi")(hidpi)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(tileLoadFunction)
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[Options]
  }
}

