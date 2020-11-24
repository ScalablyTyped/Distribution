package typings.playable.storiesTypesMod

import typings.playable.mediaStreamMod.MediaStreamType
import typings.playable.playbackEngineTypesMod.CrossOriginValue
import typings.playable.playbackEngineTypesMod.IPlayableSource
import typings.playable.playbackEngineTypesMod.PlayableMediaSource
import typings.playable.playbackEngineTypesMod.PreloadType
import typings.playable.textMapTypesMod.ITextMapConfig
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined playable.playable/dist/src/core/config.IPlayerConfig & std.Partial<{  videoType :playable.playable.MEDIA_STREAM_TYPES,   color :string,   progressBarMode :string}> */
@js.native
trait StoryProps extends js.Object {
  
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
  implicit class StoryPropsOps[Self <: StoryProps] (val x: Self) extends AnyVal {
    
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
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: CrossOriginValue): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    
    @scala.inline
    def setDisableControlWithClickOnPlayer(value: Boolean): Self = this.set("disableControlWithClickOnPlayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableControlWithClickOnPlayer: Self = this.set("disableControlWithClickOnPlayer", js.undefined)
    
    @scala.inline
    def setDisableControlWithKeyboard(value: Boolean): Self = this.set("disableControlWithKeyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableControlWithKeyboard: Self = this.set("disableControlWithKeyboard", js.undefined)
    
    @scala.inline
    def setDisableFullScreen(value: Boolean): Self = this.set("disableFullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableFullScreen: Self = this.set("disableFullScreen", js.undefined)
    
    @scala.inline
    def setFillAllSpace(value: Boolean): Self = this.set("fillAllSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillAllSpace: Self = this.set("fillAllSpace", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHideMainUI(value: Boolean): Self = this.set("hideMainUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideMainUI: Self = this.set("hideMainUI", js.undefined)
    
    @scala.inline
    def setHideOverlay(value: Boolean): Self = this.set("hideOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOverlay: Self = this.set("hideOverlay", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    
    @scala.inline
    def setNativeBrowserControls(value: Boolean): Self = this.set("nativeBrowserControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeBrowserControls: Self = this.set("nativeBrowserControls", js.undefined)
    
    @scala.inline
    def setPlaysinline(value: Boolean): Self = this.set("playsinline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaysinline: Self = this.set("playsinline", js.undefined)
    
    @scala.inline
    def setPoster(value: String): Self = this.set("poster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoster: Self = this.set("poster", js.undefined)
    
    @scala.inline
    def setPreload(value: PreloadType): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    
    @scala.inline
    def setPreventContextMenu(value: Boolean): Self = this.set("preventContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventContextMenu: Self = this.set("preventContextMenu", js.undefined)
    
    @scala.inline
    def setProgressBarMode(value: String): Self = this.set("progressBarMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressBarMode: Self = this.set("progressBarMode", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    
    @scala.inline
    def setSrcVarargs(value: (String | IPlayableSource)*): Self = this.set("src", js.Array(value :_*))
    
    @scala.inline
    def setSrc(value: PlayableMediaSource): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    
    @scala.inline
    def setTexts(value: ITextMapConfig): Self = this.set("texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTexts: Self = this.set("texts", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setVideoElement(value: HTMLVideoElement): Self = this.set("videoElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoElement: Self = this.set("videoElement", js.undefined)
    
    @scala.inline
    def setVideoType(value: MediaStreamType): Self = this.set("videoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoType: Self = this.set("videoType", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
