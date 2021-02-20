package typings.playable

import typings.playable.mediaStreamMod.MediaStreamType
import typings.playable.playbackEngineTypesMod.CrossOriginValue
import typings.playable.playbackEngineTypesMod.IPlayableSource
import typings.playable.playbackEngineTypesMod.PlayableMediaSource
import typings.playable.playbackEngineTypesMod.PreloadType
import typings.playable.textMapTypesMod.ITextMapConfig
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storiesTypesMod {
  
  /* Inlined playable.playable/dist/src/core/config.IPlayerConfig & std.Partial<{  videoType :playable.playable.MEDIA_STREAM_TYPES,   color :string,   progressBarMode :string}> */
  @js.native
  trait StoryProps extends StObject {
    
    var autoplay: js.UndefOr[Boolean] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var crossOrigin: js.UndefOr[CrossOriginValue] = js.native
    
    var disableControlWithClickOnPlayer: js.UndefOr[Boolean] = js.native
    
    var disableControlWithKeyboard: js.UndefOr[Boolean] = js.native
    
    var disableFullScreen: js.UndefOr[Boolean] = js.native
    
    var fillAllSpace: js.UndefOr[Boolean] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var hideMainUI: js.UndefOr[Boolean] = js.native
    
    var hideOverlay: js.UndefOr[Boolean] = js.native
    
    var loop: js.UndefOr[Boolean] = js.native
    
    var muted: js.UndefOr[Boolean] = js.native
    
    var nativeBrowserControls: js.UndefOr[Boolean] = js.native
    
    var playsinline: js.UndefOr[Boolean] = js.native
    
    var poster: js.UndefOr[String] = js.native
    
    var preload: js.UndefOr[PreloadType] = js.native
    
    var preventContextMenu: js.UndefOr[Boolean] = js.native
    
    var progressBarMode: js.UndefOr[String] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    var src: js.UndefOr[PlayableMediaSource] = js.native
    
    var texts: js.UndefOr[ITextMapConfig] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var videoElement: js.UndefOr[HTMLVideoElement] = js.native
    
    var videoType: js.UndefOr[MediaStreamType] = js.native
    
    var volume: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object StoryProps {
    
    @scala.inline
    def apply(): StoryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoryProps]
    }
    
    @scala.inline
    implicit class StoryPropsMutableBuilder[Self <: StoryProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCrossOrigin(value: CrossOriginValue): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setDisableControlWithClickOnPlayer(value: Boolean): Self = StObject.set(x, "disableControlWithClickOnPlayer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableControlWithClickOnPlayerUndefined: Self = StObject.set(x, "disableControlWithClickOnPlayer", js.undefined)
      
      @scala.inline
      def setDisableControlWithKeyboard(value: Boolean): Self = StObject.set(x, "disableControlWithKeyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableControlWithKeyboardUndefined: Self = StObject.set(x, "disableControlWithKeyboard", js.undefined)
      
      @scala.inline
      def setDisableFullScreen(value: Boolean): Self = StObject.set(x, "disableFullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFullScreenUndefined: Self = StObject.set(x, "disableFullScreen", js.undefined)
      
      @scala.inline
      def setFillAllSpace(value: Boolean): Self = StObject.set(x, "fillAllSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillAllSpaceUndefined: Self = StObject.set(x, "fillAllSpace", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHideMainUI(value: Boolean): Self = StObject.set(x, "hideMainUI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideMainUIUndefined: Self = StObject.set(x, "hideMainUI", js.undefined)
      
      @scala.inline
      def setHideOverlay(value: Boolean): Self = StObject.set(x, "hideOverlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOverlayUndefined: Self = StObject.set(x, "hideOverlay", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      @scala.inline
      def setNativeBrowserControls(value: Boolean): Self = StObject.set(x, "nativeBrowserControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeBrowserControlsUndefined: Self = StObject.set(x, "nativeBrowserControls", js.undefined)
      
      @scala.inline
      def setPlaysinline(value: Boolean): Self = StObject.set(x, "playsinline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaysinlineUndefined: Self = StObject.set(x, "playsinline", js.undefined)
      
      @scala.inline
      def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
      
      @scala.inline
      def setPreload(value: PreloadType): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      @scala.inline
      def setPreventContextMenu(value: Boolean): Self = StObject.set(x, "preventContextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventContextMenuUndefined: Self = StObject.set(x, "preventContextMenu", js.undefined)
      
      @scala.inline
      def setProgressBarMode(value: String): Self = StObject.set(x, "progressBarMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressBarModeUndefined: Self = StObject.set(x, "progressBarMode", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setSrc(value: PlayableMediaSource): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setSrcVarargs(value: (String | IPlayableSource)*): Self = StObject.set(x, "src", js.Array(value :_*))
      
      @scala.inline
      def setTexts(value: ITextMapConfig): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setVideoElement(value: HTMLVideoElement): Self = StObject.set(x, "videoElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoElementUndefined: Self = StObject.set(x, "videoElement", js.undefined)
      
      @scala.inline
      def setVideoType(value: MediaStreamType): Self = StObject.set(x, "videoType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoTypeUndefined: Self = StObject.set(x, "videoType", js.undefined)
      
      @scala.inline
      def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
