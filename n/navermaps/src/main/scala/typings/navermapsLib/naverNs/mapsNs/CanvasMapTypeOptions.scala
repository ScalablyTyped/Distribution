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

object CanvasMapTypeOptions {
  @scala.inline
  def apply(
    maxZoom: scala.Double,
    minZoom: scala.Double,
    name: java.lang.String,
    projection: Projection,
    darktheme: js.UndefOr[scala.Boolean] = js.undefined,
    getTileData: () => _ = null,
    provider: js.Array[MapDataProvider] = null,
    repeatX: js.UndefOr[scala.Boolean] = js.undefined,
    tileSize: Size | SizeLiteral = null,
    uid: java.lang.String = null,
    vendor: java.lang.String = null
  ): CanvasMapTypeOptions = {
    val __obj = js.Dynamic.literal(maxZoom = maxZoom, minZoom = minZoom, name = name, projection = projection)
    if (!js.isUndefined(darktheme)) __obj.updateDynamic("darktheme")(darktheme)
    if (getTileData != null) __obj.updateDynamic("getTileData")(js.Any.fromFunction0(getTileData))
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (!js.isUndefined(repeatX)) __obj.updateDynamic("repeatX")(repeatX)
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid)
    if (vendor != null) __obj.updateDynamic("vendor")(vendor)
    __obj.asInstanceOf[CanvasMapTypeOptions]
  }
}

