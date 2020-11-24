package typings.playable.pictureInPictureTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPictureInPicture extends js.Object {
  
  def destroy(): Unit = js.native
  
  def disablePictureInPicture(): Unit = js.native
  
  def enablePictureInPicture(): Unit = js.native
  
  def enterPictureInPicture(): Unit = js.native
  
  def exitPictureInPicture(): Unit = js.native
  
  var isEnabled: Boolean = js.native
  
  var isInPictureInPicture: Boolean = js.native
}
object IPictureInPicture {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    disablePictureInPicture: () => Unit,
    enablePictureInPicture: () => Unit,
    enterPictureInPicture: () => Unit,
    exitPictureInPicture: () => Unit,
    isEnabled: Boolean,
    isInPictureInPicture: Boolean
  ): IPictureInPicture = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disablePictureInPicture = js.Any.fromFunction0(disablePictureInPicture), enablePictureInPicture = js.Any.fromFunction0(enablePictureInPicture), enterPictureInPicture = js.Any.fromFunction0(enterPictureInPicture), exitPictureInPicture = js.Any.fromFunction0(exitPictureInPicture), isEnabled = isEnabled.asInstanceOf[js.Any], isInPictureInPicture = isInPictureInPicture.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPictureInPicture]
  }
  
  @scala.inline
  implicit class IPictureInPictureOps[Self <: IPictureInPicture] (val x: Self) extends AnyVal {
    
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
    def setDisablePictureInPicture(value: () => Unit): Self = this.set("disablePictureInPicture", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnablePictureInPicture(value: () => Unit): Self = this.set("enablePictureInPicture", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnterPictureInPicture(value: () => Unit): Self = this.set("enterPictureInPicture", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExitPictureInPicture(value: () => Unit): Self = this.set("exitPictureInPicture", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInPictureInPicture(value: Boolean): Self = this.set("isInPictureInPicture", value.asInstanceOf[js.Any])
  }
}
