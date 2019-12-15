package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The Point object represents a point in the two dimensional space
  * of the Paper.js project. It is also used to represent two dimensional
  * vector objects.
  */
@JSGlobal("paper.Point")
@js.native
class Point protected () extends js.Object {
  /** 
    * Creates a Point object using the numbers in the given array as
    * coordinates.
    */
  def this(array: js.Array[_]) = this()
  /** 
    * Creates a Point object using the properties in the given object.
    * 
    * @param object - the object describing the point's properties
    */
  def this(`object`: js.Object) = this()
  /** 
    * Creates a Point object using the coordinates of the given Point object.
    */
  def this(point: Point) = this()
  /** 
    * Creates a Point object using the width and height values of the given
    * Size object.
    */
  def this(size: Size) = this()
  /** 
    * Creates a Point object with the given x and y coordinates.
    * 
    * @param x - the x coordinate
    * @param y - the y coordinate
    */
  def this(x: Double, y: Double) = this()
  /** 
    * The vector's angle in degrees, measured from the x-axis to the vector.
    */
  var angle: Double = js.native
  /** 
    * The vector's angle in radians, measured from the x-axis to the vector.
    */
  var angleInRadians: Double = js.native
  /** 
    * The length of the vector that is represented by this point's coordinates.
    * Each point can be interpreted as a vector that points from the origin (`x
    * = 0`, `y = 0`) to the point's location. Setting the length changes the
    * location but keeps the vector's angle.
    */
  var length: Double = js.native
  /** 
    * The quadrant of the {@link #angle} of the point.
    * 
    * Angles between 0 and 90 degrees are in quadrant `1`. Angles between 90
    * and 180 degrees are in quadrant `2`, angles between 180 and 270 degrees
    * are in quadrant `3` and angles between 270 and 360 degrees are in
    * quadrant `4`.
    */
  val quadrant: Double = js.native
  /** 
    * This property is only valid if the point is an anchor or handle point
    * of a {@link Segment} or a {@link Curve}, or the position of an
    * {@link Item}, as returned by {@link Item#position},
    * {@link Segment#point}, {@link Segment#handleIn},
    * {@link Segment#handleOut}, {@link Curve#point1}, {@link Curve#point2},
    * {@link Curve#handle1}, {@link Curve#handle2}.
    * 
    * In those cases, it returns {@true if it the point is selected}.
    * 
    * Paper.js renders selected points on top of your project. This is very
    * useful when debugging.
    */
  var selected: Boolean = js.native
  /** 
    * The x coordinate of the point
    */
  var x: Double = js.native
  /** 
    * The y coordinate of the point
    */
  var y: Double = js.native
  /** 
    * Returns a new point with the absolute values of the specified {@link #x}
    * and {@link #y} values. The object itself is not modified!
    */
  def abs(): Point = js.native
  /** 
    * Returns the addition of the supplied value to both coordinates of
    * the point as a new point.
    * The object itself is not modified!
    * 
    * @param number - the number to add
    * 
    * @return the addition of the point and the value as a new point
    */
  def add(number: Double): Point = js.native
  /** 
    * Returns the addition of the supplied point to the point as a new
    * point.
    * The object itself is not modified!
    * 
    * @param point - the point to add
    * 
    * @return the addition of the two points as a new point
    */
  def add(point: Point): Point = js.native
  /** 
    * Returns a new point with the nearest greater non-fractional values to the
    * specified {@link #x} and {@link #y} values. The object itself is not
    * modified!
    */
  def ceil(): Point = js.native
  /** 
    * Returns the cross product of the point and another point.
    * 
    * @return the cross product of the two points
    */
  def cross(point: Point): Double = js.native
  /** 
    * Returns the division of the supplied value to both coordinates of
    * the point as a new point.
    * The object itself is not modified!
    * 
    * @param number - the number to divide by
    * 
    * @return the division of the point and the value as a new point
    */
  def divide(number: Double): Point = js.native
  /** 
    * Returns the division of the supplied point to the point as a new
    * point.
    * The object itself is not modified!
    * 
    * @param point - the point to divide by
    * 
    * @return the division of the two points as a new point
    */
  def divide(point: Point): Point = js.native
  /** 
    * Returns the dot product of the point and another point.
    * 
    * @return the dot product of the two points
    */
  def dot(point: Point): Double = js.native
  /** 
    * Checks whether the coordinates of the point are equal to that of the
    * supplied point.
    * 
    * @return true if the points are equal
    */
  def equals(point: Point): Boolean = js.native
  /** 
    * Returns a new point with the nearest smaller non-fractional values to the
    * specified {@link #x} and {@link #y} values. The object itself is not
    * modified!
    */
  def floor(): Point = js.native
  /** 
    * Returns the smaller angle between two vectors. The angle is unsigned, no
    * information about rotational direction is given.
    * 
    * @return the angle in degrees
    */
  def getAngle(point: Point): Double = js.native
  /** 
    * Returns the smaller angle between two vectors in radians. The angle is
    * unsigned, no information about rotational direction is given.
    * 
    * @return the angle in radians
    */
  def getAngleInRadians(point: Point): Double = js.native
  /** 
    * Returns the angle between two vectors. The angle is directional and
    * signed, giving information about the rotational direction.
    * 
    * Read more about angle units and orientation in the description of the
    * {@link #angle} property.
    * 
    * @return the angle between the two vectors
    */
  def getDirectedAngle(point: Point): Double = js.native
  /** 
    * Returns the distance between the point and another point.
    * 
    * @param squared - Controls whether the distance should
    * remain squared, or its square root should be calculated
    */
  def getDistance(point: Point): Double = js.native
  def getDistance(point: Point, squared: Boolean): Double = js.native
  /** 
    * Checks if the point is within a given distance of another point.
    * 
    * @param point - the point to check against
    * @param tolerance - the maximum distance allowed
    * 
    * @return true if it is within the given distance
    */
  def isClose(point: Point, tolerance: Double): Boolean = js.native
  /** 
    * Checks if the vector represented by this point is collinear (parallel) to
    * another vector.
    * 
    * @param point - the vector to check against
    * 
    * @return true it is collinear
    */
  def isCollinear(point: Point): Boolean = js.native
  /** 
    * Checks if the vector is within the specified quadrant. Note that if the
    * vector lies on the boundary between two quadrants, `true` will be
    * returned for both quadrants.
    * 
    * @see #quadrant
    * 
    * @param quadrant - the quadrant to check against
    * 
    * @return true if either x or y are not a number
    */
  def isInQuadrant(quadrant: Double): Boolean = js.native
  /** 
    * Checks whether the point is inside the boundaries of the rectangle.
    * 
    * @param rect - the rectangle to check against
    * 
    * @return true if the point is inside the rectangle
    */
  def isInside(rect: Rectangle): Boolean = js.native
  /** 
    * Checks if this point has an undefined value for at least one of its
    * coordinates.
    * 
    * @return true if either x or y are not a number
    */
  def isNaN(): Boolean = js.native
  /** 
    * Checks if the vector represented by this point is orthogonal
    * (perpendicular) to another vector.
    * 
    * @param point - the vector to check against
    * 
    * @return true it is orthogonal
    */
  def isOrthogonal(point: Point): Boolean = js.native
  /** 
    * Checks if this point has both the x and y coordinate set to 0.
    * 
    * @return true if both x and y are 0
    */
  def isZero(): Boolean = js.native
  /** 
    * The modulo operator returns the integer remainders of dividing the point
    * by the supplied value as a new point.
    * 
    * @return the integer remainders of dividing the points by each
    * other as a new point
    */
  def modulo(point: Point): Point = js.native
  /** 
    * The modulo operator returns the integer remainders of dividing the point
    * by the supplied value as a new point.
    * 
    * @return the integer remainders of dividing the point by the value
    * as a new point
    */
  def modulo(value: Double): Point = js.native
  /** 
    * Returns the multiplication of the supplied value to both coordinates of
    * the point as a new point.
    * The object itself is not modified!
    * 
    * @param number - the number to multiply by
    * 
    * @return the multiplication of the point and the value as a new
    *     point
    */
  def multiply(number: Double): Point = js.native
  /** 
    * Returns the multiplication of the supplied point to the point as a new
    * point.
    * The object itself is not modified!
    * 
    * @param point - the point to multiply by
    * 
    * @return the multiplication of the two points as a new point
    */
  def multiply(point: Point): Point = js.native
  /** 
    * Normalize modifies the {@link #length} of the vector to `1` without
    * changing its angle and returns it as a new point. The optional `length`
    * parameter defines the length to normalize to. The object itself is not
    * modified!
    * 
    * @param length - The length of the normalized vector
    * 
    * @return the normalized vector of the vector that is represented
    *     by this point's coordinates
    */
  def normalize(): Point = js.native
  def normalize(length: Double): Point = js.native
  /** 
    * Returns the projection of the point onto another point.
    * Both points are interpreted as vectors.
    * 
    * @return the projection of the point onto another point
    */
  def project(point: Point): Point = js.native
  /** 
    * Rotates the point by the given angle around an optional center point.
    * The object itself is not modified.
    * 
    * Read more about angle units and orientation in the description of the
    * {@link #angle} property.
    * 
    * @param angle - the rotation angle
    * @param center - the center point of the rotation
    * 
    * @return the rotated point
    */
  def rotate(angle: Double, center: Point): Point = js.native
  /** 
    * Returns a new point with rounded {@link #x} and {@link #y} values. The
    * object itself is not modified!
    */
  def round(): Point = js.native
  /** 
    * Sets the point to the passed values. Note that any sequence of parameters
    * that is supported by the various {@link Point} constructors also work
    * for calls of `set()`.
    */
  def set(values: js.Any*): Point = js.native
  /** 
    * Returns the subtraction of the supplied value to both coordinates of
    * the point as a new point.
    * The object itself is not modified!
    * 
    * @param number - the number to subtract
    * 
    * @return the subtraction of the point and the value as a new point
    */
  def subtract(number: Double): Point = js.native
  /** 
    * Returns the subtraction of the supplied point to the point as a new
    * point.
    * The object itself is not modified!
    * 
    * @param point - the point to subtract
    * 
    * @return the subtraction of the two points as a new point
    */
  def subtract(point: Point): Point = js.native
  /** 
    * Transforms the point by the matrix as a new point. The object itself is
    * not modified!
    * 
    * @return the transformed point
    */
  def transform(matrix: Matrix): Point = js.native
}

/* static members */
@JSGlobal("paper.Point")
@js.native
object Point extends js.Object {
  /** 
    * Returns a new point object with the largest {@link #x} and
    * {@link #y} of the supplied points.
    * 
    * @return the newly created point object
    */
  def max(point1: Point, point2: Point): Point = js.native
  /** 
    * Returns a new point object with the smallest {@link #x} and
    * {@link #y} of the supplied points.
    * 
    * @return the newly created point object
    */
  def min(point1: Point, point2: Point): Point = js.native
  /** 
    * Returns a point object with random {@link #x} and {@link #y} values
    * between `0` and `1`.
    * 
    * @return the newly created point object
    */
  def random(): Point = js.native
}

