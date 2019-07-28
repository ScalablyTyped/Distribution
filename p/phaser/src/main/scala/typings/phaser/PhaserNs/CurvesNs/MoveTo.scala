package typings.phaser.PhaserNs.CurvesNs

import typings.phaser.PhaserNs.MathNs.Vector2
import typings.phaser.PhaserNs.TypesNs.CurvesNs.JSONCurve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A MoveTo Curve is a very simple curve consisting of only a single point. Its intended use is to move the ending point in a Path.
  */
@JSGlobal("Phaser.Curves.MoveTo")
@js.native
/**
  * 
  * @param x `x` pixel coordinate.
  * @param y `y` pixel coordinate.
  */
class MoveTo () extends js.Object {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  /**
    * Denotes that this Curve does not influence the bounds, points, and drawing of its parent Path. Must be `false` or some methods in the parent Path will throw errors.
    */
  var active: Boolean = js.native
  /**
    * The lone point which this curve consists of.
    */
  var p0: Vector2 = js.native
  /**
    * Gets the length of this curve.
    */
  def getLength(): Double = js.native
  /**
    * Get point at relative position in curve according to length.
    * @param t The position along the curve to return. Where 0 is the start and 1 is the end.
    * @param out A Vector2 object to store the result in. If not given will be created.
    */
  def getPoint[O /* <: Vector2 */](t: Double): O = js.native
  def getPoint[O /* <: Vector2 */](t: Double, out: O): O = js.native
  /**
    * Retrieves the point at given position in the curve. This will always return this curve's only point.
    * @param u The position in the path to retrieve, between 0 and 1. Not used.
    * @param out An optional vector in which to store the point.
    */
  def getPointAt[O /* <: Vector2 */](u: Double): O = js.native
  def getPointAt[O /* <: Vector2 */](u: Double, out: O): O = js.native
  /**
    * Gets the resolution of this curve.
    */
  def getResolution(): Double = js.native
  /**
    * Converts this curve into a JSON-serializable object.
    */
  def toJSON(): JSONCurve = js.native
}

