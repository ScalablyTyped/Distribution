package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupData extends StObject {
  
  var data: js.Object
  
  var groupData: js.Array[Any]
  
  var itemData: js.Object
  
  var seriesData: js.Object
}
object GroupData {
  
  inline def apply(data: js.Object, groupData: js.Array[Any], itemData: js.Object, seriesData: js.Object): GroupData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], groupData = groupData.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], seriesData = seriesData.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupData]
  }
  
  extension [Self <: GroupData](x: Self) {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGroupData(value: js.Array[Any]): Self = StObject.set(x, "groupData", value.asInstanceOf[js.Any])
    
    inline def setGroupDataVarargs(value: Any*): Self = StObject.set(x, "groupData", js.Array(value*))
    
    inline def setItemData(value: js.Object): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    inline def setSeriesData(value: js.Object): Self = StObject.set(x, "seriesData", value.asInstanceOf[js.Any])
  }
}
