package typings.atOracleOraclejet.ojgaugeMod.ojRatingGaugeNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait TooltipContext extends js.Object {
  var color: String
  var componentElement: Element
  var label: String
  var parentElement: Element
}

object TooltipContext {
  @scala.inline
  def apply(color: String, componentElement: Element, label: String, parentElement: Element): TooltipContext = {
    val __obj = js.Dynamic.literal(color = color, componentElement = componentElement, label = label, parentElement = parentElement)
  
    __obj.asInstanceOf[TooltipContext]
  }
}

