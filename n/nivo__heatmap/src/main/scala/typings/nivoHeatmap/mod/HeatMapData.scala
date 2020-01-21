package typings.nivoHeatmap.mod

import typings.nivoHeatmap.nivoHeatmapStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatMapData extends js.Object {
  var data: js.Array[HeatMapDatum]
  var indexBy: js.UndefOr[String | IndexByFunc] = js.undefined
  var keys: js.UndefOr[js.Array[String]] = js.undefined
  var maxValue: js.UndefOr[Double | auto] = js.undefined
  var minValue: js.UndefOr[Double | auto] = js.undefined
}

object HeatMapData {
  @scala.inline
  def apply(
    data: js.Array[HeatMapDatum],
    indexBy: String | IndexByFunc = null,
    keys: js.Array[String] = null,
    maxValue: Double | auto = null,
    minValue: Double | auto = null
  ): HeatMapData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (indexBy != null) __obj.updateDynamic("indexBy")(indexBy.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatMapData]
  }
}

