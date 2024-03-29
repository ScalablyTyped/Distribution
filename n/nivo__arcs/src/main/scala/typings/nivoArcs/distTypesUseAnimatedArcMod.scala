package typings.nivoArcs

import typings.nivoArcs.anon.Arc
import typings.nivoArcs.anon.OuterRadius
import typings.nivoArcs.distTypesTypesMod.ArcGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUseAnimatedArcMod {
  
  @JSImport("@nivo/arcs/dist/types/useAnimatedArc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAnimatedArc(datumWithArc: Arc, arcGenerator: ArcGenerator): OuterRadius = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedArc")(datumWithArc.asInstanceOf[js.Any], arcGenerator.asInstanceOf[js.Any])).asInstanceOf[OuterRadius]
}
