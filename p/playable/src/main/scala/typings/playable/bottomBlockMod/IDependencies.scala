package typings.playable.bottomBlockMod

import typings.playable.controlsChromecastTypesMod.IChromecastButton
import typings.playable.controlsPictureInPictureTypesMod.IPictureInPictureControl
import typings.playable.downloadTypesMod.IDownloadButton
import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.fullScreenTypesMod.IFullScreenControl
import typings.playable.logoTypesMod.ILogoControl
import typings.playable.playTypesMod.IPlayControl
import typings.playable.progressTypesMod.IProgressControl
import typings.playable.timeTypesMod.ITimeControl
import typings.playable.volumeTypesMod.IVolumeControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDependencies extends js.Object {
  
  var chromecastButton: IChromecastButton = js.native
  
  var downloadButton: IDownloadButton = js.native
  
  var eventEmitter: IEventEmitter = js.native
  
  var fullScreenControl: IFullScreenControl = js.native
  
  var logo: ILogoControl = js.native
  
  var pictureInPictureControl: IPictureInPictureControl = js.native
  
  var playControl: IPlayControl = js.native
  
  var progressControl: IProgressControl = js.native
  
  var timeControl: ITimeControl = js.native
  
  var volumeControl: IVolumeControl = js.native
}
object IDependencies {
  
  @scala.inline
  def apply(
    chromecastButton: IChromecastButton,
    downloadButton: IDownloadButton,
    eventEmitter: IEventEmitter,
    fullScreenControl: IFullScreenControl,
    logo: ILogoControl,
    pictureInPictureControl: IPictureInPictureControl,
    playControl: IPlayControl,
    progressControl: IProgressControl,
    timeControl: ITimeControl,
    volumeControl: IVolumeControl
  ): IDependencies = {
    val __obj = js.Dynamic.literal(chromecastButton = chromecastButton.asInstanceOf[js.Any], downloadButton = downloadButton.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], fullScreenControl = fullScreenControl.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], pictureInPictureControl = pictureInPictureControl.asInstanceOf[js.Any], playControl = playControl.asInstanceOf[js.Any], progressControl = progressControl.asInstanceOf[js.Any], timeControl = timeControl.asInstanceOf[js.Any], volumeControl = volumeControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDependencies]
  }
  
  @scala.inline
  implicit class IDependenciesOps[Self <: IDependencies] (val x: Self) extends AnyVal {
    
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
    def setChromecastButton(value: IChromecastButton): Self = this.set("chromecastButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadButton(value: IDownloadButton): Self = this.set("downloadButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventEmitter(value: IEventEmitter): Self = this.set("eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreenControl(value: IFullScreenControl): Self = this.set("fullScreenControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogo(value: ILogoControl): Self = this.set("logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureInPictureControl(value: IPictureInPictureControl): Self = this.set("pictureInPictureControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayControl(value: IPlayControl): Self = this.set("playControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressControl(value: IProgressControl): Self = this.set("progressControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeControl(value: ITimeControl): Self = this.set("timeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeControl(value: IVolumeControl): Self = this.set("volumeControl", value.asInstanceOf[js.Any])
  }
}
