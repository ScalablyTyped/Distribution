package typings.atOracleOraclejet.ojdiagramMod.ojDiagram

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait TooltipContext[K1, K2, D1, D2] extends js.Object {
  var componentElement: Element
  var data: js.Object | js.Array[js.Object]
  var id: K1 | K2
  var itemData: D1 | D2 | js.Array[D2]
  var label: String
  var parentElement: Element
  var `type`: String
}

object TooltipContext {
  @scala.inline
  def apply[K1, K2, D1, D2](
    componentElement: Element,
    data: js.Object | js.Array[js.Object],
    id: K1 | K2,
    itemData: D1 | D2 | js.Array[D2],
    label: String,
    parentElement: Element,
    `type`: String
  ): TooltipContext[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipContext[K1, K2, D1, D2]]
  }
}

