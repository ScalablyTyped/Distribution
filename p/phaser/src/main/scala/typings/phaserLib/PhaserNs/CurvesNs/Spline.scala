package typings
package phaserLib.PhaserNs.CurvesNs

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
  def this(points: js.Array[phaserLib.PhaserNs.MathNs.Vector2]) = this()
  /**
    * [description]
    */
  var points: js.Array[phaserLib.PhaserNs.MathNs.Vector2] = js.native
  /**
    * [description]
    * @param x [description]
    * @param y [description]
    */
  def addPoint(x: scala.Double, y: scala.Double): phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * [description]
    * @param points [description]
    */
  def addPoints(points: js.Array[js.Array[scala.Double] | scala.Double | phaserLib.PhaserNs.MathNs.Vector2]): Spline = js.native
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
    * [description]
    */
  def toJSON(): phaserLib.PhaserNs.TypesNs.CurvesNs.JSONCurve = js.native
}

/* static members */
@JSGlobal("Phaser.Curves.Spline")
@js.native
object Spline extends js.Object {
  /**
    * [description]
    * @param data The JSON object containing this curve data.
    */
  def fromJSON(data: phaserLib.PhaserNs.TypesNs.CurvesNs.JSONCurve): phaserLib.PhaserNs.CurvesNs.Spline = js.native
}

