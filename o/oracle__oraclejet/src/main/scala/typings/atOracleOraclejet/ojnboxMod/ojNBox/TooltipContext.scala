package typings.atOracleOraclejet.ojnboxMod.ojNBox

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait TooltipContext[K] extends js.Object {
  var color: String
  var column: String
  var componentElement: Element
  var id: K
  var indicatorColor: String
  var label: String
  var parentElement: Element
  var row: String
  var secondaryLabel: String
}

object TooltipContext {
  @scala.inline
  def apply[K](
    color: String,
    column: String,
    componentElement: Element,
    id: K,
    indicatorColor: String,
    label: String,
    parentElement: Element,
    row: String,
    secondaryLabel: String
  ): TooltipContext[K] = {
    val __obj = js.Dynamic.literal(color = color, column = column, componentElement = componentElement, id = id.asInstanceOf[js.Any], indicatorColor = indicatorColor, label = label, parentElement = parentElement, row = row, secondaryLabel = secondaryLabel)
  
    __obj.asInstanceOf[TooltipContext[K]]
  }
}

