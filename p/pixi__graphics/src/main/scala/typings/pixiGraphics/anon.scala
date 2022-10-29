package typings.pixiGraphics

import org.scalablytyped.runtime.Instantiable0
import typings.pixiGraphics.libUtilsArcUtilsMod.IArcLikeShape
import typings.pixiGraphics.libUtilsMod.ArcUtils
import typings.pixiGraphics.libUtilsMod.BezierUtils
import typings.pixiGraphics.libUtilsMod.QuadraticUtils
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofArcUtils
    extends StObject
       with Instantiable0[ArcUtils] {
    
    /**
      * The arc method creates an arc/curve (used to create circles, or parts of circles).
      * @private
      * @param _startX - Start x location of arc
      * @param _startY - Start y location of arc
      * @param cx - The x-coordinate of the center of the circle
      * @param cy - The y-coordinate of the center of the circle
      * @param radius - The radius of the circle
      * @param startAngle - The starting angle, in radians (0 is at the 3 o'clock position
      *  of the arc's circle)
      * @param endAngle - The ending angle, in radians
      * @param _anticlockwise - Specifies whether the drawing should be
      *  counter-clockwise or clockwise. False is default, and indicates clockwise, while true
      *  indicates counter-clockwise.
      * @param points - Collection of points to add to
      */
    def arc(
      _startX: Double,
      _startY: Double,
      cx: Double,
      cy: Double,
      radius: Double,
      startAngle: Double,
      endAngle: Double,
      _anticlockwise: Boolean,
      points: js.Array[Double]
    ): Unit = js.native
    
    /**
      * The arcTo() method creates an arc/curve between two tangents on the canvas.
      *
      * "borrowed" from https://code.google.com/p/fxcanvas/ - thanks google!
      * @private
      * @param x1 - The x-coordinate of the beginning of the arc
      * @param y1 - The y-coordinate of the beginning of the arc
      * @param x2 - The x-coordinate of the end of the arc
      * @param y2 - The y-coordinate of the end of the arc
      * @param radius - The radius of the arc
      * @param points -
      * @returns - If the arc length is valid, return center of circle, radius and other info otherwise `null`.
      */
    def curveTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double, points: js.Array[Double]): IArcLikeShape = js.native
  }
  
  @js.native
  trait TypeofBezierUtils
    extends StObject
       with Instantiable0[BezierUtils] {
    
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
    def curveLength(
      fromX: Double,
      fromY: Double,
      cpX: Double,
      cpY: Double,
      cpX2: Double,
      cpY2: Double,
      toX: Double,
      toY: Double
    ): Double = js.native
    
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
    def curveTo(
      cpX: Double,
      cpY: Double,
      cpX2: Double,
      cpY2: Double,
      toX: Double,
      toY: Double,
      points: js.Array[Double]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofQuadraticUtils
    extends StObject
       with Instantiable0[QuadraticUtils] {
    
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
    def curveLength(fromX: Double, fromY: Double, cpX: Double, cpY: Double, toX: Double, toY: Double): Double = js.native
    
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
    def curveTo(cpX: Double, cpY: Double, toX: Double, toY: Double, points: js.Array[Double]): Unit = js.native
  }
}
