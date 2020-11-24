package typings.playable.adaptersTypesMod

import typings.playable.mediaStreamMod.MediaStreamDeliveryPriority
import typings.playable.mediaStreamMod.MediaStreamType
import typings.playable.playbackEngineTypesMod.IPlayableSource
import typings.playable.playbackEngineTypesMod.PlayableMediaSource
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlaybackAdapter extends js.Object {
  
  def attach(videoElement: HTMLVideoElement): Unit = js.native
  
  def canPlay(mediaType: MediaStreamType): Boolean = js.native
  
  var currentUrl: PlayableMediaSource = js.native
  
  var debugInfo: IAdapterDebugInfo = js.native
  
  def detach(): Unit = js.native
  
  var isDynamicContent: Boolean = js.native
  
  var isDynamicContentEnded: Boolean = js.native
  
  var isSeekAvailable: Boolean = js.native
  
  var isSyncWithLive: Boolean = js.native
  
  var mediaStreamDeliveryPriority: MediaStreamDeliveryPriority = js.native
  
  def setMediaStreams(mediaStreams: js.Any): Unit = js.native
  
  var syncWithLiveTime: Double = js.native
}
object IPlaybackAdapter {
  
  @scala.inline
  def apply(
    attach: HTMLVideoElement => Unit,
    canPlay: MediaStreamType => Boolean,
    currentUrl: PlayableMediaSource,
    debugInfo: IAdapterDebugInfo,
    detach: () => Unit,
    isDynamicContent: Boolean,
    isDynamicContentEnded: Boolean,
    isSeekAvailable: Boolean,
    isSyncWithLive: Boolean,
    mediaStreamDeliveryPriority: MediaStreamDeliveryPriority,
    setMediaStreams: js.Any => Unit,
    syncWithLiveTime: Double
  ): IPlaybackAdapter = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), canPlay = js.Any.fromFunction1(canPlay), currentUrl = currentUrl.asInstanceOf[js.Any], debugInfo = debugInfo.asInstanceOf[js.Any], detach = js.Any.fromFunction0(detach), isDynamicContent = isDynamicContent.asInstanceOf[js.Any], isDynamicContentEnded = isDynamicContentEnded.asInstanceOf[js.Any], isSeekAvailable = isSeekAvailable.asInstanceOf[js.Any], isSyncWithLive = isSyncWithLive.asInstanceOf[js.Any], mediaStreamDeliveryPriority = mediaStreamDeliveryPriority.asInstanceOf[js.Any], setMediaStreams = js.Any.fromFunction1(setMediaStreams), syncWithLiveTime = syncWithLiveTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlaybackAdapter]
  }
  
  @scala.inline
  implicit class IPlaybackAdapterOps[Self <: IPlaybackAdapter] (val x: Self) extends AnyVal {
    
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
    def setAttach(value: HTMLVideoElement => Unit): Self = this.set("attach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCanPlay(value: MediaStreamType => Boolean): Self = this.set("canPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrentUrlVarargs(value: (String | IPlayableSource)*): Self = this.set("currentUrl", js.Array(value :_*))
    
    @scala.inline
    def setCurrentUrl(value: PlayableMediaSource): Self = this.set("currentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugInfo(value: IAdapterDebugInfo): Self = this.set("debugInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetach(value: () => Unit): Self = this.set("detach", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDynamicContent(value: Boolean): Self = this.set("isDynamicContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDynamicContentEnded(value: Boolean): Self = this.set("isDynamicContentEnded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSeekAvailable(value: Boolean): Self = this.set("isSeekAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSyncWithLive(value: Boolean): Self = this.set("isSyncWithLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaStreamDeliveryPriority(value: MediaStreamDeliveryPriority): Self = this.set("mediaStreamDeliveryPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetMediaStreams(value: js.Any => Unit): Self = this.set("setMediaStreams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSyncWithLiveTime(value: Double): Self = this.set("syncWithLiveTime", value.asInstanceOf[js.Any])
  }
}
