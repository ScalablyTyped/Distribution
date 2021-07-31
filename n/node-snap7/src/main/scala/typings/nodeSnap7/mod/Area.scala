package typings.nodeSnap7.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Area extends StObject
@JSImport("node-snap7", "Area")
@js.native
object Area extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Area & Double] = js.native
  
  @js.native
  sealed trait S7AreaCT
    extends StObject
       with Area
  /* 0x1C */ val S7AreaCT: typings.nodeSnap7.mod.Area.S7AreaCT & Double = js.native
  
  @js.native
  sealed trait S7AreaDB
    extends StObject
       with Area
  /* 0x84 */ val S7AreaDB: typings.nodeSnap7.mod.Area.S7AreaDB & Double = js.native
  
  @js.native
  sealed trait S7AreaMK
    extends StObject
       with Area
  /* 0x83 */ val S7AreaMK: typings.nodeSnap7.mod.Area.S7AreaMK & Double = js.native
  
  @js.native
  sealed trait S7AreaPA
    extends StObject
       with Area
  /* 0x82 */ val S7AreaPA: typings.nodeSnap7.mod.Area.S7AreaPA & Double = js.native
  
  @js.native
  sealed trait S7AreaPE
    extends StObject
       with Area
  /* 0x81 */ val S7AreaPE: typings.nodeSnap7.mod.Area.S7AreaPE & Double = js.native
  
  @js.native
  sealed trait S7AreaTM
    extends StObject
       with Area
  /* 0x1D */ val S7AreaTM: typings.nodeSnap7.mod.Area.S7AreaTM & Double = js.native
}
