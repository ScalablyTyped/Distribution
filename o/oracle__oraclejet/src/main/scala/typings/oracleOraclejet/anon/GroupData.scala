package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupData extends StObject {
  
  var data: js.Object = js.native
  
  var groupData: js.Array[_] = js.native
  
  var itemData: js.Object = js.native
  
  var seriesData: js.Object = js.native
}
object GroupData {
  
  @scala.inline
  def apply(data: js.Object, groupData: js.Array[_], itemData: js.Object, seriesData: js.Object): GroupData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], groupData = groupData.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], seriesData = seriesData.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupData]
  }
  
  @scala.inline
  implicit class GroupDataMutableBuilder[Self <: GroupData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupData(value: js.Array[_]): Self = StObject.set(x, "groupData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupDataVarargs(value: js.Any*): Self = StObject.set(x, "groupData", js.Array(value :_*))
    
    @scala.inline
    def setItemData(value: js.Object): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesData(value: js.Object): Self = StObject.set(x, "seriesData", value.asInstanceOf[js.Any])
  }
}
