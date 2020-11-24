package typings.plugapi.mod.Event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserUpdate extends js.Object {
  
  var avatarID: String = js.native
  
  var curatorPoints: Double = js.native
  
  var dateJoined: String = js.native
  
  var djPoints: Double = js.native
  
  var fans: Double = js.native
  
  var id: String = js.native
  
  var language: String = js.native
  
  var listenerPoints: Double = js.native
  
  var status: Double = js.native
  
  var username: String = js.native
}
object UserUpdate {
  
  @scala.inline
  def apply(
    avatarID: String,
    curatorPoints: Double,
    dateJoined: String,
    djPoints: Double,
    fans: Double,
    id: String,
    language: String,
    listenerPoints: Double,
    status: Double,
    username: String
  ): UserUpdate = {
    val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], curatorPoints = curatorPoints.asInstanceOf[js.Any], dateJoined = dateJoined.asInstanceOf[js.Any], djPoints = djPoints.asInstanceOf[js.Any], fans = fans.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], listenerPoints = listenerPoints.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserUpdate]
  }
  
  @scala.inline
  implicit class UserUpdateOps[Self <: UserUpdate] (val x: Self) extends AnyVal {
    
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
    def setAvatarID(value: String): Self = this.set("avatarID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCuratorPoints(value: Double): Self = this.set("curatorPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateJoined(value: String): Self = this.set("dateJoined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDjPoints(value: Double): Self = this.set("djPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFans(value: Double): Self = this.set("fans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerPoints(value: Double): Self = this.set("listenerPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
