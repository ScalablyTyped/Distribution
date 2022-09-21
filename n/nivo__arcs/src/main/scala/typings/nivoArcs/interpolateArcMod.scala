package typings.nivoArcs

import typings.nivoArcs.typesTypesMod.ArcGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interpolateArcMod {
  
  @JSImport("@nivo/arcs/dist/types/interpolateArc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interpolateArc(
    startAngleValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
    endAngleValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
    innerRadiusValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
    outerRadiusValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
    arcGenerator: ArcGenerator
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArc")(startAngleValue.asInstanceOf[js.Any], endAngleValue.asInstanceOf[js.Any], innerRadiusValue.asInstanceOf[js.Any], outerRadiusValue.asInstanceOf[js.Any], arcGenerator.asInstanceOf[js.Any])).asInstanceOf[Any]
}
