package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WMTSOptions extends js.Object {
  var attributions: js.UndefOr[openlayersLib.openlayersMod.AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[scala.Double] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var dimensions: js.UndefOr[openlayersLib.openlayersMod.GlobalObject] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var layer: java.lang.String
  var logo: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions] = js.undefined
  var matrixSet: java.lang.String
  var projection: openlayersLib.openlayersMod.ProjectionLike
  var reprojectionErrorThreshold: js.UndefOr[scala.Double] = js.undefined
  var requestEncoding: js.UndefOr[openlayersLib.openlayersMod.sourceNs.WMTSRequestEncoding | java.lang.String] = js.undefined
  var style: java.lang.String
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
  var tileGrid: openlayersLib.openlayersMod.tilegridNs.WMTS
  var tileLoadFunction: js.UndefOr[openlayersLib.openlayersMod.TileLoadFunctionType] = js.undefined
  var tilePixelRatio: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var urls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

