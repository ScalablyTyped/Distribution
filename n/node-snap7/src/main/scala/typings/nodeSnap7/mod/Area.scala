package typings.nodeSnap7.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Area extends js.Object
@JSImport("node-snap7", "Area")
@js.native
object Area extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Area with Double] = js.native
  
  @js.native
  sealed trait S7AreaCT extends Area
  /* 0x1C */ @js.native
  object S7AreaCT extends TopLevel[S7AreaCT with Double]
  
  @js.native
  sealed trait S7AreaDB extends Area
  /* 0x84 */ @js.native
  object S7AreaDB extends TopLevel[S7AreaDB with Double]
  
  @js.native
  sealed trait S7AreaMK extends Area
  /* 0x83 */ @js.native
  object S7AreaMK extends TopLevel[S7AreaMK with Double]
  
  @js.native
  sealed trait S7AreaPA extends Area
  /* 0x82 */ @js.native
  object S7AreaPA extends TopLevel[S7AreaPA with Double]
  
  @js.native
  sealed trait S7AreaPE extends Area
  /* 0x81 */ @js.native
  object S7AreaPE extends TopLevel[S7AreaPE with Double]
  
  @js.native
  sealed trait S7AreaTM extends Area
  /* 0x1D */ @js.native
  object S7AreaTM extends TopLevel[S7AreaTM with Double]
}
