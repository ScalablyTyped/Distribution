package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Groups extends js.Object {
  
  var groups: DataTypes = js.native
  
  var items: DataTypes = js.native
  
  var series: DataTypes = js.native
}
object Groups {
  
  @scala.inline
  def apply(groups: DataTypes, items: DataTypes, series: DataTypes): Groups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
  
  @scala.inline
  implicit class GroupsOps[Self <: Groups] (val x: Self) extends AnyVal {
    
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
    def setGroups(value: DataTypes): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: DataTypes): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeries(value: DataTypes): Self = this.set("series", value.asInstanceOf[js.Any])
  }
}
