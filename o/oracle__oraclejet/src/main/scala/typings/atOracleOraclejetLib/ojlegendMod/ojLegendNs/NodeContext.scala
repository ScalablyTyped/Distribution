package typings
package atOracleOraclejetLib.ojlegendMod.ojLegendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait NodeContext extends js.Object {
  var itemIndex: scala.Double
  var sectionIndexPath: js.Array[scala.Double]
  var subId: java.lang.String
}

object NodeContext {
  @scala.inline
  def apply(itemIndex: scala.Double, sectionIndexPath: js.Array[scala.Double], subId: java.lang.String): NodeContext = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex, sectionIndexPath = sectionIndexPath, subId = subId)
  
    __obj.asInstanceOf[NodeContext]
  }
}

