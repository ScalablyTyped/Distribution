package typings
package atOracleOraclejetLib.ojchartMod.ojSparkChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ItemContext extends js.Object {
  var borderColor: java.lang.String
  var color: java.lang.String
  var date: stdLib.Date
  var high: scala.Double
  var low: scala.Double
  var value: scala.Double
}

object ItemContext {
  @scala.inline
  def apply(
    borderColor: java.lang.String,
    color: java.lang.String,
    date: stdLib.Date,
    high: scala.Double,
    low: scala.Double,
    value: scala.Double
  ): ItemContext = {
    val __obj = js.Dynamic.literal(borderColor = borderColor, color = color, date = date, high = high, low = low, value = value)
  
    __obj.asInstanceOf[ItemContext]
  }
}

