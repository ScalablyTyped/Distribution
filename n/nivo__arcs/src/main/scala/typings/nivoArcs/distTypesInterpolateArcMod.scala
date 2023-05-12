package typings.nivoArcs

import typings.nivoArcs.distTypesTypesMod.ArcGenerator
import typings.reactSpringCore.mod.Interpolation
import typings.reactSpringWeb.mod.SpringValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInterpolateArcMod {
  
  @JSImport("@nivo/arcs/dist/types/interpolateArc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interpolateArc(
    startAngleValue: SpringValue[Double],
    endAngleValue: SpringValue[Double],
    innerRadiusValue: SpringValue[Double],
    outerRadiusValue: SpringValue[Double],
    arcGenerator: ArcGenerator
  ): Interpolation[String | Null, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArc")(startAngleValue.asInstanceOf[js.Any], endAngleValue.asInstanceOf[js.Any], innerRadiusValue.asInstanceOf[js.Any], outerRadiusValue.asInstanceOf[js.Any], arcGenerator.asInstanceOf[js.Any])).asInstanceOf[Interpolation[String | Null, Any]]
}
