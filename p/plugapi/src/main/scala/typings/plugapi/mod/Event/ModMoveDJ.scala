package typings.plugapi.mod.Event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModMoveDJ extends js.Object {
  
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
  implicit class ModMoveDJOps[Self <: ModMoveDJ] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModerator(value: String): Self = this.set("moderator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOld(value: Double): Self = this.set("old", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserID(value: String): Self = this.set("userID", value.asInstanceOf[js.Any])
  }
}
