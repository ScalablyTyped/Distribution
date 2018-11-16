package typings
package openlayersLib.openlayersMod.olxNs.tilegridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TileGridOptions extends js.Object {
  var extent: js.UndefOr[openlayersLib.openlayersMod.Extent] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var origin: js.UndefOr[openlayersLib.openlayersMod.Coordinate] = js.undefined
  var origins: js.UndefOr[js.Array[openlayersLib.openlayersMod.Coordinate]] = js.undefined
  var resolutions: js.Array[scala.Double]
  var tileSize: js.UndefOr[scala.Double | openlayersLib.openlayersMod.Size] = js.undefined
  var tileSizes: js.UndefOr[js.Array[scala.Double | openlayersLib.openlayersMod.Size]] = js.undefined
}

