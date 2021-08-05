package typings.phaser.Phaser.Types

import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Curves {
  
  trait EllipseCurveConfig extends StObject {
    
    /**
      * Sets if the the ellipse rotation is clockwise (true) or anti-clockwise (false)
      */
    var clockwise: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The end angle of the ellipse, in degrees.
      */
    var endAngle: js.UndefOr[integer] = js.undefined
    
    /**
      * The rotation of the ellipse, in degrees.
      */
    var rotation: js.UndefOr[integer] = js.undefined
    
    /**
      * The start angle of the ellipse, in degrees.
      */
    var startAngle: js.UndefOr[integer] = js.undefined
    
    /**
      * The x coordinate of the ellipse.
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /**
      * The horizontal radius of the ellipse.
      */
    var xRadius: js.UndefOr[Double] = js.undefined
    
    /**
      * The y coordinate of the ellipse.
      */
    var y: js.UndefOr[Double] = js.undefined
    
    /**
      * The vertical radius of the ellipse.
      */
    var yRadius: js.UndefOr[Double] = js.undefined
  }
  object EllipseCurveConfig {
    
    inline def apply(): EllipseCurveConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EllipseCurveConfig]
    }
    
    extension [Self <: EllipseCurveConfig](x: Self) {
      
      inline def setClockwise(value: Boolean): Self = StObject.set(x, "clockwise", value.asInstanceOf[js.Any])
      
      inline def setClockwiseUndefined: Self = StObject.set(x, "clockwise", js.undefined)
      
      inline def setEndAngle(value: integer): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      inline def setRotation(value: integer): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setStartAngle(value: integer): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXRadius(value: Double): Self = StObject.set(x, "xRadius", value.asInstanceOf[js.Any])
      
      inline def setXRadiusUndefined: Self = StObject.set(x, "xRadius", js.undefined)
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYRadius(value: Double): Self = StObject.set(x, "yRadius", value.asInstanceOf[js.Any])
      
      inline def setYRadiusUndefined: Self = StObject.set(x, "yRadius", js.undefined)
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait JSONCurve extends StObject {
    
    /**
      * The arrays of points like `[x1, y1, x2, y2]`
      */
    var points: js.Array[Double]
    
    /**
      * The of the curve
      */
    var `type`: String
  }
  object JSONCurve {
    
    inline def apply(points: js.Array[Double], `type`: String): JSONCurve = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONCurve]
    }
    
    extension [Self <: JSONCurve](x: Self) {
      
      inline def setPoints(value: js.Array[Double]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: Double*): Self = StObject.set(x, "points", js.Array(value :_*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSONEllipseCurve extends StObject {
    
    /**
      * Sets if the the ellipse rotation is clockwise (true) or anti-clockwise (false)
      */
    var clockwise: Boolean
    
    /**
      * The end angle of the ellipse, in degrees.
      */
    var endAngle: integer
    
    /**
      * The rotation of ellipse, in degrees.
      */
    var rotation: integer
    
    /**
      * The start angle of the ellipse, in degrees.
      */
    var startAngle: integer
    
    /**
      * The of the curve.
      */
    var `type`: String
    
    /**
      * The x coordinate of the ellipse.
      */
    var x: Double
    
    /**
      * The horizontal radius of ellipse.
      */
    var xRadius: Double
    
    /**
      * The y coordinate of the ellipse.
      */
    var y: Double
    
    /**
      * The vertical radius of ellipse.
      */
    var yRadius: Double
  }
  object JSONEllipseCurve {
    
    inline def apply(
      clockwise: Boolean,
      endAngle: integer,
      rotation: integer,
      startAngle: integer,
      `type`: String,
      x: Double,
      xRadius: Double,
      y: Double,
      yRadius: Double
    ): JSONEllipseCurve = {
      val __obj = js.Dynamic.literal(clockwise = clockwise.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xRadius = xRadius.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yRadius = yRadius.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONEllipseCurve]
    }
    
    extension [Self <: JSONEllipseCurve](x: Self) {
      
      inline def setClockwise(value: Boolean): Self = StObject.set(x, "clockwise", value.asInstanceOf[js.Any])
      
      inline def setEndAngle(value: integer): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: integer): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setStartAngle(value: integer): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXRadius(value: Double): Self = StObject.set(x, "xRadius", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYRadius(value: Double): Self = StObject.set(x, "yRadius", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSONPath extends StObject {
    
    /**
      * The path is auto closed.
      */
    var autoClose: Boolean
    
    /**
      * The list of the curves
      */
    var curves: js.Array[JSONCurve]
    
    /**
      * The of the curve.
      */
    var `type`: String
    
    /**
      * The X coordinate of the curve's starting point.
      */
    var x: Double
    
    /**
      * The Y coordinate of the path's starting point.
      */
    var y: Double
  }
  object JSONPath {
    
    inline def apply(autoClose: Boolean, curves: js.Array[JSONCurve], `type`: String, x: Double, y: Double): JSONPath = {
      val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], curves = curves.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONPath]
    }
    
    extension [Self <: JSONPath](x: Self) {
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setCurves(value: js.Array[JSONCurve]): Self = StObject.set(x, "curves", value.asInstanceOf[js.Any])
      
      inline def setCurvesVarargs(value: JSONCurve*): Self = StObject.set(x, "curves", js.Array(value :_*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
