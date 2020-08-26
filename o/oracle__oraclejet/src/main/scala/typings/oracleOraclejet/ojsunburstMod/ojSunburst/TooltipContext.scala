package typings.oracleOraclejet.ojsunburstMod.ojSunburst

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait TooltipContext[K, D] extends js.Object {
  var color: String = js.native
  var componentElement: Element = js.native
  var data: js.Object = js.native
  var id: K = js.native
  var itemData: D = js.native
  var label: String = js.native
  var parentElement: Element = js.native
  var radius: Double = js.native
  var value: Double = js.native
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
  @scala.inline
  implicit class TooltipContextOps[Self <: TooltipContext[_, _], K, D] (val x: Self with (TooltipContext[K, D])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentElement(value: Element): Self = this.set("componentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: K): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemData(value: D): Self = this.set("itemData", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentElement(value: Element): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

