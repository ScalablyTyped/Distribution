package typings.playable

import org.scalablytyped.runtime.StringDictionary
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

@JSImport("playable/dist/src/core/default-modules", JSImport.Namespace)
@js.native
object defaultModulesMod extends js.Object {
  
  @js.native
  object default
    extends /* id */ StringDictionary[js.Any]
  
  @js.native
  object modules
    extends /* id */ StringDictionary[js.Any]
  
  type IPlayer = IRootContainerAPI with IEventEmitterAPI with IPlaybackEngineAPI with IThemeAPI with IFullScreenAPI with IPictureInPictureAPI with IScreenAPI with IOverlayAPI with IMainUIBlockAPI with ITopBlockAPI with ITitleAPI with IBottomBlockAPI with IProgressControlAPI with ILogoAPI with IDownloadButtonAPI with IPreviewAPI
}
