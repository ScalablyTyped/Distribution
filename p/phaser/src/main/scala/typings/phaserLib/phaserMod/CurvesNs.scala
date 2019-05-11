package typings
package phaserLib.phaserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Curves")
@js.native
object CurvesNs extends js.Object {
  /**
    * A higher-order Bézier curve constructed of four points.
    */
  @js.native
  class CubicBezier protected ()
    extends phaserLib.PhaserNs.CurvesNs.CubicBezier {
    def this(p0: js.Array[phaserLib.PhaserNs.MathNs.Vector2], p1: phaserLib.PhaserNs.MathNs.Vector2, p2: phaserLib.PhaserNs.MathNs.Vector2, p3: phaserLib.PhaserNs.MathNs.Vector2) = this()
    /**
      * 
      * @param p0 Start point, or an array of point pairs.
      * @param p1 Control Point 1.
      * @param p2 Control Point 2.
      * @param p3 End Point.
      */
    def this(p0: phaserLib.PhaserNs.MathNs.Vector2, p1: phaserLib.PhaserNs.MathNs.Vector2, p2: phaserLib.PhaserNs.MathNs.Vector2, p3: phaserLib.PhaserNs.MathNs.Vector2) = this()
  }
  
  /**
    * A Base Curve class, which all other curve types extend.
    * 
    * Based on the three.js Curve classes created by [zz85](http://www.lab4games.net/zz85/blog)
    */
  @js.native
  class Curve protected ()
    extends phaserLib.PhaserNs.CurvesNs.Curve {
    /**
      * 
      * @param type [description]
      */
    def this(`type`: java.lang.String) = this()
  }
  
  /**
    * An Elliptical Curve derived from the Base Curve class.
    * 
    * See https://en.wikipedia.org/wiki/Elliptic_curve for more details.
    */
  @js.native
  class Ellipse protected ()
    extends phaserLib.PhaserNs.CurvesNs.Ellipse {
    /**
      * 
      * @param x The x coordinate of the ellipse, or an Ellipse Curve configuration object. Default 0.
      * @param y The y coordinate of the ellipse. Default 0.
      * @param xRadius The horizontal radius of ellipse. Default 0.
      * @param yRadius The vertical radius of ellipse. Default 0.
      * @param startAngle The start angle of the ellipse, in degrees. Default 0.
      * @param endAngle The end angle of the ellipse, in degrees. Default 360.
      * @param clockwise Sets if the the ellipse rotation is clockwise (true) or anti-clockwise (false) Default false.
      * @param rotation The rotation of the ellipse, in degrees. Default 0.
      */
    def this(x: js.UndefOr[scala.Double | phaserLib.PhaserNs.TypesNs.CurvesNs.EllipseCurveConfig], y: js.UndefOr[scala.Double], xRadius: js.UndefOr[scala.Double], yRadius: js.UndefOr[scala.Double], startAngle: js.UndefOr[phaserLib.integer], endAngle: js.UndefOr[phaserLib.integer], clockwise: js.UndefOr[scala.Boolean], rotation: js.UndefOr[phaserLib.integer]) = this()
  }
  
  /**
    * A LineCurve is a "curve" comprising exactly two points (a line segment).
    */
  @js.native
  class Line protected ()
    extends phaserLib.PhaserNs.CurvesNs.Line {
    def this(p0: js.Array[scala.Double]) = this()
    /**
      * 
      * @param p0 The first endpoint.
      * @param p1 The second endpoint.
      */
    def this(p0: phaserLib.PhaserNs.MathNs.Vector2) = this()
    def this(p0: js.Array[scala.Double], p1: phaserLib.PhaserNs.MathNs.Vector2) = this()
    def this(p0: phaserLib.PhaserNs.MathNs.Vector2, p1: phaserLib.PhaserNs.MathNs.Vector2) = this()
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
    extends phaserLib.PhaserNs.CurvesNs.MoveTo {
    def this(x: scala.Double) = this()
    def this(x: scala.Double, y: scala.Double) = this()
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
    extends phaserLib.PhaserNs.CurvesNs.Path {
    def this(x: scala.Double) = this()
    def this(x: scala.Double, y: scala.Double) = this()
  }
  
  /**
    * [description]
    */
  @js.native
  class QuadraticBezier protected ()
    extends phaserLib.PhaserNs.CurvesNs.QuadraticBezier {
    def this(p0: js.Array[scala.Double], p1: phaserLib.PhaserNs.MathNs.Vector2, p2: phaserLib.PhaserNs.MathNs.Vector2) = this()
    /**
      * 
      * @param p0 Start point, or an array of point pairs.
      * @param p1 Control Point 1.
      * @param p2 Control Point 2.
      */
    def this(p0: phaserLib.PhaserNs.MathNs.Vector2, p1: phaserLib.PhaserNs.MathNs.Vector2, p2: phaserLib.PhaserNs.MathNs.Vector2) = this()
  }
  
  /**
    * [description]
    */
  @js.native
  /**
    * 
    * @param points [description]
    */
  class Spline ()
    extends phaserLib.PhaserNs.CurvesNs.Spline {
    def this(points: js.Array[phaserLib.PhaserNs.MathNs.Vector2]) = this()
  }
  
  /* static members */
  @js.native
  object CubicBezier extends js.Object {
    /**
      * Generates a curve from a JSON object.
      * @param data The JSON object containing this curve data.
      */
    def fromJSON(data: phaserLib.PhaserNs.TypesNs.CurvesNs.JSONCurve): phaserLib.PhaserNs.CurvesNs.CubicBezier = js.native
  }
  
  /* static members */
  @js.native
  object Ellipse extends js.Object {
    /**
      * Creates a curve from the provided Ellipse Curve Configuration object.
      * @param data The JSON object containing this curve data.
      */
    def fromJSON(data: phaserLib.PhaserNs.TypesNs.CurvesNs.JSONEllipseCurve): phaserLib.PhaserNs.CurvesNs.Ellipse = js.native
  }
  
  /* static members */
  @js.native
  object Line extends js.Object {
    /**
      * Configures this line from a JSON representation.
      * @param data The JSON object containing this curve data.
      */
    def fromJSON(data: phaserLib.PhaserNs.TypesNs.CurvesNs.JSONCurve): phaserLib.PhaserNs.CurvesNs.Line = js.native
  }
  
  /* static members */
  @js.native
  object QuadraticBezier extends js.Object {
    /**
      * Creates a curve from a JSON object, e. g. created by `toJSON`.
      * @param data The JSON object containing this curve data.
      */
    def fromJSON(data: phaserLib.PhaserNs.TypesNs.CurvesNs.JSONCurve): phaserLib.PhaserNs.CurvesNs.QuadraticBezier = js.native
  }
  
  /* static members */
  @js.native
  object Spline extends js.Object {
    /**
      * [description]
      * @param data The JSON object containing this curve data.
      */
    def fromJSON(data: phaserLib.PhaserNs.TypesNs.CurvesNs.JSONCurve): phaserLib.PhaserNs.CurvesNs.Spline = js.native
  }
  
}

