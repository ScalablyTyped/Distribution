package typings.atOracleOraclejet.ojpictochartMod.ojPictoChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait NodeContext extends js.Object {
  var index: Double
  var subId: String
}

object NodeContext {
  @scala.inline
  def apply(index: Double, subId: String): NodeContext = {
    val __obj = js.Dynamic.literal(index = index, subId = subId)
  
    __obj.asInstanceOf[NodeContext]
  }
}

