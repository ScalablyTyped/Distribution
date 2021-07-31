package typings.plugapi.mod.Event

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModRemoveDJ extends StObject {
  
  var moderator: String
  
  var userID: String
  
  var username: String
}
object ModRemoveDJ {
  
  @scala.inline
  def apply(moderator: String, userID: String, username: String): ModRemoveDJ = {
    val __obj = js.Dynamic.literal(moderator = moderator.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModRemoveDJ]
  }
  
  @scala.inline
  implicit class ModRemoveDJMutableBuilder[Self <: ModRemoveDJ] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModerator(value: String): Self = StObject.set(x, "moderator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserID(value: String): Self = StObject.set(x, "userID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
