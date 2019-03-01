package typings
package atOracleOraclejetLib.ojchartMod.ojChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait LegendItemContext extends js.Object {
  var itemIndex: scala.Double
  var sectionIndexPath: js.Array[_]
  var subId: java.lang.String
}

object LegendItemContext {
  @scala.inline
  def apply(itemIndex: scala.Double, sectionIndexPath: js.Array[_], subId: java.lang.String): LegendItemContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("itemIndex")(itemIndex)
    __obj.updateDynamic("sectionIndexPath")(sectionIndexPath)
    __obj.updateDynamic("subId")(subId)
    __obj.asInstanceOf[LegendItemContext]
  }
}

