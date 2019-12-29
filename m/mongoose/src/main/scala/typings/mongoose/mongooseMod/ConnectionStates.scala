package typings.mongoose.mongooseMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectionStates with Double] = js.native
  /* 1 */ @js.native
  object connected extends TopLevel[connected with Double]
  
  /* 2 */ @js.native
  object connecting extends TopLevel[connecting with Double]
  
  /* 0 */ @js.native
  object disconnected extends TopLevel[disconnected with Double]
  
  /* 3 */ @js.native
  object disconnecting extends TopLevel[disconnecting with Double]
  
  /* 99 */ @js.native
  object uninitialized extends TopLevel[uninitialized with Double]
  
}

