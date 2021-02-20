package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OverlayPlacement extends StObject
@JSImport("openseadragon", "OverlayPlacement")
@js.native
object OverlayPlacement extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverlayPlacement with Double] = js.native
  
  @js.native
  sealed trait BOTTOM extends OverlayPlacement
  /* 6 */ val BOTTOM: typings.openseadragon.mod.OverlayPlacement.BOTTOM with Double = js.native
  
  @js.native
  sealed trait BOTTOM_LEFT extends OverlayPlacement
  /* 7 */ val BOTTOM_LEFT: typings.openseadragon.mod.OverlayPlacement.BOTTOM_LEFT with Double = js.native
  
  @js.native
  sealed trait BOTTOM_RIGHT extends OverlayPlacement
  /* 5 */ val BOTTOM_RIGHT: typings.openseadragon.mod.OverlayPlacement.BOTTOM_RIGHT with Double = js.native
  
  @js.native
  sealed trait CENTER extends OverlayPlacement
  /* 0 */ val CENTER: typings.openseadragon.mod.OverlayPlacement.CENTER with Double = js.native
  
  @js.native
  sealed trait LEFT extends OverlayPlacement
  /* 8 */ val LEFT: typings.openseadragon.mod.OverlayPlacement.LEFT with Double = js.native
  
  @js.native
  sealed trait RIGHT extends OverlayPlacement
  /* 4 */ val RIGHT: typings.openseadragon.mod.OverlayPlacement.RIGHT with Double = js.native
  
  @js.native
  sealed trait TOP extends OverlayPlacement
  /* 2 */ val TOP: typings.openseadragon.mod.OverlayPlacement.TOP with Double = js.native
  
  @js.native
  sealed trait TOP_LEFT extends OverlayPlacement
  /* 1 */ val TOP_LEFT: typings.openseadragon.mod.OverlayPlacement.TOP_LEFT with Double = js.native
  
  @js.native
  sealed trait TOP_RIGHT extends OverlayPlacement
  /* 3 */ val TOP_RIGHT: typings.openseadragon.mod.OverlayPlacement.TOP_RIGHT with Double = js.native
}
