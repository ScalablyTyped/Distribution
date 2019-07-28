package typings.phaser.PhaserNs.CurvesNs

import typings.phaser.PhaserNs.MathNs.Vector2
import typings.phaser.PhaserNs.TypesNs.CurvesNs.JSONCurve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [description]
  */
@JSGlobal("Phaser.Curves.Spline")
@js.native
/**
  * 
  * @param points [description]
  */
class Spline () extends Curve {
  def this(points: js.Array[Vector2]) = this()
  /**
    * [description]
    */
  var points: js.Array[Vector2] = js.native
  /**
    * [description]
    * @param x [description]
    * @param y [description]
    */
  def addPoint(x: Double, y: Double): Vector2 = js.native
  /**
    * [description]
    * @param points [description]
    */
  def addPoints(points: js.Array[js.Array[Double] | Double | Vector2]): Spline = js.native
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
    * [description]
    */
  def toJSON(): JSONCurve = js.native
}

/* static members */
@JSGlobal("Phaser.Curves.Spline")
@js.native
object Spline extends js.Object {
  /**
    * [description]
    * @param data The JSON object containing this curve data.
    */
  def fromJSON(data: JSONCurve): Spline = js.native
}

