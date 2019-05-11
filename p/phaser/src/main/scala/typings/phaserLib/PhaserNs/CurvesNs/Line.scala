package typings
package phaserLib.PhaserNs.CurvesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A LineCurve is a "curve" comprising exactly two points (a line segment).
  */
@JSGlobal("Phaser.Curves.Line")
@js.native
class Line protected () extends Curve {
  def this(p0: js.Array[scala.Double]) = this()
  /**
    * 
    * @param p0 The first endpoint.
    * @param p1 The second endpoint.
    */
  def this(p0: phaserLib.PhaserNs.MathNs.Vector2) = this()
  def this(p0: js.Array[scala.Double], p1: phaserLib.PhaserNs.MathNs.Vector2) = this()
  def this(p0: phaserLib.PhaserNs.MathNs.Vector2, p1: phaserLib.PhaserNs.MathNs.Vector2) = this()
  /**
    * The first endpoint.
    */
  var p0: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * The second endpoint.
    */
  var p1: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  def getBounds[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](out: O): O = js.native
  /**
    * Get point at relative position in curve according to length.
    * @param t The position along the curve to return. Where 0 is the start and 1 is the end.
    * @param out A Vector2 object to store the result in. If not given will be created.
    */
  def getPoint[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](t: scala.Double): O = js.native
  def getPoint[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](t: scala.Double, out: O): O = js.native
  /**
    * Gets the resolution of the line.
    * @param divisions The number of divisions to consider. Default 1.
    */
  def getResolution(): scala.Double = js.native
  def getResolution(divisions: scala.Double): scala.Double = js.native
  /**
    * Gets the slope of the line as a unit vector.
    */
  def getTangent[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](): O = js.native
  /**
    * Gets a JSON representation of the line.
    */
  def toJSON(): phaserLib.PhaserNs.TypesNs.CurvesNs.JSONCurve = js.native
}

/* static members */
@JSGlobal("Phaser.Curves.Line")
@js.native
object Line extends js.Object {
  /**
    * Configures this line from a JSON representation.
    * @param data The JSON object containing this curve data.
    */
  def fromJSON(data: phaserLib.PhaserNs.TypesNs.CurvesNs.JSONCurve): phaserLib.PhaserNs.CurvesNs.Line = js.native
}

