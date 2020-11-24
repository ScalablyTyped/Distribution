package typings.oracleOraclejet.ojdiagramMod.ojDiagram

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait TooltipContext[K1, K2, D1, D2] extends js.Object {
  
  var componentElement: Element = js.native
  
  var data: js.Object | js.Array[js.Object] = js.native
  
  var id: K1 | K2 = js.native
  
  var itemData: D1 | D2 | js.Array[D2] = js.native
  
  var label: String = js.native
  
  var parentElement: Element = js.native
  
  var `type`: String = js.native
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
  
  @scala.inline
  implicit class TooltipContextOps[Self <: TooltipContext[_, _, _, _], K1, K2, D1, D2] (val x: Self with (TooltipContext[K1, K2, D1, D2])) extends AnyVal {
    
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
    def setDataVarargs(value: js.Object*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Object | js.Array[js.Object]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: K1 | K2): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDataVarargs(value: D2*): Self = this.set("itemData", js.Array(value :_*))
    
    @scala.inline
    def setItemData(value: D1 | D2 | js.Array[D2]): Self = this.set("itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentElement(value: Element): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
