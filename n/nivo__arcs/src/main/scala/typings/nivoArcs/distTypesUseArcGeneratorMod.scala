package typings.nivoArcs

import typings.nivoArcs.anon.CornerRadius
import typings.nivoArcs.distTypesTypesMod.ArcGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUseArcGeneratorMod {
  
  @JSImport("@nivo/arcs/dist/types/useArcGenerator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useArcGenerator(): ArcGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcGenerator")().asInstanceOf[ArcGenerator]
  inline def useArcGenerator(param0: CornerRadius): ArcGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcGenerator")(param0.asInstanceOf[js.Any]).asInstanceOf[ArcGenerator]
}
