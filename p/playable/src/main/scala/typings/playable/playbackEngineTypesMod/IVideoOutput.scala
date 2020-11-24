package typings.playable.playbackEngineTypesMod

import typings.playable.engineStateMod.EngineState
import typings.std.HTMLVideoElement
import typings.std.TimeRanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVideoOutput extends js.Object {
  
  var autoplay: Boolean = js.native
  
  var buffered: TimeRanges = js.native
  
  var crossOrigin: CrossOriginValue = js.native
  
  var currentState: EngineState = js.native
  
  var currentTime: Double = js.native
  
  var duration: Double = js.native
  
  def getDebugInfo(): IEngineDebugInfo = js.native
  
  def getElement(): HTMLVideoElement | Null = js.native
  
  var isAutoPlayActive: Boolean = js.native
  
  var isAutoplay: Boolean = js.native
  
  var isDynamicContent: Boolean = js.native
  
  var isDynamicContentEnded: js.Any = js.native
  
  var isEnded: Boolean = js.native
  
  var isInline: Boolean = js.native
  
  var isLoop: Boolean = js.native
  
  var isMetadataLoaded: Boolean = js.native
  
  var isMuted: Boolean = js.native
  
  var isPaused: Boolean = js.native
  
  var isPreloadActive: Boolean = js.native
  
  var isSeekAvailable: Boolean = js.native
  
  var isSyncWithLive: Boolean = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  var playbackRate: Double = js.native
  
  var preload: PreloadType = js.native
  
  def setAutoplay(isAutoplay: Boolean): Unit = js.native
  
  def setCrossOrigin(): Unit = js.native
  def setCrossOrigin(crossOrigin: CrossOriginValue): Unit = js.native
  
  def setCurrentTime(time: Double): Unit = js.native
  
  def setInline(isPlaysinline: Boolean): Unit = js.native
  
  def setLoop(mute: Boolean): Unit = js.native
  
  def setMute(mute: Boolean): Unit = js.native
  
  def setPlaybackRate(rate: Double): Unit = js.native
  
  def setPreload(preload: PreloadType): Unit = js.native
  
  def setSrc(): Unit = js.native
  def setSrc(src: js.UndefOr[PlayableMediaSource], callback: js.Function): Unit = js.native
  def setSrc(src: PlayableMediaSource): Unit = js.native
  
  def setVolume(volume: Double): Unit = js.native
  
  var src: PlayableMediaSource = js.native
  
  def syncWithLive(): Unit = js.native
  
  var videoHeight: js.UndefOr[Double] = js.native
  
  var videoWidth: js.UndefOr[Double] = js.native
  
  var volume: Double = js.native
}
