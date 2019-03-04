package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileImageOptions extends js.Object {
  var attributions: js.UndefOr[openlayersLib.openlayersMod.AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[scala.Double] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var logo: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions] = js.undefined
  var opaque: js.UndefOr[scala.Boolean] = js.undefined
  var projection: openlayersLib.openlayersMod.ProjectionLike
  var reprojectionErrorThreshold: js.UndefOr[scala.Double] = js.undefined
  var state: js.UndefOr[openlayersLib.openlayersMod.sourceNs.State] = js.undefined
  var tileClass: js.UndefOr[
    js.Function6[
      /* n */ openlayersLib.openlayersMod.ImageTile, 
      /* coords */ openlayersLib.openlayersMod.TileCoord, 
      /* state */ openlayersLib.openlayersMod.TileNs.State, 
      /* s1 */ java.lang.String, 
      /* s2 */ java.lang.String, 
      /* type */ openlayersLib.openlayersMod.TileLoadFunctionType, 
      _
    ]
  ] = js.undefined
  var tileGrid: js.UndefOr[openlayersLib.openlayersMod.tilegridNs.TileGrid] = js.undefined
  var tileLoadFunction: js.UndefOr[openlayersLib.openlayersMod.TileLoadFunctionType] = js.undefined
  var tilePixelRatio: js.UndefOr[scala.Double] = js.undefined
  var tileUrlFunction: js.UndefOr[openlayersLib.openlayersMod.TileUrlFunctionType] = js.undefined
  var transition: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var urls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object TileImageOptions {
  @scala.inline
  def apply(
    projection: openlayersLib.openlayersMod.ProjectionLike,
    attributions: openlayersLib.openlayersMod.AttributionLike = null,
    cacheSize: scala.Int | scala.Double = null,
    crossOrigin: java.lang.String = null,
    logo: java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions = null,
    opaque: js.UndefOr[scala.Boolean] = js.undefined,
    reprojectionErrorThreshold: scala.Int | scala.Double = null,
    state: openlayersLib.openlayersMod.sourceNs.State = null,
    tileClass: js.Function6[
      /* n */ openlayersLib.openlayersMod.ImageTile, 
      /* coords */ openlayersLib.openlayersMod.TileCoord, 
      /* state */ openlayersLib.openlayersMod.TileNs.State, 
      /* s1 */ java.lang.String, 
      /* s2 */ java.lang.String, 
      /* type */ openlayersLib.openlayersMod.TileLoadFunctionType, 
      _
    ] = null,
    tileGrid: openlayersLib.openlayersMod.tilegridNs.TileGrid = null,
    tileLoadFunction: openlayersLib.openlayersMod.TileLoadFunctionType = null,
    tilePixelRatio: scala.Int | scala.Double = null,
    tileUrlFunction: openlayersLib.openlayersMod.TileUrlFunctionType = null,
    transition: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    urls: js.Array[java.lang.String] = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): TileImageOptions = {
    val __obj = js.Dynamic.literal(projection = projection.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (!js.isUndefined(opaque)) __obj.updateDynamic("opaque")(opaque)
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (tileClass != null) __obj.updateDynamic("tileClass")(tileClass)
    if (tileGrid != null) __obj.updateDynamic("tileGrid")(tileGrid)
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(tileLoadFunction)
    if (tilePixelRatio != null) __obj.updateDynamic("tilePixelRatio")(tilePixelRatio.asInstanceOf[js.Any])
    if (tileUrlFunction != null) __obj.updateDynamic("tileUrlFunction")(tileUrlFunction)
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[TileImageOptions]
  }
}

