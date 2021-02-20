package typings.phaser.Phaser.Types

import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Curves {
  
  @js.native
  trait EllipseCurveConfig extends StObject {
    
    /**
      * Sets if the the ellipse rotation is clockwise (true) or anti-clockwise (false)
      */
    var clockwise: js.UndefOr[Boolean] = js.native
    
    /**
      * The end angle of the ellipse, in degrees.
      */
    var endAngle: js.UndefOr[integer] = js.native
    
    /**
      * The rotation of the ellipse, in degrees.
      */
    var rotation: js.UndefOr[integer] = js.native
    
    /**
      * The start angle of the ellipse, in degrees.
      */
    var startAngle: js.UndefOr[integer] = js.native
    
    /**
      * The x coordinate of the ellipse.
      */
    var x: js.UndefOr[Double] = js.native
    
    /**
      * The horizontal radius of the ellipse.
      */
    var xRadius: js.UndefOr[Double] = js.native
    
    /**
      * The y coordinate of the ellipse.
      */
    var y: js.UndefOr[Double] = js.native
    
    /**
      * The vertical radius of the ellipse.
      */
    var yRadius: js.UndefOr[Double] = js.native
  }
  object EllipseCurveConfig {
    
    @scala.inline
    def apply(): EllipseCurveConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EllipseCurveConfig]
    }
    
    @scala.inline
    implicit class EllipseCurveConfigMutableBuilder[Self <: EllipseCurveConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClockwise(value: Boolean): Self = StObject.set(x, "clockwise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockwiseUndefined: Self = StObject.set(x, "clockwise", js.undefined)
      
      @scala.inline
      def setEndAngle(value: integer): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      @scala.inline
      def setRotation(value: integer): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setStartAngle(value: integer): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXRadius(value: Double): Self = StObject.set(x, "xRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXRadiusUndefined: Self = StObject.set(x, "xRadius", js.undefined)
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYRadius(value: Double): Self = StObject.set(x, "yRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYRadiusUndefined: Self = StObject.set(x, "yRadius", js.undefined)
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait JSONCurve extends StObject {
    
    /**
      * The arrays of points like `[x1, y1, x2, y2]`
      */
    var points: js.Array[Double] = js.native
    
    /**
      * The of the curve
      */
    var `type`: String = js.native
  }
  object JSONCurve {
    
    @scala.inline
    def apply(points: js.Array[Double], `type`: String): JSONCurve = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONCurve]
    }
    
    @scala.inline
    implicit class JSONCurveMutableBuilder[Self <: JSONCurve] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPoints(value: js.Array[Double]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsVarargs(value: Double*): Self = StObject.set(x, "points", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JSONEllipseCurve extends StObject {
    
    /**
      * Sets if the the ellipse rotation is clockwise (true) or anti-clockwise (false)
      */
    var clockwise: Boolean = js.native
    
    /**
      * The end angle of the ellipse, in degrees.
      */
    var endAngle: integer = js.native
    
    /**
      * The rotation of ellipse, in degrees.
      */
    var rotation: integer = js.native
    
    /**
      * The start angle of the ellipse, in degrees.
      */
    var startAngle: integer = js.native
    
    /**
      * The of the curve.
      */
    var `type`: String = js.native
    
    /**
      * The x coordinate of the ellipse.
      */
    var x: Double = js.native
    
    /**
      * The horizontal radius of ellipse.
      */
    var xRadius: Double = js.native
    
    /**
      * The y coordinate of the ellipse.
      */
    var y: Double = js.native
    
    /**
      * The vertical radius of ellipse.
      */
    var yRadius: Double = js.native
  }
  object JSONEllipseCurve {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class JSONEllipseCurveMutableBuilder[Self <: JSONEllipseCurve] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClockwise(value: Boolean): Self = StObject.set(x, "clockwise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndAngle(value: integer): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotation(value: integer): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAngle(value: integer): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXRadius(value: Double): Self = StObject.set(x, "xRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYRadius(value: Double): Self = StObject.set(x, "yRadius", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JSONPath extends StObject {
    
    /**
      * The path is auto closed.
      */
    var autoClose: Boolean = js.native
    
    /**
      * The list of the curves
      */
    var curves: js.Array[JSONCurve] = js.native
    
    /**
      * The of the curve.
      */
    var `type`: String = js.native
    
    /**
      * The X coordinate of the curve's starting point.
      */
    var x: Double = js.native
    
    /**
      * The Y coordinate of the path's starting point.
      */
    var y: Double = js.native
  }
  object JSONPath {
    
    @scala.inline
    def apply(autoClose: Boolean, curves: js.Array[JSONCurve], `type`: String, x: Double, y: Double): JSONPath = {
      val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], curves = curves.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONPath]
    }
    
    @scala.inline
    implicit class JSONPathMutableBuilder[Self <: JSONPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurves(value: js.Array[JSONCurve]): Self = StObject.set(x, "curves", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurvesVarargs(value: JSONCurve*): Self = StObject.set(x, "curves", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
