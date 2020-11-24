package typings.playable.chomecastApiMockMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SessionState extends js.Object
@JSImport("playable/dist/src/testkit/chomecast-api-mock", "SessionState")
@js.native
object SessionState extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SessionState with String] = js.native
  
  @js.native
  sealed trait NO_SESSION extends SessionState
  /* "NO_SESSION" */ @js.native
  object NO_SESSION extends TopLevel[NO_SESSION with String]
  
  @js.native
  sealed trait SESSION_ENDED extends SessionState
  /* "SESSION_ENDED" */ @js.native
  object SESSION_ENDED extends TopLevel[SESSION_ENDED with String]
  
  @js.native
  sealed trait SESSION_ENDING extends SessionState
  /* "SESSION_ENDING" */ @js.native
  object SESSION_ENDING extends TopLevel[SESSION_ENDING with String]
  
  @js.native
  sealed trait SESSION_RESUMED extends SessionState
  /* "SESSION_RESUMED" */ @js.native
  object SESSION_RESUMED extends TopLevel[SESSION_RESUMED with String]
  
  @js.native
  sealed trait SESSION_STARTED extends SessionState
  /* "SESSION_STARTED" */ @js.native
  object SESSION_STARTED extends TopLevel[SESSION_STARTED with String]
  
  @js.native
  sealed trait SESSION_STARTING extends SessionState
  /* "SESSION_STARTING" */ @js.native
  object SESSION_STARTING extends TopLevel[SESSION_STARTING with String]
  
  @js.native
  sealed trait SESSION_START_FAILED extends SessionState
  /* "SESSION_START_FAILED" */ @js.native
  object SESSION_START_FAILED extends TopLevel[SESSION_START_FAILED with String]
}
