package typings.popperjsCore

import typings.popperjsCore.enumsMod.Placement
import typings.popperjsCore.enumsMod.Variation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getVariationMod {
  
  @JSImport("@popperjs/core/lib/utils/getVariation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(placement: Placement): js.UndefOr[Variation | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(placement.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Variation | Null]]
}
