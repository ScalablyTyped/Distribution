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

