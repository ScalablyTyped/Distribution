package typings.playable

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.playable.anon.AutoJoinPolicy
import typings.playable.anon.GetInstance
import typings.playable.anon.GetMediaSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chomecastApiMockMod {
  
  @JSImport("playable/dist/src/testkit/chomecast-api-mock", "CastTestFramework")
  @js.native
  class CastTestFramework () extends StObject {
    
    def CastContext: GetInstance = js.native
    
    def CastContextEventType: js.Any = js.native
    
    var RemotePlayer: Instantiable0[typings.playable.chomecastApiMockMod.RemotePlayer] = js.native
    
    var RemotePlayerController: Instantiable1[
        /* player */ RemotePlayer, 
        typings.playable.chomecastApiMockMod.RemotePlayerController
      ] = js.native
    
    def RemotePlayerEventType: js.Any = js.native
    
    def SessionState: js.Any = js.native
    
    var _context: js.Any = js.native
    
    def context: CastContext = js.native
    
    def trigger(`type`: eventType, event: js.Any): Unit = js.native
  }
  
  @js.native
  sealed trait RemotePlayerEventType extends StObject
  @JSImport("playable/dist/src/testkit/chomecast-api-mock", "RemotePlayerEventType")
  @js.native
  object RemotePlayerEventType extends StObject {
    
    @js.native
    sealed trait ANY_CHANGE extends RemotePlayerEventType
    
    @js.native
    sealed trait IS_PAUSED_CHANGED extends RemotePlayerEventType
  }
  
  @js.native
  sealed trait SessionState extends StObject
  @JSImport("playable/dist/src/testkit/chomecast-api-mock", "SessionState")
  @js.native
  object SessionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SessionState with String] = js.native
    
    @js.native
    sealed trait NO_SESSION extends SessionState
    /* "NO_SESSION" */ val NO_SESSION: typings.playable.chomecastApiMockMod.SessionState.NO_SESSION with String = js.native
    
    @js.native
    sealed trait SESSION_ENDED extends SessionState
    /* "SESSION_ENDED" */ val SESSION_ENDED: typings.playable.chomecastApiMockMod.SessionState.SESSION_ENDED with String = js.native
    
    @js.native
    sealed trait SESSION_ENDING extends SessionState
    /* "SESSION_ENDING" */ val SESSION_ENDING: typings.playable.chomecastApiMockMod.SessionState.SESSION_ENDING with String = js.native
    
    @js.native
    sealed trait SESSION_RESUMED extends SessionState
    /* "SESSION_RESUMED" */ val SESSION_RESUMED: typings.playable.chomecastApiMockMod.SessionState.SESSION_RESUMED with String = js.native
    
    @js.native
    sealed trait SESSION_STARTED extends SessionState
    /* "SESSION_STARTED" */ val SESSION_STARTED: typings.playable.chomecastApiMockMod.SessionState.SESSION_STARTED with String = js.native
    
    @js.native
    sealed trait SESSION_STARTING extends SessionState
    /* "SESSION_STARTING" */ val SESSION_STARTING: typings.playable.chomecastApiMockMod.SessionState.SESSION_STARTING with String = js.native
    
    @js.native
    sealed trait SESSION_START_FAILED extends SessionState
    /* "SESSION_START_FAILED" */ val SESSION_START_FAILED: typings.playable.chomecastApiMockMod.SessionState.SESSION_START_FAILED with String = js.native
  }
  
  @JSImport("playable/dist/src/testkit/chomecast-api-mock", "WindowCastAPIMock")
  @js.native
  class WindowCastAPIMock () extends StObject {
    
    var framework: CastTestFramework = js.native
  }
  object WindowCastAPIMock {
    
    /* static member */
    @JSImport("playable/dist/src/testkit/chomecast-api-mock", "WindowCastAPIMock.init")
    @js.native
    def init(): Unit = js.native
    
    /* static member */
    @JSImport("playable/dist/src/testkit/chomecast-api-mock", "WindowCastAPIMock.reset")
    @js.native
    def reset(): Unit = js.native
  }
  
  @JSImport("playable/dist/src/testkit/chomecast-api-mock", "WindowChromeAPIMock")
  @js.native
  class WindowChromeAPIMock () extends StObject {
    
    def cast: AutoJoinPolicy = js.native
  }
  
  @js.native
  sealed trait eventType extends StObject
  @JSImport("playable/dist/src/testkit/chomecast-api-mock", "eventType")
  @js.native
  object eventType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[eventType with String] = js.native
    
    @js.native
    sealed trait CAST_STATE_CHANGED extends eventType
    /* "caststatechanged" */ val CAST_STATE_CHANGED: typings.playable.chomecastApiMockMod.eventType.CAST_STATE_CHANGED with String = js.native
    
    @js.native
    sealed trait SESSION_STATE_CHANGED extends eventType
    /* "sessionstatechanged" */ val SESSION_STATE_CHANGED: typings.playable.chomecastApiMockMod.eventType.SESSION_STATE_CHANGED with String = js.native
  }
  
  @js.native
  trait CastContext extends Publisher {
    
    var _estimatedTime: Double = js.native
    
    def getCurrentSession(): GetMediaSession = js.native
    
    def list: StringDictionary[js.Array[js.Function]] = js.native
    
    def setOptions(): Unit = js.native
  }
  
  @js.native
  trait Publisher extends StObject {
    
    var _listeners: StringDictionary[js.Array[js.Function]] = js.native
    
    def addEventListener(`type`: eventType, func: js.Function): Unit = js.native
    
    def trigger(`type`: eventType, event: js.Any): Unit = js.native
  }
  object Publisher {
    
    @scala.inline
    def apply(
      _listeners: StringDictionary[js.Array[js.Function]],
      addEventListener: (eventType, js.Function) => Unit,
      trigger: (eventType, js.Any) => Unit
    ): Publisher = {
      val __obj = js.Dynamic.literal(_listeners = _listeners.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), trigger = js.Any.fromFunction2(trigger))
      __obj.asInstanceOf[Publisher]
    }
    
    @scala.inline
    implicit class PublisherMutableBuilder[Self <: Publisher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddEventListener(value: (eventType, js.Function) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTrigger(value: (eventType, js.Any) => Unit): Self = StObject.set(x, "trigger", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_listeners(value: StringDictionary[js.Array[js.Function]]): Self = StObject.set(x, "_listeners", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RemotePlayer extends StObject {
    
    var currentTime: Double = js.native
  }
  object RemotePlayer {
    
    @scala.inline
    def apply(currentTime: Double): RemotePlayer = {
      val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemotePlayer]
    }
    
    @scala.inline
    implicit class RemotePlayerMutableBuilder[Self <: RemotePlayer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RemotePlayerController extends Publisher {
    
    var player: RemotePlayer = js.native
    
    def seek(): Unit = js.native
    
    def setVolumeLevel(): Unit = js.native
  }
  object RemotePlayerController {
    
    @scala.inline
    def apply(
      _listeners: StringDictionary[js.Array[js.Function]],
      addEventListener: (eventType, js.Function) => Unit,
      player: RemotePlayer,
      seek: () => Unit,
      setVolumeLevel: () => Unit,
      trigger: (eventType, js.Any) => Unit
    ): RemotePlayerController = {
      val __obj = js.Dynamic.literal(_listeners = _listeners.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), player = player.asInstanceOf[js.Any], seek = js.Any.fromFunction0(seek), setVolumeLevel = js.Any.fromFunction0(setVolumeLevel), trigger = js.Any.fromFunction2(trigger))
      __obj.asInstanceOf[RemotePlayerController]
    }
    
    @scala.inline
    implicit class RemotePlayerControllerMutableBuilder[Self <: RemotePlayerController] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlayer(value: RemotePlayer): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeek(value: () => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetVolumeLevel(value: () => Unit): Self = StObject.set(x, "setVolumeLevel", js.Any.fromFunction0(value))
    }
  }
}
