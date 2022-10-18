package typings.playable

import typings.playable.distSrcModulesEventEmitterTypesMod.IEventEmitterAPI
import typings.playable.distSrcModulesFullScreenManagerTypesMod.IFullScreenAPI
import typings.playable.distSrcModulesPictureInPictureTypesMod.IPictureInPictureAPI
import typings.playable.distSrcModulesPlaybackEngineTypesMod.IPlaybackEngineAPI
import typings.playable.distSrcModulesRootContainerTypesMod.IRootContainerAPI
import typings.playable.distSrcModulesUiBottomBlockTypesMod.IBottomBlockAPI
import typings.playable.distSrcModulesUiControlsDownloadTypesMod.IDownloadButtonAPI
import typings.playable.distSrcModulesUiControlsLogoTypesMod.ILogoAPI
import typings.playable.distSrcModulesUiControlsProgressTypesMod.IProgressControlAPI
import typings.playable.distSrcModulesUiCoreThemeTypesMod.IThemeAPI
import typings.playable.distSrcModulesUiMainUiBlockTypesMod.IMainUIBlockAPI
import typings.playable.distSrcModulesUiOverlayTypesMod.IOverlayAPI
import typings.playable.distSrcModulesUiPreviewServiceTypesMod.IPreviewAPI
import typings.playable.distSrcModulesUiScreenTypesMod.IScreenAPI
import typings.playable.distSrcModulesUiTitleTypesMod.ITitleAPI
import typings.playable.distSrcModulesUiTopBlockTypesMod.ITopBlockAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreDefaultModulesMod {
  
  trait IPlayer
    extends StObject
       with IRootContainerAPI
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
       with IPreviewAPI
  object IPlayer {
    
    inline def apply(): IPlayer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPlayer]
    }
  }
}
