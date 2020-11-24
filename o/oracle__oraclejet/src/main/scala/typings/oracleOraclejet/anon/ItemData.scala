package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojganttMod.ojGantt.RowTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemData[K2, D2] extends js.Object {
  
  var color: String = js.native
  
  var data: RowTask[K2] = js.native
  
  var itemData: D2 | Null = js.native
  
  var rowData: typings.oracleOraclejet.ojganttMod.ojGantt.Row[K2] = js.native
}
object ItemData {
  
  @scala.inline
  def apply[K2, D2](color: String, data: RowTask[K2], rowData: typings.oracleOraclejet.ojganttMod.ojGantt.Row[K2]): ItemData[K2, D2] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemData[K2, D2]]
  }
  
  @scala.inline
  implicit class ItemDataOps[Self <: ItemData[_, _], K2, D2] (val x: Self with (ItemData[K2, D2])) extends AnyVal {
    
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
    def setData(value: RowTask[K2]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowData(value: typings.oracleOraclejet.ojganttMod.ojGantt.Row[K2]): Self = this.set("rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemData(value: D2): Self = this.set("itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDataNull: Self = this.set("itemData", null)
  }
}
