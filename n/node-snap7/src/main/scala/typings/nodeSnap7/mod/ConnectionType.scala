package typings.nodeSnap7.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectionType extends js.Object
@JSImport("node-snap7", "ConnectionType")
@js.native
object ConnectionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectionType with Double] = js.native
  
  @js.native
  sealed trait CONNTYPE_BASIC extends ConnectionType
  /* 0x03 */ @js.native
  object CONNTYPE_BASIC extends TopLevel[CONNTYPE_BASIC with Double]
  
  @js.native
  sealed trait CONNTYPE_OP extends ConnectionType
  /* 0x02 */ @js.native
  object CONNTYPE_OP extends TopLevel[CONNTYPE_OP with Double]
  
  @js.native
  sealed trait CONNTYPE_PG extends ConnectionType
  /* 0x01 */ @js.native
  object CONNTYPE_PG extends TopLevel[CONNTYPE_PG with Double]
}
