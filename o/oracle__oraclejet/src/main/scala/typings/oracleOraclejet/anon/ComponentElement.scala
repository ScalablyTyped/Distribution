package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentElement[K2] extends js.Object {
  
  var componentElement: typings.std.Element = js.native
  
  var rowData: typings.oracleOraclejet.ojganttMod.ojGantt.Row[K2] = js.native
}
object ComponentElement {
  
  @scala.inline
  def apply[K2](componentElement: typings.std.Element, rowData: typings.oracleOraclejet.ojganttMod.ojGantt.Row[K2]): ComponentElement[K2] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElement[K2]]
  }
  
  @scala.inline
  implicit class ComponentElementOps[Self <: ComponentElement[_], K2] (val x: Self with ComponentElement[K2]) extends AnyVal {
    
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
    def setComponentElement(value: typings.std.Element): Self = this.set("componentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowData(value: typings.oracleOraclejet.ojganttMod.ojGantt.Row[K2]): Self = this.set("rowData", value.asInstanceOf[js.Any])
  }
}
