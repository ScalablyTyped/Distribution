package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojganttMod.ojGantt.RowTask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemData[K2, D2] extends StObject {
  
  var color: String
  
  var data: RowTask[K2]
  
  var itemData: D2 | Null
  
  var rowData: typings.oracleOraclejet.ojganttMod.ojGantt.Row[K2]
}
object ItemData {
  
  inline def apply[K2, D2](color: String, data: RowTask[K2], rowData: typings.oracleOraclejet.ojganttMod.ojGantt.Row[K2]): ItemData[K2, D2] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], itemData = null)
    __obj.asInstanceOf[ItemData[K2, D2]]
  }
  
  extension [Self <: ItemData[?, ?], K2, D2](x: Self & (ItemData[K2, D2])) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setData(value: RowTask[K2]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setItemData(value: D2): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    inline def setItemDataNull: Self = StObject.set(x, "itemData", null)
    
    inline def setRowData(value: typings.oracleOraclejet.ojganttMod.ojGantt.Row[K2]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
  }
}
