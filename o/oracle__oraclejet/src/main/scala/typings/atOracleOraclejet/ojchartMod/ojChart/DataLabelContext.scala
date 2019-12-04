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
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], targetValue = targetValue.asInstanceOf[js.Any], totalValue = totalValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (groupData != null) __obj.updateDynamic("groupData")(groupData.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (seriesData != null) __obj.updateDynamic("seriesData")(seriesData.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataLabelContext]
  }
}

