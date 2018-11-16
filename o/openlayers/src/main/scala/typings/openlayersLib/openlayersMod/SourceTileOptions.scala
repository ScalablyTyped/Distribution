package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SourceTileOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[scala.Double] = js.undefined
  var extent: js.UndefOr[Extent] = js.undefined
  var logo: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions] = js.undefined
  var opaque: js.UndefOr[scala.Boolean] = js.undefined
  var projection: ProjectionLike
  var state: js.UndefOr[openlayersLib.openlayersMod.sourceNs.State] = js.undefined
  var tileGrid: js.UndefOr[openlayersLib.openlayersMod.tilegridNs.TileGrid] = js.undefined
  var tilePixelRatio: js.UndefOr[scala.Double] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

