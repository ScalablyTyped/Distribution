package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var data: js.Object
  
  var group: String
  
  var groupData: js.Array[js.Any]
  
  var id: String
  
  var itemData: js.Object
  
  var series: String
  
  var seriesData: js.Object
}
object Data {
  
  inline def apply(
    data: js.Object,
    group: String,
    groupData: js.Array[js.Any],
    id: String,
    itemData: js.Object,
    series: String,
    seriesData: js.Object
  ): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], groupData = groupData.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], seriesData = seriesData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupData(value: js.Array[js.Any]): Self = StObject.set(x, "groupData", value.asInstanceOf[js.Any])
    
    inline def setGroupDataVarargs(value: js.Any*): Self = StObject.set(x, "groupData", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setItemData(value: js.Object): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesData(value: js.Object): Self = StObject.set(x, "seriesData", value.asInstanceOf[js.Any])
  }
}
