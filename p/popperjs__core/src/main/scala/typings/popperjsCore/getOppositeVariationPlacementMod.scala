package typings.popperjsCore

import typings.popperjsCore.enumsMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOppositeVariationPlacementMod {
  
  @JSImport("@popperjs/core/lib/utils/getOppositeVariationPlacement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(placement: Placement): Placement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(placement.asInstanceOf[js.Any]).asInstanceOf[Placement]
}
