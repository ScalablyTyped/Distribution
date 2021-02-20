package typings.nodeSnap7.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParamNumber extends StObject
@JSImport("node-snap7", "ParamNumber")
@js.native
object ParamNumber extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParamNumber with Double] = js.native
  
  @js.native
  sealed trait DstRef extends ParamNumber
  /* 8 */ val DstRef: typings.nodeSnap7.mod.ParamNumber.DstRef with Double = js.native
  
  @js.native
  sealed trait PDURequest extends ParamNumber
  /* 10 */ val PDURequest: typings.nodeSnap7.mod.ParamNumber.PDURequest with Double = js.native
  
  @js.native
  sealed trait PingTimeout extends ParamNumber
  /* 3 */ val PingTimeout: typings.nodeSnap7.mod.ParamNumber.PingTimeout with Double = js.native
  
  @js.native
  sealed trait RecvTimeout extends ParamNumber
  /* 5 */ val RecvTimeout: typings.nodeSnap7.mod.ParamNumber.RecvTimeout with Double = js.native
  
  @js.native
  sealed trait RemotePort extends ParamNumber
  /* 2 */ val RemotePort: typings.nodeSnap7.mod.ParamNumber.RemotePort with Double = js.native
  
  @js.native
  sealed trait SendTimeout extends ParamNumber
  /* 4 */ val SendTimeout: typings.nodeSnap7.mod.ParamNumber.SendTimeout with Double = js.native
  
  @js.native
  sealed trait SrcRef extends ParamNumber
  /* 7 */ val SrcRef: typings.nodeSnap7.mod.ParamNumber.SrcRef with Double = js.native
  
  @js.native
  sealed trait SrcTSap extends ParamNumber
  /* 9 */ val SrcTSap: typings.nodeSnap7.mod.ParamNumber.SrcTSap with Double = js.native
}
