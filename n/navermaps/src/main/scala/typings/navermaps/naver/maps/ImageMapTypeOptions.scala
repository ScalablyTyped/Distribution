package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageMapTypeOptions extends js.Object {
  var darktheme: js.UndefOr[Boolean] = js.undefined
  var getTileUrl: js.UndefOr[js.Function0[_]] = js.undefined
  var maxZoom: Double
  var minZoom: Double
  var name: String
  var projection: Projection
  var provider: js.UndefOr[js.Array[MapDataProvider]] = js.undefined
  var repeatX: js.UndefOr[Boolean] = js.undefined
  var tileSet: js.UndefOr[String | js.Array[String]] = js.undefined
  var tileSize: js.UndefOr[Size | SizeLiteral] = js.undefined
  var uid: js.UndefOr[String] = js.undefined
  var vendor: js.UndefOr[String] = js.undefined
}

object ImageMapTypeOptions {
  @scala.inline
  def apply(
    maxZoom: Double,
    minZoom: Double,
    name: String,
    projection: Projection,
    darktheme: js.UndefOr[Boolean] = js.undefined,
    getTileUrl: () => _ = null,
    provider: js.Array[MapDataProvider] = null,
    repeatX: js.UndefOr[Boolean] = js.undefined,
    tileSet: String | js.Array[String] = null,
    tileSize: Size | SizeLiteral = null,
    uid: String = null,
    vendor: String = null
  ): ImageMapTypeOptions = {
    val __obj = js.Dynamic.literal(maxZoom = maxZoom, minZoom = minZoom, name = name, projection = projection)
    if (!js.isUndefined(darktheme)) __obj.updateDynamic("darktheme")(darktheme)
    if (getTileUrl != null) __obj.updateDynamic("getTileUrl")(js.Any.fromFunction0(getTileUrl))
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (!js.isUndefined(repeatX)) __obj.updateDynamic("repeatX")(repeatX)
    if (tileSet != null) __obj.updateDynamic("tileSet")(tileSet.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid)
    if (vendor != null) __obj.updateDynamic("vendor")(vendor)
    __obj.asInstanceOf[ImageMapTypeOptions]
  }
}

