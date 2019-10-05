package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Point")
@js.native
class Point protected () extends Base {
  /**
    * Creates a Point object using the properties in the given object.
    * @param object - the object describing the point's properties
    */
  def this(`object`: js.Any) = this()
  /**
    * Creates a Point object using the coordinates of the given Point object.
    * @param point - the point to copy
    */
  def this(point: Point) = this()
  /**
    * Creates a Point object using the width and height values of the given Size object.
    * @param size - the size width and height to use
    */
  def this(size: Size) = this()
  /**
    * Creates a Point object using the numbers in the given array as coordinates.
    * @param array - an array of numbers to use as coordinates
    */
  def this(values: js.Array[Double]) = this()
  /**
    * Creates a Point object with the given x and y coordinates.
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
    * Each point can be interpreted as a vector that points from the origin (x = 0, y = 0) to the point's location.
    * Setting the length changes the location but keeps the vector's angle.
    */
  var length: Double = js.native
  /**
    * The quadrant of the angle of the point.
    * Angles between 0 and 90 degrees are in quadrant 1. Angles between 90 and 180 degrees are in quadrant 2, angles between 180 and 270 degrees are in quadrant 3 and angles between 270 and 360 degrees are in quadrant 4.
    * Read only.
    */
  val quadrant: Double = js.native
  /**
    * This property is only present if the point is an anchor or control point of a Segment or a Curve. In this case, it returns true it is selected, false otherwise
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
    * Returns a new point with the absolute values of the specified x and y values. The object itself is not modified!
    */
  def abs(): Point = js.native
  def add(point: js.Array[Double]): Point = js.native
  def add(point: Double): Point = js.native
  /*
    * Returns a new point
    * @param point - The point you want to add with
    */
  def add(point: Point): Point = js.native
  /**
    * Returns a new point with the nearest greater non-fractional values to the specified x and y values. The object itself is not modified!
    */
  def ceil(): Point = js.native
  /**
    * Returns the cross product of the point and another point.
    * @param point -
    */
  def cross(point: Point): Double = js.native
  def divide(point: js.Array[Double]): Point = js.native
  def divide(point: Double): Point = js.native
  /*
    * Returns the new divided point
    * @param point - The point you want to divide with
    */
  def divide(point: Point): Point = js.native
  /**
    * Returns the dot product of the point and another point.
    * @param point -
    */
  def dot(point: Point): Double = js.native
  /**
    * Checks whether the coordinates of the point are equal to that of the supplied point.
    * @param point - the point to check against
    */
  def equals(point: Point): Boolean = js.native
  /**
    * Returns a new point with the nearest smaller non-fractional values to the specified x and y values. The object itself is not modified!
    */
  def floor(): Point = js.native
  /**
    * Returns the smaller angle between two vectors. The angle is unsigned, no information about rotational direction is given.
    * @param point -
    */
  def getAngle(Point: Point): Double = js.native
  /**
    * Returns the smaller angle between two vectors in radians. The angle is unsigned, no information about rotational direction is given.
    * @param point: Point
    */
  def getAngleInRadians(point: Point): Double = js.native
  /**
    * Returns the angle between two vectors. The angle is directional and signed, giving information about the rotational direction.
    * Read more about angle units and orientation in the description of the angle property.
    * @param point -
    */
  def getDirectedAngle(point: Point): Double = js.native
  /**
    * Returns the distance between the point and another point.
    * @param point -
    * @param squared [optional] - Controls whether the distance should remain squared, or its square root should be calculated. default: false
    */
  def getDistance(point: Point): Double = js.native
  def getDistance(point: Point, squared: Boolean): Double = js.native
  /**
    * Checks if the point is within a given distance of another point.
    * @param point - the point to check against
    * @param tolerance - the maximum distance allowed
    */
  def isClose(point: Point, tolerance: Double): Boolean = js.native
  /**
    * Checks if the vector represented by this point is colinear (parallel) to another vector.
    * @param point - the vector to check against
    */
  def isColinear(point: Point): Boolean = js.native
  /**
    * Checks if the vector is within the specified quadrant. Note that if the vector lies on the boundary between two quadrants, true will be returned for both quadrants.
    * @param quadrant
    * @returns true if either x or y are not a number, false otherwise
    */
  def isInQuadrant(quadrant: Double): Boolean = js.native
  /**
    * Checks whether the point is inside the boundaries of the rectangle.
    * @param rect - the rectangle to check against
    */
  def isInside(rect: Rectangle): Boolean = js.native
  /**
    * Checks if this point has an undefined value for at least one of its coordinates.
    */
  def isNaN(): Boolean = js.native
  /**
    * Checks if the vector represented by this point is orthogonal (perpendicular) to another vector.
    * @param point - the vector to check against
    */
  def isOrthogonal(point: Point): Boolean = js.native
  /**
    * Checks if this point has both the x and y coordinate set to 0.
    */
  def isZero(): Boolean = js.native
  def modulo(point: js.Array[Double]): Point = js.native
  def modulo(point: Double): Point = js.native
  /**
    * The modulo operator returns the integer remainders of dividing the point by the supplied value as a new point
    * @param point - The point you want to divide with
    */
  def modulo(point: Point): Point = js.native
  def multiply(point: js.Array[Double]): Point = js.native
  def multiply(point: Double): Point = js.native
  /*
    * Returns the new multiplied point
    * @param point - The point you want to multiply with
    */
  def multiply(point: Point): Point = js.native
  /**
    * Normalize modifies the length of the vector to 1 without changing its angle and returns it as a new point. The optional length parameter defines the length to normalize to.
    * The object itself is not modified!
    * @param length [optional] - The length of the normalized vector, default: 1
    */
  def normalize(): Point = js.native
  def normalize(length: Double): Point = js.native
  /**
    * Returns the projection of the point on another point.
    * Both points are interpreted as vectors.
    * @param point -
    */
  def project(point: Point): Point = js.native
  /**
    * Rotates the point by the given angle around an optional center point.
    * The object itself is not modified.
    * Read more about angle units and orientation in the description of the angle property.
    * @param angle - the rotation angle
    * @param center - the center point of the rotation
    */
  def rotate(angle: Double): Point = js.native
  def rotate(angle: Double, center: Point): Point = js.native
  /**
    * Returns a new point with rounded x and y values. The object itself is not modified!
    */
  def round(): Point = js.native
  /**
    * Sets the Point object using the properties in the given object.
    * @param object - the object describing the point's properties
    */
  def set(`object`: js.Any): Point = js.native
  /**
    * Sets the Point object using the coordinates of the given Point object.
    * @param point - the point to copy
    */
  def set(point: Point): Point = js.native
  /**
    * Sets the Point object using the width and height values of the given Size object.
    * @param size - the size width and height to use
    */
  def set(size: Size): Point = js.native
  /**
    * Sets the Point object using the numbers in the given array as coordinates.
    * @param array - an array of numbers to use as coordinates
    */
  def set(values: js.Array[Double]): Point = js.native
  /**
    * Sets the Point object with the given x and y coordinates.
    * @param x - the x coordinate
    * @param y - the y coordinate
    */
  def set(x: Double, y: Double): Point = js.native
  def subtract(point: js.Array[Double]): Point = js.native
  def subtract(point: Double): Point = js.native
  /*
    * Returns a new point
    * @param point - The point you want to subtract with
    */
  def subtract(point: Point): Point = js.native
  /**
    * Transforms the point by the matrix as a new point. The object itself is not modified!
    * @param matrix -
    */
  def transform(matrix: Matrix): Point = js.native
}

/* static members */
@JSGlobal("paper.Point")
@js.native
object Point extends js.Object {
  /**
    * Returns a new point object with the largest x and y of the supplied points.
    * @param point1 -
    * @param point2 -
    */
  def max(point1: Point, point2: Point): Point = js.native
  /**
    * Returns a new point object with the smallest x and y of the supplied points.
    * @param point1 -
    * @param point2 -
    */
  def min(point1: Point, point2: Point): Point = js.native
  /**
    * Returns a point object with random x and y values between 0 and 1.
    */
  def random(): Point = js.native
}

