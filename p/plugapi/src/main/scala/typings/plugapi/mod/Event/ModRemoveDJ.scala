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
  
  inline def apply(moderator: String, userID: String, username: String): ModRemoveDJ = {
    val __obj = js.Dynamic.literal(moderator = moderator.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModRemoveDJ]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModRemoveDJ] (val x: Self) extends AnyVal {
    
    inline def setModerator(value: String): Self = StObject.set(x, "moderator", value.asInstanceOf[js.Any])
    
    inline def setUserID(value: String): Self = StObject.set(x, "userID", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
