package typings.nodeDashSnap7.nodeDashSnap7Mod

import org.scalablytyped.runtime.TopLevel
import typings.nodeDashSnap7.nodeDashSnap7Mod.Area.S7AreaCT
import typings.nodeDashSnap7.nodeDashSnap7Mod.Area.S7AreaDB
import typings.nodeDashSnap7.nodeDashSnap7Mod.Area.S7AreaMK
import typings.nodeDashSnap7.nodeDashSnap7Mod.Area.S7AreaPA
import typings.nodeDashSnap7.nodeDashSnap7Mod.Area.S7AreaPE
import typings.nodeDashSnap7.nodeDashSnap7Mod.Area.S7AreaTM
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Area with Double] = js.native
  /* 0x1C */ @js.native
  object S7AreaCT extends TopLevel[S7AreaCT with Double]
  
  /* 0x84 */ @js.native
  object S7AreaDB extends TopLevel[S7AreaDB with Double]
  
  /* 0x83 */ @js.native
  object S7AreaMK extends TopLevel[S7AreaMK with Double]
  
  /* 0x82 */ @js.native
  object S7AreaPA extends TopLevel[S7AreaPA with Double]
  
  /* 0x81 */ @js.native
  object S7AreaPE extends TopLevel[S7AreaPE with Double]
  
  /* 0x1D */ @js.native
  object S7AreaTM extends TopLevel[S7AreaTM with Double]
  
}

