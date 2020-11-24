package typings.playable.bottomBlockTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBottomBlockViewStyles extends js.Object {
  
  var activated: String = js.native
  
  var additionalButton: String = js.native
  
  var bottomBlock: String = js.native
  
  var controlsContainerLeft: String = js.native
  
  var controlsContainerRight: String = js.native
  
  var downloadButtonHidden: String = js.native
  
  var elementsContainer: String = js.native
  
  var fullScreenContainer: String = js.native
  
  var fullScreenControlHidden: String = js.native
  
  var hidden: String = js.native
  
  var logoContainer: String = js.native
  
  var logoHidden: String = js.native
  
  var pictureInPictureButtonHidden: String = js.native
  
  var playContainer: String = js.native
  
  var playControlHidden: String = js.native
  
  var progressBarContainer: String = js.native
  
  var progressControlHidden: String = js.native
  
  var showLogoAlways: String = js.native
  
  var timeContainer: String = js.native
  
  var timeControlHidden: String = js.native
  
  var volumeContainer: String = js.native
  
  var volumeControlHidden: String = js.native
}
object IBottomBlockViewStyles {
  
  @scala.inline
  def apply(
    activated: String,
    additionalButton: String,
    bottomBlock: String,
    controlsContainerLeft: String,
    controlsContainerRight: String,
    downloadButtonHidden: String,
    elementsContainer: String,
    fullScreenContainer: String,
    fullScreenControlHidden: String,
    hidden: String,
    logoContainer: String,
    logoHidden: String,
    pictureInPictureButtonHidden: String,
    playContainer: String,
    playControlHidden: String,
    progressBarContainer: String,
    progressControlHidden: String,
    showLogoAlways: String,
    timeContainer: String,
    timeControlHidden: String,
    volumeContainer: String,
    volumeControlHidden: String
  ): IBottomBlockViewStyles = {
    val __obj = js.Dynamic.literal(activated = activated.asInstanceOf[js.Any], additionalButton = additionalButton.asInstanceOf[js.Any], bottomBlock = bottomBlock.asInstanceOf[js.Any], controlsContainerLeft = controlsContainerLeft.asInstanceOf[js.Any], controlsContainerRight = controlsContainerRight.asInstanceOf[js.Any], downloadButtonHidden = downloadButtonHidden.asInstanceOf[js.Any], elementsContainer = elementsContainer.asInstanceOf[js.Any], fullScreenContainer = fullScreenContainer.asInstanceOf[js.Any], fullScreenControlHidden = fullScreenControlHidden.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], logoContainer = logoContainer.asInstanceOf[js.Any], logoHidden = logoHidden.asInstanceOf[js.Any], pictureInPictureButtonHidden = pictureInPictureButtonHidden.asInstanceOf[js.Any], playContainer = playContainer.asInstanceOf[js.Any], playControlHidden = playControlHidden.asInstanceOf[js.Any], progressBarContainer = progressBarContainer.asInstanceOf[js.Any], progressControlHidden = progressControlHidden.asInstanceOf[js.Any], showLogoAlways = showLogoAlways.asInstanceOf[js.Any], timeContainer = timeContainer.asInstanceOf[js.Any], timeControlHidden = timeControlHidden.asInstanceOf[js.Any], volumeContainer = volumeContainer.asInstanceOf[js.Any], volumeControlHidden = volumeControlHidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBottomBlockViewStyles]
  }
  
  @scala.inline
  implicit class IBottomBlockViewStylesOps[Self <: IBottomBlockViewStyles] (val x: Self) extends AnyVal {
    
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
    def setActivated(value: String): Self = this.set("activated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalButton(value: String): Self = this.set("additionalButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomBlock(value: String): Self = this.set("bottomBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsContainerLeft(value: String): Self = this.set("controlsContainerLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsContainerRight(value: String): Self = this.set("controlsContainerRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadButtonHidden(value: String): Self = this.set("downloadButtonHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsContainer(value: String): Self = this.set("elementsContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreenContainer(value: String): Self = this.set("fullScreenContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreenControlHidden(value: String): Self = this.set("fullScreenControlHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoContainer(value: String): Self = this.set("logoContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoHidden(value: String): Self = this.set("logoHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureInPictureButtonHidden(value: String): Self = this.set("pictureInPictureButtonHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayContainer(value: String): Self = this.set("playContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayControlHidden(value: String): Self = this.set("playControlHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressBarContainer(value: String): Self = this.set("progressBarContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressControlHidden(value: String): Self = this.set("progressControlHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLogoAlways(value: String): Self = this.set("showLogoAlways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeContainer(value: String): Self = this.set("timeContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeControlHidden(value: String): Self = this.set("timeControlHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeContainer(value: String): Self = this.set("volumeContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeControlHidden(value: String): Self = this.set("volumeControlHidden", value.asInstanceOf[js.Any])
  }
}
