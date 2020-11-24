package typings.passportDiscord.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GuildInfo extends js.Object {
  
  var icon: String = js.native
  
  var id: String = js.native
  
  var name: String = js.native
  
  var owner: Boolean = js.native
  
  var permissions: Double = js.native
}
object GuildInfo {
  
  @scala.inline
  def apply(icon: String, id: String, name: String, owner: Boolean, permissions: Double): GuildInfo = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuildInfo]
  }
  
  @scala.inline
  implicit class GuildInfoOps[Self <: GuildInfo] (val x: Self) extends AnyVal {
    
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
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: Boolean): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: Double): Self = this.set("permissions", value.asInstanceOf[js.Any])
  }
}
