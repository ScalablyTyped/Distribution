package typings.nodeDashSnap7.nodeDashSnap7Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Area extends js.Object

@JSImport("node-snap7", "Area")
@js.native
object Area extends js.Object {
  @js.native
  sealed trait S7AreaCT extends Area
  
  @js.native
  sealed trait S7AreaDB extends Area
  
  @js.native
  sealed trait S7AreaMK extends Area
  
  @js.native
  sealed trait S7AreaPA extends Area
  
  @js.native
  sealed trait S7AreaPE extends Area
  
  @js.native
  sealed trait S7AreaTM extends Area
  
  /* 0x1C */ val S7AreaCT: typings.nodeDashSnap7.nodeDashSnap7Mod.Area.S7AreaCT with Double = js.native
  /* 0x84 */ val S7AreaDB: typings.nodeDashSnap7.nodeDashSnap7Mod.Area.S7AreaDB with Double = js.native
  /* 0x83 */ val S7AreaMK: typings.nodeDashSnap7.nodeDashSnap7Mod.Area.S7AreaMK with Double = js.native
  /* 0x82 */ val S7AreaPA: typings.nodeDashSnap7.nodeDashSnap7Mod.Area.S7AreaPA with Double = js.native
  /* 0x81 */ val S7AreaPE: typings.nodeDashSnap7.nodeDashSnap7Mod.Area.S7AreaPE with Double = js.native
  /* 0x1D */ val S7AreaTM: typings.nodeDashSnap7.nodeDashSnap7Mod.Area.S7AreaTM with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Area with Double] = js.native
}

