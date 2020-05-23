package typings.oracleOraclejet.ojchartMod.ojChart

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
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], targetValue = targetValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], groupData = groupData.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], seriesData = seriesData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipContext]
  }
}

