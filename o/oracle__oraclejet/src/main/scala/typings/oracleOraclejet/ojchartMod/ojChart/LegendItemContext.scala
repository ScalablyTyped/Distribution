package typings.oracleOraclejet.ojchartMod.ojChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait LegendItemContext extends js.Object {
  var itemIndex: Double
  var sectionIndexPath: js.Array[_]
  var subId: String
}

object LegendItemContext {
  @scala.inline
  def apply(itemIndex: Double, sectionIndexPath: js.Array[_], subId: String): LegendItemContext = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], sectionIndexPath = sectionIndexPath.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendItemContext]
  }
}

