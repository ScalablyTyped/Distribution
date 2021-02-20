package typings.plugapi.mod.Event

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModBan extends StObject {
  
  var duration: Double = js.native
  
  var moderator: String = js.native
  
  var reason: String = js.native
  
  var ref: String = js.native
  
  var username: String = js.native
}
object ModBan {
  
  @scala.inline
  def apply(duration: Double, moderator: String, reason: String, ref: String, username: String): ModBan = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], moderator = moderator.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModBan]
  }
  
  @scala.inline
  implicit class ModBanMutableBuilder[Self <: ModBan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModerator(value: String): Self = StObject.set(x, "moderator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
