package typings.atOracleOraclejet.ojlegendMod.ojLegend

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
    val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], sectionIndexPath = sectionIndexPath.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeContext]
  }
}

