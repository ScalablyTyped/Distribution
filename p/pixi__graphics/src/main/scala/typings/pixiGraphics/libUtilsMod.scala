package typings.pixiGraphics

import typings.pixiCore.mod.BatchDrawCall
import typings.pixiGraphics.libGraphicsDataMod.GraphicsData
import typings.pixiGraphics.libGraphicsGeometryMod.GraphicsGeometry
import typings.pixiGraphics.libUtilsArcUtilsMod.IArcLikeShape
import typings.pixiGraphics.libUtilsIshapebuildcommandMod.IShapeBuildCommand
import typings.pixiMath.libConstMod.SHAPES
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("@pixi/graphics/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi/graphics/lib/utils", "ArcUtils")
  @js.native
  open class ArcUtils ()
    extends typings.pixiGraphics.libUtilsArcUtilsMod.ArcUtils
  /* static members */
  object ArcUtils {
    
    @JSImport("@pixi/graphics/lib/utils", "ArcUtils")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def arc(
      _startX: Double,
      _startY: Double,
      cx: Double,
      cy: Double,
      radius: Double,
      startAngle: Double,
      endAngle: Double,
      _anticlockwise: Boolean,
      points: js.Array[Double]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arc")(_startX.asInstanceOf[js.Any], _startY.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any], _anticlockwise.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Calculate information of the arc for {@link PIXI.Graphics.arcTo}.
      * @private
      * @param x1 - The x-coordinate of the first control point of the arc
      * @param y1 - The y-coordinate of the first control point of the arc
      * @param x2 - The x-coordinate of the second control point of the arc
      * @param y2 - The y-coordinate of the second control point of the arc
      * @param radius - The radius of the arc
      * @param points - Collection of points to add to
      * @returns - If the arc length is valid, return center of circle, radius and other info otherwise `null`.
      */
    inline def curveTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double, points: js.Array[Double]): IArcLikeShape = (^.asInstanceOf[js.Dynamic].applyDynamic("curveTo")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[IArcLikeShape]
  }
  
  @JSImport("@pixi/graphics/lib/utils", "BATCH_POOL")
  @js.native
  val BATCH_POOL: js.Array[typings.pixiGraphics.libUtilsBatchPartMod.BatchPart] = js.native
  
  @JSImport("@pixi/graphics/lib/utils", "BatchPart")
  @js.native
  open class BatchPart ()
    extends typings.pixiGraphics.libUtilsBatchPartMod.BatchPart
  
  @JSImport("@pixi/graphics/lib/utils", "BezierUtils")
  @js.native
  open class BezierUtils ()
    extends typings.pixiGraphics.libUtilsBezierUtilsMod.BezierUtils
  /* static members */
  object BezierUtils {
    
    @JSImport("@pixi/graphics/lib/utils", "BezierUtils")
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
  
  @JSImport("@pixi/graphics/lib/utils", "DRAW_CALL_POOL")
  @js.native
  val DRAW_CALL_POOL: js.Array[BatchDrawCall] = js.native
  
  @JSImport("@pixi/graphics/lib/utils", "FILL_COMMANDS")
  @js.native
  val FILL_COMMANDS: Record[SHAPES, IShapeBuildCommand] = js.native
  
  @JSImport("@pixi/graphics/lib/utils", "QuadraticUtils")
  @js.native
  open class QuadraticUtils ()
    extends typings.pixiGraphics.libUtilsQuadraticUtilsMod.QuadraticUtils
  /* static members */
  object QuadraticUtils {
    
    @JSImport("@pixi/graphics/lib/utils", "QuadraticUtils")
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
  
  @JSImport("@pixi/graphics/lib/utils", "buildCircle")
  @js.native
  val buildCircle: IShapeBuildCommand = js.native
  
  inline def buildLine(graphicsData: GraphicsData, graphicsGeometry: GraphicsGeometry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("buildLine")(graphicsData.asInstanceOf[js.Any], graphicsGeometry.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@pixi/graphics/lib/utils", "buildPoly")
  @js.native
  val buildPoly: IShapeBuildCommand = js.native
  
  @JSImport("@pixi/graphics/lib/utils", "buildRectangle")
  @js.native
  val buildRectangle: IShapeBuildCommand = js.native
  
  @JSImport("@pixi/graphics/lib/utils", "buildRoundedRectangle")
  @js.native
  val buildRoundedRectangle: IShapeBuildCommand = js.native
}
