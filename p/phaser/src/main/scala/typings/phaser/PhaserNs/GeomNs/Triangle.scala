package typings.phaser.PhaserNs.GeomNs

import typings.phaser.CenterFunction
import typings.phaser.PhaserNs.MathNs.Vector2
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A triangle is a plane created by connecting three points.
  * The first two arguments specify the first point, the middle two arguments
  * specify the second point, and the last two arguments specify the third point.
  */
@JSGlobal("Phaser.Geom.Triangle")
@js.native
class Triangle protected () extends js.Object {
  /**
    * 
    * @param x1 `x` coordinate of the first point. Default 0.
    * @param y1 `y` coordinate of the first point. Default 0.
    * @param x2 `x` coordinate of the second point. Default 0.
    * @param y2 `y` coordinate of the second point. Default 0.
    * @param x3 `x` coordinate of the third point. Default 0.
    * @param y3 `y` coordinate of the third point. Default 0.
    */
  def this(
    x1: js.UndefOr[Double],
    y1: js.UndefOr[Double],
    x2: js.UndefOr[Double],
    y2: js.UndefOr[Double],
    x3: js.UndefOr[Double],
    y3: js.UndefOr[Double]
  ) = this()
  /**
    * Bottom most Y coordinate of the triangle. Setting it moves the triangle on the Y axis accordingly.
    */
  var bottom: Double = js.native
  /**
    * Left most X coordinate of the triangle. Setting it moves the triangle on the X axis accordingly.
    */
  var left: Double = js.native
  /**
    * Right most X coordinate of the triangle. Setting it moves the triangle on the X axis accordingly.
    */
  var right: Double = js.native
  /**
    * Top most Y coordinate of the triangle. Setting it moves the triangle on the Y axis accordingly.
    */
  var top: Double = js.native
  /**
    * `x` coordinate of the first point.
    */
  var x1: Double = js.native
  /**
    * `x` coordinate of the second point.
    */
  var x2: Double = js.native
  /**
    * `x` coordinate of the third point.
    */
  var x3: Double = js.native
  /**
    * `y` coordinate of the first point.
    */
  var y1: Double = js.native
  /**
    * `y` coordinate of the second point.
    */
  var y2: Double = js.native
  /**
    * `y` coordinate of the third point.
    */
  var y3: Double = js.native
  /**
    * Checks whether a given points lies within the triangle.
    * @param x The x coordinate of the point to check.
    * @param y The y coordinate of the point to check.
    */
  def contains(x: Double, y: Double): Boolean = js.native
  /**
    * Returns a Line object that corresponds to Line A of this Triangle.
    * @param line A Line object to set the results in. If `undefined` a new Line will be created.
    */
  def getLineA[O /* <: Line */](): O = js.native
  def getLineA[O /* <: Line */](line: O): O = js.native
  /**
    * Returns a Line object that corresponds to Line B of this Triangle.
    * @param line A Line object to set the results in. If `undefined` a new Line will be created.
    */
  def getLineB[O /* <: Line */](): O = js.native
  def getLineB[O /* <: Line */](line: O): O = js.native
  /**
    * Returns a Line object that corresponds to Line C of this Triangle.
    * @param line A Line object to set the results in. If `undefined` a new Line will be created.
    */
  def getLineC[O /* <: Line */](): O = js.native
  def getLineC[O /* <: Line */](line: O): O = js.native
  /**
    * Returns a specific point  on the triangle.
    * @param position Position as float within `0` and `1`. `0` equals the first point.
    * @param output Optional Point, or point-like object, that the calculated point will be written to.
    */
  def getPoint[O /* <: Point */](position: Double): O = js.native
  def getPoint[O /* <: Point */](position: Double, output: O): O = js.native
  /**
    * Calculates a list of evenly distributed points on the triangle. It is either possible to pass an amount of points to be generated (`quantity`) or the distance between two points (`stepRate`).
    * @param quantity Number of points to be generated. Can be falsey when `stepRate` should be used. All points have the same distance along the triangle.
    * @param stepRate Distance between two points. Will only be used when `quantity` is falsey.
    * @param output Optional Array for writing the calculated points into. Otherwise a new array will be created.
    */
  def getPoints[O /* <: js.Array[Point] */](quantity: integer): O = js.native
  def getPoints[O /* <: js.Array[Point] */](quantity: integer, stepRate: Double): O = js.native
  def getPoints[O /* <: js.Array[Point] */](quantity: integer, stepRate: Double, output: O): O = js.native
  /**
    * Returns a random point along the triangle.
    * @param point Optional `Point` that should be modified. Otherwise a new one will be created.
    */
  def getRandomPoint[O /* <: Point */](): O = js.native
  def getRandomPoint[O /* <: Point */](point: O): O = js.native
  /**
    * Sets all three points of the triangle. Leaving out any coordinate sets it to be `0`.
    * @param x1 `x` coordinate of the first point. Default 0.
    * @param y1 `y` coordinate of the first point. Default 0.
    * @param x2 `x` coordinate of the second point. Default 0.
    * @param y2 `y` coordinate of the second point. Default 0.
    * @param x3 `x` coordinate of the third point. Default 0.
    * @param y3 `y` coordinate of the third point. Default 0.
    */
  def setTo(
    x1: js.UndefOr[Double],
    y1: js.UndefOr[Double],
    x2: js.UndefOr[Double],
    y2: js.UndefOr[Double],
    x3: js.UndefOr[Double],
    y3: js.UndefOr[Double]
  ): Triangle = js.native
}

/* static members */
@JSGlobal("Phaser.Geom.Triangle")
@js.native
object Triangle extends js.Object {
  /**
    * Returns the area of a Triangle.
    * @param triangle The Triangle to use.
    */
  def Area(triangle: Triangle): Double = js.native
  /**
    * Builds an equilateral triangle. In the equilateral triangle, all the sides are the same length (congruent) and all the angles are the same size (congruent).
    * The x/y specifies the top-middle of the triangle (x1/y1) and length is the length of each side.
    * @param x x coordinate of the top point of the triangle.
    * @param y y coordinate of the top point of the triangle.
    * @param length Length of each side of the triangle.
    */
  def BuildEquilateral(x: Double, y: Double, length: Double): Triangle = js.native
  /**
    * [description]
    * @param data A flat array of vertice coordinates like [x0,y0, x1,y1, x2,y2, ...]
    * @param holes An array of hole indices if any (e.g. [5, 8] for a 12-vertice input would mean one hole with vertices 5–7 and another with 8–11). Default null.
    * @param scaleX [description] Default 1.
    * @param scaleY [description] Default 1.
    * @param out [description]
    */
  def BuildFromPolygon[O /* <: js.Array[Triangle] */](data: js.Array[_]): O = js.native
  def BuildFromPolygon[O /* <: js.Array[Triangle] */](data: js.Array[_], holes: js.Array[_]): O = js.native
  def BuildFromPolygon[O /* <: js.Array[Triangle] */](data: js.Array[_], holes: js.Array[_], scaleX: Double): O = js.native
  def BuildFromPolygon[O /* <: js.Array[Triangle] */](data: js.Array[_], holes: js.Array[_], scaleX: Double, scaleY: Double): O = js.native
  def BuildFromPolygon[O /* <: js.Array[Triangle] */](data: js.Array[_], holes: js.Array[_], scaleX: Double, scaleY: Double, out: O): O = js.native
  /**
    * Builds a right triangle, i.e. one which has a 90-degree angle and two acute angles.
    * @param x The X coordinate of the right angle, which will also be the first X coordinate of the constructed Triangle.
    * @param y The Y coordinate of the right angle, which will also be the first Y coordinate of the constructed Triangle.
    * @param width The length of the side which is to the left or to the right of the right angle.
    * @param height The length of the side which is above or below the right angle.
    */
  def BuildRight(x: Double, y: Double, width: Double, height: Double): Triangle = js.native
  /**
    * Positions the Triangle so that it is centered on the given coordinates.
    * @param triangle The triangle to be positioned.
    * @param x The horizontal coordinate to center on.
    * @param y The vertical coordinate to center on.
    * @param centerFunc The function used to center the triangle. Defaults to Centroid centering.
    */
  def CenterOn[O /* <: Triangle */](triangle: O, x: Double, y: Double): O = js.native
  def CenterOn[O /* <: Triangle */](triangle: O, x: Double, y: Double, centerFunc: CenterFunction): O = js.native
  /**
    * Calculates the position of a Triangle's centroid, which is also its center of mass (center of gravity).
    * 
    * The centroid is the point in a Triangle at which its three medians (the lines drawn from the vertices to the bisectors of the opposite sides) meet. It divides each one in a 2:1 ratio.
    * @param triangle The Triangle to use.
    * @param out An object to store the coordinates in.
    */
  def Centroid[O /* <: Point */](triangle: Triangle): O = js.native
  def Centroid[O /* <: Point */](triangle: Triangle, out: O): O = js.native
  /**
    * Computes the circumcentre of a triangle. The circumcentre is the centre of
    * the circumcircle, the smallest circle which encloses the triangle. It is also
    * the common intersection point of the perpendicular bisectors of the sides of
    * the triangle, and is the only point which has equal distance to all three
    * vertices of the triangle.
    * @param triangle [description]
    * @param out [description]
    */
  def CircumCenter[O /* <: Vector2 */](triangle: Triangle): O = js.native
  def CircumCenter[O /* <: Vector2 */](triangle: Triangle, out: O): O = js.native
  /**
    * Finds the circumscribed circle (circumcircle) of a Triangle object. The circumcircle is the circle which touches all of the triangle's vertices.
    * @param triangle The Triangle to use as input.
    * @param out An optional Circle to store the result in.
    */
  def CircumCircle[O /* <: Circle */](triangle: Triangle): O = js.native
  def CircumCircle[O /* <: Circle */](triangle: Triangle, out: O): O = js.native
  /**
    * Clones a Triangle object.
    * @param source The Triangle to clone.
    */
  def Clone(source: Triangle): Triangle = js.native
  /**
    * Checks if a point (as a pair of coordinates) is inside a Triangle's bounds.
    * @param triangle The Triangle to check.
    * @param x The X coordinate of the point to check.
    * @param y The Y coordinate of the point to check.
    */
  def Contains(triangle: Triangle, x: Double, y: Double): Boolean = js.native
  /**
    * Filters an array of point-like objects to only those contained within a triangle.
    * If `returnFirst` is true, will return an array containing only the first point in the provided array that is within the triangle (or an empty array if there are no such points).
    * @param triangle The triangle that the points are being checked in.
    * @param points An array of point-like objects (objects that have an `x` and `y` property)
    * @param returnFirst If `true`, return an array containing only the first point found that is within the triangle. Default false.
    * @param out If provided, the points that are within the triangle will be appended to this array instead of being added to a new array. If `returnFirst` is true, only the first point found within the triangle will be appended. This array will also be returned by this function.
    */
  def ContainsArray(triangle: Triangle, points: js.Array[Point]): js.Array[Point] = js.native
  def ContainsArray(triangle: Triangle, points: js.Array[Point], returnFirst: Boolean): js.Array[Point] = js.native
  def ContainsArray(triangle: Triangle, points: js.Array[Point], returnFirst: Boolean, out: js.Array[_]): js.Array[Point] = js.native
  def ContainsPoint(triangle: Triangle, point: js.Any): Boolean = js.native
  /**
    * Tests if a triangle contains a point.
    * @param triangle The triangle.
    * @param point The point to test, or any point-like object with public `x` and `y` properties.
    */
  def ContainsPoint(triangle: Triangle, point: Point): Boolean = js.native
  def ContainsPoint(triangle: Triangle, point: Vector2): Boolean = js.native
  /**
    * Copy the values of one Triangle to a destination Triangle.
    * @param source The source Triangle to copy the values from.
    * @param dest The destination Triangle to copy the values to.
    */
  def CopyFrom[O /* <: Triangle */](source: Triangle, dest: O): O = js.native
  /**
    * Decomposes a Triangle into an array of its points.
    * @param triangle The Triangle to decompose.
    * @param out An array to store the points into.
    */
  def Decompose(triangle: Triangle): js.Array[_] = js.native
  def Decompose(triangle: Triangle, out: js.Array[_]): js.Array[_] = js.native
  /**
    * Returns true if two triangles have the same coordinates.
    * @param triangle The first triangle to check.
    * @param toCompare The second triangle to check.
    */
  def Equals(triangle: Triangle, toCompare: Triangle): Boolean = js.native
  /**
    * Returns a Point from around the perimeter of a Triangle.
    * @param triangle The Triangle to get the point on its perimeter from.
    * @param position The position along the perimeter of the triangle. A value between 0 and 1.
    * @param out An option Point, or Point-like object to store the value in. If not given a new Point will be created.
    */
  def GetPoint[O /* <: Point */](triangle: Triangle, position: Double): O = js.native
  def GetPoint[O /* <: Point */](triangle: Triangle, position: Double, out: O): O = js.native
  /**
    * Returns an array of evenly spaced points on the perimeter of a Triangle.
    * @param triangle The Triangle to get the points from.
    * @param quantity The number of evenly spaced points to return. Set to 0 to return an arbitrary number of points based on the `stepRate`.
    * @param stepRate If `quantity` is 0, the distance between each returned point.
    * @param out An array to which the points should be appended.
    */
  def GetPoints[O /* <: Point */](triangle: Triangle, quantity: integer, stepRate: Double): O = js.native
  def GetPoints[O /* <: Point */](triangle: Triangle, quantity: integer, stepRate: Double, out: O): O = js.native
  /**
    * Calculates the position of the incenter of a Triangle object. This is the point where its three angle bisectors meet and it's also the center of the incircle, which is the circle inscribed in the triangle.
    * @param triangle The Triangle to find the incenter of.
    * @param out An optional Point in which to store the coordinates.
    */
  def InCenter[O /* <: Point */](triangle: Triangle): O = js.native
  def InCenter[O /* <: Point */](triangle: Triangle, out: O): O = js.native
  /**
    * Moves each point (vertex) of a Triangle by a given offset, thus moving the entire Triangle by that offset.
    * @param triangle The Triangle to move.
    * @param x The horizontal offset (distance) by which to move each point. Can be positive or negative.
    * @param y The vertical offset (distance) by which to move each point. Can be positive or negative.
    */
  def Offset[O /* <: Triangle */](triangle: O, x: Double, y: Double): O = js.native
  /**
    * Gets the length of the perimeter of the given triangle.
    * @param triangle [description]
    */
  def Perimeter(triangle: Triangle): Double = js.native
  /**
    * [description]
    * @param triangle [description]
    * @param out [description]
    */
  def Random[O /* <: Point */](triangle: Triangle): O = js.native
  def Random[O /* <: Point */](triangle: Triangle, out: O): O = js.native
  /**
    * Rotates a Triangle about its incenter, which is the point at which its three angle bisectors meet.
    * @param triangle The Triangle to rotate.
    * @param angle The angle by which to rotate the Triangle, in radians.
    */
  def Rotate[O /* <: Triangle */](triangle: O, angle: Double): O = js.native
  /**
    * Rotates a Triangle at a certain angle about a given Point or object with public `x` and `y` properties.
    * @param triangle The Triangle to rotate.
    * @param point The Point to rotate the Triangle about.
    * @param angle The angle by which to rotate the Triangle, in radians.
    */
  def RotateAroundPoint[O /* <: Triangle */](triangle: O, point: Point, angle: Double): O = js.native
  /**
    * Rotates an entire Triangle at a given angle about a specific point.
    * @param triangle The Triangle to rotate.
    * @param x The X coordinate of the point to rotate the Triangle about.
    * @param y The Y coordinate of the point to rotate the Triangle about.
    * @param angle The angle by which to rotate the Triangle, in radians.
    */
  def RotateAroundXY[O /* <: Triangle */](triangle: O, x: Double, y: Double, angle: Double): O = js.native
}

