package typings.atOracleOraclejet.ojchartMod.ojChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait SeriesContext extends js.Object {
  var itemIndex: Double
  var subId: String
}

object SeriesContext {
  @scala.inline
  def apply(itemIndex: Double, subId: String): SeriesContext = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex, subId = subId)
  
    __obj.asInstanceOf[SeriesContext]
  }
}

