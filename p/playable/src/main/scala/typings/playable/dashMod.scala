package typings.playable

import typings.playable.adaptersTypesMod.IAdapterDebugInfo
import typings.playable.adaptersTypesMod.IPlaybackAdapter
import typings.playable.anon.Bitrates
import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.mediaStreamMod.MediaStreamDeliveryPriority
import typings.playable.mediaStreamMod.MediaStreamType
import typings.playable.playbackEngineTypesMod.IParsedPlayableSource
import typings.playable.playbackEngineTypesMod.PlayableMediaSource
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dashMod {
  
  @JSImport("playable/dist/src/adapters/dash", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with DashAdapter {
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
    override def setMediaStreams(mediaStreams: js.Any): Unit = js.native
    
    /* CompleteClass */
    var syncWithLiveTime: Double = js.native
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/adapters/dash", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  }
  
  @js.native
  trait DashAdapter
    extends StObject
       with IPlaybackAdapter {
    
    /* private */ var _bindCallbacks: js.Any = js.native
    
    /* private */ var _broadcastError: js.Any = js.native
    
    /* private */ var _delayedInitPlayer: js.Any = js.native
    
    /* private */ var _initPlayer: js.Any = js.native
    
    /* private */ var _logError: js.Any = js.native
    
    /* private */ var _startDelayedInitPlayer: js.Any = js.native
    
    /* private */ var _stopDelayedInitPlayer: js.Any = js.native
    
    @JSName("currentUrl")
    def currentUrl_MDashAdapter: String = js.native
    
    /* private */ var dashPlayer: js.Any = js.native
    
    @JSName("debugInfo")
    def debugInfo_MDashAdapter: Bitrates = js.native
    
    /* private */ var eventEmitter: js.Any = js.native
    
    @JSName("isDynamicContentEnded")
    def isDynamicContentEnded_MDashAdapter: Boolean = js.native
    
    @JSName("isDynamicContent")
    def isDynamicContent_MDashAdapter: Boolean = js.native
    
    @JSName("isSeekAvailable")
    def isSeekAvailable_MDashAdapter: Boolean = js.native
    
    @JSName("isSyncWithLive")
    def isSyncWithLive_MDashAdapter: Boolean = js.native
    
    /* private */ var mediaStream: js.Any = js.native
    
    @JSName("mediaStreamDeliveryPriority")
    def mediaStreamDeliveryPriority_MDashAdapter: MediaStreamDeliveryPriority = js.native
    
    def setMediaStreams(mediaStreams: js.Array[IParsedPlayableSource]): Unit = js.native
    
    @JSName("syncWithLiveTime")
    def syncWithLiveTime_MDashAdapter: js.Any = js.native
    
    /* private */ var videoElement: js.Any = js.native
  }
}
