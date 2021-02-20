package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data
  extends /* key */ StringDictionary[js.Any] {
  
  var data: js.Object = js.native
  
  var group: String = js.native
  
  var groupData: js.Array[_] = js.native
  
  var id: String = js.native
  
  var itemData: js.Object = js.native
  
  var series: String = js.native
  
  var seriesData: js.Object = js.native
}
object Data {
  
  @scala.inline
  def apply(
    data: js.Object,
    group: String,
    groupData: js.Array[_],
    id: String,
    itemData: js.Object,
    series: String,
    seriesData: js.Object
  ): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], groupData = groupData.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], seriesData = seriesData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupData(value: js.Array[_]): Self = StObject.set(x, "groupData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupDataVarargs(value: js.Any*): Self = StObject.set(x, "groupData", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemData(value: js.Object): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesData(value: js.Object): Self = StObject.set(x, "seriesData", value.asInstanceOf[js.Any])
  }
}
