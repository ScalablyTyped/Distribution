package typings.nodeSnap7.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Status extends StObject
@JSImport("node-snap7", "Status")
@js.native
object Status extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status & Double] = js.native
  
  @js.native
  sealed trait S7CpuStatusRun
    extends StObject
       with Status
  /* 0x08 */ val S7CpuStatusRun: typings.nodeSnap7.mod.Status.S7CpuStatusRun & Double = js.native
  
  @js.native
  sealed trait S7CpuStatusStop
    extends StObject
       with Status
  /* 0x04 */ val S7CpuStatusStop: typings.nodeSnap7.mod.Status.S7CpuStatusStop & Double = js.native
  
  @js.native
  sealed trait S7CpuStatusUnknown
    extends StObject
       with Status
  /* 0x00 */ val S7CpuStatusUnknown: typings.nodeSnap7.mod.Status.S7CpuStatusUnknown & Double = js.native
}
