package typings.playable.bottomBlockTypesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBottomBlockViewElements extends js.Object {
  
  var download: HTMLElement = js.native
  
  var fullScreen: HTMLElement = js.native
  
  var logo: HTMLElement = js.native
  
  var pictureInPicture: HTMLElement = js.native
  
  var play: HTMLElement = js.native
  
  var progress: HTMLElement = js.native
  
  var time: HTMLElement = js.native
  
  var volume: HTMLElement = js.native
}
object IBottomBlockViewElements {
  
  @scala.inline
  def apply(
    download: HTMLElement,
    fullScreen: HTMLElement,
    logo: HTMLElement,
    pictureInPicture: HTMLElement,
    play: HTMLElement,
    progress: HTMLElement,
    time: HTMLElement,
    volume: HTMLElement
  ): IBottomBlockViewElements = {
    val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], pictureInPicture = pictureInPicture.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBottomBlockViewElements]
  }
  
  @scala.inline
  implicit class IBottomBlockViewElementsOps[Self <: IBottomBlockViewElements] (val x: Self) extends AnyVal {
    
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
    def setDownload(value: HTMLElement): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreen(value: HTMLElement): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogo(value: HTMLElement): Self = this.set("logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureInPicture(value: HTMLElement): Self = this.set("pictureInPicture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlay(value: HTMLElement): Self = this.set("play", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: HTMLElement): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: HTMLElement): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: HTMLElement): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
}
