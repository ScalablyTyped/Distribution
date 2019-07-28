package typings.atOracleOraclejet.ojtreemapMod.ojTreemapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait NodeContext extends js.Object {
  var indexPath: js.Array[Double]
  var subId: String
}

object NodeContext {
  @scala.inline
  def apply(indexPath: js.Array[Double], subId: String): NodeContext = {
    val __obj = js.Dynamic.literal(indexPath = indexPath, subId = subId)
  
    __obj.asInstanceOf[NodeContext]
  }
}

