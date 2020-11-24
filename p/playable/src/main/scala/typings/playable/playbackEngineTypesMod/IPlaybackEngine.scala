package typings.playable.playbackEngineTypesMod

import typings.playable.engineStateMod.EngineState
import typings.std.HTMLVideoElement
import typings.std.TimeRanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlaybackEngine extends js.Object {
  
  def changeOutput(chromecastOutput: IVideoOutput): Unit = js.native
  def changeOutput(chromecastOutput: IVideoOutput, callback: js.Function): Unit = js.native
  
  def decreaseVolume(value: Double): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def getAutoplay(): Boolean = js.native
  
  def getBuffered(): TimeRanges = js.native
  
  def getCrossOrigin(): CrossOriginValue = js.native
  
  def getCurrentState(): EngineState = js.native
  
  def getCurrentTime(): Double = js.native
  
  def getDebugInfo(): IEngineDebugInfo = js.native
  
  def getDuration(): Double = js.native
  
  def getElement(): HTMLVideoElement | Null = js.native
  
  def getLoop(): Boolean = js.native
  
  def getPlaybackRate(): Double = js.native
  
  def getPlaysinline(): Boolean = js.native
  
  def getPreload(): String = js.native
  
  def getSrc(): PlayableMediaSource = js.native
  
  def getVideoHeight(): Double = js.native
  
  def getVideoWidth(): Double = js.native
  
  def getVolume(): Double = js.native
  
  def increaseVolume(value: Double): Unit = js.native
  
  var isAutoPlayActive: Boolean = js.native
  
  var isDynamicContent: Boolean = js.native
  
  var isDynamicContentEnded: Boolean = js.native
  
  var isEnded: Boolean = js.native
  
  var isMetadataLoaded: Boolean = js.native
  
  var isMuted: Boolean = js.native
  
  var isPaused: Boolean = js.native
  
  var isPreloadActive: Boolean = js.native
  
  var isSeekAvailable: Boolean = js.native
  
  var isSyncWithLive: Boolean = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  def reset(): Unit = js.native
  
  def resetOutput(): Unit = js.native
  
  def seekBackward(sec: Double): Unit = js.native
  
  def seekForward(sec: Double): Unit = js.native
  
  def seekTo(time: Double): Unit = js.native
  
  def setAutoplay(isAutoplay: Boolean): Unit = js.native
  
  def setCrossOrigin(): Unit = js.native
  def setCrossOrigin(crossOrigin: CrossOriginValue): Unit = js.native
  
  def setLoop(isLoop: Boolean): Unit = js.native
  
  def setMute(isMuted: Boolean): Unit = js.native
  
  def setPlaybackRate(rate: Double): Unit = js.native
  
  def setPlaysinline(isPlaysinline: Boolean): Unit = js.native
  
  def setPreload(preload: PreloadType): Unit = js.native
  
  def setSrc(src: PlayableMediaSource): Unit = js.native
  def setSrc(src: PlayableMediaSource, callback: js.Function): Unit = js.native
  
  def setVolume(volume: Double): Unit = js.native
  
  def syncWithLive(): Unit = js.native
  
  def togglePlayback(): Unit = js.native
}
