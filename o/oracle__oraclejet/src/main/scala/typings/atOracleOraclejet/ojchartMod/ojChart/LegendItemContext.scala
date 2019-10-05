package typings.atOracleOraclejet.ojchartMod.ojChart

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
    val __obj = js.Dynamic.literal(itemIndex = itemIndex, sectionIndexPath = sectionIndexPath, subId = subId)
  
    __obj.asInstanceOf[LegendItemContext]
  }
}

