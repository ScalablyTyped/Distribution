package typings.playable.fullScreenManagerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFullScreenConfig extends js.Object {
  
  var enterFullScreenOnPlay: js.UndefOr[Boolean] = js.native
  
  var exitFullScreenOnEnd: js.UndefOr[Boolean] = js.native
  
  var exitFullScreenOnPause: js.UndefOr[Boolean] = js.native
  
  var pauseVideoOnFullScreenExit: js.UndefOr[Boolean] = js.native
}
object IFullScreenConfig {
  
  @scala.inline
  def apply(): IFullScreenConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFullScreenConfig]
  }
  
  @scala.inline
  implicit class IFullScreenConfigOps[Self <: IFullScreenConfig] (val x: Self) extends AnyVal {
    
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
    def setEnterFullScreenOnPlay(value: Boolean): Self = this.set("enterFullScreenOnPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterFullScreenOnPlay: Self = this.set("enterFullScreenOnPlay", js.undefined)
    
    @scala.inline
    def setExitFullScreenOnEnd(value: Boolean): Self = this.set("exitFullScreenOnEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitFullScreenOnEnd: Self = this.set("exitFullScreenOnEnd", js.undefined)
    
    @scala.inline
    def setExitFullScreenOnPause(value: Boolean): Self = this.set("exitFullScreenOnPause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitFullScreenOnPause: Self = this.set("exitFullScreenOnPause", js.undefined)
    
    @scala.inline
    def setPauseVideoOnFullScreenExit(value: Boolean): Self = this.set("pauseVideoOnFullScreenExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePauseVideoOnFullScreenExit: Self = this.set("pauseVideoOnFullScreenExit", js.undefined)
  }
}
