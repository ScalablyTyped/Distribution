package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasMapTypeOptions extends js.Object {
  var darktheme: js.UndefOr[Boolean] = js.undefined
  var getTileData: js.UndefOr[js.Function0[_]] = js.undefined
  var maxZoom: Double
  var minZoom: Double
  var name: String
  var projection: Projection
  var provider: js.UndefOr[js.Array[MapDataProvider]] = js.undefined
  var repeatX: js.UndefOr[Boolean] = js.undefined
  var tileSize: js.UndefOr[Size | SizeLiteral] = js.undefined
  var uid: js.UndefOr[String] = js.undefined
  var vendor: js.UndefOr[String] = js.undefined
}

object CanvasMapTypeOptions {
  @scala.inline
  def apply(
    maxZoom: Double,
    minZoom: Double,
    name: String,
    projection: Projection,
    darktheme: js.UndefOr[Boolean] = js.undefined,
    getTileData: () => _ = null,
    provider: js.Array[MapDataProvider] = null,
    repeatX: js.UndefOr[Boolean] = js.undefined,
    tileSize: Size | SizeLiteral = null,
    uid: String = null,
    vendor: String = null
  ): CanvasMapTypeOptions = {
    val __obj = js.Dynamic.literal(maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any])
    if (!js.isUndefined(darktheme)) __obj.updateDynamic("darktheme")(darktheme.get.asInstanceOf[js.Any])
    if (getTileData != null) __obj.updateDynamic("getTileData")(js.Any.fromFunction0(getTileData))
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatX)) __obj.updateDynamic("repeatX")(repeatX.get.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (vendor != null) __obj.updateDynamic("vendor")(vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasMapTypeOptions]
  }
}

