package typings.atOracleOraclejet.ojchartMod.ojChart

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait DataLabelContext extends js.Object {
  var close: Double
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
  var series: String
  var seriesData: js.Object | Null
  var targetValue: Double
  var totalValue: Double
  var value: Double
  var volume: Double
  var x: Double | String
  var y: Double
  var z: Double
}

object DataLabelContext {
  @scala.inline
  def apply(
    close: Double,
    componentElement: Element,
    group: String | js.Array[String],
    high: Double,
    id: js.Any,
    label: String,
    low: Double,
    open: Double,
    series: String,
    targetValue: Double,
    totalValue: Double,
    value: Double,
    volume: Double,
    x: Double | String,
    y: Double,
    z: Double,
    data: js.Object = null,
    groupData: js.Object = null,
    itemData: js.Object = null,
    seriesData: js.Object = null
  ): DataLabelContext = {
    val __obj = js.Dynamic.literal(close = close, componentElement = componentElement, group = group.asInstanceOf[js.Any], high = high, id = id, label = label, low = low, open = open, series = series, targetValue = targetValue, totalValue = totalValue, value = value, volume = volume, x = x.asInstanceOf[js.Any], y = y, z = z)
    if (data != null) __obj.updateDynamic("data")(data)
    if (groupData != null) __obj.updateDynamic("groupData")(groupData)
    if (itemData != null) __obj.updateDynamic("itemData")(itemData)
    if (seriesData != null) __obj.updateDynamic("seriesData")(seriesData)
    __obj.asInstanceOf[DataLabelContext]
  }
}

