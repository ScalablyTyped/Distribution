package typings.atOracleOraclejet.ojchartMod.ojChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ItemContext extends js.Object {
  var itemIndex: Double
  var seriesIndex: Double
  var subId: String
}

object ItemContext {
  @scala.inline
  def apply(itemIndex: Double, seriesIndex: Double, subId: String): ItemContext = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex, seriesIndex = seriesIndex, subId = subId)
  
    __obj.asInstanceOf[ItemContext]
  }
}

