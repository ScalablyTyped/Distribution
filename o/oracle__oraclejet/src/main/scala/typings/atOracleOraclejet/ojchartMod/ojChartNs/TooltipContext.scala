package typings.atOracleOraclejet.ojchartMod.ojChartNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait TooltipContext extends js.Object {
  var close: Double
  var color: String
  var componentElement: Element
  var data: js.Object | Null
  var group: String | js.Array[String]
  var groupData: js.Object | Null
  var high: Double
  var id: js.Any
  var itemData: js.Object | Null
  var label: String
  var low: Double
  var open: Double
  var parentElement: Element
  var series: String
  var seriesData: js.Object | Null
  var targetValue: Double
  var value: Double
  var volume: Double
  var x: Double | String
  var y: Double
  var z: Double
}

object TooltipContext {
  @scala.inline
  def apply(
    close: Double,
    color: String,
    componentElement: Element,
    group: String | js.Array[String],
    high: Double,
    id: js.Any,
    label: String,
    low: Double,
    open: Double,
    parentElement: Element,
    series: String,
    targetValue: Double,
    value: Double,
    volume: Double,
    x: Double | String,
    y: Double,
    z: Double,
    data: js.Object = null,
    groupData: js.Object = null,
    itemData: js.Object = null,
    seriesData: js.Object = null
  ): TooltipContext = {
    val __obj = js.Dynamic.literal(close = close, color = color, componentElement = componentElement, group = group.asInstanceOf[js.Any], high = high, id = id, label = label, low = low, open = open, parentElement = parentElement, series = series, targetValue = targetValue, value = value, volume = volume, x = x.asInstanceOf[js.Any], y = y, z = z)
    if (data != null) __obj.updateDynamic("data")(data)
    if (groupData != null) __obj.updateDynamic("groupData")(groupData)
    if (itemData != null) __obj.updateDynamic("itemData")(itemData)
    if (seriesData != null) __obj.updateDynamic("seriesData")(seriesData)
    __obj.asInstanceOf[TooltipContext]
  }
}

