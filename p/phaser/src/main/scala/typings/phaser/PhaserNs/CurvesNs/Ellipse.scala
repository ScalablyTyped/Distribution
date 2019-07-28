package typings.phaser.PhaserNs.CurvesNs

import typings.phaser.PhaserNs.MathNs.Vector2
import typings.phaser.PhaserNs.TypesNs.CurvesNs.EllipseCurveConfig
import typings.phaser.PhaserNs.TypesNs.CurvesNs.JSONEllipseCurve
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Elliptical Curve derived from the Base Curve class.
  * 
  * See https://en.wikipedia.org/wiki/Elliptic_curve for more details.
  */
@JSGlobal("Phaser.Curves.Ellipse")
@js.native
class Ellipse protected () extends Curve {
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
  /**
    * The rotation of the ellipse, relative to the center, in degrees.
    */
  var angle: Double = js.native
  /**
    * `true` if the ellipse rotation is clockwise or `false` if anti-clockwise.
    */
  var clockwise: Boolean = js.native
  /**
    * The end angle of the ellipse in degrees.
    */
  var endAngle: Double = js.native
  /**
    * The center point of the ellipse. Used for calculating rotation.
    */
  var p0: Vector2 = js.native
  /**
    * The rotation of the ellipse, relative to the center, in radians.
    */
  var rotation: Double = js.native
  /**
    * The start angle of the ellipse in degrees.
    */
  var startAngle: Double = js.native
  /**
    * The x coordinate of the center of the ellipse.
    */
  var x: Double = js.native
  /**
    * The horizontal radius of the ellipse.
    */
  var xRadius: Double = js.native
  /**
    * The y coordinate of the center of the ellipse.
    */
  var y: Double = js.native
  /**
    * The vertical radius of the ellipse.
    */
  var yRadius: Double = js.native
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
    * Sets if this curve extends clockwise or anti-clockwise.
    * @param value The clockwise state of this curve.
    */
  def setClockwise(value: Boolean): Ellipse = js.native
  /**
    * Sets the end angle of this curve.
    * @param value The end angle of this curve, in radians.
    */
  def setEndAngle(value: Double): Ellipse = js.native
  /**
    * Sets the height of this curve.
    * @param value The height of this curve.
    */
  def setHeight(value: Double): Ellipse = js.native
  /**
    * Sets the rotation of this curve.
    * @param value The rotation of this curve, in radians.
    */
  def setRotation(value: Double): Ellipse = js.native
  /**
    * Sets the start angle of this curve.
    * @param value The start angle of this curve, in radians.
    */
  def setStartAngle(value: Double): Ellipse = js.native
  /**
    * Sets the width of this curve.
    * @param value The width of this curve.
    */
  def setWidth(value: Double): Ellipse = js.native
  /**
    * Sets the horizontal radius of this curve.
    * @param value The horizontal radius of this curve.
    */
  def setXRadius(value: Double): Ellipse = js.native
  /**
    * Sets the vertical radius of this curve.
    * @param value The vertical radius of this curve.
    */
  def setYRadius(value: Double): Ellipse = js.native
  /**
    * JSON serialization of the curve.
    */
  def toJSON(): JSONEllipseCurve = js.native
}

/* static members */
@JSGlobal("Phaser.Curves.Ellipse")
@js.native
object Ellipse extends js.Object {
  /**
    * Creates a curve from the provided Ellipse Curve Configuration object.
    * @param data The JSON object containing this curve data.
    */
  def fromJSON(data: JSONEllipseCurve): Ellipse = js.native
}

