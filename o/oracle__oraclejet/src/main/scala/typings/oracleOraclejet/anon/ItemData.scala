package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojganttMod.ojGantt.RowTask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemData[K2, D2] extends StObject {
  
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
  implicit class ItemDataMutableBuilder[Self <: ItemData[_, _], K2, D2] (val x: Self with (ItemData[K2, D2])) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: RowTask[K2]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemData(value: D2): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDataNull: Self = StObject.set(x, "itemData", null)
    
    @scala.inline
    def setRowData(value: typings.oracleOraclejet.ojganttMod.ojGantt.Row[K2]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
  }
}
