package typings.phaser.global.Phaser

import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Types.Curves.EllipseCurveConfig
import typings.phaser.Phaser.Types.Curves.JSONCurve
import typings.phaser.Phaser.Types.Curves.JSONEllipseCurve
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Curves")
@js.native
object Curves extends js.Object {
  /**
    * A higher-order Bézier curve constructed of four points.
    */
  @js.native
  class CubicBezier protected ()
    extends typings.phaser.Phaser.Curves.CubicBezier {
    def this(p0: js.Array[Vector2], p1: Vector2, p2: Vector2, p3: Vector2) = this()
    /**
      * 
      * @param p0 Start point, or an array of point pairs.
      * @param p1 Control Point 1.
      * @param p2 Control Point 2.
      * @param p3 End Point.
      */
    def this(p0: Vector2, p1: Vector2, p2: Vector2, p3: Vector2) = this()
  }
  
  /**
    * A Base Curve class, which all other curve types extend.
    * 
    * Based on the three.js Curve classes created by [zz85](http://www.lab4games.net/zz85/blog)
    */
  @js.native
  class Curve protected ()
    extends typings.phaser.Phaser.Curves.Curve {
    /**
      * 
      * @param type The curve type.
      */
    def this(`type`: String) = this()
  }
  
  /**
    * An Elliptical Curve derived from the Base Curve class.
    * 
    * See https://en.wikipedia.org/wiki/Elliptic_curve for more details.
    */
  @js.native
  class Ellipse protected ()
    extends typings.phaser.Phaser.Curves.Ellipse {
    /**
      * 
      * @param x The x coordinate of the ellipse, or an Ellipse Curve configuration object. Default 0.
      * @param y The y coordinate of the ellipse. Default 0.
      * @param xRadius The horizontal radius of ellipse. Default 0.
      * @param yRadius The vertical radius of ellipse. Default 0.
      * @param startAngle The start angle of the ellipse, in degrees. Default 0.
      * @param endAngle The end angle of the ellipse, in degrees. Default 360.
      * @param clockwise Whether the ellipse angles are given as clockwise (`true`) or counter-clockwise (`false`). Default false.
      * @param rotation The rotation of the ellipse, in degrees. Default 0.
      */
    def this(
      x: js.UndefOr[Double | EllipseCurveConfig],
      y: js.UndefOr[Double],
      xRadius: js.UndefOr[Double],
      yRadius: js.UndefOr[Double],
      startAngle: js.UndefOr[integer],
      endAngle: js.UndefOr[integer],
      clockwise: js.UndefOr[Boolean],
      rotation: js.UndefOr[integer]
    ) = this()
  }
  
  /**
    * A LineCurve is a "curve" comprising exactly two points (a line segment).
    */
  @js.native
  class Line protected ()
    extends typings.phaser.Phaser.Curves.Line {
    def this(p0: js.Array[Double]) = this()
    /**
      * 
      * @param p0 The first endpoint.
      * @param p1 The second endpoint.
      */
    def this(p0: Vector2) = this()
    def this(p0: js.Array[Double], p1: Vector2) = this()
    def this(p0: Vector2, p1: Vector2) = this()
  }
  
  /**
    * A MoveTo Curve is a very simple curve consisting of only a single point. Its intended use is to move the ending point in a Path.
    */
  @js.native
  /**
    * 
    * @param x `x` pixel coordinate.
    * @param y `y` pixel coordinate.
    */
  class MoveTo ()
    extends typings.phaser.Phaser.Curves.MoveTo {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
  }
  
  /**
    * A Path combines multiple Curves into one continuous compound curve.
    * It does not matter how many Curves are in the Path or what type they are.
    * 
    * A Curve in a Path does not have to start where the previous Curve ends - that is to say, a Path does not
    * have to be an uninterrupted curve. Only the order of the Curves influences the actual points on the Path.
    */
  @js.native
  /**
    * 
    * @param x The X coordinate of the Path's starting point or a {@link Phaser.Types.Curves.JSONPath}. Default 0.
    * @param y The Y coordinate of the Path's starting point. Default 0.
    */
  class Path ()
    extends typings.phaser.Phaser.Curves.Path {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
  }
  
  /**
    * A quadratic Bézier curve constructed from two control points.
    */
  @js.native
  class QuadraticBezier protected ()
    extends typings.phaser.Phaser.Curves.QuadraticBezier {
    def this(p0: js.Array[Double], p1: Vector2, p2: Vector2) = this()
    /**
      * 
      * @param p0 Start point, or an array of point pairs.
      * @param p1 Control Point 1.
      * @param p2 Control Point 2.
      */
    def this(p0: Vector2, p1: Vector2, p2: Vector2) = this()
  }
  
  /**
    * Create a smooth 2d spline curve from a series of points.
    */
  @js.native
  /**
    * 
    * @param points The points that configure the curve.
    */
  class Spline ()
    extends typings.phaser.Phaser.Curves.Spline {
    def this(points: js.Array[js.Array[Double] | Double | Vector2]) = this()
  }
  
  /* static members */
  @js.native
  object CubicBezier extends js.Object {
    /**
      * Generates a curve from a JSON object.
      * @param data The JSON object containing this curve data.
      */
    def fromJSON(data: JSONCurve): typings.phaser.Phaser.Curves.CubicBezier = js.native
  }
  
  /* static members */
  @js.native
  object Ellipse extends js.Object {
    /**
      * Creates a curve from the provided Ellipse Curve Configuration object.
      * @param data The JSON object containing this curve data.
      */
    def fromJSON(data: JSONEllipseCurve): typings.phaser.Phaser.Curves.Ellipse = js.native
  }
  
  /* static members */
  @js.native
  object Line extends js.Object {
    /**
      * Configures this line from a JSON representation.
      * @param data The JSON object containing this curve data.
      */
    def fromJSON(data: JSONCurve): typings.phaser.Phaser.Curves.Line = js.native
  }
  
  /* static members */
  @js.native
  object QuadraticBezier extends js.Object {
    /**
      * Creates a curve from a JSON object, e. g. created by `toJSON`.
      * @param data The JSON object containing this curve data.
      */
    def fromJSON(data: JSONCurve): typings.phaser.Phaser.Curves.QuadraticBezier = js.native
  }
  
  /* static members */
  @js.native
  object Spline extends js.Object {
    /**
      * Imports a JSON object containing this curve data.
      * @param data The JSON object containing this curve data.
      */
    def fromJSON(data: JSONCurve): typings.phaser.Phaser.Curves.Spline = js.native
  }
  
}

