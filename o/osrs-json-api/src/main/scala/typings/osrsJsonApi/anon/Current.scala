package typings.osrsJsonApi.anon

import typings.osrsJsonApi.mod.ge.TrendPriceObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Current extends js.Object {
  
  var current: TrendPriceObject = js.native
  
  var day180: TrendPriceObject = js.native
  
  var day30: TrendPriceObject = js.native
  
  var day90: TrendPriceObject = js.native
  
  var description: String = js.native
  
  var icon: String = js.native
  
  var icon_large: String = js.native
  
  var id: Double = js.native
  
  var members: Boolean = js.native
  
  var name: String = js.native
  
  var today: TrendPriceObject = js.native
  
  var `type`: String = js.native
  
  var typeIcon: String = js.native
}
object Current {
  
  @scala.inline
  def apply(
    current: TrendPriceObject,
    day180: TrendPriceObject,
    day30: TrendPriceObject,
    day90: TrendPriceObject,
    description: String,
    icon: String,
    icon_large: String,
    id: Double,
    members: Boolean,
    name: String,
    today: TrendPriceObject,
    `type`: String,
    typeIcon: String
  ): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], day180 = day180.asInstanceOf[js.Any], day30 = day30.asInstanceOf[js.Any], day90 = day90.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], icon_large = icon_large.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any], typeIcon = typeIcon.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  
  @scala.inline
  implicit class CurrentOps[Self <: Current] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: TrendPriceObject): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDay180(value: TrendPriceObject): Self = this.set("day180", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDay30(value: TrendPriceObject): Self = this.set("day30", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDay90(value: TrendPriceObject): Self = this.set("day90", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon_large(value: String): Self = this.set("icon_large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: Boolean): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToday(value: TrendPriceObject): Self = this.set("today", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeIcon(value: String): Self = this.set("typeIcon", value.asInstanceOf[js.Any])
  }
}
