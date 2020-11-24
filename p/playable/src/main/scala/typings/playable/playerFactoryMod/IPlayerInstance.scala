package typings.playable.playerFactoryMod

import typings.playable.bottomBlockTypesMod.IBottomBlockAPI
import typings.playable.downloadTypesMod.IDownloadButtonAPI
import typings.playable.eventEmitterTypesMod.IEventEmitterAPI
import typings.playable.fullScreenManagerTypesMod.IFullScreenAPI
import typings.playable.logoTypesMod.ILogoAPI
import typings.playable.mainUiBlockTypesMod.IMainUIBlockAPI
import typings.playable.overlayTypesMod.IOverlayAPI
import typings.playable.pictureInPictureTypesMod.IPictureInPictureAPI
import typings.playable.playbackEngineTypesMod.IPlaybackEngineAPI
import typings.playable.previewServiceTypesMod.IPreviewAPI
import typings.playable.progressTypesMod.IProgressControlAPI
import typings.playable.rootContainerTypesMod.IRootContainerAPI
import typings.playable.screenTypesMod.IScreenAPI
import typings.playable.themeTypesMod.IThemeAPI
import typings.playable.titleTypesMod.ITitleAPI
import typings.playable.topBlockTypesMod.ITopBlockAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlayerInstance
  extends IRootContainerAPI
     with IEventEmitterAPI
     with IPlaybackEngineAPI
     with IThemeAPI
     with IFullScreenAPI
     with IPictureInPictureAPI
     with IScreenAPI
     with IOverlayAPI
     with IMainUIBlockAPI
     with ITopBlockAPI
     with ITitleAPI
     with IBottomBlockAPI
     with IProgressControlAPI
     with ILogoAPI
     with IDownloadButtonAPI
     with IPreviewAPI {
  
  def destroy(): Unit = js.native
}
object IPlayerInstance {
  
  @scala.inline
  def apply(destroy: () => Unit): IPlayerInstance = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[IPlayerInstance]
  }
  
  @scala.inline
  implicit class IPlayerInstanceOps[Self <: IPlayerInstance] (val x: Self) extends AnyVal {
    
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
  }
}
