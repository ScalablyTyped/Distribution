package typings
package atOracleOraclejetLib.ojganttMod.ojGanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait TooltipContext[K2, D2] extends js.Object {
  var color: java.lang.String
  var componentElement: stdLib.Element
  var data: RowTask[K2]
  var itemData: D2
  var parentElement: stdLib.Element
  var rowData: Row[K2]
}

object TooltipContext {
  @scala.inline
  def apply[K2, D2](
    color: java.lang.String,
    componentElement: stdLib.Element,
    data: RowTask[K2],
    itemData: D2,
    parentElement: stdLib.Element,
    rowData: Row[K2]
  ): TooltipContext[K2, D2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("componentElement")(componentElement)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    __obj.updateDynamic("parentElement")(parentElement)
    __obj.updateDynamic("rowData")(rowData)
    __obj.asInstanceOf[TooltipContext[K2, D2]]
  }
}

