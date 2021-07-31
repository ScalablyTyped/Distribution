package typings.mongorito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DatabaseState extends StObject
@JSImport("mongorito", "DatabaseState")
@js.native
object DatabaseState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DatabaseState & Double] = js.native
  
  @js.native
  sealed trait STATE_CONNECTED
    extends StObject
       with DatabaseState
  /* 0 */ val STATE_CONNECTED: typings.mongorito.mod.DatabaseState.STATE_CONNECTED & Double = js.native
  
  @js.native
  sealed trait STATE_CONNECTING
    extends StObject
       with DatabaseState
  /* 1 */ val STATE_CONNECTING: typings.mongorito.mod.DatabaseState.STATE_CONNECTING & Double = js.native
  
  @js.native
  sealed trait STATE_DISCONNECTED
    extends StObject
       with DatabaseState
  /* 2 */ val STATE_DISCONNECTED: typings.mongorito.mod.DatabaseState.STATE_DISCONNECTED & Double = js.native
}
