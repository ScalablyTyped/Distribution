package typings.plugapi.mod.Event

import typings.plugapi.mod.User.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomMinChatLevelUpdate extends StObject {
  
  var id: Double = js.native
  
  var level: Double = js.native
  
  var user: User = js.native
}
object RoomMinChatLevelUpdate {
  
  @scala.inline
  def apply(id: Double, level: Double, user: User): RoomMinChatLevelUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomMinChatLevelUpdate]
  }
  
  @scala.inline
  implicit class RoomMinChatLevelUpdateMutableBuilder[Self <: RoomMinChatLevelUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
