package typings.nodeSnap7.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParamNumber extends StObject
@JSImport("node-snap7", "ParamNumber")
@js.native
object ParamNumber extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParamNumber & Double] = js.native
  
  @js.native
  sealed trait DstRef
    extends StObject
       with ParamNumber
  /* 8 */ val DstRef: typings.nodeSnap7.mod.ParamNumber.DstRef & Double = js.native
  
  @js.native
  sealed trait PDURequest
    extends StObject
       with ParamNumber
  /* 10 */ val PDURequest: typings.nodeSnap7.mod.ParamNumber.PDURequest & Double = js.native
  
  @js.native
  sealed trait PingTimeout
    extends StObject
       with ParamNumber
  /* 3 */ val PingTimeout: typings.nodeSnap7.mod.ParamNumber.PingTimeout & Double = js.native
  
  @js.native
  sealed trait RecvTimeout
    extends StObject
       with ParamNumber
  /* 5 */ val RecvTimeout: typings.nodeSnap7.mod.ParamNumber.RecvTimeout & Double = js.native
  
  @js.native
  sealed trait RemotePort
    extends StObject
       with ParamNumber
  /* 2 */ val RemotePort: typings.nodeSnap7.mod.ParamNumber.RemotePort & Double = js.native
  
  @js.native
  sealed trait SendTimeout
    extends StObject
       with ParamNumber
  /* 4 */ val SendTimeout: typings.nodeSnap7.mod.ParamNumber.SendTimeout & Double = js.native
  
  @js.native
  sealed trait SrcRef
    extends StObject
       with ParamNumber
  /* 7 */ val SrcRef: typings.nodeSnap7.mod.ParamNumber.SrcRef & Double = js.native
  
  @js.native
  sealed trait SrcTSap
    extends StObject
       with ParamNumber
  /* 9 */ val SrcTSap: typings.nodeSnap7.mod.ParamNumber.SrcTSap & Double = js.native
}
