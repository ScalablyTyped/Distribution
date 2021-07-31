package typings.plugapi.mod.Event

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserUpdate extends StObject {
  
  var avatarID: String
  
  var curatorPoints: Double
  
  var dateJoined: String
  
  var djPoints: Double
  
  var fans: Double
  
  var id: String
  
  var language: String
  
  var listenerPoints: Double
  
  var status: Double
  
  var username: String
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
  implicit class UserUpdateMutableBuilder[Self <: UserUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvatarID(value: String): Self = StObject.set(x, "avatarID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCuratorPoints(value: Double): Self = StObject.set(x, "curatorPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateJoined(value: String): Self = StObject.set(x, "dateJoined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDjPoints(value: Double): Self = StObject.set(x, "djPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFans(value: Double): Self = StObject.set(x, "fans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerPoints(value: Double): Self = StObject.set(x, "listenerPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
