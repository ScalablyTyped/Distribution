package typings
package atOracleOraclejetLib.ojchartMod.ojChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait TooltipContext extends js.Object {
  var close: scala.Double
  var color: java.lang.String
  var componentElement: stdLib.Element
  var data: js.Object | scala.Null
  var group: java.lang.String | js.Array[java.lang.String]
  var groupData: js.Object | scala.Null
  var high: scala.Double
  var id: js.Any
  var itemData: js.Object | scala.Null
  var label: java.lang.String
  var low: scala.Double
  var open: scala.Double
  var parentElement: stdLib.Element
  var series: java.lang.String
  var seriesData: js.Object | scala.Null
  var targetValue: scala.Double
  var value: scala.Double
  var volume: scala.Double
  var x: scala.Double | java.lang.String
  var y: scala.Double
  var z: scala.Double
}

object TooltipContext {
  @scala.inline
  def apply(
    close: scala.Double,
    color: java.lang.String,
    componentElement: stdLib.Element,
    group: java.lang.String | js.Array[java.lang.String],
    high: scala.Double,
    id: js.Any,
    label: java.lang.String,
    low: scala.Double,
    open: scala.Double,
    parentElement: stdLib.Element,
    series: java.lang.String,
    targetValue: scala.Double,
    value: scala.Double,
    volume: scala.Double,
    x: scala.Double | java.lang.String,
    y: scala.Double,
    z: scala.Double,
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

