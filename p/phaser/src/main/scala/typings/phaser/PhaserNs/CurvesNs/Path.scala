package typings.phaser.PhaserNs.CurvesNs

import typings.phaser.PhaserNs.GameObjectsNs.Graphics
import typings.phaser.PhaserNs.MathNs.Vector2
import typings.phaser.PhaserNs.TypesNs.CurvesNs.JSONPath
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Path combines multiple Curves into one continuous compound curve.
  * It does not matter how many Curves are in the Path or what type they are.
  * 
  * A Curve in a Path does not have to start where the previous Curve ends - that is to say, a Path does not
  * have to be an uninterrupted curve. Only the order of the Curves influences the actual points on the Path.
  */
@JSGlobal("Phaser.Curves.Path")
@js.native
/**
  * 
  * @param x The X coordinate of the Path's starting point or a {@link Phaser.Types.Curves.JSONPath}. Default 0.
  * @param y The Y coordinate of the Path's starting point. Default 0.
  */
class Path () extends js.Object {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  /**
    * Automatically closes the path.
    */
  var autoClose: Boolean = js.native
  /**
    * The cached length of each Curve in the Path.
    * 
    * Used internally by {@link #getCurveLengths}.
    */
  var cacheLengths: js.Array[Double] = js.native
  /**
    * The list of Curves which make up this Path.
    */
  var curves: js.Array[Curve] = js.native
  /**
    * The name of this Path.
    * Empty by default and never populated by Phaser, this is left for developers to use.
    */
  var name: String = js.native
  /**
    * The starting point of the Path.
    * 
    * This is not necessarily equivalent to the starting point of the first Curve in the Path. In an empty Path, it's also treated as the ending point.
    */
  var startPoint: Vector2 = js.native
  /**
    * Appends a Curve to the end of the Path.
    * 
    * The Curve does not have to start where the Path ends or, for an empty Path, at its defined starting point.
    * @param curve The Curve to append.
    */
  def add(curve: Curve): Path = js.native
  /**
    * Creates a circular Ellipse Curve positioned at the end of the Path.
    * @param radius The radius of the circle.
    * @param clockwise `true` to create a clockwise circle as opposed to a counter-clockwise circle. Default false.
    * @param rotation The rotation of the circle in degrees. Default 0.
    */
  def circleTo(radius: Double): Path = js.native
  def circleTo(radius: Double, clockwise: Boolean): Path = js.native
  def circleTo(radius: Double, clockwise: Boolean, rotation: Double): Path = js.native
  /**
    * Ensures that the Path is closed.
    * 
    * A closed Path starts and ends at the same point. If the Path is not closed, a straight Line Curve will be created from the ending point directly to the starting point. During the check, the actual starting point of the Path, i.e. the starting point of the first Curve, will be used as opposed to the Path's defined {@link startPoint}, which could differ.
    * 
    * Calling this method on an empty Path will result in an error.
    */
  def closePath(): Path = js.native
  /**
    * Creates a cubic bezier curve starting at the previous end point and ending at p3, using p1 and p2 as control points.
    * @param x The x coordinate of the end point. Or, if a Vec2, the p1 value.
    * @param y The y coordinate of the end point. Or, if a Vec2, the p2 value.
    * @param control1X The x coordinate of the first control point. Or, if a Vec2, the p3 value.
    * @param control1Y The y coordinate of the first control point. Not used if vec2s are provided as the first 3 arguments.
    * @param control2X The x coordinate of the second control point. Not used if vec2s are provided as the first 3 arguments.
    * @param control2Y The y coordinate of the second control point. Not used if vec2s are provided as the first 3 arguments.
    */
  def cubicBezierTo(x: Double, y: Double, control1X: Double): Path = js.native
  def cubicBezierTo(x: Double, y: Double, control1X: Double, control1Y: Double): Path = js.native
  def cubicBezierTo(x: Double, y: Double, control1X: Double, control1Y: Double, control2X: Double): Path = js.native
  def cubicBezierTo(x: Double, y: Double, control1X: Double, control1Y: Double, control2X: Double, control2Y: Double): Path = js.native
  def cubicBezierTo(x: Double, y: Double, control1X: Vector2): Path = js.native
  def cubicBezierTo(x: Double, y: Double, control1X: Vector2, control1Y: Double): Path = js.native
  def cubicBezierTo(x: Double, y: Double, control1X: Vector2, control1Y: Double, control2X: Double): Path = js.native
  def cubicBezierTo(x: Double, y: Double, control1X: Vector2, control1Y: Double, control2X: Double, control2Y: Double): Path = js.native
  def cubicBezierTo(x: Double, y: Vector2, control1X: Double): Path = js.native
  def cubicBezierTo(x: Double, y: Vector2, control1X: Double, control1Y: Double): Path = js.native
  def cubicBezierTo(x: Double, y: Vector2, control1X: Double, control1Y: Double, control2X: Double): Path = js.native
  def cubicBezierTo(x: Double, y: Vector2, control1X: Double, control1Y: Double, control2X: Double, control2Y: Double): Path = js.native
  def cubicBezierTo(x: Double, y: Vector2, control1X: Vector2): Path = js.native
  def cubicBezierTo(x: Double, y: Vector2, control1X: Vector2, control1Y: Double): Path = js.native
  def cubicBezierTo(x: Double, y: Vector2, control1X: Vector2, control1Y: Double, control2X: Double): Path = js.native
  def cubicBezierTo(x: Double, y: Vector2, control1X: Vector2, control1Y: Double, control2X: Double, control2Y: Double): Path = js.native
  def cubicBezierTo(x: Vector2, y: Double, control1X: Double): Path = js.native
  def cubicBezierTo(x: Vector2, y: Double, control1X: Double, control1Y: Double): Path = js.native
  def cubicBezierTo(x: Vector2, y: Double, control1X: Double, control1Y: Double, control2X: Double): Path = js.native
  def cubicBezierTo(x: Vector2, y: Double, control1X: Double, control1Y: Double, control2X: Double, control2Y: Double): Path = js.native
  def cubicBezierTo(x: Vector2, y: Double, control1X: Vector2): Path = js.native
  def cubicBezierTo(x: Vector2, y: Double, control1X: Vector2, control1Y: Double): Path = js.native
  def cubicBezierTo(x: Vector2, y: Double, control1X: Vector2, control1Y: Double, control2X: Double): Path = js.native
  def cubicBezierTo(x: Vector2, y: Double, control1X: Vector2, control1Y: Double, control2X: Double, control2Y: Double): Path = js.native
  def cubicBezierTo(x: Vector2, y: Vector2, control1X: Double): Path = js.native
  def cubicBezierTo(x: Vector2, y: Vector2, control1X: Double, control1Y: Double): Path = js.native
  def cubicBezierTo(x: Vector2, y: Vector2, control1X: Double, control1Y: Double, control2X: Double): Path = js.native
  def cubicBezierTo(x: Vector2, y: Vector2, control1X: Double, control1Y: Double, control2X: Double, control2Y: Double): Path = js.native
  def cubicBezierTo(x: Vector2, y: Vector2, control1X: Vector2): Path = js.native
  def cubicBezierTo(x: Vector2, y: Vector2, control1X: Vector2, control1Y: Double): Path = js.native
  def cubicBezierTo(x: Vector2, y: Vector2, control1X: Vector2, control1Y: Double, control2X: Double): Path = js.native
  def cubicBezierTo(
    x: Vector2,
    y: Vector2,
    control1X: Vector2,
    control1Y: Double,
    control2X: Double,
    control2Y: Double
  ): Path = js.native
  /**
    * [description]
    */
  def destroy(): Unit = js.native
  /**
    * Draws all Curves in the Path to a Graphics Game Object.
    * @param graphics The Graphics Game Object to draw to.
    * @param pointsTotal The number of points to draw for each Curve. Higher numbers result in a smoother curve but require more processing. Default 32.
    */
  def draw[G /* <: Graphics */](graphics: Graphics): G = js.native
  def draw[G /* <: Graphics */](graphics: Graphics, pointsTotal: integer): G = js.native
  /**
    * Creates an ellipse curve positioned at the previous end point, using the given parameters.
    * @param xRadius The horizontal radius of ellipse. Default 0.
    * @param yRadius The vertical radius of ellipse. Default 0.
    * @param startAngle The start angle of the ellipse, in degrees. Default 0.
    * @param endAngle The end angle of the ellipse, in degrees. Default 360.
    * @param clockwise Whether the ellipse angles are given as clockwise (`true`) or counter-clockwise (`false`). Default false.
    * @param rotation The rotation of the ellipse, in degrees. Default 0.
    */
  def ellipseTo(
    xRadius: js.UndefOr[Double],
    yRadius: js.UndefOr[Double],
    startAngle: js.UndefOr[integer],
    endAngle: js.UndefOr[integer],
    clockwise: js.UndefOr[Boolean],
    rotation: js.UndefOr[Double]
  ): Path = js.native
  /**
    * Creates a Path from a Path Configuration object.
    * 
    * The provided object should be a {@link Phaser.Types.Curves.JSONPath}, as returned by {@link #toJSON}. Providing a malformed object may cause errors.
    * @param data The JSON object containing the Path data.
    */
  def fromJSON(data: JSONPath): Path = js.native
  /**
    * Returns a Rectangle with a position and size matching the bounds of this Path.
    * @param out The Rectangle to store the bounds in.
    * @param accuracy The accuracy of the bounds calculations. Higher values are more accurate at the cost of calculation speed. Default 16.
    */
  def getBounds[O /* <: Vector2 */](): O = js.native
  def getBounds[O /* <: Vector2 */](out: O): O = js.native
  def getBounds[O /* <: Vector2 */](out: O, accuracy: integer): O = js.native
  /**
    * Returns an array containing the length of the Path at the end of each Curve.
    * 
    * The result of this method will be cached to avoid recalculating it in subsequent calls. The cache is only invalidated when the {@link #curves} array changes in length, leading to potential inaccuracies if a Curve in the Path is changed, or if a Curve is removed and another is added in its place.
    */
  def getCurveLengths(): js.Array[Double] = js.native
  /**
    * Returns the ending point of the Path.
    * 
    * A Path's ending point is equivalent to the ending point of the last Curve in the Path. For an empty Path, the ending point is at the Path's defined {@link #startPoint}.
    * @param out The object to store the point in.
    */
  def getEndPoint[O /* <: Vector2 */](): O = js.native
  def getEndPoint[O /* <: Vector2 */](out: O): O = js.native
  /**
    * Returns the total length of the Path.
    */
  def getLength(): Double = js.native
  /**
    * Calculates the coordinates of the point at the given normalized location (between 0 and 1) on the Path.
    * 
    * The location is relative to the entire Path, not to an individual Curve. A location of 0.5 is always in the middle of the Path and is thus an equal distance away from both its starting and ending points. In a Path with one Curve, it would be in the middle of the Curve; in a Path with two Curves, it could be anywhere on either one of them depending on their lengths.
    * @param t The location of the point to return, between 0 and 1.
    * @param out The object in which to store the calculated point.
    */
  def getPoint[O /* <: Vector2 */](t: Double): O = js.native
  def getPoint[O /* <: Vector2 */](t: Double, out: O): O = js.native
  /**
    * Returns the defined starting point of the Path.
    * 
    * This is not necessarily equal to the starting point of the first Curve if it differs from {@link startPoint}.
    * @param divisions The number of points to divide the path in to. Default 12.
    */
  def getPoints(): js.Array[Vector2] = js.native
  def getPoints(divisions: integer): js.Array[Vector2] = js.native
  /**
    * [description]
    * @param out `Vector2` instance that should be used for storing the result. If `undefined` a new `Vector2` will be created.
    */
  def getRandomPoint[O /* <: Vector2 */](): O = js.native
  def getRandomPoint[O /* <: Vector2 */](out: O): O = js.native
  /**
    * Creates a straight Line Curve from the ending point of the Path to the given coordinates.
    * @param divisions The X coordinate of the line's ending point, or the line's ending point as a `Vector2`. Default 40.
    */
  def getSpacedPoints(): js.Array[Vector2] = js.native
  def getSpacedPoints(divisions: integer): js.Array[Vector2] = js.native
  /**
    * [description]
    * @param out [description]
    */
  def getStartPoint[O /* <: Vector2 */](): O = js.native
  def getStartPoint[O /* <: Vector2 */](out: O): O = js.native
  /**
    * Creates a line curve from the previous end point to x/y
    * @param x [description]
    * @param y [description]
    */
  def lineTo(x: Double): Path = js.native
  def lineTo(x: Double, y: Double): Path = js.native
  def lineTo(x: Vector2): Path = js.native
  def lineTo(x: Vector2, y: Double): Path = js.native
  /**
    * [description]
    * @param x [description]
    * @param y [description]
    */
  def moveTo(x: Double, y: Double): Path = js.native
  def quadraticBezierTo(x: js.Array[Vector2]): Path = js.native
  def quadraticBezierTo(x: js.Array[Vector2], y: Double): Path = js.native
  def quadraticBezierTo(x: js.Array[Vector2], y: Double, controlX: Double): Path = js.native
  def quadraticBezierTo(x: js.Array[Vector2], y: Double, controlX: Double, controlY: Double): Path = js.native
  /**
    * Creates a Quadratic Bezier Curve starting at the ending point of the Path.
    * @param x The X coordinate of the second control point or, if it's a `Vector2`, the first control point.
    * @param y The Y coordinate of the second control point or, if `x` is a `Vector2`, the second control point.
    * @param controlX If `x` is not a `Vector2`, the X coordinate of the first control point.
    * @param controlY If `x` is not a `Vector2`, the Y coordinate of the first control point.
    */
  def quadraticBezierTo(x: Double): Path = js.native
  def quadraticBezierTo(x: Double, y: Double): Path = js.native
  def quadraticBezierTo(x: Double, y: Double, controlX: Double): Path = js.native
  def quadraticBezierTo(x: Double, y: Double, controlX: Double, controlY: Double): Path = js.native
  /**
    * [description]
    * @param points [description]
    */
  def splineTo(points: js.Array[Vector2]): Path = js.native
  /**
    * [description]
    */
  def toJSON(): JSONPath = js.native
  /**
    * cacheLengths must be recalculated.
    */
  def updateArcLengths(): Unit = js.native
}

