package typings.pixiGraphics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsBezierUtilsMod {
  
  @JSImport("@pixi/graphics/lib/utils/BezierUtils", "BezierUtils")
  @js.native
  open class BezierUtils () extends StObject
  /* static members */
  object BezierUtils {
    
    @JSImport("@pixi/graphics/lib/utils/BezierUtils", "BezierUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Calculate length of bezier curve.
      * Analytical solution is impossible, since it involves an integral that does not integrate in general.
      * Therefore numerical solution is used.
      * @private
      * @param fromX - Starting point x
      * @param fromY - Starting point y
      * @param cpX - Control point x
      * @param cpY - Control point y
      * @param cpX2 - Second Control point x
      * @param cpY2 - Second Control point y
      * @param toX - Destination point x
      * @param toY - Destination point y
      * @returns - Length of bezier curve
      */
    inline def curveLength(
      fromX: Double,
      fromY: Double,
      cpX: Double,
      cpY: Double,
      cpX2: Double,
      cpY2: Double,
      toX: Double,
      toY: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("curveLength")(fromX.asInstanceOf[js.Any], fromY.asInstanceOf[js.Any], cpX.asInstanceOf[js.Any], cpY.asInstanceOf[js.Any], cpX2.asInstanceOf[js.Any], cpY2.asInstanceOf[js.Any], toX.asInstanceOf[js.Any], toY.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Calculate the points for a bezier curve and then draws it.
      *
      * Ignored from docs since it is not directly exposed.
      * @ignore
      * @param cpX - Control point x
      * @param cpY - Control point y
      * @param cpX2 - Second Control point x
      * @param cpY2 - Second Control point y
      * @param toX - Destination point x
      * @param toY - Destination point y
      * @param points - Path array to push points into
      */
    inline def curveTo(
      cpX: Double,
      cpY: Double,
      cpX2: Double,
      cpY2: Double,
      toX: Double,
      toY: Double,
      points: js.Array[Double]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("curveTo")(cpX.asInstanceOf[js.Any], cpY.asInstanceOf[js.Any], cpX2.asInstanceOf[js.Any], cpY2.asInstanceOf[js.Any], toX.asInstanceOf[js.Any], toY.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
