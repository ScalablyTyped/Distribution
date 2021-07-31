package typings.phaser.Phaser

import typings.phaser.Phaser.GameObjects.Graphics
import typings.phaser.Phaser.Geom.Point
import typings.phaser.Phaser.Geom.Rectangle
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Types.Curves.JSONCurve
import typings.phaser.Phaser.Types.Curves.JSONEllipseCurve
import typings.phaser.Phaser.Types.Curves.JSONPath
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Curves {
  
  /**
    * A higher-order Bézier curve constructed of four points.
    */
  @js.native
  trait CubicBezier
    extends StObject
       with Curve {
    
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
      * Returns a JSON object that describes this curve.
      */
    def toJSON(): JSONCurve = js.native
  }
  
  /**
    * A Base Curve class, which all other curve types extend.
    * 
    * Based on the three.js Curve classes created by [zz85](http://www.lab4games.net/zz85/blog)
    */
  @js.native
  trait Curve extends StObject {
    
    /**
      * For a curve on a Path, `false` means the Path will ignore this curve.
      */
    var active: Boolean = js.native
    
    /**
      * The quantity of arc length divisions within the curve.
      */
    var arcLengthDivisions: integer = js.native
    
    /**
      * An array of cached arc length values.
      */
    var cacheArcLengths: js.Array[Double] = js.native
    
    /**
      * The default number of divisions within the curve.
      */
    var defaultDivisions: integer = js.native
    
    /**
      * Draws this curve on the given Graphics object.
      * 
      * The curve is drawn using `Graphics.strokePoints` so will be drawn at whatever the present Graphics stroke color is.
      * The Graphics object is not cleared before the draw, so the curve will appear on-top of anything else already rendered to it.
      * @param graphics The Graphics instance onto which this curve will be drawn.
      * @param pointsTotal The resolution of the curve. The higher the value the smoother it will render, at the cost of rendering performance. Default 32.
      */
    def draw[G /* <: Graphics */](graphics: G): G = js.native
    def draw[G /* <: Graphics */](graphics: G, pointsTotal: integer): G = js.native
    
    /**
      * Returns a Rectangle where the position and dimensions match the bounds of this Curve.
      * 
      * You can control the accuracy of the bounds. The value given is used to work out how many points
      * to plot across the curve. Higher values are more accurate at the cost of calculation speed.
      * @param out The Rectangle to store the bounds in. If falsey a new object will be created.
      * @param accuracy The accuracy of the bounds calculations. Default 16.
      */
    def getBounds(): Rectangle = js.native
    def getBounds(out: Unit, accuracy: integer): Rectangle = js.native
    def getBounds(out: Rectangle): Rectangle = js.native
    def getBounds(out: Rectangle, accuracy: integer): Rectangle = js.native
    
    /**
      * Returns an array of points, spaced out X distance pixels apart.
      * The smaller the distance, the larger the array will be.
      * @param distance The distance, in pixels, between each point along the curve.
      */
    def getDistancePoints(distance: integer): js.Array[Point] = js.native
    
    /**
      * Get a point at the end of the curve.
      * @param out Optional Vector object to store the result in.
      */
    def getEndPoint(): Vector2 = js.native
    def getEndPoint(out: Vector2): Vector2 = js.native
    
    /**
      * Get total curve arc length
      */
    def getLength(): Double = js.native
    
    /**
      * Get a list of cumulative segment lengths.
      * 
      * These lengths are
      * 
      * - [0] 0
      * - [1] The first segment
      * - [2] The first and second segment
      * - ...
      * - [divisions] All segments
      * @param divisions The number of divisions or segments.
      */
    def getLengths(): js.Array[Double] = js.native
    def getLengths(divisions: integer): js.Array[Double] = js.native
    
    /**
      * Get a point at a relative position on the curve, by arc length.
      * @param u The relative position, [0..1].
      * @param out A point to store the result in.
      */
    def getPointAt[O /* <: Vector2 */](u: Double): O = js.native
    def getPointAt[O /* <: Vector2 */](u: Double, out: O): O = js.native
    
    /**
      * Get a sequence of evenly spaced points from the curve.
      * 
      * You can pass `divisions`, `stepRate`, or neither.
      * 
      * The number of divisions will be
      * 
      * 1. `divisions`, if `divisions` > 0; or
      * 2. `this.getLength / stepRate`, if `stepRate` > 0; or
      * 3. `this.defaultDivisions`
      * 
      * `1 + divisions` points will be returned.
      * @param divisions The number of divisions to make.
      * @param stepRate The curve distance between points, implying `divisions`.
      * @param out An optional array to store the points in.
      */
    def getPoints[O /* <: js.Array[Vector2] */](): O = js.native
    def getPoints[O /* <: js.Array[Vector2] */](divisions: Unit, stepRate: Double): O = js.native
    def getPoints[O /* <: js.Array[Vector2] */](divisions: Unit, stepRate: Double, out: O): O = js.native
    def getPoints[O /* <: js.Array[Vector2] */](divisions: Unit, stepRate: Unit, out: O): O = js.native
    def getPoints[O /* <: js.Array[Vector2] */](divisions: integer): O = js.native
    def getPoints[O /* <: js.Array[Vector2] */](divisions: integer, stepRate: Double): O = js.native
    def getPoints[O /* <: js.Array[Vector2] */](divisions: integer, stepRate: Double, out: O): O = js.native
    def getPoints[O /* <: js.Array[Vector2] */](divisions: integer, stepRate: Unit, out: O): O = js.native
    
    /**
      * Get a random point from the curve.
      * @param out A point object to store the result in.
      */
    def getRandomPoint[O /* <: Vector2 */](): O = js.native
    def getRandomPoint[O /* <: Vector2 */](out: O): O = js.native
    
    /**
      * Get a sequence of equally spaced points (by arc distance) from the curve.
      * 
      * `1 + divisions` points will be returned.
      * @param divisions The number of divisions to make. Default this.defaultDivisions.
      * @param stepRate Step between points. Used to calculate the number of points to return when divisions is falsy. Ignored if divisions is positive.
      * @param out An optional array to store the points in.
      */
    def getSpacedPoints(): js.Array[Vector2] = js.native
    def getSpacedPoints(divisions: Unit, stepRate: Double): js.Array[Vector2] = js.native
    def getSpacedPoints(divisions: Unit, stepRate: Double, out: js.Array[js.Any | Vector2]): js.Array[Vector2] = js.native
    def getSpacedPoints(divisions: Unit, stepRate: Unit, out: js.Array[js.Any | Vector2]): js.Array[Vector2] = js.native
    def getSpacedPoints(divisions: integer): js.Array[Vector2] = js.native
    def getSpacedPoints(divisions: integer, stepRate: Double): js.Array[Vector2] = js.native
    def getSpacedPoints(divisions: integer, stepRate: Double, out: js.Array[js.Any | Vector2]): js.Array[Vector2] = js.native
    def getSpacedPoints(divisions: integer, stepRate: Unit, out: js.Array[js.Any | Vector2]): js.Array[Vector2] = js.native
    
    /**
      * Get a point at the start of the curve.
      * @param out A point to store the result in.
      */
    def getStartPoint[O /* <: Vector2 */](): O = js.native
    def getStartPoint[O /* <: Vector2 */](out: O): O = js.native
    
    /**
      * Given a distance in pixels, get a t to find p.
      * @param distance The distance, in pixels.
      * @param divisions Optional amount of divisions.
      */
    def getTFromDistance(distance: integer): Double = js.native
    def getTFromDistance(distance: integer, divisions: integer): Double = js.native
    
    /**
      * Get a unit vector tangent at a relative position on the curve.
      * In case any sub curve does not implement its tangent derivation,
      * 2 points a small delta apart will be used to find its gradient
      * which seems to give a reasonable approximation
      * @param t The relative position on the curve, [0..1].
      * @param out A vector to store the result in.
      */
    def getTangent[O /* <: Vector2 */](t: Double): O = js.native
    def getTangent[O /* <: Vector2 */](t: Double, out: O): O = js.native
    
    /**
      * Get a unit vector tangent at a relative position on the curve, by arc length.
      * @param u The relative position on the curve, [0..1].
      * @param out A vector to store the result in.
      */
    def getTangentAt[O /* <: Vector2 */](u: Double): O = js.native
    def getTangentAt[O /* <: Vector2 */](u: Double, out: O): O = js.native
    
    /**
      * Given u ( 0 .. 1 ), get a t to find p. This gives you points which are equidistant.
      * @param u A float between 0 and 1.
      * @param distance The distance, in pixels.
      * @param divisions Optional amount of divisions.
      */
    def getUtoTmapping(u: Double, distance: integer): Double = js.native
    def getUtoTmapping(u: Double, distance: integer, divisions: integer): Double = js.native
    
    /**
      * Does the data of this curve need updating?
      */
    var needsUpdate: Boolean = js.native
    
    /**
      * String based identifier for the type of curve.
      */
    var `type`: String = js.native
    
    /**
      * Calculate and cache the arc lengths.
      */
    def updateArcLengths(): Unit = js.native
  }
  
  /**
    * An Elliptical Curve derived from the Base Curve class.
    * 
    * See https://en.wikipedia.org/wiki/Elliptic_curve for more details.
    */
  @js.native
  trait Ellipse
    extends StObject
       with Curve {
    
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
      * Get point at relative position in curve according to length.
      * @param t The position along the curve to return. Where 0 is the start and 1 is the end.
      * @param out A Vector2 object to store the result in. If not given will be created.
      */
    def getPoint[O /* <: Vector2 */](t: Double): O = js.native
    def getPoint[O /* <: Vector2 */](t: Double, out: O): O = js.native
    
    /**
      * Get the resolution of the curve.
      * @param divisions Optional divisions value.
      */
    def getResolution(divisions: Double): Double = js.native
    
    /**
      * The center point of the ellipse. Used for calculating rotation.
      */
    var p0: Vector2 = js.native
    
    /**
      * The rotation of the ellipse, relative to the center, in radians.
      */
    var rotation: Double = js.native
    
    /**
      * Sets if this curve extends clockwise or anti-clockwise.
      * @param value The clockwise state of this curve.
      */
    def setClockwise(value: Boolean): this.type = js.native
    
    /**
      * Sets the end angle of this curve.
      * @param value The end angle of this curve, in radians.
      */
    def setEndAngle(value: Double): this.type = js.native
    
    /**
      * Sets the height of this curve.
      * @param value The height of this curve.
      */
    def setHeight(value: Double): this.type = js.native
    
    /**
      * Sets the rotation of this curve.
      * @param value The rotation of this curve, in radians.
      */
    def setRotation(value: Double): this.type = js.native
    
    /**
      * Sets the start angle of this curve.
      * @param value The start angle of this curve, in radians.
      */
    def setStartAngle(value: Double): this.type = js.native
    
    /**
      * Sets the width of this curve.
      * @param value The width of this curve.
      */
    def setWidth(value: Double): this.type = js.native
    
    /**
      * Sets the horizontal radius of this curve.
      * @param value The horizontal radius of this curve.
      */
    def setXRadius(value: Double): this.type = js.native
    
    /**
      * Sets the vertical radius of this curve.
      * @param value The vertical radius of this curve.
      */
    def setYRadius(value: Double): this.type = js.native
    
    /**
      * The start angle of the ellipse in degrees.
      */
    var startAngle: Double = js.native
    
    /**
      * JSON serialization of the curve.
      */
    def toJSON(): JSONEllipseCurve = js.native
    
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
  }
  
  /**
    * A LineCurve is a "curve" comprising exactly two points (a line segment).
    */
  @js.native
  trait Line
    extends StObject
       with Curve {
    
    def getBounds[O /* <: Rectangle */](out: O): O = js.native
    
    /**
      * Get point at relative position in curve according to length.
      * @param t The position along the curve to return. Where 0 is the start and 1 is the end.
      * @param out A Vector2 object to store the result in. If not given will be created.
      */
    def getPoint[O /* <: Vector2 */](t: Double): O = js.native
    def getPoint[O /* <: Vector2 */](t: Double, out: O): O = js.native
    
    /**
      * Gets the resolution of the line.
      * @param divisions The number of divisions to consider. Default 1.
      */
    def getResolution(): Double = js.native
    def getResolution(divisions: Double): Double = js.native
    
    /**
      * Gets the slope of the line as a unit vector.
      */
    def getTangent[O /* <: Vector2 */](): O = js.native
    
    /**
      * The first endpoint.
      */
    var p0: Vector2 = js.native
    
    /**
      * The second endpoint.
      */
    var p1: Vector2 = js.native
    
    /**
      * Gets a JSON representation of the line.
      */
    def toJSON(): JSONCurve = js.native
  }
  
  /**
    * A MoveTo Curve is a very simple curve consisting of only a single point. Its intended use is to move the ending point in a Path.
    */
  @js.native
  trait MoveTo extends StObject {
    
    /**
      * Denotes that this Curve does not influence the bounds, points, and drawing of its parent Path. Must be `false` or some methods in the parent Path will throw errors.
      */
    var active: Boolean = js.native
    
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
      * The lone point which this curve consists of.
      */
    var p0: Vector2 = js.native
    
    /**
      * Converts this curve into a JSON-serializable object.
      */
    def toJSON(): JSONCurve = js.native
  }
  
  /**
    * A Path combines multiple Curves into one continuous compound curve.
    * It does not matter how many Curves are in the Path or what type they are.
    * 
    * A Curve in a Path does not have to start where the previous Curve ends - that is to say, a Path does not
    * have to be an uninterrupted curve. Only the order of the Curves influences the actual points on the Path.
    */
  @js.native
  trait Path extends StObject {
    
    /**
      * Appends a Curve to the end of the Path.
      * 
      * The Curve does not have to start where the Path ends or, for an empty Path, at its defined starting point.
      * @param curve The Curve to append.
      */
    def add(curve: Curve): this.type = js.native
    
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
      * Creates a circular Ellipse Curve positioned at the end of the Path.
      * @param radius The radius of the circle.
      * @param clockwise `true` to create a clockwise circle as opposed to a counter-clockwise circle. Default false.
      * @param rotation The rotation of the circle in degrees. Default 0.
      */
    def circleTo(radius: Double): this.type = js.native
    def circleTo(radius: Double, clockwise: Boolean): this.type = js.native
    def circleTo(radius: Double, clockwise: Boolean, rotation: Double): this.type = js.native
    def circleTo(radius: Double, clockwise: Unit, rotation: Double): this.type = js.native
    
    /**
      * Ensures that the Path is closed.
      * 
      * A closed Path starts and ends at the same point. If the Path is not closed, a straight Line Curve will be created from the ending point directly to the starting point. During the check, the actual starting point of the Path, i.e. the starting point of the first Curve, will be used as opposed to the Path's defined {@link startPoint}, which could differ.
      * 
      * Calling this method on an empty Path will result in an error.
      */
    def closePath(): this.type = js.native
    
    /**
      * Creates a cubic bezier curve starting at the previous end point and ending at p3, using p1 and p2 as control points.
      * @param x The x coordinate of the end point. Or, if a Vector2, the p1 value.
      * @param y The y coordinate of the end point. Or, if a Vector2, the p2 value.
      * @param control1X The x coordinate of the first control point. Or, if a Vector2, the p3 value.
      * @param control1Y The y coordinate of the first control point. Not used if Vector2s are provided as the first 3 arguments.
      * @param control2X The x coordinate of the second control point. Not used if Vector2s are provided as the first 3 arguments.
      * @param control2Y The y coordinate of the second control point. Not used if Vector2s are provided as the first 3 arguments.
      */
    def cubicBezierTo(
      x: Double | Vector2,
      y: Double | Vector2,
      control1X: Double | Vector2,
      control1Y: js.UndefOr[Double],
      control2X: js.UndefOr[Double],
      control2Y: js.UndefOr[Double]
    ): this.type = js.native
    
    /**
      * The list of Curves which make up this Path.
      */
    var curves: js.Array[Curve] = js.native
    
    /**
      * Disposes of this Path, clearing its internal references to objects so they can be garbage-collected.
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
    ): this.type = js.native
    
    /**
      * Creates a Path from a Path Configuration object.
      * 
      * The provided object should be a {@link Phaser.Types.Curves.JSONPath}, as returned by {@link #toJSON}. Providing a malformed object may cause errors.
      * @param data The JSON object containing the Path data.
      */
    def fromJSON(data: JSONPath): this.type = js.native
    
    /**
      * Returns a Rectangle with a position and size matching the bounds of this Path.
      * @param out The Rectangle to store the bounds in.
      * @param accuracy The accuracy of the bounds calculations. Higher values are more accurate at the cost of calculation speed. Default 16.
      */
    def getBounds[O /* <: Vector2 */](): O = js.native
    def getBounds[O /* <: Vector2 */](out: O): O = js.native
    def getBounds[O /* <: Vector2 */](out: O, accuracy: integer): O = js.native
    def getBounds[O /* <: Vector2 */](out: Unit, accuracy: integer): O = js.native
    
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
      * Get a sequence of points on the path.
      * @param divisions The number of divisions per resolution per curve. Default 12.
      */
    def getPoints(): js.Array[Vector2] = js.native
    def getPoints(divisions: integer): js.Array[Vector2] = js.native
    
    /**
      * Returns a randomly chosen point anywhere on the path. This follows the same rules as `getPoint` in that it may return a point on any Curve inside this path.
      * 
      * When calling this method multiple times, the points are not guaranteed to be equally spaced spatially.
      * @param out `Vector2` instance that should be used for storing the result. If `undefined` a new `Vector2` will be created.
      */
    def getRandomPoint[O /* <: Vector2 */](): O = js.native
    def getRandomPoint[O /* <: Vector2 */](out: O): O = js.native
    
    /**
      * Divides this Path into a set of equally spaced points,
      * 
      * The resulting points are equally spaced with respect to the points' position on the path, but not necessarily equally spaced spatially.
      * @param divisions The amount of points to divide this Path into. Default 40.
      */
    def getSpacedPoints(): js.Array[Vector2] = js.native
    def getSpacedPoints(divisions: integer): js.Array[Vector2] = js.native
    
    /**
      * Returns the starting point of the Path.
      * @param out `Vector2` instance that should be used for storing the result. If `undefined` a new `Vector2` will be created.
      */
    def getStartPoint[O /* <: Vector2 */](): O = js.native
    def getStartPoint[O /* <: Vector2 */](out: O): O = js.native
    
    /**
      * Gets a unit vector tangent at a relative position on the path.
      * @param t The relative position on the path, [0..1].
      * @param out A vector to store the result in.
      */
    def getTangent[O /* <: Vector2 */](t: Double): O = js.native
    def getTangent[O /* <: Vector2 */](t: Double, out: O): O = js.native
    
    /**
      * Creates a line curve from the previous end point to x/y.
      * @param x The X coordinate of the line's end point, or a `Vector2` containing the entire end point.
      * @param y The Y coordinate of the line's end point, if a number was passed as the X parameter.
      */
    def lineTo(x: Double): this.type = js.native
    def lineTo(x: Double, y: Double): this.type = js.native
    def lineTo(x: Vector2): this.type = js.native
    def lineTo(x: Vector2, y: Double): this.type = js.native
    
    /**
      * Creates a "gap" in this path from the path's current end point to the given coordinates.
      * 
      * After calling this function, this Path's end point will be equal to the given coordinates
      * @param x The X coordinate of the position to move the path's end point to, or a `Vector2` containing the entire new end point.
      * @param y The Y coordinate of the position to move the path's end point to, if a number was passed as the X coordinate.
      */
    def moveTo(x: Double): this.type = js.native
    def moveTo(x: Double, y: Double): this.type = js.native
    def moveTo(x: Vector2): this.type = js.native
    def moveTo(x: Vector2, y: Double): this.type = js.native
    
    /**
      * The name of this Path.
      * Empty by default and never populated by Phaser, this is left for developers to use.
      */
    var name: String = js.native
    
    def quadraticBezierTo(x: js.Array[Vector2]): this.type = js.native
    def quadraticBezierTo(x: js.Array[Vector2], y: Double): this.type = js.native
    def quadraticBezierTo(x: js.Array[Vector2], y: Double, controlX: Double): this.type = js.native
    def quadraticBezierTo(x: js.Array[Vector2], y: Double, controlX: Double, controlY: Double): this.type = js.native
    def quadraticBezierTo(x: js.Array[Vector2], y: Double, controlX: Unit, controlY: Double): this.type = js.native
    def quadraticBezierTo(x: js.Array[Vector2], y: Unit, controlX: Double): this.type = js.native
    def quadraticBezierTo(x: js.Array[Vector2], y: Unit, controlX: Double, controlY: Double): this.type = js.native
    def quadraticBezierTo(x: js.Array[Vector2], y: Unit, controlX: Unit, controlY: Double): this.type = js.native
    /**
      * Creates a Quadratic Bezier Curve starting at the ending point of the Path.
      * @param x The X coordinate of the second control point or, if it's a `Vector2`, the first control point.
      * @param y The Y coordinate of the second control point or, if `x` is a `Vector2`, the second control point.
      * @param controlX If `x` is not a `Vector2`, the X coordinate of the first control point.
      * @param controlY If `x` is not a `Vector2`, the Y coordinate of the first control point.
      */
    def quadraticBezierTo(x: Double): this.type = js.native
    def quadraticBezierTo(x: Double, y: Double): this.type = js.native
    def quadraticBezierTo(x: Double, y: Double, controlX: Double): this.type = js.native
    def quadraticBezierTo(x: Double, y: Double, controlX: Double, controlY: Double): this.type = js.native
    def quadraticBezierTo(x: Double, y: Double, controlX: Unit, controlY: Double): this.type = js.native
    def quadraticBezierTo(x: Double, y: Unit, controlX: Double): this.type = js.native
    def quadraticBezierTo(x: Double, y: Unit, controlX: Double, controlY: Double): this.type = js.native
    def quadraticBezierTo(x: Double, y: Unit, controlX: Unit, controlY: Double): this.type = js.native
    
    /**
      * Creates a spline curve starting at the previous end point, using the given points on the curve.
      * @param points The points the newly created spline curve should consist of.
      */
    def splineTo(points: js.Array[Vector2]): this.type = js.native
    
    /**
      * The starting point of the Path.
      * 
      * This is not necessarily equivalent to the starting point of the first Curve in the Path. In an empty Path, it's also treated as the ending point.
      */
    var startPoint: Vector2 = js.native
    
    /**
      * Converts this Path to a JSON object containing the path information and its constituent curves.
      */
    def toJSON(): JSONPath = js.native
    
    /**
      * cacheLengths must be recalculated.
      */
    def updateArcLengths(): Unit = js.native
  }
  
  /**
    * A quadratic Bézier curve constructed from two control points.
    */
  @js.native
  trait QuadraticBezier
    extends StObject
       with Curve {
    
    /**
      * Get point at relative position in curve according to length.
      * @param t The position along the curve to return. Where 0 is the start and 1 is the end.
      * @param out A Vector2 object to store the result in. If not given will be created.
      */
    def getPoint[O /* <: Vector2 */](t: Double): O = js.native
    def getPoint[O /* <: Vector2 */](t: Double, out: O): O = js.native
    
    /**
      * Get the resolution of the curve.
      * @param divisions Optional divisions value.
      */
    def getResolution(divisions: Double): Double = js.native
    
    /**
      * The start point.
      */
    var p0: Vector2 = js.native
    
    /**
      * The first control point.
      */
    var p1: Vector2 = js.native
    
    /**
      * The second control point.
      */
    var p2: Vector2 = js.native
    
    /**
      * Converts the curve into a JSON compatible object.
      */
    def toJSON(): JSONCurve = js.native
  }
  
  /**
    * Create a smooth 2d spline curve from a series of points.
    */
  @js.native
  trait Spline
    extends StObject
       with Curve {
    
    /**
      * Add a point to the current list of Vector2 points of the curve.
      * @param x The x coordinate of this curve
      * @param y The y coordinate of this curve
      */
    def addPoint(x: Double, y: Double): Vector2 = js.native
    
    /**
      * Add a list of points to the current list of Vector2 points of the curve.
      * @param points The points that configure the curve.
      */
    def addPoints(points: js.Array[js.Array[Double] | Double | Vector2]): this.type = js.native
    
    /**
      * Get point at relative position in curve according to length.
      * @param t The position along the curve to return. Where 0 is the start and 1 is the end.
      * @param out A Vector2 object to store the result in. If not given will be created.
      */
    def getPoint[O /* <: Vector2 */](t: Double): O = js.native
    def getPoint[O /* <: Vector2 */](t: Double, out: O): O = js.native
    
    /**
      * Get the resolution of the curve.
      * @param divisions Optional divisions value.
      */
    def getResolution(divisions: Double): Double = js.native
    
    /**
      * The Vector2 points that configure the curve.
      */
    var points: js.Array[Vector2] = js.native
    
    /**
      * Exports a JSON object containing this curve data.
      */
    def toJSON(): JSONCurve = js.native
  }
}
