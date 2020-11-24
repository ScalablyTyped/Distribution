package typings.oracleOraclejet.ojganttMod.ojGantt

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait TooltipContext[K2, D2] extends js.Object {
  
  var color: String = js.native
  
  var componentElement: Element = js.native
  
  var data: RowTask[K2] = js.native
  
  var itemData: D2 = js.native
  
  var parentElement: Element = js.native
  
  var rowData: Row[K2] = js.native
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
  
  @scala.inline
  implicit class TooltipContextOps[Self <: TooltipContext[_, _], K2, D2] (val x: Self with (TooltipContext[K2, D2])) extends AnyVal {
    
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
    def setData(value: RowTask[K2]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemData(value: D2): Self = this.set("itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentElement(value: Element): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowData(value: Row[K2]): Self = this.set("rowData", value.asInstanceOf[js.Any])
  }
}
