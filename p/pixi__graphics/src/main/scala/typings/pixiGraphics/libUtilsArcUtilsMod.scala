package typings.pixiGraphics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsArcUtilsMod {
  
  @JSImport("@pixi/graphics/lib/utils/ArcUtils", "ArcUtils")
  @js.native
  open class ArcUtils () extends StObject
  /* static members */
  object ArcUtils {
    
    @JSImport("@pixi/graphics/lib/utils/ArcUtils", "ArcUtils")
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
    inline def curveTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double, points: js.Array[Double]): IArcLikeShape = (^.asInstanceOf[js.Dynamic].applyDynamic("curveTo")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[IArcLikeShape]
  }
  
  trait IArcLikeShape extends StObject {
    
    var anticlockwise: Boolean
    
    var cx: Double
    
    var cy: Double
    
    var endAngle: Double
    
    var radius: Double
    
    var startAngle: Double
  }
  object IArcLikeShape {
    
    inline def apply(
      anticlockwise: Boolean,
      cx: Double,
      cy: Double,
      endAngle: Double,
      radius: Double,
      startAngle: Double
    ): IArcLikeShape = {
      val __obj = js.Dynamic.literal(anticlockwise = anticlockwise.asInstanceOf[js.Any], cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
      __obj.asInstanceOf[IArcLikeShape]
    }
    
    extension [Self <: IArcLikeShape](x: Self) {
      
      inline def setAnticlockwise(value: Boolean): Self = StObject.set(x, "anticlockwise", value.asInstanceOf[js.Any])
      
      inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    }
  }
}
