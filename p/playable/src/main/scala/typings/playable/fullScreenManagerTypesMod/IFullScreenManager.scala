package typings.playable.fullScreenManagerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFullScreenManager extends js.Object {
  
  def destroy(): Unit = js.native
  
  def disableEnterFullScreenOnPlay(): Unit = js.native
  
  def disableExitFullScreenOnEnd(): Unit = js.native
  
  def disableExitFullScreenOnPause(): Unit = js.native
  
  def disablePauseVideoOnFullScreenExit(): Unit = js.native
  
  def enableEnterFullScreenOnPlay(): Unit = js.native
  
  def enableExitFullScreenOnEnd(): Unit = js.native
  
  def enableExitFullScreenOnPause(): Unit = js.native
  
  def enablePauseVideoOnFullScreenExit(): Unit = js.native
  
  def enterFullScreen(): Unit = js.native
  
  def exitFullScreen(): Unit = js.native
  
  var isEnabled: Boolean = js.native
  
  var isInFullScreen: Boolean = js.native
}
object IFullScreenManager {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    disableEnterFullScreenOnPlay: () => Unit,
    disableExitFullScreenOnEnd: () => Unit,
    disableExitFullScreenOnPause: () => Unit,
    disablePauseVideoOnFullScreenExit: () => Unit,
    enableEnterFullScreenOnPlay: () => Unit,
    enableExitFullScreenOnEnd: () => Unit,
    enableExitFullScreenOnPause: () => Unit,
    enablePauseVideoOnFullScreenExit: () => Unit,
    enterFullScreen: () => Unit,
    exitFullScreen: () => Unit,
    isEnabled: Boolean,
    isInFullScreen: Boolean
  ): IFullScreenManager = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disableEnterFullScreenOnPlay = js.Any.fromFunction0(disableEnterFullScreenOnPlay), disableExitFullScreenOnEnd = js.Any.fromFunction0(disableExitFullScreenOnEnd), disableExitFullScreenOnPause = js.Any.fromFunction0(disableExitFullScreenOnPause), disablePauseVideoOnFullScreenExit = js.Any.fromFunction0(disablePauseVideoOnFullScreenExit), enableEnterFullScreenOnPlay = js.Any.fromFunction0(enableEnterFullScreenOnPlay), enableExitFullScreenOnEnd = js.Any.fromFunction0(enableExitFullScreenOnEnd), enableExitFullScreenOnPause = js.Any.fromFunction0(enableExitFullScreenOnPause), enablePauseVideoOnFullScreenExit = js.Any.fromFunction0(enablePauseVideoOnFullScreenExit), enterFullScreen = js.Any.fromFunction0(enterFullScreen), exitFullScreen = js.Any.fromFunction0(exitFullScreen), isEnabled = isEnabled.asInstanceOf[js.Any], isInFullScreen = isInFullScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFullScreenManager]
  }
  
  @scala.inline
  implicit class IFullScreenManagerOps[Self <: IFullScreenManager] (val x: Self) extends AnyVal {
    
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
    def setDisableEnterFullScreenOnPlay(value: () => Unit): Self = this.set("disableEnterFullScreenOnPlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisableExitFullScreenOnEnd(value: () => Unit): Self = this.set("disableExitFullScreenOnEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisableExitFullScreenOnPause(value: () => Unit): Self = this.set("disableExitFullScreenOnPause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisablePauseVideoOnFullScreenExit(value: () => Unit): Self = this.set("disablePauseVideoOnFullScreenExit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableEnterFullScreenOnPlay(value: () => Unit): Self = this.set("enableEnterFullScreenOnPlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableExitFullScreenOnEnd(value: () => Unit): Self = this.set("enableExitFullScreenOnEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableExitFullScreenOnPause(value: () => Unit): Self = this.set("enableExitFullScreenOnPause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnablePauseVideoOnFullScreenExit(value: () => Unit): Self = this.set("enablePauseVideoOnFullScreenExit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnterFullScreen(value: () => Unit): Self = this.set("enterFullScreen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExitFullScreen(value: () => Unit): Self = this.set("exitFullScreen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInFullScreen(value: Boolean): Self = this.set("isInFullScreen", value.asInstanceOf[js.Any])
  }
}
