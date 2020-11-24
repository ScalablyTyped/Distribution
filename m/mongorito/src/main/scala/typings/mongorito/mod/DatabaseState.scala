package typings.mongorito.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DatabaseState extends js.Object
@JSImport("mongorito", "DatabaseState")
@js.native
object DatabaseState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DatabaseState with Double] = js.native
  
  @js.native
  sealed trait STATE_CONNECTED extends DatabaseState
  /* 0 */ @js.native
  object STATE_CONNECTED extends TopLevel[STATE_CONNECTED with Double]
  
  @js.native
  sealed trait STATE_CONNECTING extends DatabaseState
  /* 1 */ @js.native
  object STATE_CONNECTING extends TopLevel[STATE_CONNECTING with Double]
  
  @js.native
  sealed trait STATE_DISCONNECTED extends DatabaseState
  /* 2 */ @js.native
  object STATE_DISCONNECTED extends TopLevel[STATE_DISCONNECTED with Double]
}
