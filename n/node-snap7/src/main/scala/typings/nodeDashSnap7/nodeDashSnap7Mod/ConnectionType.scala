package typings.nodeDashSnap7.nodeDashSnap7Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectionType extends js.Object

@JSImport("node-snap7", "ConnectionType")
@js.native
object ConnectionType extends js.Object {
  @js.native
  sealed trait CONNTYPE_BASIC extends ConnectionType
  
  @js.native
  sealed trait CONNTYPE_OP extends ConnectionType
  
  @js.native
  sealed trait CONNTYPE_PG extends ConnectionType
  
  /* 0x03 */ val CONNTYPE_BASIC: typings.nodeDashSnap7.nodeDashSnap7Mod.ConnectionType.CONNTYPE_BASIC with Double = js.native
  /* 0x02 */ val CONNTYPE_OP: typings.nodeDashSnap7.nodeDashSnap7Mod.ConnectionType.CONNTYPE_OP with Double = js.native
  /* 0x01 */ val CONNTYPE_PG: typings.nodeDashSnap7.nodeDashSnap7Mod.ConnectionType.CONNTYPE_PG with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectionType with Double] = js.native
}

