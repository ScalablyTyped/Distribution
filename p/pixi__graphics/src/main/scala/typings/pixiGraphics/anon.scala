package typings.pixiGraphics

import typings.pixiGraphics.mod.IArcLikeShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeofArcUtils extends StObject {
    
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
    /* static member */
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
    ): Unit
    
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
    /* static member */
    def curveTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double, points: js.Array[Double]): IArcLikeShape
  }
  object TypeofArcUtils {
    
    inline def apply(
      arc: (Double, Double, Double, Double, Double, Double, Double, Boolean, js.Array[Double]) => Unit,
      curveTo: (Double, Double, Double, Double, Double, js.Array[Double]) => IArcLikeShape
    ): TypeofArcUtils = {
      val __obj = js.Dynamic.literal(arc = js.Any.fromFunction9(arc), curveTo = js.Any.fromFunction6(curveTo))
      __obj.asInstanceOf[TypeofArcUtils]
    }
    
    extension [Self <: TypeofArcUtils](x: Self) {
      
      inline def setArc(value: (Double, Double, Double, Double, Double, Double, Double, Boolean, js.Array[Double]) => Unit): Self = StObject.set(x, "arc", js.Any.fromFunction9(value))
      
      inline def setCurveTo(value: (Double, Double, Double, Double, Double, js.Array[Double]) => IArcLikeShape): Self = StObject.set(x, "curveTo", js.Any.fromFunction6(value))
    }
  }
  
  trait TypeofBezierUtils extends StObject {
    
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
    /* static member */
    def curveLength(
      fromX: Double,
      fromY: Double,
      cpX: Double,
      cpY: Double,
      cpX2: Double,
      cpY2: Double,
      toX: Double,
      toY: Double
    ): Double
    
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
    /* static member */
    def curveTo(
      cpX: Double,
      cpY: Double,
      cpX2: Double,
      cpY2: Double,
      toX: Double,
      toY: Double,
      points: js.Array[Double]
    ): Unit
  }
  object TypeofBezierUtils {
    
    inline def apply(
      curveLength: (Double, Double, Double, Double, Double, Double, Double, Double) => Double,
      curveTo: (Double, Double, Double, Double, Double, Double, js.Array[Double]) => Unit
    ): TypeofBezierUtils = {
      val __obj = js.Dynamic.literal(curveLength = js.Any.fromFunction8(curveLength), curveTo = js.Any.fromFunction7(curveTo))
      __obj.asInstanceOf[TypeofBezierUtils]
    }
    
    extension [Self <: TypeofBezierUtils](x: Self) {
      
      inline def setCurveLength(value: (Double, Double, Double, Double, Double, Double, Double, Double) => Double): Self = StObject.set(x, "curveLength", js.Any.fromFunction8(value))
      
      inline def setCurveTo(value: (Double, Double, Double, Double, Double, Double, js.Array[Double]) => Unit): Self = StObject.set(x, "curveTo", js.Any.fromFunction7(value))
    }
  }
  
  trait TypeofQuadraticUtils extends StObject {
    
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
    /* static member */
    def curveLength(fromX: Double, fromY: Double, cpX: Double, cpY: Double, toX: Double, toY: Double): Double
    
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
    /* static member */
    def curveTo(cpX: Double, cpY: Double, toX: Double, toY: Double, points: js.Array[Double]): Unit
  }
  object TypeofQuadraticUtils {
    
    inline def apply(
      curveLength: (Double, Double, Double, Double, Double, Double) => Double,
      curveTo: (Double, Double, Double, Double, js.Array[Double]) => Unit
    ): TypeofQuadraticUtils = {
      val __obj = js.Dynamic.literal(curveLength = js.Any.fromFunction6(curveLength), curveTo = js.Any.fromFunction5(curveTo))
      __obj.asInstanceOf[TypeofQuadraticUtils]
    }
    
    extension [Self <: TypeofQuadraticUtils](x: Self) {
      
      inline def setCurveLength(value: (Double, Double, Double, Double, Double, Double) => Double): Self = StObject.set(x, "curveLength", js.Any.fromFunction6(value))
      
      inline def setCurveTo(value: (Double, Double, Double, Double, js.Array[Double]) => Unit): Self = StObject.set(x, "curveTo", js.Any.fromFunction5(value))
    }
  }
}
