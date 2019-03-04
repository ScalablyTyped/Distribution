package typings
package atOracleOraclejetLib.ojtreemapMod.ojTreemapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait TooltipContext[K, D] extends js.Object {
  var color: java.lang.String
  var componentElement: stdLib.Element
  var data: js.Object
  var id: K
  var itemData: D
  var label: java.lang.String
  var parentElement: stdLib.Element
  var value: scala.Double
}

object TooltipContext {
  @scala.inline
  def apply[K, D](
    color: java.lang.String,
    componentElement: stdLib.Element,
    data: js.Object,
    id: K,
    itemData: D,
    label: java.lang.String,
    parentElement: stdLib.Element,
    value: scala.Double
  ): TooltipContext[K, D] = {
    val __obj = js.Dynamic.literal(color = color, componentElement = componentElement, data = data, id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], label = label, parentElement = parentElement, value = value)
  
    __obj.asInstanceOf[TooltipContext[K, D]]
  }
}

