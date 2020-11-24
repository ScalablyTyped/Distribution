package typings.playable.pictureInPictureTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPictureInPictureHelper extends js.Object {
  
  def destroy(): Unit = js.native
  
  def exit(): Unit = js.native
  
  var isEnabled: Boolean = js.native
  
  var isInPictureInPicture: Boolean = js.native
  
  def request(): Unit = js.native
}
object IPictureInPictureHelper {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    exit: () => Unit,
    isEnabled: Boolean,
    isInPictureInPicture: Boolean,
    request: () => Unit
  ): IPictureInPictureHelper = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), exit = js.Any.fromFunction0(exit), isEnabled = isEnabled.asInstanceOf[js.Any], isInPictureInPicture = isInPictureInPicture.asInstanceOf[js.Any], request = js.Any.fromFunction0(request))
    __obj.asInstanceOf[IPictureInPictureHelper]
  }
  
  @scala.inline
  implicit class IPictureInPictureHelperOps[Self <: IPictureInPictureHelper] (val x: Self) extends AnyVal {
    
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
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInPictureInPicture(value: Boolean): Self = this.set("isInPictureInPicture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: () => Unit): Self = this.set("request", js.Any.fromFunction0(value))
  }
}
