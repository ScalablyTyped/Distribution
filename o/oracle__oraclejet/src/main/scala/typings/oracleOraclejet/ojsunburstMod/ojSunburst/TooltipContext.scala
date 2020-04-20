package typings.oracleOraclejet.ojsunburstMod.ojSunburst

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait TooltipContext[K, D] extends js.Object {
  var color: String
  var componentElement: Element
  var data: js.Object
  var id: K
  var itemData: D
  var label: String
  var parentElement: Element
  var radius: Double
  var value: Double
}

object TooltipContext {
  @scala.inline
  def apply[K, D](
    color: String,
    componentElement: Element,
    data: js.Object,
    id: K,
    itemData: D,
    label: String,
    parentElement: Element,
    radius: Double,
    value: Double
  ): TooltipContext[K, D] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipContext[K, D]]
  }
}

