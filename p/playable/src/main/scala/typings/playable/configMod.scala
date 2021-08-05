package typings.playable

import typings.playable.playbackEngineTypesMod.CrossOriginValue
import typings.playable.playbackEngineTypesMod.IPlayableSource
import typings.playable.playbackEngineTypesMod.PlayableMediaSource
import typings.playable.playbackEngineTypesMod.PreloadType
import typings.playable.textMapTypesMod.ITextMapConfig
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("playable/dist/src/core/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: IPlayerConfig): IPlayerConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[IPlayerConfig]
  
  trait IPlayerConfig extends StObject {
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var crossOrigin: js.UndefOr[CrossOriginValue] = js.undefined
    
    var disableControlWithClickOnPlayer: js.UndefOr[Boolean] = js.undefined
    
    var disableControlWithKeyboard: js.UndefOr[Boolean] = js.undefined
    
    var disableFullScreen: js.UndefOr[Boolean] = js.undefined
    
    var fillAllSpace: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var hideMainUI: js.UndefOr[Boolean] = js.undefined
    
    var hideOverlay: js.UndefOr[Boolean] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var muted: js.UndefOr[Boolean] = js.undefined
    
    var nativeBrowserControls: js.UndefOr[Boolean] = js.undefined
    
    var playsinline: js.UndefOr[Boolean] = js.undefined
    
    var poster: js.UndefOr[String] = js.undefined
    
    var preload: js.UndefOr[PreloadType] = js.undefined
    
    var preventContextMenu: js.UndefOr[Boolean] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var src: js.UndefOr[PlayableMediaSource] = js.undefined
    
    var texts: js.UndefOr[ITextMapConfig] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var videoElement: js.UndefOr[HTMLVideoElement] = js.undefined
    
    var volume: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object IPlayerConfig {
    
    inline def apply(): IPlayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPlayerConfig]
    }
    
    extension [Self <: IPlayerConfig](x: Self) {
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setCrossOrigin(value: CrossOriginValue): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDisableControlWithClickOnPlayer(value: Boolean): Self = StObject.set(x, "disableControlWithClickOnPlayer", value.asInstanceOf[js.Any])
      
      inline def setDisableControlWithClickOnPlayerUndefined: Self = StObject.set(x, "disableControlWithClickOnPlayer", js.undefined)
      
      inline def setDisableControlWithKeyboard(value: Boolean): Self = StObject.set(x, "disableControlWithKeyboard", value.asInstanceOf[js.Any])
      
      inline def setDisableControlWithKeyboardUndefined: Self = StObject.set(x, "disableControlWithKeyboard", js.undefined)
      
      inline def setDisableFullScreen(value: Boolean): Self = StObject.set(x, "disableFullScreen", value.asInstanceOf[js.Any])
      
      inline def setDisableFullScreenUndefined: Self = StObject.set(x, "disableFullScreen", js.undefined)
      
      inline def setFillAllSpace(value: Boolean): Self = StObject.set(x, "fillAllSpace", value.asInstanceOf[js.Any])
      
      inline def setFillAllSpaceUndefined: Self = StObject.set(x, "fillAllSpace", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHideMainUI(value: Boolean): Self = StObject.set(x, "hideMainUI", value.asInstanceOf[js.Any])
      
      inline def setHideMainUIUndefined: Self = StObject.set(x, "hideMainUI", js.undefined)
      
      inline def setHideOverlay(value: Boolean): Self = StObject.set(x, "hideOverlay", value.asInstanceOf[js.Any])
      
      inline def setHideOverlayUndefined: Self = StObject.set(x, "hideOverlay", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setNativeBrowserControls(value: Boolean): Self = StObject.set(x, "nativeBrowserControls", value.asInstanceOf[js.Any])
      
      inline def setNativeBrowserControlsUndefined: Self = StObject.set(x, "nativeBrowserControls", js.undefined)
      
      inline def setPlaysinline(value: Boolean): Self = StObject.set(x, "playsinline", value.asInstanceOf[js.Any])
      
      inline def setPlaysinlineUndefined: Self = StObject.set(x, "playsinline", js.undefined)
      
      inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
      
      inline def setPreload(value: PreloadType): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setPreventContextMenu(value: Boolean): Self = StObject.set(x, "preventContextMenu", value.asInstanceOf[js.Any])
      
      inline def setPreventContextMenuUndefined: Self = StObject.set(x, "preventContextMenu", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setSrc(value: PlayableMediaSource): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setSrcVarargs(value: (String | IPlayableSource)*): Self = StObject.set(x, "src", js.Array(value :_*))
      
      inline def setTexts(value: ITextMapConfig): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
      
      inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVideoElement(value: HTMLVideoElement): Self = StObject.set(x, "videoElement", value.asInstanceOf[js.Any])
      
      inline def setVideoElementUndefined: Self = StObject.set(x, "videoElement", js.undefined)
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
