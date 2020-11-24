package typings.playable

import typings.playable.adaptersTypesMod.IPlaybackAdapter
import typings.playable.adaptersTypesMod.IPlaybackAdapterClass
import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.playbackEngineTypesMod.PlayableMediaSource
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/playback-engine/output/native/adapters-strategy", JSImport.Namespace)
@js.native
object adaptersStrategyMod extends js.Object {
  
  @js.native
  trait AdaptersStrategy extends js.Object {
    
    var _attachedAdapter: js.Any = js.native
    
    var _autoDetectSourceTypes: js.Any = js.native
    
    var _availableAdapters: js.Any = js.native
    
    var _connectAdapterToVideo: js.Any = js.native
    
    var _detachCurrentAdapter: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _playableAdapters: js.Any = js.native
    
    var _resolvePlayableAdapters: js.Any = js.native
    
    var _video: js.Any = js.native
    
    def attachedAdapter: IPlaybackAdapter = js.native
    
    def connectAdapter(src: PlayableMediaSource): Unit = js.native
    
    def destroy(): Unit = js.native
  }
  
  @js.native
  class default protected () extends AdaptersStrategy {
    def this(eventEmitter: IEventEmitter, video: HTMLVideoElement) = this()
    def this(
      eventEmitter: IEventEmitter,
      video: HTMLVideoElement,
      playbackAdapters: js.Array[IPlaybackAdapterClass]
    ) = this()
  }
}
