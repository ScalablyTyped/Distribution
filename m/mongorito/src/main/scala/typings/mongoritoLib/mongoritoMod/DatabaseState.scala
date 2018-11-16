package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DatabaseState extends js.Object

@JSImport("mongorito", "DatabaseState")
@js.native
object DatabaseState extends js.Object {
  @js.native
  sealed trait STATE_CONNECTED
    extends mongoritoLib.mongoritoMod.DatabaseState
  
  @js.native
  sealed trait STATE_CONNECTING
    extends mongoritoLib.mongoritoMod.DatabaseState
  
  @js.native
  sealed trait STATE_DISCONNECTED
    extends mongoritoLib.mongoritoMod.DatabaseState
  
  /* 0 */ val STATE_CONNECTED: STATE_CONNECTED with scala.Double = js.native
  /* 1 */ val STATE_CONNECTING: STATE_CONNECTING with scala.Double = js.native
  /* 2 */ val STATE_DISCONNECTED: STATE_DISCONNECTED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mongoritoLib.mongoritoMod.DatabaseState with scala.Double] = js.native
}

