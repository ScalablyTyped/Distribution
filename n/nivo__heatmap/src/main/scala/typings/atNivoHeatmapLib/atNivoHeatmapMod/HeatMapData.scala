package typings
package atNivoHeatmapLib.atNivoHeatmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatMapData extends js.Object {
  var data: js.Array[HeatMapDatum]
  var indexBy: js.UndefOr[java.lang.String | IndexByFunc] = js.undefined
  var keys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var maxValue: js.UndefOr[scala.Double | atNivoHeatmapLib.atNivoHeatmapLibStrings.auto] = js.undefined
  var minValue: js.UndefOr[scala.Double | atNivoHeatmapLib.atNivoHeatmapLibStrings.auto] = js.undefined
}

object HeatMapData {
  @scala.inline
  def apply(
    data: js.Array[HeatMapDatum],
    indexBy: java.lang.String | IndexByFunc = null,
    keys: js.Array[java.lang.String] = null,
    maxValue: scala.Double | atNivoHeatmapLib.atNivoHeatmapLibStrings.auto = null,
    minValue: scala.Double | atNivoHeatmapLib.atNivoHeatmapLibStrings.auto = null
  ): HeatMapData = {
    val __obj = js.Dynamic.literal(data = data)
    if (indexBy != null) __obj.updateDynamic("indexBy")(indexBy.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatMapData]
  }
}

