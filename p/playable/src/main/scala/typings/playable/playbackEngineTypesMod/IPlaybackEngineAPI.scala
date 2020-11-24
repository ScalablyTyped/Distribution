package typings.playable.playbackEngineTypesMod

import typings.playable.engineStateMod.EngineState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlaybackEngineAPI extends js.Object {
  
  var decreaseVolume: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var getAutoplay: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var getCrossOrigin: js.UndefOr[js.Function0[CrossOriginValue]] = js.native
  
  var getCurrentTime: js.UndefOr[js.Function0[Double]] = js.native
  
  var getDebugInfo: js.UndefOr[js.Function0[IEngineDebugInfo]] = js.native
  
  var getDuration: js.UndefOr[js.Function0[Double]] = js.native
  
  var getLoop: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var getPlaybackRate: js.UndefOr[js.Function0[Double]] = js.native
  
  var getPlaybackState: js.UndefOr[js.Function0[EngineState]] = js.native
  
  var getPlaysinline: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var getPreload: js.UndefOr[js.Function0[String]] = js.native
  
  var getSrc: js.UndefOr[js.Function0[PlayableMediaSource]] = js.native
  
  var getVideoHeight: js.UndefOr[js.Function0[Double]] = js.native
  
  var getVideoWidth: js.UndefOr[js.Function0[Double]] = js.native
  
  var getVolume: js.UndefOr[js.Function0[Double]] = js.native
  
  var increaseVolume: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var isEnded: js.UndefOr[Boolean] = js.native
  
  var isMuted: js.UndefOr[Boolean] = js.native
  
  var isPaused: js.UndefOr[Boolean] = js.native
  
  var mute: js.UndefOr[js.Function0[Unit]] = js.native
  
  var pause: js.UndefOr[js.Function0[Unit]] = js.native
  
  var play: js.UndefOr[js.Function0[Unit]] = js.native
  
  var resetPlayback: js.UndefOr[js.Function0[Unit]] = js.native
  
  var seekBackward: js.UndefOr[js.Function1[/* sec */ Double, Unit]] = js.native
  
  var seekForward: js.UndefOr[js.Function1[/* sec */ Double, Unit]] = js.native
  
  var seekTo: js.UndefOr[js.Function1[/* time */ Double, Unit]] = js.native
  
  var setAutoplay: js.UndefOr[js.Function1[/* isAutoplay */ Boolean, Unit]] = js.native
  
  var setCrossOrigin: js.UndefOr[js.Function1[/* crossOrigin */ js.UndefOr[CrossOriginValue], Unit]] = js.native
  
  var setLoop: js.UndefOr[js.Function1[/* isLoop */ Boolean, Unit]] = js.native
  
  var setPlaybackRate: js.UndefOr[js.Function1[/* rate */ Double, Unit]] = js.native
  
  var setPlaysinline: js.UndefOr[js.Function1[/* isPlaysinline */ Boolean, Unit]] = js.native
  
  var setPreload: js.UndefOr[js.Function1[/* preload */ PreloadType, Unit]] = js.native
  
  var setSrc: js.UndefOr[
    js.Function2[/* src */ PlayableMediaSource, /* callback */ js.UndefOr[js.Function], Unit]
  ] = js.native
  
  var setVolume: js.UndefOr[js.Function1[/* volume */ Double, Unit]] = js.native
  
  var syncWithLive: js.UndefOr[js.Function0[Unit]] = js.native
  
  var togglePlayback: js.UndefOr[js.Function0[Unit]] = js.native
  
  var unmute: js.UndefOr[js.Function0[Unit]] = js.native
}
object IPlaybackEngineAPI {
  
  @scala.inline
  def apply(): IPlaybackEngineAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPlaybackEngineAPI]
  }
  
  @scala.inline
  implicit class IPlaybackEngineAPIOps[Self <: IPlaybackEngineAPI] (val x: Self) extends AnyVal {
    
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
    def setDecreaseVolume(value: /* value */ Double => Unit): Self = this.set("decreaseVolume", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDecreaseVolume: Self = this.set("decreaseVolume", js.undefined)
    
    @scala.inline
    def setGetAutoplay(value: () => Boolean): Self = this.set("getAutoplay", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAutoplay: Self = this.set("getAutoplay", js.undefined)
    
    @scala.inline
    def setGetCrossOrigin(value: () => CrossOriginValue): Self = this.set("getCrossOrigin", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCrossOrigin: Self = this.set("getCrossOrigin", js.undefined)
    
    @scala.inline
    def setGetCurrentTime(value: () => Double): Self = this.set("getCurrentTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCurrentTime: Self = this.set("getCurrentTime", js.undefined)
    
    @scala.inline
    def setGetDebugInfo(value: () => IEngineDebugInfo): Self = this.set("getDebugInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDebugInfo: Self = this.set("getDebugInfo", js.undefined)
    
    @scala.inline
    def setGetDuration(value: () => Double): Self = this.set("getDuration", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDuration: Self = this.set("getDuration", js.undefined)
    
    @scala.inline
    def setGetLoop(value: () => Boolean): Self = this.set("getLoop", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLoop: Self = this.set("getLoop", js.undefined)
    
    @scala.inline
    def setGetPlaybackRate(value: () => Double): Self = this.set("getPlaybackRate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPlaybackRate: Self = this.set("getPlaybackRate", js.undefined)
    
    @scala.inline
    def setGetPlaybackState(value: () => EngineState): Self = this.set("getPlaybackState", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPlaybackState: Self = this.set("getPlaybackState", js.undefined)
    
    @scala.inline
    def setGetPlaysinline(value: () => Boolean): Self = this.set("getPlaysinline", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPlaysinline: Self = this.set("getPlaysinline", js.undefined)
    
    @scala.inline
    def setGetPreload(value: () => String): Self = this.set("getPreload", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPreload: Self = this.set("getPreload", js.undefined)
    
    @scala.inline
    def setGetSrc(value: () => PlayableMediaSource): Self = this.set("getSrc", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSrc: Self = this.set("getSrc", js.undefined)
    
    @scala.inline
    def setGetVideoHeight(value: () => Double): Self = this.set("getVideoHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetVideoHeight: Self = this.set("getVideoHeight", js.undefined)
    
    @scala.inline
    def setGetVideoWidth(value: () => Double): Self = this.set("getVideoWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetVideoWidth: Self = this.set("getVideoWidth", js.undefined)
    
    @scala.inline
    def setGetVolume(value: () => Double): Self = this.set("getVolume", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetVolume: Self = this.set("getVolume", js.undefined)
    
    @scala.inline
    def setIncreaseVolume(value: /* value */ Double => Unit): Self = this.set("increaseVolume", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIncreaseVolume: Self = this.set("increaseVolume", js.undefined)
    
    @scala.inline
    def setIsEnded(value: Boolean): Self = this.set("isEnded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnded: Self = this.set("isEnded", js.undefined)
    
    @scala.inline
    def setIsMuted(value: Boolean): Self = this.set("isMuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMuted: Self = this.set("isMuted", js.undefined)
    
    @scala.inline
    def setIsPaused(value: Boolean): Self = this.set("isPaused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPaused: Self = this.set("isPaused", js.undefined)
    
    @scala.inline
    def setMute(value: () => Unit): Self = this.set("mute", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteMute: Self = this.set("mute", js.undefined)
    
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    
    @scala.inline
    def setPlay(value: () => Unit): Self = this.set("play", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePlay: Self = this.set("play", js.undefined)
    
    @scala.inline
    def setResetPlayback(value: () => Unit): Self = this.set("resetPlayback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteResetPlayback: Self = this.set("resetPlayback", js.undefined)
    
    @scala.inline
    def setSeekBackward(value: /* sec */ Double => Unit): Self = this.set("seekBackward", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSeekBackward: Self = this.set("seekBackward", js.undefined)
    
    @scala.inline
    def setSeekForward(value: /* sec */ Double => Unit): Self = this.set("seekForward", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSeekForward: Self = this.set("seekForward", js.undefined)
    
    @scala.inline
    def setSeekTo(value: /* time */ Double => Unit): Self = this.set("seekTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSeekTo: Self = this.set("seekTo", js.undefined)
    
    @scala.inline
    def setSetAutoplay(value: /* isAutoplay */ Boolean => Unit): Self = this.set("setAutoplay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAutoplay: Self = this.set("setAutoplay", js.undefined)
    
    @scala.inline
    def setSetCrossOrigin(value: /* crossOrigin */ js.UndefOr[CrossOriginValue] => Unit): Self = this.set("setCrossOrigin", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCrossOrigin: Self = this.set("setCrossOrigin", js.undefined)
    
    @scala.inline
    def setSetLoop(value: /* isLoop */ Boolean => Unit): Self = this.set("setLoop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLoop: Self = this.set("setLoop", js.undefined)
    
    @scala.inline
    def setSetPlaybackRate(value: /* rate */ Double => Unit): Self = this.set("setPlaybackRate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPlaybackRate: Self = this.set("setPlaybackRate", js.undefined)
    
    @scala.inline
    def setSetPlaysinline(value: /* isPlaysinline */ Boolean => Unit): Self = this.set("setPlaysinline", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPlaysinline: Self = this.set("setPlaysinline", js.undefined)
    
    @scala.inline
    def setSetPreload(value: /* preload */ PreloadType => Unit): Self = this.set("setPreload", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPreload: Self = this.set("setPreload", js.undefined)
    
    @scala.inline
    def setSetSrc(value: (/* src */ PlayableMediaSource, /* callback */ js.UndefOr[js.Function]) => Unit): Self = this.set("setSrc", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetSrc: Self = this.set("setSrc", js.undefined)
    
    @scala.inline
    def setSetVolume(value: /* volume */ Double => Unit): Self = this.set("setVolume", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetVolume: Self = this.set("setVolume", js.undefined)
    
    @scala.inline
    def setSyncWithLive(value: () => Unit): Self = this.set("syncWithLive", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSyncWithLive: Self = this.set("syncWithLive", js.undefined)
    
    @scala.inline
    def setTogglePlayback(value: () => Unit): Self = this.set("togglePlayback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTogglePlayback: Self = this.set("togglePlayback", js.undefined)
    
    @scala.inline
    def setUnmute(value: () => Unit): Self = this.set("unmute", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteUnmute: Self = this.set("unmute", js.undefined)
  }
}
