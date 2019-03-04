package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapQuestOptions extends js.Object {
  var cacheSize: js.UndefOr[scala.Double] = js.undefined
  var layer: java.lang.String
  var reprojectionErrorThreshold: js.UndefOr[scala.Double] = js.undefined
  var tileLoadFunction: js.UndefOr[openlayersLib.openlayersMod.TileLoadFunctionType] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object MapQuestOptions {
  @scala.inline
  def apply(
    layer: java.lang.String,
    cacheSize: scala.Int | scala.Double = null,
    reprojectionErrorThreshold: scala.Int | scala.Double = null,
    tileLoadFunction: openlayersLib.openlayersMod.TileLoadFunctionType = null,
    url: java.lang.String = null
  ): MapQuestOptions = {
    val __obj = js.Dynamic.literal(layer = layer)
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(tileLoadFunction)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[MapQuestOptions]
  }
}

