package typings.pixiGraphics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsQuadraticUtilsMod {
  
  @JSImport("@pixi/graphics/lib/utils/QuadraticUtils", "QuadraticUtils")
  @js.native
  open class QuadraticUtils () extends StObject
  /* static members */
  object QuadraticUtils {
    
    @JSImport("@pixi/graphics/lib/utils/QuadraticUtils", "QuadraticUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Calculate length of quadratic curve
      * @see {@link http://www.malczak.linuxpl.com/blog/quadratic-bezier-curve-length/}
      * for the detailed explanation of math behind this.
      * @private
      * @param fromX - x-coordinate of curve start point
      * @param fromY - y-coordinate of curve start point
      * @param cpX - x-coordinate of curve control point
      * @param cpY - y-coordinate of curve control point
      * @param toX - x-coordinate of curve end point
      * @param toY - y-coordinate of curve end point
      * @returns - Length of quadratic curve
      */
    inline def curveLength(fromX: Double, fromY: Double, cpX: Double, cpY: Double, toX: Double, toY: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("curveLength")(fromX.asInstanceOf[js.Any], fromY.asInstanceOf[js.Any], cpX.asInstanceOf[js.Any], cpY.asInstanceOf[js.Any], toX.asInstanceOf[js.Any], toY.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Calculate the points for a quadratic bezier curve and then draws it.
      * Based on: https://stackoverflow.com/questions/785097/how-do-i-implement-a-bezier-curve-in-c
      * @private
      * @param cpX - Control point x
      * @param cpY - Control point y
      * @param toX - Destination point x
      * @param toY - Destination point y
      * @param points - Points to add segments to.
      */
    inline def curveTo(cpX: Double, cpY: Double, toX: Double, toY: Double, points: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("curveTo")(cpX.asInstanceOf[js.Any], cpY.asInstanceOf[js.Any], toX.asInstanceOf[js.Any], toY.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
