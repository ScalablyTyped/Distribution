package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ControlAnchor extends StObject
@JSImport("openseadragon", "ControlAnchor")
@js.native
object ControlAnchor extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ControlAnchor with Double] = js.native
  
  @js.native
  sealed trait ABSOLUTE extends ControlAnchor
  /* 5 */ val ABSOLUTE: typings.openseadragon.mod.ControlAnchor.ABSOLUTE with Double = js.native
  
  @js.native
  sealed trait BOTTOM_LEFT extends ControlAnchor
  /* 3 */ val BOTTOM_LEFT: typings.openseadragon.mod.ControlAnchor.BOTTOM_LEFT with Double = js.native
  
  @js.native
  sealed trait BOTTOM_RIGHT extends ControlAnchor
  /* 4 */ val BOTTOM_RIGHT: typings.openseadragon.mod.ControlAnchor.BOTTOM_RIGHT with Double = js.native
  
  @js.native
  sealed trait NONE extends ControlAnchor
  /* 0 */ val NONE: typings.openseadragon.mod.ControlAnchor.NONE with Double = js.native
  
  @js.native
  sealed trait TOP_LEFT extends ControlAnchor
  /* 1 */ val TOP_LEFT: typings.openseadragon.mod.ControlAnchor.TOP_LEFT with Double = js.native
  
  @js.native
  sealed trait TOP_RIGHT extends ControlAnchor
  /* 2 */ val TOP_RIGHT: typings.openseadragon.mod.ControlAnchor.TOP_RIGHT with Double = js.native
}
