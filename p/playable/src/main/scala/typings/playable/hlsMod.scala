package typings.playable

import typings.playable.adaptersTypesMod.IPlaybackAdapter
import typings.playable.anon.BwEstimate
import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.ADAPTIVE_VIA_MSE
import typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.FORCED
import typings.playable.playbackEngineTypesMod.IParsedPlayableSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/adapters/hls", JSImport.Namespace)
@js.native
object hlsMod extends js.Object {
  
  @js.native
  trait HlsAdapter extends IPlaybackAdapter {
    
    var _attachOnPlay: js.Any = js.native
    
    var _bindCallbacks: js.Any = js.native
    
    var _broadcastError: js.Any = js.native
    
    var _isAttached: js.Any = js.native
    
    var _isDynamicContent: js.Any = js.native
    
    var _isDynamicContentEnded: js.Any = js.native
    
    var _logError: js.Any = js.native
    
    var _mediaRecoverTimeout: js.Any = js.native
    
    var _networkRecoverTimeout: js.Any = js.native
    
    var _onEndOfStream: js.Any = js.native
    
    var _onLevelUpdated: js.Any = js.native
    
    var _tryRecoverMediaError: js.Any = js.native
    
    var _tryRecoverNetworkError: js.Any = js.native
    
    @JSName("currentUrl")
    def currentUrl_MHlsAdapter: String = js.native
    
    @JSName("debugInfo")
    def debugInfo_MHlsAdapter: BwEstimate = js.native
    
    var eventEmitter: js.Any = js.native
    
    var hls: js.Any = js.native
    
    @JSName("isDynamicContentEnded")
    def isDynamicContentEnded_MHlsAdapter: Boolean = js.native
    
    @JSName("isDynamicContent")
    def isDynamicContent_MHlsAdapter: Boolean = js.native
    
    @JSName("isSeekAvailable")
    def isSeekAvailable_MHlsAdapter: Boolean = js.native
    
    @JSName("isSyncWithLive")
    def isSyncWithLive_MHlsAdapter: Boolean = js.native
    
    var mediaStream: js.Any = js.native
    
    @JSName("mediaStreamDeliveryPriority")
    def mediaStreamDeliveryPriority_MHlsAdapter: ADAPTIVE_VIA_MSE | FORCED = js.native
    
    def setMediaStreams(mediaStreams: js.Array[IParsedPlayableSource]): Unit = js.native
    
    @JSName("syncWithLiveTime")
    def syncWithLiveTime_MHlsAdapter: Double = js.native
    
    var videoElement: js.Any = js.native
  }
  
  @js.native
  class default protected () extends HlsAdapter {
    def this(eventEmitter: IEventEmitter) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var DEFAULT_HLS_CONFIG: js.Any = js.native
    
    def isSupported(): Boolean = js.native
  }
}
