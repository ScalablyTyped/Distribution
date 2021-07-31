package typings.nodeSnap7.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectionType extends StObject
@JSImport("node-snap7", "ConnectionType")
@js.native
object ConnectionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectionType & Double] = js.native
  
  @js.native
  sealed trait CONNTYPE_BASIC
    extends StObject
       with ConnectionType
  /* 0x03 */ val CONNTYPE_BASIC: typings.nodeSnap7.mod.ConnectionType.CONNTYPE_BASIC & Double = js.native
  
  @js.native
  sealed trait CONNTYPE_OP
    extends StObject
       with ConnectionType
  /* 0x02 */ val CONNTYPE_OP: typings.nodeSnap7.mod.ConnectionType.CONNTYPE_OP & Double = js.native
  
  @js.native
  sealed trait CONNTYPE_PG
    extends StObject
       with ConnectionType
  /* 0x01 */ val CONNTYPE_PG: typings.nodeSnap7.mod.ConnectionType.CONNTYPE_PG & Double = js.native
}
