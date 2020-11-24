package typings.playable.fullScreenManagerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFullScreenAPI extends js.Object {
  
  var disableEnterFullScreenOnPlay: js.UndefOr[js.Function0[Unit]] = js.native
  
  var disableExitFullScreenOnEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  var disableExitFullScreenOnPause: js.UndefOr[js.Function0[Unit]] = js.native
  
  var disablePauseVideoOnFullScreenExit: js.UndefOr[js.Function0[Unit]] = js.native
  
  var enableEnterFullScreenOnPlay: js.UndefOr[js.Function0[Unit]] = js.native
  
  var enableExitFullScreenOnEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  var enableExitFullScreenOnPause: js.UndefOr[js.Function0[Unit]] = js.native
  
  var enablePauseVideoOnFullScreenExit: js.UndefOr[js.Function0[Unit]] = js.native
  
  var enterFullScreen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var exitFullScreen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var isInFullScreen: js.UndefOr[Boolean] = js.native
}
object IFullScreenAPI {
  
  @scala.inline
  def apply(): IFullScreenAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFullScreenAPI]
  }
  
  @scala.inline
  implicit class IFullScreenAPIOps[Self <: IFullScreenAPI] (val x: Self) extends AnyVal {
    
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
    def setDisableEnterFullScreenOnPlay(value: () => Unit): Self = this.set("disableEnterFullScreenOnPlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDisableEnterFullScreenOnPlay: Self = this.set("disableEnterFullScreenOnPlay", js.undefined)
    
    @scala.inline
    def setDisableExitFullScreenOnEnd(value: () => Unit): Self = this.set("disableExitFullScreenOnEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDisableExitFullScreenOnEnd: Self = this.set("disableExitFullScreenOnEnd", js.undefined)
    
    @scala.inline
    def setDisableExitFullScreenOnPause(value: () => Unit): Self = this.set("disableExitFullScreenOnPause", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDisableExitFullScreenOnPause: Self = this.set("disableExitFullScreenOnPause", js.undefined)
    
    @scala.inline
    def setDisablePauseVideoOnFullScreenExit(value: () => Unit): Self = this.set("disablePauseVideoOnFullScreenExit", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDisablePauseVideoOnFullScreenExit: Self = this.set("disablePauseVideoOnFullScreenExit", js.undefined)
    
    @scala.inline
    def setEnableEnterFullScreenOnPlay(value: () => Unit): Self = this.set("enableEnterFullScreenOnPlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEnableEnterFullScreenOnPlay: Self = this.set("enableEnterFullScreenOnPlay", js.undefined)
    
    @scala.inline
    def setEnableExitFullScreenOnEnd(value: () => Unit): Self = this.set("enableExitFullScreenOnEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEnableExitFullScreenOnEnd: Self = this.set("enableExitFullScreenOnEnd", js.undefined)
    
    @scala.inline
    def setEnableExitFullScreenOnPause(value: () => Unit): Self = this.set("enableExitFullScreenOnPause", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEnableExitFullScreenOnPause: Self = this.set("enableExitFullScreenOnPause", js.undefined)
    
    @scala.inline
    def setEnablePauseVideoOnFullScreenExit(value: () => Unit): Self = this.set("enablePauseVideoOnFullScreenExit", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEnablePauseVideoOnFullScreenExit: Self = this.set("enablePauseVideoOnFullScreenExit", js.undefined)
    
    @scala.inline
    def setEnterFullScreen(value: () => Unit): Self = this.set("enterFullScreen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEnterFullScreen: Self = this.set("enterFullScreen", js.undefined)
    
    @scala.inline
    def setExitFullScreen(value: () => Unit): Self = this.set("exitFullScreen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteExitFullScreen: Self = this.set("exitFullScreen", js.undefined)
    
    @scala.inline
    def setIsInFullScreen(value: Boolean): Self = this.set("isInFullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInFullScreen: Self = this.set("isInFullScreen", js.undefined)
  }
}
