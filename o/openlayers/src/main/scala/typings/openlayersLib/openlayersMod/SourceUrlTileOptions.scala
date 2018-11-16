package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceUrlTileOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.native
  var cacheSize: js.UndefOr[scala.Double] = js.native
  var extent: js.UndefOr[Extent] = js.native
  var logo: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions] = js.native
  var opaque: js.UndefOr[scala.Boolean] = js.native
  var projection: ProjectionLike = js.native
  var state: js.UndefOr[openlayersLib.openlayersMod.sourceNs.State] = js.native
  var tileGrid: js.UndefOr[openlayersLib.openlayersMod.tilegridNs.TileGrid] = js.native
  @JSName("tileLoadFunction")
  var tileLoadFunction_Original: TileLoadFunctionType = js.native
  var tilePixelRatio: js.UndefOr[scala.Double] = js.native
  var tileUrlFunction: js.UndefOr[TileUrlFunctionType] = js.native
  var url: js.UndefOr[java.lang.String] = js.native
  var urls: js.UndefOr[js.Array[java.lang.String]] = js.native
  var wrapX: js.UndefOr[scala.Boolean] = js.native
  def tileLoadFunction(tile: Tile, url: java.lang.String): scala.Unit = js.native
}

