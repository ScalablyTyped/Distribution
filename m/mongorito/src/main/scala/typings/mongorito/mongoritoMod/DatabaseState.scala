package typings.mongorito.mongoritoMod

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
  
  /* 0 */ val STATE_CONNECTED: typings.mongorito.mongoritoMod.DatabaseState.STATE_CONNECTED with Double = js.native
  /* 1 */ val STATE_CONNECTING: typings.mongorito.mongoritoMod.DatabaseState.STATE_CONNECTING with Double = js.native
  /* 2 */ val STATE_DISCONNECTED: typings.mongorito.mongoritoMod.DatabaseState.STATE_DISCONNECTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DatabaseState with Double] = js.native
}

