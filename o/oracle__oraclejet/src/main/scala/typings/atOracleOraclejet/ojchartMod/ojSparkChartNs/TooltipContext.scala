package typings.atOracleOraclejet.ojchartMod.ojSparkChartNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait TooltipContext extends js.Object {
  var color: String
  var componentElement: Element
  var parentElement: Element
}

object TooltipContext {
  @scala.inline
  def apply(color: String, componentElement: Element, parentElement: Element): TooltipContext = {
    val __obj = js.Dynamic.literal(color = color, componentElement = componentElement, parentElement = parentElement)
  
    __obj.asInstanceOf[TooltipContext]
  }
}

