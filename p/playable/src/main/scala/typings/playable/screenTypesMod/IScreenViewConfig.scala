package typings.playable.screenTypesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScreenViewConfig extends js.Object {
  
  var callbacks: IScreenViewCallbacks = js.native
  
  var nativeControls: Boolean = js.native
  
  var playbackViewElement: HTMLElement = js.native
}
object IScreenViewConfig {
  
  @scala.inline
  def apply(callbacks: IScreenViewCallbacks, nativeControls: Boolean, playbackViewElement: HTMLElement): IScreenViewConfig = {
    val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], nativeControls = nativeControls.asInstanceOf[js.Any], playbackViewElement = playbackViewElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScreenViewConfig]
  }
  
  @scala.inline
  implicit class IScreenViewConfigOps[Self <: IScreenViewConfig] (val x: Self) extends AnyVal {
    
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
    def setCallbacks(value: IScreenViewCallbacks): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeControls(value: Boolean): Self = this.set("nativeControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackViewElement(value: HTMLElement): Self = this.set("playbackViewElement", value.asInstanceOf[js.Any])
  }
}
