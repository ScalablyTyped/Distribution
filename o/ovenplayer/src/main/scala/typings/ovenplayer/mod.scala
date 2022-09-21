package typings.ovenplayer

import org.scalablytyped.runtime.Shortcut
import typings.ovenplayer.ovenplayerStrings.dash
import typings.ovenplayer.ovenplayerStrings.googleima
import typings.ovenplayer.ovenplayerStrings.hls
import typings.ovenplayer.ovenplayerStrings.lldash
import typings.ovenplayer.ovenplayerStrings.llhls
import typings.ovenplayer.ovenplayerStrings.mp4
import typings.ovenplayer.ovenplayerStrings.vast
import typings.ovenplayer.ovenplayerStrings.webrtc
import typings.std.HTMLDivElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("ovenplayer", JSImport.Namespace)
  @js.native
  val ^ : OvenPlayer = js.native
  
  @js.native
  trait OvenPlayer extends StObject {
    
    def create(container: String, config: OvenPlayerConfig): OvenPlayerInstance = js.native
    def create(container: HTMLDivElement, config: OvenPlayerConfig): OvenPlayerInstance = js.native
    
    def debug(debug: Boolean): Boolean = js.native
    
    def generateWebrtcUrls(sources: js.Array[OvenPlayerWebRTCStream]): js.Array[OvenPlayerSource] = js.native
    def generateWebrtcUrls(sources: OvenPlayerWebRTCStream): js.Array[OvenPlayerSource] = js.native
    
    def getPlayerByContainerId(containerId: String): OvenPlayerInstance | Null = js.native
    
    def getPlayerByIndex(index: Double): OvenPlayerInstance | Null = js.native
    
    def getPlayerList(): js.Array[OvenPlayerInstance] = js.native
    
    def removePlayer(player: OvenPlayerInstance): Unit = js.native
  }
  
  @js.native
  trait OvenPlayerCallbackFunction extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  trait OvenPlayerConfig extends StObject {
    
    var adClient: js.UndefOr[googleima | vast] = js.undefined
    
    var adTagUrl: js.UndefOr[String] = js.undefined
    
    var aspectRatio: js.UndefOr[String] = js.undefined
    
    var autoFallback: js.UndefOr[Boolean] = js.undefined
    
    var autoStart: js.UndefOr[Boolean] = js.undefined
    
    var controls: js.UndefOr[Boolean] = js.undefined
    
    var currentProtocolOnly: js.UndefOr[Boolean] = js.undefined
    
    var dashConfig: js.UndefOr[Any] = js.undefined
    
    var disableSeekUI: js.UndefOr[Boolean] = js.undefined
    
    var expandFullScreenUI: js.UndefOr[Boolean] = js.undefined
    
    var hidePlaylistIcon: js.UndefOr[Boolean] = js.undefined
    
    var hlsConfig: js.UndefOr[Any] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var mute: js.UndefOr[Boolean] = js.undefined
    
    var playbackRate: js.UndefOr[Double] = js.undefined
    
    var playbackRates: js.UndefOr[js.Array[Double]] = js.undefined
    
    var playlist: js.UndefOr[OvenPlayerPlayList] = js.undefined
    
    var seekControlInterval: js.UndefOr[Double] = js.undefined
    
    var showBigPlayButton: js.UndefOr[Boolean] = js.undefined
    
    var showSeekControl: js.UndefOr[Boolean] = js.undefined
    
    var sources: js.UndefOr[js.Array[OvenPlayerSource] | OvenPlayerPlayList] = js.undefined
    
    var timecode: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var tracks: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var volume: js.UndefOr[Double] = js.undefined
    
    var waterMark: js.UndefOr[js.Object] = js.undefined
    
    var webrtcConfig: js.UndefOr[js.Object] = js.undefined
  }
  object OvenPlayerConfig {
    
    inline def apply(): OvenPlayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OvenPlayerConfig]
    }
    
    extension [Self <: OvenPlayerConfig](x: Self) {
      
      inline def setAdClient(value: googleima | vast): Self = StObject.set(x, "adClient", value.asInstanceOf[js.Any])
      
      inline def setAdClientUndefined: Self = StObject.set(x, "adClient", js.undefined)
      
      inline def setAdTagUrl(value: String): Self = StObject.set(x, "adTagUrl", value.asInstanceOf[js.Any])
      
      inline def setAdTagUrlUndefined: Self = StObject.set(x, "adTagUrl", js.undefined)
      
      inline def setAspectRatio(value: String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      inline def setAutoFallback(value: Boolean): Self = StObject.set(x, "autoFallback", value.asInstanceOf[js.Any])
      
      inline def setAutoFallbackUndefined: Self = StObject.set(x, "autoFallback", js.undefined)
      
      inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setCurrentProtocolOnly(value: Boolean): Self = StObject.set(x, "currentProtocolOnly", value.asInstanceOf[js.Any])
      
      inline def setCurrentProtocolOnlyUndefined: Self = StObject.set(x, "currentProtocolOnly", js.undefined)
      
      inline def setDashConfig(value: Any): Self = StObject.set(x, "dashConfig", value.asInstanceOf[js.Any])
      
      inline def setDashConfigUndefined: Self = StObject.set(x, "dashConfig", js.undefined)
      
      inline def setDisableSeekUI(value: Boolean): Self = StObject.set(x, "disableSeekUI", value.asInstanceOf[js.Any])
      
      inline def setDisableSeekUIUndefined: Self = StObject.set(x, "disableSeekUI", js.undefined)
      
      inline def setExpandFullScreenUI(value: Boolean): Self = StObject.set(x, "expandFullScreenUI", value.asInstanceOf[js.Any])
      
      inline def setExpandFullScreenUIUndefined: Self = StObject.set(x, "expandFullScreenUI", js.undefined)
      
      inline def setHidePlaylistIcon(value: Boolean): Self = StObject.set(x, "hidePlaylistIcon", value.asInstanceOf[js.Any])
      
      inline def setHidePlaylistIconUndefined: Self = StObject.set(x, "hidePlaylistIcon", js.undefined)
      
      inline def setHlsConfig(value: Any): Self = StObject.set(x, "hlsConfig", value.asInstanceOf[js.Any])
      
      inline def setHlsConfigUndefined: Self = StObject.set(x, "hlsConfig", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
      
      inline def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
      
      inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
      
      inline def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
      
      inline def setPlaybackRates(value: js.Array[Double]): Self = StObject.set(x, "playbackRates", value.asInstanceOf[js.Any])
      
      inline def setPlaybackRatesUndefined: Self = StObject.set(x, "playbackRates", js.undefined)
      
      inline def setPlaybackRatesVarargs(value: Double*): Self = StObject.set(x, "playbackRates", js.Array(value*))
      
      inline def setPlaylist(value: OvenPlayerPlayList): Self = StObject.set(x, "playlist", value.asInstanceOf[js.Any])
      
      inline def setPlaylistUndefined: Self = StObject.set(x, "playlist", js.undefined)
      
      inline def setPlaylistVarargs(value: js.Array[OvenPlayerSource]*): Self = StObject.set(x, "playlist", js.Array(value*))
      
      inline def setSeekControlInterval(value: Double): Self = StObject.set(x, "seekControlInterval", value.asInstanceOf[js.Any])
      
      inline def setSeekControlIntervalUndefined: Self = StObject.set(x, "seekControlInterval", js.undefined)
      
      inline def setShowBigPlayButton(value: Boolean): Self = StObject.set(x, "showBigPlayButton", value.asInstanceOf[js.Any])
      
      inline def setShowBigPlayButtonUndefined: Self = StObject.set(x, "showBigPlayButton", js.undefined)
      
      inline def setShowSeekControl(value: Boolean): Self = StObject.set(x, "showSeekControl", value.asInstanceOf[js.Any])
      
      inline def setShowSeekControlUndefined: Self = StObject.set(x, "showSeekControl", js.undefined)
      
      inline def setSources(value: js.Array[OvenPlayerSource] | OvenPlayerPlayList): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
      
      inline def setSourcesVarargs(value: (js.Array[OvenPlayerSource] | OvenPlayerSource)*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setTimecode(value: Boolean): Self = StObject.set(x, "timecode", value.asInstanceOf[js.Any])
      
      inline def setTimecodeUndefined: Self = StObject.set(x, "timecode", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTracks(value: js.Array[js.Object]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
      
      inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
      
      inline def setTracksVarargs(value: js.Object*): Self = StObject.set(x, "tracks", js.Array(value*))
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
      
      inline def setWaterMark(value: js.Object): Self = StObject.set(x, "waterMark", value.asInstanceOf[js.Any])
      
      inline def setWaterMarkUndefined: Self = StObject.set(x, "waterMark", js.undefined)
      
      inline def setWebrtcConfig(value: js.Object): Self = StObject.set(x, "webrtcConfig", value.asInstanceOf[js.Any])
      
      inline def setWebrtcConfigUndefined: Self = StObject.set(x, "webrtcConfig", js.undefined)
    }
  }
  
  @js.native
  trait OvenPlayerInstance extends StObject {
    
    def addCaption(track: js.Object): Unit = js.native
    
    def getBrowser(): js.Object = js.native
    
    def getCaptionList(): js.Array[js.Object] = js.native
    
    def getConfig(): OvenPlayerConfig = js.native
    
    def getContainerElement(): HTMLDivElement = js.native
    
    def getContainerId(): String = js.native
    
    def getCurrentCaption(): Double = js.native
    
    def getCurrentPlaylist(): Double = js.native
    
    def getCurrentQuality(): Double = js.native
    
    def getCurrentSource(): Double = js.native
    
    def getDuration(): Double = js.native
    
    def getFramerate(): Double = js.native
    
    def getMediaElement(): HTMLVideoElement = js.native
    
    def getMseInstance(): js.Object | Null = js.native
    
    def getMute(): Boolean = js.native
    
    def getPlaybackRate(): Double = js.native
    
    def getPlaylist(): OvenPlayerPlayList = js.native
    
    def getPosition(): Double = js.native
    
    def getProviderName(): String | Null = js.native
    
    def getQualityLevels(): js.Array[js.Object] = js.native
    
    def getSources(): js.Array[OvenPlayerSource] | OvenPlayerPlayList = js.native
    
    def getState(): String = js.native
    
    def getVersion(): String = js.native
    
    def getVolume(): Double = js.native
    
    def isAutoQuality(): Boolean = js.native
    
    def isTimecodeMode(): Boolean = js.native
    
    def load(sources: js.Array[OvenPlayerSource] | OvenPlayerPlayList): Unit = js.native
    
    def off(eventName: String): Unit = js.native
    
    def on(eventName: String, callback: OvenPlayerCallbackFunction): Unit = js.native
    
    def once(eventName: String, callback: OvenPlayerCallbackFunction): Unit = js.native
    
    def pause(): Unit = js.native
    
    def play(): Unit = js.native
    
    def remove(): Unit = js.native
    
    def removeCaption(index: Double): Unit = js.native
    
    def seek(position: Double): Unit = js.native
    
    def seekFrame(frame: Double): Unit = js.native
    
    def setAutoQuality(auto: Boolean): Unit = js.native
    
    def setCaption(caption: js.Object): Unit = js.native
    
    def setCurrentCaption(index: Double): Unit = js.native
    
    def setCurrentPlaylist(index: Double): Unit = js.native
    
    def setCurrentQuality(index: Double): Unit = js.native
    
    def setCurrentSource(index: Double): Unit = js.native
    
    def setMute(mute: Boolean): Unit = js.native
    
    def setPlaybackRate(rate: Double): Unit = js.native
    
    def setTimecodeMode(mode: Boolean): Unit = js.native
    
    def setVolume(volume: Double): Unit = js.native
    
    def showControls(show: Boolean): Unit = js.native
    
    def stop(): Unit = js.native
    
    def toggleFullScreen(): Unit = js.native
  }
  
  type OvenPlayerPlayList = js.Array[js.Array[OvenPlayerSource]]
  
  trait OvenPlayerSource extends StObject {
    
    var file: String
    
    var framerate: js.UndefOr[Double] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var sectionEnd: js.UndefOr[Double] = js.undefined
    
    var sectionStart: js.UndefOr[Double] = js.undefined
    
    var `type`: webrtc | llhls | hls | lldash | dash | mp4
  }
  object OvenPlayerSource {
    
    inline def apply(file: String, `type`: webrtc | llhls | hls | lldash | dash | mp4): OvenPlayerSource = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OvenPlayerSource]
    }
    
    extension [Self <: OvenPlayerSource](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFramerate(value: Double): Self = StObject.set(x, "framerate", value.asInstanceOf[js.Any])
      
      inline def setFramerateUndefined: Self = StObject.set(x, "framerate", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setSectionEnd(value: Double): Self = StObject.set(x, "sectionEnd", value.asInstanceOf[js.Any])
      
      inline def setSectionEndUndefined: Self = StObject.set(x, "sectionEnd", js.undefined)
      
      inline def setSectionStart(value: Double): Self = StObject.set(x, "sectionStart", value.asInstanceOf[js.Any])
      
      inline def setSectionStartUndefined: Self = StObject.set(x, "sectionStart", js.undefined)
      
      inline def setType(value: webrtc | llhls | hls | lldash | dash | mp4): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait OvenPlayerWebRTCStream extends StObject {
    
    var application: String
    
    var host: String
    
    var label: js.UndefOr[String] = js.undefined
    
    var stream: String
  }
  object OvenPlayerWebRTCStream {
    
    inline def apply(application: String, host: String, stream: String): OvenPlayerWebRTCStream = {
      val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[OvenPlayerWebRTCStream]
    }
    
    extension [Self <: OvenPlayerWebRTCStream](x: Self) {
      
      inline def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setStream(value: String): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OvenPlayer
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: OvenPlayer = ^
}
