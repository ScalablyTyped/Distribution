package typings.mongoose.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectionStates extends js.Object

@JSImport("mongoose", "ConnectionStates")
@js.native
object ConnectionStates extends js.Object {
  @js.native
  sealed trait connected extends ConnectionStates
  
  @js.native
  sealed trait connecting extends ConnectionStates
  
  @js.native
  sealed trait disconnected extends ConnectionStates
  
  @js.native
  sealed trait disconnecting extends ConnectionStates
  
  @js.native
  sealed trait uninitialized extends ConnectionStates
  
  /* 1 */ val connected: typings.mongoose.mongooseMod.ConnectionStates.connected with Double = js.native
  /* 2 */ val connecting: typings.mongoose.mongooseMod.ConnectionStates.connecting with Double = js.native
  /* 0 */ val disconnected: typings.mongoose.mongooseMod.ConnectionStates.disconnected with Double = js.native
  /* 3 */ val disconnecting: typings.mongoose.mongooseMod.ConnectionStates.disconnecting with Double = js.native
  /* 99 */ val uninitialized: typings.mongoose.mongooseMod.ConnectionStates.uninitialized with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectionStates with Double] = js.native
}

