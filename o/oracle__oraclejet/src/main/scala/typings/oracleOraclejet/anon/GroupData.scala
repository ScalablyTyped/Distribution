package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupData extends js.Object {
  
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
  implicit class GroupDataOps[Self <: GroupData] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupDataVarargs(value: js.Any*): Self = this.set("groupData", js.Array(value :_*))
    
    @scala.inline
    def setGroupData(value: js.Array[_]): Self = this.set("groupData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemData(value: js.Object): Self = this.set("itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesData(value: js.Object): Self = this.set("seriesData", value.asInstanceOf[js.Any])
  }
}
