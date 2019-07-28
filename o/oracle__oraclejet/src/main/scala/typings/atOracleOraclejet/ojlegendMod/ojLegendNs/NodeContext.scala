package typings.atOracleOraclejet.ojlegendMod.ojLegendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait NodeContext extends js.Object {
  var itemIndex: Double
  var sectionIndexPath: js.Array[Double]
  var subId: String
}

object NodeContext {
  @scala.inline
  def apply(itemIndex: Double, sectionIndexPath: js.Array[Double], subId: String): NodeContext = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex, sectionIndexPath = sectionIndexPath, subId = subId)
  
    __obj.asInstanceOf[NodeContext]
  }
}

