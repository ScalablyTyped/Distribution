package typings.playable

import typings.playable.playbackEngineTypesMod.IPlaybackEngine
import typings.playable.playbackEngineTypesMod.IPlaybackEngineDependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playbackEngineMod {
  
  @JSImport("playable/dist/src/modules/playback-engine/playback-engine", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Engine {
    def this(hasEventEmitterNativeOutputConfig: IPlaybackEngineDependencies) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/playback-engine/playback-engine", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("playable/dist/src/modules/playback-engine/playback-engine", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/playback-engine/playback-engine", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Engine
    extends StObject
       with IPlaybackEngine {
    
    /* private */ var _applyConfig: js.Any = js.native
    
    /* private */ var _config: js.Any = js.native
    
    /* private */ var _defaultOutput: js.Any = js.native
    
    /* private */ var _eventEmitter: js.Any = js.native
    
    /* private */ var _output: js.Any = js.native
    
    def changeOutput(): Unit = js.native
    def changeOutput(output: Unit, callback: js.Function): Unit = js.native
    
    @JSName("isAutoPlayActive")
    def isAutoPlayActive_MEngine: Boolean = js.native
    
    @JSName("isDynamicContentEnded")
    def isDynamicContentEnded_MEngine: js.Any = js.native
    
    @JSName("isDynamicContent")
    def isDynamicContent_MEngine: Boolean = js.native
    
    /**
      * High level state of video playback. Returns true if playback is ended. Also note, that `isPaused` will return `true` if playback is ended also.
      * For more advance state use `getPlaybackState`
      * @example
      * player.play();
      * console.log(player.isEnded);
      */
    @JSName("isEnded")
    def isEnded_MEngine: Boolean = js.native
    
    @JSName("isMetadataLoaded")
    def isMetadataLoaded_MEngine: Boolean = js.native
    
    /**
      * Get mute flag
      * @example
      * player.mute();
      * player.isMuted; // true
      * player.unmute();
      * player.isMuted: // false
      */
    @JSName("isMuted")
    def isMuted_MEngine: Boolean = js.native
    
    /**
      * High level state of video playback. Returns true if playback is paused.
      * For more advance state use `getPlaybackState`
      * @example
      * player.play();
      * console.log(player.isPaused);
      */
    @JSName("isPaused")
    def isPaused_MEngine: Boolean = js.native
    
    @JSName("isPreloadActive")
    def isPreloadActive_MEngine: Boolean = js.native
    
    @JSName("isSeekAvailable")
    def isSeekAvailable_MEngine: Boolean = js.native
    
    @JSName("isSyncWithLive")
    def isSyncWithLive_MEngine: Boolean = js.native
    
    /**
      * Mute the video
      * @example
      * player.mute();
      */
    def mute(): Unit = js.native
    
    /**
      * Reset video playback
      * @example
      * player.play();
      * console.log(player.isPaused); // false
      * ...
      * player.resetPlayback();
      * console.log(player.isPaused); // true;
      * console.log(player.getCurrentTime()); //0;
      */
    def resetPlayback(): Unit = js.native
    
    /**
      * Unmute the video
      * @example
      * player.unmute(true);
      */
    def unmute(): Unit = js.native
  }
}
