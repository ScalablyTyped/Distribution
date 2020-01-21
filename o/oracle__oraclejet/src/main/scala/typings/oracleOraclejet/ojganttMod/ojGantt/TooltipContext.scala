package typings.oracleOraclejet.ojganttMod.ojGantt

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait TooltipContext[K2, D2] extends js.Object {
  var color: String
  var componentElement: Element
  var data: RowTask[K2]
  var itemData: D2
  var parentElement: Element
  var rowData: Row[K2]
}

object TooltipContext {
  @scala.inline
  def apply[K2, D2](
    color: String,
    componentElement: Element,
    data: RowTask[K2],
    itemData: D2,
    parentElement: Element,
    rowData: Row[K2]
  ): TooltipContext[K2, D2] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TooltipContext[K2, D2]]
  }
}

