package typings.nivoArcs

import typings.nivoArcs.anon.CornerRadius
import typings.nivoArcs.typesTypesMod.ArcGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useArcGeneratorMod {
  
  @JSImport("@nivo/arcs/dist/types/useArcGenerator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useArcGenerator(): ArcGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcGenerator")().asInstanceOf[ArcGenerator]
  inline def useArcGenerator(hasCornerRadiusPadAngle: CornerRadius): ArcGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcGenerator")(hasCornerRadiusPadAngle.asInstanceOf[js.Any]).asInstanceOf[ArcGenerator]
}
