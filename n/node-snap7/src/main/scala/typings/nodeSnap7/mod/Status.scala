package typings.nodeSnap7.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Status extends js.Object
@JSImport("node-snap7", "Status")
@js.native
object Status extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status with Double] = js.native
  
  @js.native
  sealed trait S7CpuStatusRun extends Status
  /* 0x08 */ @js.native
  object S7CpuStatusRun extends TopLevel[S7CpuStatusRun with Double]
  
  @js.native
  sealed trait S7CpuStatusStop extends Status
  /* 0x04 */ @js.native
  object S7CpuStatusStop extends TopLevel[S7CpuStatusStop with Double]
  
  @js.native
  sealed trait S7CpuStatusUnknown extends Status
  /* 0x00 */ @js.native
  object S7CpuStatusUnknown extends TopLevel[S7CpuStatusUnknown with Double]
}
