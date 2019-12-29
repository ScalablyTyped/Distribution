package typings.mongorito.mongoritoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DatabaseState extends js.Object

@JSImport("mongorito", "DatabaseState")
@js.native
object DatabaseState extends js.Object {
  @js.native
  sealed trait STATE_CONNECTED extends DatabaseState
  
  @js.native
  sealed trait STATE_CONNECTING extends DatabaseState
  
  @js.native
  sealed trait STATE_DISCONNECTED extends DatabaseState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DatabaseState with Double] = js.native
  /* 0 */ @js.native
  object STATE_CONNECTED extends TopLevel[STATE_CONNECTED with Double]
  
  /* 1 */ @js.native
  object STATE_CONNECTING extends TopLevel[STATE_CONNECTING with Double]
  
  /* 2 */ @js.native
  object STATE_DISCONNECTED extends TopLevel[STATE_DISCONNECTED with Double]
  
}

