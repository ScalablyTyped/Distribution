package typings.playable

import typings.playable.adaptersTypesMod.IAdapterDebugInfo
import typings.playable.adaptersTypesMod.IPlaybackAdapter
import typings.playable.anon.BwEstimate
import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.mediaStreamMod.MediaStreamDeliveryPriority
import typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.ADAPTIVE_VIA_MSE
import typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.FORCED
import typings.playable.mediaStreamMod.MediaStreamType
import typings.playable.playbackEngineTypesMod.IParsedPlayableSource
import typings.playable.playbackEngineTypesMod.PlayableMediaSource
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hlsMod {
  
  @JSImport("playable/dist/src/adapters/hls", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with HlsAdapter {
    def this(eventEmitter: IEventEmitter) = this()
    
    /* CompleteClass */
    override def attach(videoElement: HTMLVideoElement): Unit = js.native
    
    /* CompleteClass */
    override def canPlay(mediaType: MediaStreamType): Boolean = js.native
    
    /* CompleteClass */
    var currentUrl: PlayableMediaSource = js.native
    
    /* CompleteClass */
    var debugInfo: IAdapterDebugInfo = js.native
    
    /* CompleteClass */
    override def detach(): Unit = js.native
    
    /* CompleteClass */
    var isDynamicContent: Boolean = js.native
    
    /* CompleteClass */
    var isDynamicContentEnded: Boolean = js.native
    
    /* CompleteClass */
    var isSeekAvailable: Boolean = js.native
    
    /* CompleteClass */
    var isSyncWithLive: Boolean = js.native
    
    /* CompleteClass */
    var mediaStreamDeliveryPriority: MediaStreamDeliveryPriority = js.native
    
    /* CompleteClass */
    override def setMediaStreams(mediaStreams: Any): Unit = js.native
    
    /* CompleteClass */
    var syncWithLiveTime: Double = js.native
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/adapters/hls", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/adapters/hls", "default.DEFAULT_HLS_CONFIG")
    @js.native
    def DEFAULT_HLS_CONFIG: Any = js.native
    inline def DEFAULT_HLS_CONFIG_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_HLS_CONFIG")(x.asInstanceOf[js.Any])
    
    inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  }
  
  @js.native
  trait HlsAdapter
    extends StObject
       with IPlaybackAdapter {
    
    /* private */ var _attachOnPlay: Any = js.native
    
    /* private */ var _bindCallbacks: Any = js.native
    
    /* private */ var _broadcastError: Any = js.native
    
    /* private */ var _isAttached: Any = js.native
    
    /* private */ var _isDynamicContent: Any = js.native
    
    /* private */ var _isDynamicContentEnded: Any = js.native
    
    /* private */ var _logError: Any = js.native
    
    /* private */ var _mediaRecoverTimeout: Any = js.native
    
    /* private */ var _networkRecoverTimeout: Any = js.native
    
    /* private */ var _onEndOfStream: Any = js.native
    
    /* private */ var _onLevelUpdated: Any = js.native
    
    /* private */ var _tryRecoverMediaError: Any = js.native
    
    /* private */ var _tryRecoverNetworkError: Any = js.native
    
    @JSName("currentUrl")
    def currentUrl_MHlsAdapter: String = js.native
    
    @JSName("debugInfo")
    def debugInfo_MHlsAdapter: BwEstimate = js.native
    
    /* private */ var eventEmitter: Any = js.native
    
    /* private */ var hls: Any = js.native
    
    @JSName("isDynamicContentEnded")
    def isDynamicContentEnded_MHlsAdapter: Boolean = js.native
    
    @JSName("isDynamicContent")
    def isDynamicContent_MHlsAdapter: Boolean = js.native
    
    @JSName("isSeekAvailable")
    def isSeekAvailable_MHlsAdapter: Boolean = js.native
    
    @JSName("isSyncWithLive")
    def isSyncWithLive_MHlsAdapter: Boolean = js.native
    
    /* private */ var mediaStream: Any = js.native
    
    @JSName("mediaStreamDeliveryPriority")
    def mediaStreamDeliveryPriority_MHlsAdapter: ADAPTIVE_VIA_MSE | FORCED = js.native
    
    def setMediaStreams(mediaStreams: js.Array[IParsedPlayableSource]): Unit = js.native
    
    @JSName("syncWithLiveTime")
    def syncWithLiveTime_MHlsAdapter: Double = js.native
    
    /* private */ var videoElement: Any = js.native
  }
}
