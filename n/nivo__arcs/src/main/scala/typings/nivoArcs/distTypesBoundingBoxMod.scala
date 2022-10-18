package typings.nivoArcs

import typings.nivoArcs.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBoundingBoxMod {
  
  @JSImport("@nivo/arcs/dist/types/boundingBox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeArcBoundingBox(centerX: Double, centerY: Double, radius: Double, startAngle: Double, endAngle: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArcBoundingBox")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def computeArcBoundingBox(
    centerX: Double,
    centerY: Double,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    includeCenter: Boolean
  ): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArcBoundingBox")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any], includeCenter.asInstanceOf[js.Any])).asInstanceOf[Height]
}
