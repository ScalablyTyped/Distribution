package typings
package atOracleOraclejetLib.ojdiagramMod.ojDiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait TooltipContext[K1, K2, D1, D2] extends js.Object {
  var componentElement: stdLib.Element
  var data: js.Object | js.Array[js.Object]
  var id: K1 | K2
  var itemData: D1 | D2 | js.Array[D2]
  var label: java.lang.String
  var parentElement: stdLib.Element
  var `type`: java.lang.String
}

object TooltipContext {
  @scala.inline
  def apply[K1, K2, D1, D2](
    componentElement: stdLib.Element,
    data: js.Object | js.Array[js.Object],
    id: K1 | K2,
    itemData: D1 | D2 | js.Array[D2],
    label: java.lang.String,
    parentElement: stdLib.Element,
    `type`: java.lang.String
  ): TooltipContext[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement, data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], label = label, parentElement = parentElement)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TooltipContext[K1, K2, D1, D2]]
  }
}

