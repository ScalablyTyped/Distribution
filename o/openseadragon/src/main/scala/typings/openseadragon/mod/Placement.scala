package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Placement extends StObject
@JSImport("openseadragon", "Placement")
@js.native
object Placement extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Placement with Double] = js.native
  
  @js.native
  sealed trait BOTTOM extends Placement
  /* 6 */ val BOTTOM: typings.openseadragon.mod.Placement.BOTTOM with Double = js.native
  
  @js.native
  sealed trait BOTTOM_LEFT extends Placement
  /* 7 */ val BOTTOM_LEFT: typings.openseadragon.mod.Placement.BOTTOM_LEFT with Double = js.native
  
  @js.native
  sealed trait BOTTOM_RIGHT extends Placement
  /* 5 */ val BOTTOM_RIGHT: typings.openseadragon.mod.Placement.BOTTOM_RIGHT with Double = js.native
  
  @js.native
  sealed trait CENTER extends Placement
  /* 0 */ val CENTER: typings.openseadragon.mod.Placement.CENTER with Double = js.native
  
  @js.native
  sealed trait LEFT extends Placement
  /* 8 */ val LEFT: typings.openseadragon.mod.Placement.LEFT with Double = js.native
  
  @js.native
  sealed trait RIGHT extends Placement
  /* 4 */ val RIGHT: typings.openseadragon.mod.Placement.RIGHT with Double = js.native
  
  @js.native
  sealed trait TOP extends Placement
  /* 2 */ val TOP: typings.openseadragon.mod.Placement.TOP with Double = js.native
  
  @js.native
  sealed trait TOP_LEFT extends Placement
  /* 1 */ val TOP_LEFT: typings.openseadragon.mod.Placement.TOP_LEFT with Double = js.native
  
  @js.native
  sealed trait TOP_RIGHT extends Placement
  /* 3 */ val TOP_RIGHT: typings.openseadragon.mod.Placement.TOP_RIGHT with Double = js.native
}
