package typings.playable.pictureInPictureTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPictureInPictureAPI extends js.Object {
  
  var disablePictureInPicture: js.UndefOr[js.Function0[Unit]] = js.native
  
  var enablePictureInPicture: js.UndefOr[js.Function0[Unit]] = js.native
  
  var enterPictureInPicture: js.UndefOr[js.Function0[Unit]] = js.native
  
  var exitPictureInPicture: js.UndefOr[js.Function0[Unit]] = js.native
  
  var isInPictureInPicture: js.UndefOr[Boolean] = js.native
}
object IPictureInPictureAPI {
  
  @scala.inline
  def apply(): IPictureInPictureAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPictureInPictureAPI]
  }
  
  @scala.inline
  implicit class IPictureInPictureAPIOps[Self <: IPictureInPictureAPI] (val x: Self) extends AnyVal {
    
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
    def setDisablePictureInPicture(value: () => Unit): Self = this.set("disablePictureInPicture", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDisablePictureInPicture: Self = this.set("disablePictureInPicture", js.undefined)
    
    @scala.inline
    def setEnablePictureInPicture(value: () => Unit): Self = this.set("enablePictureInPicture", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEnablePictureInPicture: Self = this.set("enablePictureInPicture", js.undefined)
    
    @scala.inline
    def setEnterPictureInPicture(value: () => Unit): Self = this.set("enterPictureInPicture", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEnterPictureInPicture: Self = this.set("enterPictureInPicture", js.undefined)
    
    @scala.inline
    def setExitPictureInPicture(value: () => Unit): Self = this.set("exitPictureInPicture", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteExitPictureInPicture: Self = this.set("exitPictureInPicture", js.undefined)
    
    @scala.inline
    def setIsInPictureInPicture(value: Boolean): Self = this.set("isInPictureInPicture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInPictureInPicture: Self = this.set("isInPictureInPicture", js.undefined)
  }
}
