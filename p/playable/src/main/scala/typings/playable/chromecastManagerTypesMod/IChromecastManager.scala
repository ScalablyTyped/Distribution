package typings.playable.chromecastManagerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChromecastManager extends js.Object {
  
  def destroy(): Unit = js.native
  
  var isCasting: Boolean = js.native
  
  var isEnabled: Boolean = js.native
}
object IChromecastManager {
  
  @scala.inline
  def apply(destroy: () => Unit, isCasting: Boolean, isEnabled: Boolean): IChromecastManager = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), isCasting = isCasting.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChromecastManager]
  }
  
  @scala.inline
  implicit class IChromecastManagerOps[Self <: IChromecastManager] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCasting(value: Boolean): Self = this.set("isCasting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
  }
}
