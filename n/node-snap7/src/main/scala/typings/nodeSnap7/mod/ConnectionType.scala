package typings.nodeSnap7.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectionType extends StObject
@JSImport("node-snap7", "ConnectionType")
@js.native
object ConnectionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectionType with Double] = js.native
  
  @js.native
  sealed trait CONNTYPE_BASIC extends ConnectionType
  /* 0x03 */ val CONNTYPE_BASIC: typings.nodeSnap7.mod.ConnectionType.CONNTYPE_BASIC with Double = js.native
  
  @js.native
  sealed trait CONNTYPE_OP extends ConnectionType
  /* 0x02 */ val CONNTYPE_OP: typings.nodeSnap7.mod.ConnectionType.CONNTYPE_OP with Double = js.native
  
  @js.native
  sealed trait CONNTYPE_PG extends ConnectionType
  /* 0x01 */ val CONNTYPE_PG: typings.nodeSnap7.mod.ConnectionType.CONNTYPE_PG with Double = js.native
}
