package typings.playable

import typings.playable.adaptersTypesMod.IPlaybackAdapter
import typings.playable.anon.Bitrates
import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.mediaStreamMod.MediaStreamDeliveryPriority
import typings.playable.playbackEngineTypesMod.IParsedPlayableSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/adapters/dash", JSImport.Namespace)
@js.native
object dashMod extends js.Object {
  
  @js.native
  trait DashAdapter extends IPlaybackAdapter {
    
    var _bindCallbacks: js.Any = js.native
    
    var _broadcastError: js.Any = js.native
    
    var _delayedInitPlayer: js.Any = js.native
    
    var _initPlayer: js.Any = js.native
    
    var _logError: js.Any = js.native
    
    var _startDelayedInitPlayer: js.Any = js.native
    
    var _stopDelayedInitPlayer: js.Any = js.native
    
    @JSName("currentUrl")
    def currentUrl_MDashAdapter: String = js.native
    
    var dashPlayer: js.Any = js.native
    
    @JSName("debugInfo")
    def debugInfo_MDashAdapter: Bitrates = js.native
    
    var eventEmitter: js.Any = js.native
    
    @JSName("isDynamicContentEnded")
    def isDynamicContentEnded_MDashAdapter: Boolean = js.native
    
    @JSName("isDynamicContent")
    def isDynamicContent_MDashAdapter: Boolean = js.native
    
    @JSName("isSeekAvailable")
    def isSeekAvailable_MDashAdapter: Boolean = js.native
    
    @JSName("isSyncWithLive")
    def isSyncWithLive_MDashAdapter: Boolean = js.native
    
    var mediaStream: js.Any = js.native
    
    @JSName("mediaStreamDeliveryPriority")
    def mediaStreamDeliveryPriority_MDashAdapter: MediaStreamDeliveryPriority = js.native
    
    def setMediaStreams(mediaStreams: js.Array[IParsedPlayableSource]): Unit = js.native
    
    @JSName("syncWithLiveTime")
    def syncWithLiveTime_MDashAdapter: js.Any = js.native
    
    var videoElement: js.Any = js.native
  }
  
  @js.native
  class default protected () extends DashAdapter {
    def this(eventEmitter: IEventEmitter) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def isSupported(): Boolean = js.native
  }
}
