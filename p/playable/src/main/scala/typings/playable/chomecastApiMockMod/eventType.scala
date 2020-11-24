package typings.playable.chomecastApiMockMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait eventType extends js.Object
@JSImport("playable/dist/src/testkit/chomecast-api-mock", "eventType")
@js.native
object eventType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[eventType with String] = js.native
  
  @js.native
  sealed trait CAST_STATE_CHANGED extends eventType
  /* "caststatechanged" */ @js.native
  object CAST_STATE_CHANGED extends TopLevel[CAST_STATE_CHANGED with String]
  
  @js.native
  sealed trait SESSION_STATE_CHANGED extends eventType
  /* "sessionstatechanged" */ @js.native
  object SESSION_STATE_CHANGED extends TopLevel[SESSION_STATE_CHANGED with String]
}
