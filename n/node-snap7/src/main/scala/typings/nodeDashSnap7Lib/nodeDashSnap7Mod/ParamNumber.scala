package typings
package nodeDashSnap7Lib.nodeDashSnap7Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParamNumber extends js.Object

@JSImport("node-snap7", "ParamNumber")
@js.native
object ParamNumber extends js.Object {
  @js.native
  sealed trait DstRef
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.ParamNumber
  
  @js.native
  sealed trait PDURequest
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.ParamNumber
  
  @js.native
  sealed trait PingTimeout
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.ParamNumber
  
  @js.native
  sealed trait RecvTimeout
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.ParamNumber
  
  @js.native
  sealed trait RemotePort
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.ParamNumber
  
  @js.native
  sealed trait SendTimeout
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.ParamNumber
  
  @js.native
  sealed trait SrcRef
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.ParamNumber
  
  @js.native
  sealed trait SrcTSap
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.ParamNumber
  
  /* 8 */ val DstRef: DstRef with scala.Double = js.native
  /* 10 */ val PDURequest: PDURequest with scala.Double = js.native
  /* 3 */ val PingTimeout: PingTimeout with scala.Double = js.native
  /* 5 */ val RecvTimeout: RecvTimeout with scala.Double = js.native
  /* 2 */ val RemotePort: RemotePort with scala.Double = js.native
  /* 4 */ val SendTimeout: SendTimeout with scala.Double = js.native
  /* 7 */ val SrcRef: SrcRef with scala.Double = js.native
  /* 9 */ val SrcTSap: SrcTSap with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[nodeDashSnap7Lib.nodeDashSnap7Mod.ParamNumber with scala.Double] = js.native
}

