package typings
package nodeDashSnap7Lib.nodeDashSnap7Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectionType extends js.Object

@JSImport("node-snap7", "ConnectionType")
@js.native
object ConnectionType extends js.Object {
  @js.native
  sealed trait CONNTYPE_BASIC
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.ConnectionType
  
  @js.native
  sealed trait CONNTYPE_OP
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.ConnectionType
  
  @js.native
  sealed trait CONNTYPE_PG
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.ConnectionType
  
  /* 0x03 */ val CONNTYPE_BASIC: CONNTYPE_BASIC with scala.Double = js.native
  /* 0x02 */ val CONNTYPE_OP: CONNTYPE_OP with scala.Double = js.native
  /* 0x01 */ val CONNTYPE_PG: CONNTYPE_PG with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[nodeDashSnap7Lib.nodeDashSnap7Mod.ConnectionType with scala.Double] = js.native
}

