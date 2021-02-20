package typings.plugapi.mod.Event

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModMoveDJ extends StObject {
  
  var index: Double = js.native
  
  var moderator: String = js.native
  
  var old: Double = js.native
  
  var userID: String = js.native
}
object ModMoveDJ {
  
  @scala.inline
  def apply(index: Double, moderator: String, old: Double, userID: String): ModMoveDJ = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], moderator = moderator.asInstanceOf[js.Any], old = old.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModMoveDJ]
  }
  
  @scala.inline
  implicit class ModMoveDJMutableBuilder[Self <: ModMoveDJ] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModerator(value: String): Self = StObject.set(x, "moderator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOld(value: Double): Self = StObject.set(x, "old", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserID(value: String): Self = StObject.set(x, "userID", value.asInstanceOf[js.Any])
  }
}
