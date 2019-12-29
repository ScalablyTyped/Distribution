package typings.nodeDashSnap7.nodeDashSnap7Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParamNumber extends js.Object

@JSImport("node-snap7", "ParamNumber")
@js.native
object ParamNumber extends js.Object {
  @js.native
  sealed trait DstRef extends ParamNumber
  
  @js.native
  sealed trait PDURequest extends ParamNumber
  
  @js.native
  sealed trait PingTimeout extends ParamNumber
  
  @js.native
  sealed trait RecvTimeout extends ParamNumber
  
  @js.native
  sealed trait RemotePort extends ParamNumber
  
  @js.native
  sealed trait SendTimeout extends ParamNumber
  
  @js.native
  sealed trait SrcRef extends ParamNumber
  
  @js.native
  sealed trait SrcTSap extends ParamNumber
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParamNumber with Double] = js.native
  /* 8 */ @js.native
  object DstRef extends TopLevel[DstRef with Double]
  
  /* 10 */ @js.native
  object PDURequest extends TopLevel[PDURequest with Double]
  
  /* 3 */ @js.native
  object PingTimeout extends TopLevel[PingTimeout with Double]
  
  /* 5 */ @js.native
  object RecvTimeout extends TopLevel[RecvTimeout with Double]
  
  /* 2 */ @js.native
  object RemotePort extends TopLevel[RemotePort with Double]
  
  /* 4 */ @js.native
  object SendTimeout extends TopLevel[SendTimeout with Double]
  
  /* 7 */ @js.native
  object SrcRef extends TopLevel[SrcRef with Double]
  
  /* 9 */ @js.native
  object SrcTSap extends TopLevel[SrcTSap with Double]
  
}

