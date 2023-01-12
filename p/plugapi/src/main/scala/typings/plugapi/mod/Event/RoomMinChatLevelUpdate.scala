package typings.plugapi.mod.Event

import typings.plugapi.mod.User.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomMinChatLevelUpdate extends StObject {
  
  var id: Double
  
  var level: Double
  
  var user: User
}
object RoomMinChatLevelUpdate {
  
  inline def apply(id: Double, level: Double, user: User): RoomMinChatLevelUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomMinChatLevelUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoomMinChatLevelUpdate] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
