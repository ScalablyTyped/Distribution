package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectionStates extends js.Object

@JSImport("mongoose", "ConnectionStates")
@js.native
object ConnectionStates extends js.Object {
  @js.native
  sealed trait connected
    extends mongooseLib.mongooseMod.ConnectionStates
  
  @js.native
  sealed trait connecting
    extends mongooseLib.mongooseMod.ConnectionStates
  
  @js.native
  sealed trait disconnected
    extends mongooseLib.mongooseMod.ConnectionStates
  
  @js.native
  sealed trait disconnecting
    extends mongooseLib.mongooseMod.ConnectionStates
  
  @js.native
  sealed trait uninitialized
    extends mongooseLib.mongooseMod.ConnectionStates
  
  /* 1 */ val connected: connected with scala.Double = js.native
  /* 2 */ val connecting: connecting with scala.Double = js.native
  /* 0 */ val disconnected: disconnected with scala.Double = js.native
  /* 3 */ val disconnecting: disconnecting with scala.Double = js.native
  /* 99 */ val uninitialized: uninitialized with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mongooseLib.mongooseMod.ConnectionStates with scala.Double] = js.native
}

