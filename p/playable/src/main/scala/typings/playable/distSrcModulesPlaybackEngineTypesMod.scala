package typings.playable

import typings.playable.distSrcConstantsEngineStateMod.EngineState
import typings.playable.distSrcConstantsMediaStreamMod.MediaStreamDeliveryPriority
import typings.playable.distSrcConstantsMediaStreamMod.MediaStreamType
import typings.playable.distSrcCoreConfigMod.IPlayerConfig
import typings.playable.distSrcModulesEventEmitterTypesMod.IEventEmitter
import typings.playable.distSrcModulesPlaybackEngineOutputNativeAdaptersTypesMod.IAdapterDebugInfo
import typings.playable.distSrcModulesPlaybackEngineOutputNativeAdaptersTypesMod.IPlaybackAdapterClass
import typings.playable.playableStrings.html5video
import typings.std.HTMLVideoElement
import typings.std.TimeRanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesPlaybackEngineTypesMod {
  
  @js.native
  sealed trait CrossOriginValue extends StObject
  @JSImport("playable/dist/src/modules/playback-engine/types", "CrossOriginValue")
  @js.native
  object CrossOriginValue extends StObject {
    
    @js.native
    sealed trait ANONYMUS
      extends StObject
         with CrossOriginValue
    
    @js.native
    sealed trait CREDENTIALS
      extends StObject
         with CrossOriginValue
  }
  
  @js.native
  sealed trait PreloadType extends StObject
  @JSImport("playable/dist/src/modules/playback-engine/types", "PreloadType")
  @js.native
  object PreloadType extends StObject {
    
    @js.native
    sealed trait AUTO
      extends StObject
         with PreloadType
    
    @js.native
    sealed trait METADATA
      extends StObject
         with PreloadType
    
    @js.native
    sealed trait NONE
      extends StObject
         with PreloadType
  }
  
  trait IEngineDebugInfo extends StObject {
    
    var currentTime: Double
    
    var duration: Double
    
    var output: String
  }
  object IEngineDebugInfo {
    
    inline def apply(currentTime: Double, duration: Double, output: String): IEngineDebugInfo = {
      val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEngineDebugInfo]
    }
    
    extension [Self <: IEngineDebugInfo](x: Self) {
      
      inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  trait ILiveStateEngineDependencies extends StObject {
    
    var engine: IPlaybackEngine
    
    var eventEmitter: IEventEmitter
  }
  object ILiveStateEngineDependencies {
    
    inline def apply(engine: IPlaybackEngine, eventEmitter: IEventEmitter): ILiveStateEngineDependencies = {
      val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILiveStateEngineDependencies]
    }
    
    extension [Self <: ILiveStateEngineDependencies](x: Self) {
      
      inline def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @property viewDimensions - Current size of view port provided by engine (right now - actual size of video tag)
    * @property currentTime - Current time of playback
    * @property duration - Duration of current video
    * @property loadingStateTimestamps - Object with time spend for different initial phases
    * @property output - Type of the output (html5video, chromecast etc.);
    */
  trait INativeDebugInfo
    extends StObject
       with IAdapterDebugInfo {
    
    var currentTime: Double
    
    var duration: Double
    
    var loadingStateTimestamps: js.Object
    
    var output: html5video
    
    var viewDimensions: js.Object
  }
  object INativeDebugInfo {
    
    inline def apply(
      bitrates: js.Array[String],
      bwEstimate: Double,
      currentBitrate: String,
      currentTime: Double,
      deliveryPriority: MediaStreamDeliveryPriority,
      duration: Double,
      loadingStateTimestamps: js.Object,
      nearestBufferSegInfo: js.Object,
      overallBufferLength: Double,
      `type`: MediaStreamType,
      url: String,
      viewDimensions: js.Object
    ): INativeDebugInfo = {
      val __obj = js.Dynamic.literal(bitrates = bitrates.asInstanceOf[js.Any], bwEstimate = bwEstimate.asInstanceOf[js.Any], currentBitrate = currentBitrate.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], deliveryPriority = deliveryPriority.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], loadingStateTimestamps = loadingStateTimestamps.asInstanceOf[js.Any], nearestBufferSegInfo = nearestBufferSegInfo.asInstanceOf[js.Any], output = "html5video", overallBufferLength = overallBufferLength.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], viewDimensions = viewDimensions.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[INativeDebugInfo]
    }
    
    extension [Self <: INativeDebugInfo](x: Self) {
      
      inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setLoadingStateTimestamps(value: js.Object): Self = StObject.set(x, "loadingStateTimestamps", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: html5video): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setViewDimensions(value: js.Object): Self = StObject.set(x, "viewDimensions", value.asInstanceOf[js.Any])
    }
  }
  
  trait IParsedPlayableSource extends StObject {
    
    var `type`: MediaStreamType
    
    var url: String
  }
  object IParsedPlayableSource {
    
    inline def apply(`type`: MediaStreamType, url: String): IParsedPlayableSource = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IParsedPlayableSource]
    }
    
    extension [Self <: IParsedPlayableSource](x: Self) {
      
      inline def setType(value: MediaStreamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPlayableSource extends StObject {
    
    var mimeType: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[MediaStreamType] = js.undefined
    
    var url: String
  }
  object IPlayableSource {
    
    inline def apply(url: String): IPlayableSource = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPlayableSource]
    }
    
    extension [Self <: IPlayableSource](x: Self) {
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setType(value: MediaStreamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPlaybackEngine extends StObject {
    
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
  
  trait IPlaybackEngineAPI extends StObject {
    
    var decreaseVolume: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var getAutoplay: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var getCrossOrigin: js.UndefOr[js.Function0[CrossOriginValue]] = js.undefined
    
    var getCurrentTime: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getDebugInfo: js.UndefOr[js.Function0[IEngineDebugInfo]] = js.undefined
    
    var getDuration: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getLoop: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var getPlaybackRate: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getPlaybackState: js.UndefOr[js.Function0[EngineState]] = js.undefined
    
    var getPlaysinline: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var getPreload: js.UndefOr[js.Function0[String]] = js.undefined
    
    var getSrc: js.UndefOr[js.Function0[PlayableMediaSource]] = js.undefined
    
    var getVideoHeight: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getVideoWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getVolume: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var increaseVolume: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var isEnded: js.UndefOr[Boolean] = js.undefined
    
    var isMuted: js.UndefOr[Boolean] = js.undefined
    
    var isPaused: js.UndefOr[Boolean] = js.undefined
    
    var mute: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var pause: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var play: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var resetPlayback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var seekBackward: js.UndefOr[js.Function1[/* sec */ Double, Unit]] = js.undefined
    
    var seekForward: js.UndefOr[js.Function1[/* sec */ Double, Unit]] = js.undefined
    
    var seekTo: js.UndefOr[js.Function1[/* time */ Double, Unit]] = js.undefined
    
    var setAutoplay: js.UndefOr[js.Function1[/* isAutoplay */ Boolean, Unit]] = js.undefined
    
    var setCrossOrigin: js.UndefOr[js.Function1[/* crossOrigin */ js.UndefOr[CrossOriginValue], Unit]] = js.undefined
    
    var setLoop: js.UndefOr[js.Function1[/* isLoop */ Boolean, Unit]] = js.undefined
    
    var setPlaybackRate: js.UndefOr[js.Function1[/* rate */ Double, Unit]] = js.undefined
    
    var setPlaysinline: js.UndefOr[js.Function1[/* isPlaysinline */ Boolean, Unit]] = js.undefined
    
    var setPreload: js.UndefOr[js.Function1[/* preload */ PreloadType, Unit]] = js.undefined
    
    var setSrc: js.UndefOr[
        js.Function2[/* src */ PlayableMediaSource, /* callback */ js.UndefOr[js.Function], Unit]
      ] = js.undefined
    
    var setVolume: js.UndefOr[js.Function1[/* volume */ Double, Unit]] = js.undefined
    
    var syncWithLive: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var togglePlayback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var unmute: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object IPlaybackEngineAPI {
    
    inline def apply(): IPlaybackEngineAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPlaybackEngineAPI]
    }
    
    extension [Self <: IPlaybackEngineAPI](x: Self) {
      
      inline def setDecreaseVolume(value: /* value */ Double => Unit): Self = StObject.set(x, "decreaseVolume", js.Any.fromFunction1(value))
      
      inline def setDecreaseVolumeUndefined: Self = StObject.set(x, "decreaseVolume", js.undefined)
      
      inline def setGetAutoplay(value: () => Boolean): Self = StObject.set(x, "getAutoplay", js.Any.fromFunction0(value))
      
      inline def setGetAutoplayUndefined: Self = StObject.set(x, "getAutoplay", js.undefined)
      
      inline def setGetCrossOrigin(value: () => CrossOriginValue): Self = StObject.set(x, "getCrossOrigin", js.Any.fromFunction0(value))
      
      inline def setGetCrossOriginUndefined: Self = StObject.set(x, "getCrossOrigin", js.undefined)
      
      inline def setGetCurrentTime(value: () => Double): Self = StObject.set(x, "getCurrentTime", js.Any.fromFunction0(value))
      
      inline def setGetCurrentTimeUndefined: Self = StObject.set(x, "getCurrentTime", js.undefined)
      
      inline def setGetDebugInfo(value: () => IEngineDebugInfo): Self = StObject.set(x, "getDebugInfo", js.Any.fromFunction0(value))
      
      inline def setGetDebugInfoUndefined: Self = StObject.set(x, "getDebugInfo", js.undefined)
      
      inline def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
      
      inline def setGetDurationUndefined: Self = StObject.set(x, "getDuration", js.undefined)
      
      inline def setGetLoop(value: () => Boolean): Self = StObject.set(x, "getLoop", js.Any.fromFunction0(value))
      
      inline def setGetLoopUndefined: Self = StObject.set(x, "getLoop", js.undefined)
      
      inline def setGetPlaybackRate(value: () => Double): Self = StObject.set(x, "getPlaybackRate", js.Any.fromFunction0(value))
      
      inline def setGetPlaybackRateUndefined: Self = StObject.set(x, "getPlaybackRate", js.undefined)
      
      inline def setGetPlaybackState(value: () => EngineState): Self = StObject.set(x, "getPlaybackState", js.Any.fromFunction0(value))
      
      inline def setGetPlaybackStateUndefined: Self = StObject.set(x, "getPlaybackState", js.undefined)
      
      inline def setGetPlaysinline(value: () => Boolean): Self = StObject.set(x, "getPlaysinline", js.Any.fromFunction0(value))
      
      inline def setGetPlaysinlineUndefined: Self = StObject.set(x, "getPlaysinline", js.undefined)
      
      inline def setGetPreload(value: () => String): Self = StObject.set(x, "getPreload", js.Any.fromFunction0(value))
      
      inline def setGetPreloadUndefined: Self = StObject.set(x, "getPreload", js.undefined)
      
      inline def setGetSrc(value: () => PlayableMediaSource): Self = StObject.set(x, "getSrc", js.Any.fromFunction0(value))
      
      inline def setGetSrcUndefined: Self = StObject.set(x, "getSrc", js.undefined)
      
      inline def setGetVideoHeight(value: () => Double): Self = StObject.set(x, "getVideoHeight", js.Any.fromFunction0(value))
      
      inline def setGetVideoHeightUndefined: Self = StObject.set(x, "getVideoHeight", js.undefined)
      
      inline def setGetVideoWidth(value: () => Double): Self = StObject.set(x, "getVideoWidth", js.Any.fromFunction0(value))
      
      inline def setGetVideoWidthUndefined: Self = StObject.set(x, "getVideoWidth", js.undefined)
      
      inline def setGetVolume(value: () => Double): Self = StObject.set(x, "getVolume", js.Any.fromFunction0(value))
      
      inline def setGetVolumeUndefined: Self = StObject.set(x, "getVolume", js.undefined)
      
      inline def setIncreaseVolume(value: /* value */ Double => Unit): Self = StObject.set(x, "increaseVolume", js.Any.fromFunction1(value))
      
      inline def setIncreaseVolumeUndefined: Self = StObject.set(x, "increaseVolume", js.undefined)
      
      inline def setIsEnded(value: Boolean): Self = StObject.set(x, "isEnded", value.asInstanceOf[js.Any])
      
      inline def setIsEndedUndefined: Self = StObject.set(x, "isEnded", js.undefined)
      
      inline def setIsMuted(value: Boolean): Self = StObject.set(x, "isMuted", value.asInstanceOf[js.Any])
      
      inline def setIsMutedUndefined: Self = StObject.set(x, "isMuted", js.undefined)
      
      inline def setIsPaused(value: Boolean): Self = StObject.set(x, "isPaused", value.asInstanceOf[js.Any])
      
      inline def setIsPausedUndefined: Self = StObject.set(x, "isPaused", js.undefined)
      
      inline def setMute(value: () => Unit): Self = StObject.set(x, "mute", js.Any.fromFunction0(value))
      
      inline def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
      
      inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
      
      inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      inline def setResetPlayback(value: () => Unit): Self = StObject.set(x, "resetPlayback", js.Any.fromFunction0(value))
      
      inline def setResetPlaybackUndefined: Self = StObject.set(x, "resetPlayback", js.undefined)
      
      inline def setSeekBackward(value: /* sec */ Double => Unit): Self = StObject.set(x, "seekBackward", js.Any.fromFunction1(value))
      
      inline def setSeekBackwardUndefined: Self = StObject.set(x, "seekBackward", js.undefined)
      
      inline def setSeekForward(value: /* sec */ Double => Unit): Self = StObject.set(x, "seekForward", js.Any.fromFunction1(value))
      
      inline def setSeekForwardUndefined: Self = StObject.set(x, "seekForward", js.undefined)
      
      inline def setSeekTo(value: /* time */ Double => Unit): Self = StObject.set(x, "seekTo", js.Any.fromFunction1(value))
      
      inline def setSeekToUndefined: Self = StObject.set(x, "seekTo", js.undefined)
      
      inline def setSetAutoplay(value: /* isAutoplay */ Boolean => Unit): Self = StObject.set(x, "setAutoplay", js.Any.fromFunction1(value))
      
      inline def setSetAutoplayUndefined: Self = StObject.set(x, "setAutoplay", js.undefined)
      
      inline def setSetCrossOrigin(value: /* crossOrigin */ js.UndefOr[CrossOriginValue] => Unit): Self = StObject.set(x, "setCrossOrigin", js.Any.fromFunction1(value))
      
      inline def setSetCrossOriginUndefined: Self = StObject.set(x, "setCrossOrigin", js.undefined)
      
      inline def setSetLoop(value: /* isLoop */ Boolean => Unit): Self = StObject.set(x, "setLoop", js.Any.fromFunction1(value))
      
      inline def setSetLoopUndefined: Self = StObject.set(x, "setLoop", js.undefined)
      
      inline def setSetPlaybackRate(value: /* rate */ Double => Unit): Self = StObject.set(x, "setPlaybackRate", js.Any.fromFunction1(value))
      
      inline def setSetPlaybackRateUndefined: Self = StObject.set(x, "setPlaybackRate", js.undefined)
      
      inline def setSetPlaysinline(value: /* isPlaysinline */ Boolean => Unit): Self = StObject.set(x, "setPlaysinline", js.Any.fromFunction1(value))
      
      inline def setSetPlaysinlineUndefined: Self = StObject.set(x, "setPlaysinline", js.undefined)
      
      inline def setSetPreload(value: /* preload */ PreloadType => Unit): Self = StObject.set(x, "setPreload", js.Any.fromFunction1(value))
      
      inline def setSetPreloadUndefined: Self = StObject.set(x, "setPreload", js.undefined)
      
      inline def setSetSrc(value: (/* src */ PlayableMediaSource, /* callback */ js.UndefOr[js.Function]) => Unit): Self = StObject.set(x, "setSrc", js.Any.fromFunction2(value))
      
      inline def setSetSrcUndefined: Self = StObject.set(x, "setSrc", js.undefined)
      
      inline def setSetVolume(value: /* volume */ Double => Unit): Self = StObject.set(x, "setVolume", js.Any.fromFunction1(value))
      
      inline def setSetVolumeUndefined: Self = StObject.set(x, "setVolume", js.undefined)
      
      inline def setSyncWithLive(value: () => Unit): Self = StObject.set(x, "syncWithLive", js.Any.fromFunction0(value))
      
      inline def setSyncWithLiveUndefined: Self = StObject.set(x, "syncWithLive", js.undefined)
      
      inline def setTogglePlayback(value: () => Unit): Self = StObject.set(x, "togglePlayback", js.Any.fromFunction0(value))
      
      inline def setTogglePlaybackUndefined: Self = StObject.set(x, "togglePlayback", js.undefined)
      
      inline def setUnmute(value: () => Unit): Self = StObject.set(x, "unmute", js.Any.fromFunction0(value))
      
      inline def setUnmuteUndefined: Self = StObject.set(x, "unmute", js.undefined)
    }
  }
  
  trait IPlaybackEngineDependencies extends StObject {
    
    var availablePlaybackAdapters: js.Array[IPlaybackAdapterClass]
    
    var config: IPlayerConfig
    
    var eventEmitter: IEventEmitter
    
    var nativeOutput: IVideoOutput
  }
  object IPlaybackEngineDependencies {
    
    inline def apply(
      availablePlaybackAdapters: js.Array[IPlaybackAdapterClass],
      config: IPlayerConfig,
      eventEmitter: IEventEmitter,
      nativeOutput: IVideoOutput
    ): IPlaybackEngineDependencies = {
      val __obj = js.Dynamic.literal(availablePlaybackAdapters = availablePlaybackAdapters.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], nativeOutput = nativeOutput.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPlaybackEngineDependencies]
    }
    
    extension [Self <: IPlaybackEngineDependencies](x: Self) {
      
      inline def setAvailablePlaybackAdapters(value: js.Array[IPlaybackAdapterClass]): Self = StObject.set(x, "availablePlaybackAdapters", value.asInstanceOf[js.Any])
      
      inline def setAvailablePlaybackAdaptersVarargs(value: IPlaybackAdapterClass*): Self = StObject.set(x, "availablePlaybackAdapters", js.Array(value*))
      
      inline def setConfig(value: IPlayerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
      
      inline def setNativeOutput(value: IVideoOutput): Self = StObject.set(x, "nativeOutput", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IVideoOutput extends StObject {
    
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
    
    var isDynamicContentEnded: Boolean = js.native
    
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
    def setSrc(src: Unit, callback: js.Function): Unit = js.native
    def setSrc(src: PlayableMediaSource): Unit = js.native
    def setSrc(src: PlayableMediaSource, callback: js.Function): Unit = js.native
    
    def setVolume(volume: Double): Unit = js.native
    
    var src: PlayableMediaSource = js.native
    
    def syncWithLive(): Unit = js.native
    
    var videoHeight: js.UndefOr[Double] = js.native
    
    var videoWidth: js.UndefOr[Double] = js.native
    
    var volume: Double = js.native
  }
  
  type PlayableMediaSource = String | IPlayableSource | (js.Array[String | IPlayableSource])
}
