package typings.atOracleOraclejet.ojchartMod.ojChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait SeriesContext extends js.Object {
  var itemIndex: Double
  var subId: String
}

object SeriesContext {
  @scala.inline
  def apply(itemIndex: Double, subId: String): SeriesContext = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SeriesContext]
  }
}

