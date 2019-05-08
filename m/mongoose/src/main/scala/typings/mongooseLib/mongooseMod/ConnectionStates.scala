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
  
}

