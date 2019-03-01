package typings
package atOracleOraclejetLib.ojchartMod.ojChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ItemContext extends js.Object {
  var itemIndex: scala.Double
  var seriesIndex: scala.Double
  var subId: java.lang.String
}

object ItemContext {
  @scala.inline
  def apply(itemIndex: scala.Double, seriesIndex: scala.Double, subId: java.lang.String): ItemContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("itemIndex")(itemIndex)
    __obj.updateDynamic("seriesIndex")(seriesIndex)
    __obj.updateDynamic("subId")(subId)
    __obj.asInstanceOf[ItemContext]
  }
}

