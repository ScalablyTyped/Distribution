package typings.phaser.PhaserNs.CurvesNs

import typings.phaser.PhaserNs.MathNs.Vector2
import typings.phaser.PhaserNs.TypesNs.CurvesNs.JSONCurve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A higher-order Bézier curve constructed of four points.
  */
@JSGlobal("Phaser.Curves.CubicBezier")
@js.native
class CubicBezier protected () extends Curve {
  def this(p0: js.Array[Vector2], p1: Vector2, p2: Vector2, p3: Vector2) = this()
  /**
    * 
    * @param p0 Start point, or an array of point pairs.
    * @param p1 Control Point 1.
    * @param p2 Control Point 2.
    * @param p3 End Point.
    */
  def this(p0: Vector2, p1: Vector2, p2: Vector2, p3: Vector2) = this()
  /**
    * The start point of this curve.
    */
  var p0: Vector2 = js.native
  /**
    * The first control point of this curve.
    */
  var p1: Vector2 = js.native
  /**
    * The second control point of this curve.
    */
  var p2: Vector2 = js.native
  /**
    * The end point of this curve.
    */
  var p3: Vector2 = js.native
  /**
    * Get point at relative position in curve according to length.
    * @param t The position along the curve to return. Where 0 is the start and 1 is the end.
    * @param out A Vector2 object to store the result in. If not given will be created.
    */
  def getPoint[O /* <: Vector2 */](t: Double): O = js.native
  def getPoint[O /* <: Vector2 */](t: Double, out: O): O = js.native
  /**
    * Returns the resolution of this curve.
    * @param divisions The amount of divisions used by this curve.
    */
  def getResolution(divisions: Double): Double = js.native
  /**
    * Returns a JSON object that describes this curve.
    */
  def toJSON(): JSONCurve = js.native
}

/* static members */
@JSGlobal("Phaser.Curves.CubicBezier")
@js.native
object CubicBezier extends js.Object {
  /**
    * Generates a curve from a JSON object.
    * @param data The JSON object containing this curve data.
    */
  def fromJSON(data: JSONCurve): CubicBezier = js.native
}

