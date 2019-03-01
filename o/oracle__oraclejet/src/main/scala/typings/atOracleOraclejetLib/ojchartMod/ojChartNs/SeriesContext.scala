package typings
package atOracleOraclejetLib.ojchartMod.ojChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait SeriesContext extends js.Object {
  var itemIndex: scala.Double
  var subId: java.lang.String
}

object SeriesContext {
  @scala.inline
  def apply(itemIndex: scala.Double, subId: java.lang.String): SeriesContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("itemIndex")(itemIndex)
    __obj.updateDynamic("subId")(subId)
    __obj.asInstanceOf[SeriesContext]
  }
}

