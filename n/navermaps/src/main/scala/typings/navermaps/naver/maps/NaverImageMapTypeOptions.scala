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
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    projection: Projection = null,
    tileSize: Size = null
  ): NaverImageMapTypeOptions = {
    val __obj = js.Dynamic.literal()
    if (hd != null) __obj.updateDynamic("hd")(hd)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize)
    __obj.asInstanceOf[NaverImageMapTypeOptions]
  }
}

