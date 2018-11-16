package typings
package nodeDashSnap7Lib.nodeDashSnap7Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Area extends js.Object

@JSImport("node-snap7", "Area")
@js.native
object Area extends js.Object {
  @js.native
  sealed trait S7AreaCT
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.Area
  
  @js.native
  sealed trait S7AreaDB
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.Area
  
  @js.native
  sealed trait S7AreaMK
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.Area
  
  @js.native
  sealed trait S7AreaPA
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.Area
  
  @js.native
  sealed trait S7AreaPE
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.Area
  
  @js.native
  sealed trait S7AreaTM
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.Area
  
  /* 0x1C */ val S7AreaCT: S7AreaCT with scala.Double = js.native
  /* 0x84 */ val S7AreaDB: S7AreaDB with scala.Double = js.native
  /* 0x83 */ val S7AreaMK: S7AreaMK with scala.Double = js.native
  /* 0x82 */ val S7AreaPA: S7AreaPA with scala.Double = js.native
  /* 0x81 */ val S7AreaPE: S7AreaPE with scala.Double = js.native
  /* 0x1D */ val S7AreaTM: S7AreaTM with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[nodeDashSnap7Lib.nodeDashSnap7Mod.Area with scala.Double] = js.native
}

