package typings.playable.fullScreenManagerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFullScreenHelper extends js.Object {
  
  def destroy(): Unit = js.native
  
  def exit(): Unit = js.native
  
  var isAPIExist: Boolean = js.native
  
  var isEnabled: Boolean = js.native
  
  var isInFullScreen: Boolean = js.native
  
  def request(): Unit = js.native
}
object IFullScreenHelper {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    exit: () => Unit,
    isAPIExist: Boolean,
    isEnabled: Boolean,
    isInFullScreen: Boolean,
    request: () => Unit
  ): IFullScreenHelper = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), exit = js.Any.fromFunction0(exit), isAPIExist = isAPIExist.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isInFullScreen = isInFullScreen.asInstanceOf[js.Any], request = js.Any.fromFunction0(request))
    __obj.asInstanceOf[IFullScreenHelper]
  }
  
  @scala.inline
  implicit class IFullScreenHelperOps[Self <: IFullScreenHelper] (val x: Self) extends AnyVal {
    
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
    def setExit(value: () => Unit): Self = this.set("exit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAPIExist(value: Boolean): Self = this.set("isAPIExist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInFullScreen(value: Boolean): Self = this.set("isInFullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: () => Unit): Self = this.set("request", js.Any.fromFunction0(value))
  }
}
