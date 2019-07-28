package typings.phaser.PhaserNs.CurvesNs

import typings.phaser.PhaserNs.MathNs.Vector2
import typings.phaser.PhaserNs.TypesNs.CurvesNs.JSONCurve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [description]
  */
@JSGlobal("Phaser.Curves.QuadraticBezier")
@js.native
class QuadraticBezier protected () extends Curve {
  def this(p0: js.Array[Double], p1: Vector2, p2: Vector2) = this()
  /**
    * 
    * @param p0 Start point, or an array of point pairs.
    * @param p1 Control Point 1.
    * @param p2 Control Point 2.
    */
  def this(p0: Vector2, p1: Vector2, p2: Vector2) = this()
  /**
    * [description]
    */
  var p0: Vector2 = js.native
  /**
    * [description]
    */
  var p1: Vector2 = js.native
  /**
    * [description]
    */
  var p2: Vector2 = js.native
  /**
    * Get point at relative position in curve according to length.
    * @param t The position along the curve to return. Where 0 is the start and 1 is the end.
    * @param out A Vector2 object to store the result in. If not given will be created.
    */
  def getPoint[O /* <: Vector2 */](t: Double): O = js.native
  def getPoint[O /* <: Vector2 */](t: Double, out: O): O = js.native
  /**
    * [description]
    * @param divisions [description]
    */
  def getResolution(divisions: Double): Double = js.native
  /**
    * Converts the curve into a JSON compatible object.
    */
  def toJSON(): JSONCurve = js.native
}

/* static members */
@JSGlobal("Phaser.Curves.QuadraticBezier")
@js.native
object QuadraticBezier extends js.Object {
  /**
    * Creates a curve from a JSON object, e. g. created by `toJSON`.
    * @param data The JSON object containing this curve data.
    */
  def fromJSON(data: JSONCurve): QuadraticBezier = js.native
}

