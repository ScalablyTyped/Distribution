package typings.atOracleOraclejet.ojpictochartMod.ojPictoChartNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait TooltipContext[K] extends js.Object {
  var color: String
  var componentElement: Element
  var count: Double
  var id: K
  var name: String
  var parentElement: Element
}

object TooltipContext {
  @scala.inline
  def apply[K](
    color: String,
    componentElement: Element,
    count: Double,
    id: K,
    name: String,
    parentElement: Element
  ): TooltipContext[K] = {
    val __obj = js.Dynamic.literal(color = color, componentElement = componentElement, count = count, id = id.asInstanceOf[js.Any], name = name, parentElement = parentElement)
  
    __obj.asInstanceOf[TooltipContext[K]]
  }
}

