package typings
package nodeDashSnap7Lib.nodeDashSnap7Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Status extends js.Object

@JSImport("node-snap7", "Status")
@js.native
object Status extends js.Object {
  @js.native
  sealed trait S7CpuStatusRun
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.Status
  
  @js.native
  sealed trait S7CpuStatusStop
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.Status
  
  @js.native
  sealed trait S7CpuStatusUnknown
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.Status
  
  /* 0x08 */ val S7CpuStatusRun: S7CpuStatusRun with scala.Double = js.native
  /* 0x04 */ val S7CpuStatusStop: S7CpuStatusStop with scala.Double = js.native
  /* 0x00 */ val S7CpuStatusUnknown: S7CpuStatusUnknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[nodeDashSnap7Lib.nodeDashSnap7Mod.Status with scala.Double] = js.native
}

