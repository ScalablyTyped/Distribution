package typings.playable

import typings.playable.bottomBlockTypesMod.IBottomBlockAPI
import typings.playable.configMod.IPlayerConfig
import typings.playable.createContainerMod.Container
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
import typings.playable.themeTypesMod.IThemeConfig
import typings.playable.titleTypesMod.ITitleAPI
import typings.playable.topBlockTypesMod.ITopBlockAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playerFactoryMod {
  
  @JSImport("playable/dist/src/core/player-factory", "clearAdditionalModules")
  @js.native
  def clearAdditionalModules(): Unit = js.native
  
  @JSImport("playable/dist/src/core/player-factory", "clearPlaybackAdapters")
  @js.native
  def clearPlaybackAdapters(): Unit = js.native
  
  @JSImport("playable/dist/src/core/player-factory", "container")
  @js.native
  val container: Container = js.native
  
  @JSImport("playable/dist/src/core/player-factory", "create")
  @js.native
  def create(): IPlayerInstance = js.native
  @JSImport("playable/dist/src/core/player-factory", "create")
  @js.native
  def create(params: js.UndefOr[scala.Nothing], themeConfig: IThemeConfig): IPlayerInstance = js.native
  @JSImport("playable/dist/src/core/player-factory", "create")
  @js.native
  def create(params: IPlayerConfig): IPlayerInstance = js.native
  @JSImport("playable/dist/src/core/player-factory", "create")
  @js.native
  def create(params: IPlayerConfig, themeConfig: IThemeConfig): IPlayerInstance = js.native
  
  @JSImport("playable/dist/src/core/player-factory", "registerModule")
  @js.native
  def registerModule(id: String, module: js.Any): Unit = js.native
  
  @JSImport("playable/dist/src/core/player-factory", "registerPlaybackAdapter")
  @js.native
  def registerPlaybackAdapter(adapter: js.Any): Unit = js.native
  
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
    implicit class IPlayerInstanceMutableBuilder[Self <: IPlayerInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    }
  }
}
