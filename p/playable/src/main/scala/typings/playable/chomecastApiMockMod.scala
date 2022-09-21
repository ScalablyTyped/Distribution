package typings.playable

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.playable.anon.AutoJoinPolicy
import typings.playable.anon.GetInstance
import typings.playable.anon.GetMediaSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chomecastApiMockMod {
  
  @JSImport("playable/dist/src/testkit/chomecast-api-mock", "CastTestFramework")
  @js.native
  open class CastTestFramework () extends StObject {
    
    def CastContext: GetInstance = js.native
    
    def CastContextEventType: Any = js.native
    
    var RemotePlayer: Instantiable0[typings.playable.chomecastApiMockMod.RemotePlayer] = js.native
    
    var RemotePlayerController: Instantiable1[
        /* player */ RemotePlayer, 
        typings.playable.chomecastApiMockMod.RemotePlayerController
      ] = js.native
    
    def RemotePlayerEventType: Any = js.native
    
    def SessionState: Any = js.native
    
    /* private */ var _context: Any = js.native
    
    def context: CastContext = js.native
    
    def trigger(`type`: eventType, event: Any): Unit = js.native
  }
  
  @js.native
  sealed trait RemotePlayerEventType extends StObject
  @JSImport("playable/dist/src/testkit/chomecast-api-mock", "RemotePlayerEventType")
  @js.native
  object RemotePlayerEventType extends StObject {
    
    @js.native
    sealed trait ANY_CHANGE
      extends StObject
         with RemotePlayerEventType
    
    @js.native
    sealed trait IS_PAUSED_CHANGED
      extends StObject
         with RemotePlayerEventType
  }
  
  @js.native
  sealed trait SessionState extends StObject
  @JSImport("playable/dist/src/testkit/chomecast-api-mock", "SessionState")
  @js.native
  object SessionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SessionState & String] = js.native
    
    @js.native
    sealed trait NO_SESSION
      extends StObject
         with SessionState
    /* "NO_SESSION" */ val NO_SESSION: typings.playable.chomecastApiMockMod.SessionState.NO_SESSION & String = js.native
    
    @js.native
    sealed trait SESSION_ENDED
      extends StObject
         with SessionState
    /* "SESSION_ENDED" */ val SESSION_ENDED: typings.playable.chomecastApiMockMod.SessionState.SESSION_ENDED & String = js.native
    
    @js.native
    sealed trait SESSION_ENDING
      extends StObject
         with SessionState
    /* "SESSION_ENDING" */ val SESSION_ENDING: typings.playable.chomecastApiMockMod.SessionState.SESSION_ENDING & String = js.native
    
    @js.native
    sealed trait SESSION_RESUMED
      extends StObject
         with SessionState
    /* "SESSION_RESUMED" */ val SESSION_RESUMED: typings.playable.chomecastApiMockMod.SessionState.SESSION_RESUMED & String = js.native
    
    @js.native
    sealed trait SESSION_STARTED
      extends StObject
         with SessionState
    /* "SESSION_STARTED" */ val SESSION_STARTED: typings.playable.chomecastApiMockMod.SessionState.SESSION_STARTED & String = js.native
    
    @js.native
    sealed trait SESSION_STARTING
      extends StObject
         with SessionState
    /* "SESSION_STARTING" */ val SESSION_STARTING: typings.playable.chomecastApiMockMod.SessionState.SESSION_STARTING & String = js.native
    
    @js.native
    sealed trait SESSION_START_FAILED
      extends StObject
         with SessionState
    /* "SESSION_START_FAILED" */ val SESSION_START_FAILED: typings.playable.chomecastApiMockMod.SessionState.SESSION_START_FAILED & String = js.native
  }
  
  @JSImport("playable/dist/src/testkit/chomecast-api-mock", "WindowCastAPIMock")
  @js.native
  open class WindowCastAPIMock () extends StObject {
    
    var framework: CastTestFramework = js.native
  }
  object WindowCastAPIMock {
    
    @JSImport("playable/dist/src/testkit/chomecast-api-mock", "WindowCastAPIMock")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
    
    /* static member */
    inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  }
  
  @JSImport("playable/dist/src/testkit/chomecast-api-mock", "WindowChromeAPIMock")
  @js.native
  open class WindowChromeAPIMock () extends StObject {
    
    def cast: AutoJoinPolicy = js.native
  }
  
  @js.native
  sealed trait eventType extends StObject
  @JSImport("playable/dist/src/testkit/chomecast-api-mock", "eventType")
  @js.native
  object eventType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[eventType & String] = js.native
    
    @js.native
    sealed trait CAST_STATE_CHANGED
      extends StObject
         with eventType
    /* "caststatechanged" */ val CAST_STATE_CHANGED: typings.playable.chomecastApiMockMod.eventType.CAST_STATE_CHANGED & String = js.native
    
    @js.native
    sealed trait SESSION_STATE_CHANGED
      extends StObject
         with eventType
    /* "sessionstatechanged" */ val SESSION_STATE_CHANGED: typings.playable.chomecastApiMockMod.eventType.SESSION_STATE_CHANGED & String = js.native
  }
  
  @js.native
  trait CastContext
    extends StObject
       with Publisher {
    
    var _estimatedTime: Double = js.native
    
    def getCurrentSession(): GetMediaSession = js.native
    
    def list: StringDictionary[js.Array[js.Function]] = js.native
    
    def setOptions(): Unit = js.native
  }
  
  trait Publisher extends StObject {
    
    /* protected */ var _listeners: StringDictionary[js.Array[js.Function]]
    
    def addEventListener(`type`: eventType, func: js.Function): Unit
    
    def trigger(`type`: eventType, event: Any): Unit
  }
  object Publisher {
    
    inline def apply(
      _listeners: StringDictionary[js.Array[js.Function]],
      addEventListener: (eventType, js.Function) => Unit,
      trigger: (eventType, Any) => Unit
    ): Publisher = {
      val __obj = js.Dynamic.literal(_listeners = _listeners.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), trigger = js.Any.fromFunction2(trigger))
      __obj.asInstanceOf[Publisher]
    }
    
    extension [Self <: Publisher](x: Self) {
      
      inline def setAddEventListener(value: (eventType, js.Function) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      inline def setTrigger(value: (eventType, Any) => Unit): Self = StObject.set(x, "trigger", js.Any.fromFunction2(value))
      
      inline def set_listeners(value: StringDictionary[js.Array[js.Function]]): Self = StObject.set(x, "_listeners", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemotePlayer extends StObject {
    
    var currentTime: Double
  }
  object RemotePlayer {
    
    inline def apply(currentTime: Double): RemotePlayer = {
      val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemotePlayer]
    }
    
    extension [Self <: RemotePlayer](x: Self) {
      
      inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemotePlayerController
    extends StObject
       with Publisher {
    
    var player: RemotePlayer
    
    def seek(): Unit
    
    def setVolumeLevel(): Unit
  }
  object RemotePlayerController {
    
    inline def apply(
      _listeners: StringDictionary[js.Array[js.Function]],
      addEventListener: (eventType, js.Function) => Unit,
      player: RemotePlayer,
      seek: () => Unit,
      setVolumeLevel: () => Unit,
      trigger: (eventType, Any) => Unit
    ): RemotePlayerController = {
      val __obj = js.Dynamic.literal(_listeners = _listeners.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), player = player.asInstanceOf[js.Any], seek = js.Any.fromFunction0(seek), setVolumeLevel = js.Any.fromFunction0(setVolumeLevel), trigger = js.Any.fromFunction2(trigger))
      __obj.asInstanceOf[RemotePlayerController]
    }
    
    extension [Self <: RemotePlayerController](x: Self) {
      
      inline def setPlayer(value: RemotePlayer): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
      
      inline def setSeek(value: () => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction0(value))
      
      inline def setSetVolumeLevel(value: () => Unit): Self = StObject.set(x, "setVolumeLevel", js.Any.fromFunction0(value))
    }
  }
}
