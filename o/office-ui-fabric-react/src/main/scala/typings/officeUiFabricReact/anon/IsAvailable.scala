package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsAvailable extends js.Object {
  
  var isAvailable: Boolean = js.native
  
  var isAway: Boolean = js.native
  
  var isBlocked: Boolean = js.native
  
  var isBusy: Boolean = js.native
  
  var isDoNotDisturb: Boolean = js.native
  
  var isOffline: Boolean = js.native
}
object IsAvailable {
  
  @scala.inline
  def apply(
    isAvailable: Boolean,
    isAway: Boolean,
    isBlocked: Boolean,
    isBusy: Boolean,
    isDoNotDisturb: Boolean,
    isOffline: Boolean
  ): IsAvailable = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any], isAway = isAway.asInstanceOf[js.Any], isBlocked = isBlocked.asInstanceOf[js.Any], isBusy = isBusy.asInstanceOf[js.Any], isDoNotDisturb = isDoNotDisturb.asInstanceOf[js.Any], isOffline = isOffline.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsAvailable]
  }
  
  @scala.inline
  implicit class IsAvailableOps[Self <: IsAvailable] (val x: Self) extends AnyVal {
    
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
    def setIsAvailable(value: Boolean): Self = this.set("isAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAway(value: Boolean): Self = this.set("isAway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBlocked(value: Boolean): Self = this.set("isBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBusy(value: Boolean): Self = this.set("isBusy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDoNotDisturb(value: Boolean): Self = this.set("isDoNotDisturb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOffline(value: Boolean): Self = this.set("isOffline", value.asInstanceOf[js.Any])
  }
}
