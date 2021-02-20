package typings.plugapi.mod.Event

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModAddDJ extends StObject {
  
  var moderator: String = js.native
  
  var username: String = js.native
}
object ModAddDJ {
  
  @scala.inline
  def apply(moderator: String, username: String): ModAddDJ = {
    val __obj = js.Dynamic.literal(moderator = moderator.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModAddDJ]
  }
  
  @scala.inline
  implicit class ModAddDJMutableBuilder[Self <: ModAddDJ] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModerator(value: String): Self = StObject.set(x, "moderator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
