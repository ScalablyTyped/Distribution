package typings
package phaserLib.PhaserNs.CurvesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [description]
  */
@JSGlobal("Phaser.Curves.QuadraticBezier")
@js.native
class QuadraticBezier protected () extends Curve {
  def this(p0: js.Array[scala.Double], p1: phaserLib.PhaserNs.MathNs.Vector2, p2: phaserLib.PhaserNs.MathNs.Vector2) = this()
  /**
    * 
    * @param p0 Start point, or an array of point pairs.
    * @param p1 Control Point 1.
    * @param p2 Control Point 2.
    */
  def this(p0: phaserLib.PhaserNs.MathNs.Vector2, p1: phaserLib.PhaserNs.MathNs.Vector2, p2: phaserLib.PhaserNs.MathNs.Vector2) = this()
  /**
    * [description]
    */
  var p0: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * [description]
    */
  var p1: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * [description]
    */
  var p2: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * Get point at relative position in curve according to length.
    * @param t The position along the curve to return. Where 0 is the start and 1 is the end.
    * @param out A Vector2 object to store the result in. If not given will be created.
    */
  def getPoint[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](t: scala.Double): O = js.native
  def getPoint[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](t: scala.Double, out: O): O = js.native
  /**
    * [description]
    * @param divisions [description]
    */
  def getResolution(divisions: scala.Double): scala.Double = js.native
  /**
    * Converts the curve into a JSON compatible object.
    */
  def toJSON(): phaserLib.PhaserNs.TypesNs.CurvesNs.JSONCurve = js.native
}

/* static members */
@JSGlobal("Phaser.Curves.QuadraticBezier")
@js.native
object QuadraticBezier extends js.Object {
  /**
    * Creates a curve from a JSON object, e. g. created by `toJSON`.
    * @param data The JSON object containing this curve data.
    */
  def fromJSON(data: phaserLib.PhaserNs.TypesNs.CurvesNs.JSONCurve): phaserLib.PhaserNs.CurvesNs.QuadraticBezier = js.native
}

