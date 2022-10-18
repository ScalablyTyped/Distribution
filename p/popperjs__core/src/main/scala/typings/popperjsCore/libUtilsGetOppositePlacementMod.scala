package typings.popperjsCore

import typings.popperjsCore.libEnumsMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsGetOppositePlacementMod {
  
  @JSImport("@popperjs/core/lib/utils/getOppositePlacement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(placement: Placement): Placement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(placement.asInstanceOf[js.Any]).asInstanceOf[Placement]
}
