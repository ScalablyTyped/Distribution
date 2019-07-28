package typings.nodeDashSnap7.nodeDashSnap7Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Status extends js.Object

@JSImport("node-snap7", "Status")
@js.native
object Status extends js.Object {
  @js.native
  sealed trait S7CpuStatusRun extends Status
  
  @js.native
  sealed trait S7CpuStatusStop extends Status
  
  @js.native
  sealed trait S7CpuStatusUnknown extends Status
  
  /* 0x08 */ val S7CpuStatusRun: typings.nodeDashSnap7.nodeDashSnap7Mod.Status.S7CpuStatusRun with Double = js.native
  /* 0x04 */ val S7CpuStatusStop: typings.nodeDashSnap7.nodeDashSnap7Mod.Status.S7CpuStatusStop with Double = js.native
  /* 0x00 */ val S7CpuStatusUnknown: typings.nodeDashSnap7.nodeDashSnap7Mod.Status.S7CpuStatusUnknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status with Double] = js.native
}

