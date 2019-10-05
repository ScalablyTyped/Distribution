package typings.atOracleOraclejet.ojchartMod.ojSparkChart

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ItemContext extends js.Object {
  var borderColor: String
  var color: String
  var date: Date
  var high: Double
  var low: Double
  var value: Double
}

object ItemContext {
  @scala.inline
  def apply(borderColor: String, color: String, date: Date, high: Double, low: Double, value: Double): ItemContext = {
    val __obj = js.Dynamic.literal(borderColor = borderColor, color = color, date = date, high = high, low = low, value = value)
  
    __obj.asInstanceOf[ItemContext]
  }
}

