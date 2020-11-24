package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Available extends js.Object {
  
  var available: String = js.native
  
  var away: String = js.native
  
  var background: String = js.native
  
  var busy: String = js.native
  
  var dnd: String = js.native
  
  var offline: String = js.native
  
  var oof: String = js.native
}
object Available {
  
  @scala.inline
  def apply(
    available: String,
    away: String,
    background: String,
    busy: String,
    dnd: String,
    offline: String,
    oof: String
  ): Available = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], away = away.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], busy = busy.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], oof = oof.asInstanceOf[js.Any])
    __obj.asInstanceOf[Available]
  }
  
  @scala.inline
  implicit class AvailableOps[Self <: Available] (val x: Self) extends AnyVal {
    
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
    def setAvailable(value: String): Self = this.set("available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAway(value: String): Self = this.set("away", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusy(value: String): Self = this.set("busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnd(value: String): Self = this.set("dnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffline(value: String): Self = this.set("offline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOof(value: String): Self = this.set("oof", value.asInstanceOf[js.Any])
  }
}
