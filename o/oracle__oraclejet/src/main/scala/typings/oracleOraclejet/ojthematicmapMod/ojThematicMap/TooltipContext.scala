package typings.oracleOraclejet.ojthematicmapMod.ojThematicMap

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait TooltipContext[K1, K2, K3, D1, D2, D3] extends js.Object {
  var color: String | Null = js.native
  var componentElement: Element = js.native
  var data: js.Object | Null = js.native
  var id: K1 | K2 | K3 = js.native
  var itemData: D1 | D2 | D3 = js.native
  var label: String | Null = js.native
  var location: String | Null = js.native
  var locationName: String | Null = js.native
  var parentElement: Element = js.native
  var tooltip: String = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object TooltipContext {
  @scala.inline
  def apply[K1, K2, K3, D1, D2, D3](
    componentElement: Element,
    id: K1 | K2 | K3,
    itemData: D1 | D2 | D3,
    parentElement: Element,
    tooltip: String,
    x: Double,
    y: Double
  ): TooltipContext[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipContext[K1, K2, K3, D1, D2, D3]]
  }
  @scala.inline
  implicit class TooltipContextOps[Self <: TooltipContext[_, _, _, _, _, _], K1, K2, K3, D1, D2, D3] (val x: Self with (TooltipContext[K1, K2, K3, D1, D2, D3])) extends AnyVal {
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
    def setComponentElement(value: Element): Self = this.set("componentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: K1 | K2 | K3): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemData(value: D1 | D2 | D3): Self = this.set("itemData", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentElement(value: Element): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorNull: Self = this.set("color", null)
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelNull: Self = this.set("label", null)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationNull: Self = this.set("location", null)
    @scala.inline
    def setLocationName(value: String): Self = this.set("locationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationNameNull: Self = this.set("locationName", null)
  }
  
}

