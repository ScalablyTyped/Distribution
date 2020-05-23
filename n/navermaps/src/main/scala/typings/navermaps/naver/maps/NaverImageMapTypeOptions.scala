package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NaverImageMapTypeOptions extends js.Object {
  var hd: js.UndefOr[String] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var projection: js.UndefOr[Projection] = js.undefined
  var tileSize: js.UndefOr[Size] = js.undefined
}

object NaverImageMapTypeOptions {
  @scala.inline
  def apply(
    hd: String = null,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    projection: Projection = null,
    tileSize: Size = null
  ): NaverImageMapTypeOptions = {
    val __obj = js.Dynamic.literal()
    if (hd != null) __obj.updateDynamic("hd")(hd.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[NaverImageMapTypeOptions]
  }
}

