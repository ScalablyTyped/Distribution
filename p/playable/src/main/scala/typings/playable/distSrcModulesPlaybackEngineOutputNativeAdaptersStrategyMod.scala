package typings.playable

import typings.playable.distSrcModulesEventEmitterTypesMod.IEventEmitter
import typings.playable.distSrcModulesPlaybackEngineOutputNativeAdaptersTypesMod.IPlaybackAdapter
import typings.playable.distSrcModulesPlaybackEngineOutputNativeAdaptersTypesMod.IPlaybackAdapterClass
import typings.playable.distSrcModulesPlaybackEngineTypesMod.PlayableMediaSource
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesPlaybackEngineOutputNativeAdaptersStrategyMod {
  
  @JSImport("playable/dist/src/modules/playback-engine/output/native/adapters-strategy", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AdaptersStrategy {
    def this(eventEmitter: IEventEmitter, video: HTMLVideoElement) = this()
    def this(
      eventEmitter: IEventEmitter,
      video: HTMLVideoElement,
      playbackAdapters: js.Array[IPlaybackAdapterClass]
    ) = this()
  }
  
  @js.native
  trait AdaptersStrategy extends StObject {
    
    /* private */ var _attachedAdapter: Any = js.native
    
    /* private */ var _autoDetectSourceTypes: Any = js.native
    
    /* private */ var _availableAdapters: Any = js.native
    
    /* private */ var _connectAdapterToVideo: Any = js.native
    
    /* private */ var _detachCurrentAdapter: Any = js.native
    
    /* private */ var _eventEmitter: Any = js.native
    
    /* private */ var _playableAdapters: Any = js.native
    
    /* private */ var _resolvePlayableAdapters: Any = js.native
    
    /* private */ var _video: Any = js.native
    
    def attachedAdapter: IPlaybackAdapter = js.native
    
    def connectAdapter(src: PlayableMediaSource): Unit = js.native
    
    def destroy(): Unit = js.native
  }
}
