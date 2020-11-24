package typings.nodeSnap7.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParamNumber extends js.Object
@JSImport("node-snap7", "ParamNumber")
@js.native
object ParamNumber extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParamNumber with Double] = js.native
  
  @js.native
  sealed trait DstRef extends ParamNumber
  /* 8 */ @js.native
  object DstRef extends TopLevel[DstRef with Double]
  
  @js.native
  sealed trait PDURequest extends ParamNumber
  /* 10 */ @js.native
  object PDURequest extends TopLevel[PDURequest with Double]
  
  @js.native
  sealed trait PingTimeout extends ParamNumber
  /* 3 */ @js.native
  object PingTimeout extends TopLevel[PingTimeout with Double]
  
  @js.native
  sealed trait RecvTimeout extends ParamNumber
  /* 5 */ @js.native
  object RecvTimeout extends TopLevel[RecvTimeout with Double]
  
  @js.native
  sealed trait RemotePort extends ParamNumber
  /* 2 */ @js.native
  object RemotePort extends TopLevel[RemotePort with Double]
  
  @js.native
  sealed trait SendTimeout extends ParamNumber
  /* 4 */ @js.native
  object SendTimeout extends TopLevel[SendTimeout with Double]
  
  @js.native
  sealed trait SrcRef extends ParamNumber
  /* 7 */ @js.native
  object SrcRef extends TopLevel[SrcRef with Double]
  
  @js.native
  sealed trait SrcTSap extends ParamNumber
  /* 9 */ @js.native
  object SrcTSap extends TopLevel[SrcTSap with Double]
}
