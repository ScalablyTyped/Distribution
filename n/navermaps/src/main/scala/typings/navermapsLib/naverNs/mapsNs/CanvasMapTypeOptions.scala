package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CanvasMapTypeOptions extends js.Object {
  var darktheme: js.UndefOr[scala.Boolean] = js.undefined
  var getTileData: js.UndefOr[js.Function0[_]] = js.undefined
  var maxZoom: scala.Double
  var minZoom: scala.Double
  var name: java.lang.String
  var projection: Projection
  var provider: js.UndefOr[js.Array[MapDataProvider]] = js.undefined
  var repeatX: js.UndefOr[scala.Boolean] = js.undefined
  var tileSize: js.UndefOr[Size | SizeLiteral] = js.undefined
  var uid: js.UndefOr[java.lang.String] = js.undefined
  var vendor: js.UndefOr[java.lang.String] = js.undefined
}

