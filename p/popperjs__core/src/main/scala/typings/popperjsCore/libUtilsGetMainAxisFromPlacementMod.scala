package typings.popperjsCore

import typings.popperjsCore.libEnumsMod.Placement
import typings.popperjsCore.popperjsCoreStrings.x
import typings.popperjsCore.popperjsCoreStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsGetMainAxisFromPlacementMod {
  
  @JSImport("@popperjs/core/lib/utils/getMainAxisFromPlacement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(placement: Placement): x | y = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(placement.asInstanceOf[js.Any]).asInstanceOf[x | y]
}
