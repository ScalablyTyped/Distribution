package typings.phaser.PhaserNs.GeomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Geom.Intersects")
@js.native
object IntersectsNs extends js.Object {
  /**
    * Checks if two Circles intersect.
    * @param circleA The first Circle to check for intersection.
    * @param circleB The second Circle to check for intersection.
    */
  def CircleToCircle(circleA: Circle, circleB: Circle): Boolean = js.native
  /**
    * Checks for intersection between a circle and a rectangle.
    * @param circle The circle to be checked.
    * @param rect The rectangle to be checked.
    */
  def CircleToRectangle(circle: Circle, rect: Rectangle): Boolean = js.native
  /**
    * Checks if two Circles intersect and returns the intersection points as a Point object array.
    * @param circleA The first Circle to check for intersection.
    * @param circleB The second Circle to check for intersection.
    * @param out An optional array in which to store the points of intersection.
    */
  def GetCircleToCircle(circleA: Circle, circleB: Circle): js.Array[_] = js.native
  def GetCircleToCircle(circleA: Circle, circleB: Circle, out: js.Array[_]): js.Array[_] = js.native
  /**
    * Checks for intersection between a circle and a rectangle,
    * and returns the intersection points as a Point object array.
    * @param circle The circle to be checked.
    * @param rect The rectangle to be checked.
    * @param out An optional array in which to store the points of intersection.
    */
  def GetCircleToRectangle(circle: Circle, rect: Rectangle): js.Array[_] = js.native
  def GetCircleToRectangle(circle: Circle, rect: Rectangle, out: js.Array[_]): js.Array[_] = js.native
  /**
    * Checks for intersection between the line segment and circle,
    * and returns the intersection points as a Point object array.
    * @param line The line segment to check.
    * @param circle The circle to check against the line.
    * @param out An optional array in which to store the points of intersection.
    */
  def GetLineToCircle(line: Line, circle: Circle): js.Array[_] = js.native
  def GetLineToCircle(line: Line, circle: Circle, out: js.Array[_]): js.Array[_] = js.native
  def GetLineToRectangle(line: Line, rect: js.Object): js.Array[_] = js.native
  def GetLineToRectangle(line: Line, rect: js.Object, out: js.Array[_]): js.Array[_] = js.native
  /**
    * Checks for intersection between the Line and a Rectangle shape,
    * and returns the intersection points as a Point object array.
    * @param line The Line to check for intersection.
    * @param rect The Rectangle to check for intersection.
    * @param out An optional array in which to store the points of intersection.
    */
  def GetLineToRectangle(line: Line, rect: Rectangle): js.Array[_] = js.native
  def GetLineToRectangle(line: Line, rect: Rectangle, out: js.Array[_]): js.Array[_] = js.native
  /**
    * Checks if two Rectangle shapes intersect and returns the area of this intersection as Rectangle object.
    * 
    * If optional `output` parameter is omitted, new Rectangle object is created and returned. If there is intersection, it will contain intersection area. If there is no intersection, it wil be empty Rectangle (all values set to zero).
    * 
    * If Rectangle object is passed as `output` and there is intersection, then intersection area data will be loaded into it and it will be returned. If there is no intersetion, it will be returned without any change.
    * @param rectA The first Rectangle object.
    * @param rectB The second Rectangle object.
    * @param output Optional Rectangle object. If given, the intersection data will be loaded into it (in case of no intersection, it will be left unchanged). Otherwise, new Rectangle object will be created and returned with either intersection data or empty (all values set to zero), if there is no intersection.
    */
  def GetRectangleIntersection[O /* <: Rectangle */](rectA: Rectangle, rectB: Rectangle): O = js.native
  def GetRectangleIntersection[O /* <: Rectangle */](rectA: Rectangle, rectB: Rectangle, output: O): O = js.native
  /**
    * Checks if two Rectangles intersect and returns the intersection points as a Point object array.
    * 
    * A Rectangle intersects another Rectangle if any part of its bounds is within the other Rectangle's bounds. As such, the two Rectangles are considered "solid". A Rectangle with no width or no height will never intersect another Rectangle.
    * @param rectA The first Rectangle to check for intersection.
    * @param rectB The second Rectangle to check for intersection.
    * @param out An optional array in which to store the points of intersection.
    */
  def GetRectangleToRectangle(rectA: Rectangle, rectB: Rectangle): js.Array[_] = js.native
  def GetRectangleToRectangle(rectA: Rectangle, rectB: Rectangle, out: js.Array[_]): js.Array[_] = js.native
  /**
    * Checks for intersection between Rectangle shape and Triangle shape,
    * and returns the intersection points as a Point object array.
    * @param rect Rectangle object to test.
    * @param triangle Triangle object to test.
    * @param out An optional array in which to store the points of intersection.
    */
  def GetRectangleToTriangle(rect: Rectangle, triangle: Triangle): js.Array[_] = js.native
  def GetRectangleToTriangle(rect: Rectangle, triangle: Triangle, out: js.Array[_]): js.Array[_] = js.native
  /**
    * Checks if a Triangle and a Circle intersect, and returns the intersection points as a Point object array.
    * 
    * A Circle intersects a Triangle if its center is located within it or if any of the Triangle's sides intersect the Circle. As such, the Triangle and the Circle are considered "solid" for the intersection.
    * @param triangle The Triangle to check for intersection.
    * @param circle The Circle to check for intersection.
    * @param out An optional array in which to store the points of intersection.
    */
  def GetTriangleToCircle(triangle: Triangle, circle: Circle): js.Array[_] = js.native
  def GetTriangleToCircle(triangle: Triangle, circle: Circle, out: js.Array[_]): js.Array[_] = js.native
  /**
    * Checks if a Triangle and a Line intersect, and returns the intersection points as a Point object array.
    * 
    * The Line intersects the Triangle if it starts inside of it, ends inside of it, or crosses any of the Triangle's sides. Thus, the Triangle is considered "solid".
    * @param triangle The Triangle to check with.
    * @param line The Line to check with.
    * @param out An optional array in which to store the points of intersection.
    */
  def GetTriangleToLine(triangle: Triangle, line: Line): js.Array[_] = js.native
  def GetTriangleToLine(triangle: Triangle, line: Line, out: js.Array[_]): js.Array[_] = js.native
  /**
    * Checks if two Triangles intersect, and returns the intersection points as a Point object array.
    * 
    * A Triangle intersects another Triangle if any pair of their lines intersects or if any point of one Triangle is within the other Triangle. Thus, the Triangles are considered "solid".
    * @param triangleA The first Triangle to check for intersection.
    * @param triangleB The second Triangle to check for intersection.
    * @param out An optional array in which to store the points of intersection.
    */
  def GetTriangleToTriangle(triangleA: Triangle, triangleB: Triangle): js.Array[_] = js.native
  def GetTriangleToTriangle(triangleA: Triangle, triangleB: Triangle, out: js.Array[_]): js.Array[_] = js.native
  /**
    * Checks for intersection between the line segment and circle.
    * 
    * Based on code by [Matt DesLauriers](https://github.com/mattdesl/line-circle-collision/blob/master/LICENSE.md).
    * @param line The line segment to check.
    * @param circle The circle to check against the line.
    * @param nearest An optional Point-like object. If given the closest point on the Line where the circle intersects will be stored in this object.
    */
  def LineToCircle(line: Line, circle: Circle): Boolean = js.native
  def LineToCircle(line: Line, circle: Circle, nearest: js.Any): Boolean = js.native
  def LineToCircle(line: Line, circle: Circle, nearest: Point): Boolean = js.native
  /**
    * Checks if two Lines intersect. If the Lines are identical, they will be treated as parallel and thus non-intersecting.
    * @param line1 The first Line to check.
    * @param line2 The second Line to check.
    * @param out A Point in which to optionally store the point of intersection.
    */
  def LineToLine(line1: Line, line2: Line): Boolean = js.native
  def LineToLine(line1: Line, line2: Line, out: Point): Boolean = js.native
  def LineToRectangle(line: Line, rect: js.Object): Boolean = js.native
  /**
    * Checks for intersection between the Line and a Rectangle shape, or a rectangle-like
    * object, with public `x`, `y`, `right` and `bottom` properties, such as a Sprite or Body.
    * 
    * An intersection is considered valid if:
    * 
    * The line starts within, or ends within, the Rectangle.
    * The line segment intersects one of the 4 rectangle edges.
    * 
    * The for the purposes of this function rectangles are considered 'solid'.
    * @param line The Line to check for intersection.
    * @param rect The Rectangle to check for intersection.
    */
  def LineToRectangle(line: Line, rect: Rectangle): Boolean = js.native
  def PointToLine(point: js.Any, line: Line): Boolean = js.native
  def PointToLine(point: js.Any, line: Line, lineThickness: Double): Boolean = js.native
  /**
    * Checks if the a Point falls between the two end-points of a Line, based on the given line thickness.
    * 
    * Assumes that the line end points are circular, not square.
    * @param point The point, or point-like object to check.
    * @param line The line segment to test for intersection on.
    * @param lineThickness The line thickness. Assumes that the line end points are circular. Default 1.
    */
  def PointToLine(point: Point, line: Line): Boolean = js.native
  def PointToLine(point: Point, line: Line, lineThickness: Double): Boolean = js.native
  /**
    * Checks if a Point is located on the given line segment.
    * @param point The Point to check for intersection.
    * @param line The line segment to check for intersection.
    */
  def PointToLineSegment(point: Point, line: Line): Boolean = js.native
  /**
    * Checks if two Rectangles intersect.
    * 
    * A Rectangle intersects another Rectangle if any part of its bounds is within the other Rectangle's bounds. As such, the two Rectangles are considered "solid". A Rectangle with no width or no height will never intersect another Rectangle.
    * @param rectA The first Rectangle to check for intersection.
    * @param rectB The second Rectangle to check for intersection.
    */
  def RectangleToRectangle(rectA: Rectangle, rectB: Rectangle): Boolean = js.native
  /**
    * Checks for intersection between Rectangle shape and Triangle shape.
    * @param rect Rectangle object to test.
    * @param triangle Triangle object to test.
    */
  def RectangleToTriangle(rect: Rectangle, triangle: Triangle): Boolean = js.native
  /**
    * Check if rectangle intersects with values.
    * @param rect The rectangle object
    * @param left The x coordinate of the left of the Rectangle.
    * @param right The x coordinate of the right of the Rectangle.
    * @param top The y coordinate of the top of the Rectangle.
    * @param bottom The y coordinate of the bottom of the Rectangle.
    * @param tolerance Tolerance allowed in the calculation, expressed in pixels. Default 0.
    */
  def RectangleToValues(rect: Rectangle, left: Double, right: Double, top: Double, bottom: Double): Boolean = js.native
  def RectangleToValues(rect: Rectangle, left: Double, right: Double, top: Double, bottom: Double, tolerance: Double): Boolean = js.native
  /**
    * Checks if a Triangle and a Circle intersect.
    * 
    * A Circle intersects a Triangle if its center is located within it or if any of the Triangle's sides intersect the Circle. As such, the Triangle and the Circle are considered "solid" for the intersection.
    * @param triangle The Triangle to check for intersection.
    * @param circle The Circle to check for intersection.
    */
  def TriangleToCircle(triangle: Triangle, circle: Circle): Boolean = js.native
  /**
    * Checks if a Triangle and a Line intersect.
    * 
    * The Line intersects the Triangle if it starts inside of it, ends inside of it, or crosses any of the Triangle's sides. Thus, the Triangle is considered "solid".
    * @param triangle The Triangle to check with.
    * @param line The Line to check with.
    */
  def TriangleToLine(triangle: Triangle, line: Line): Boolean = js.native
  /**
    * Checks if two Triangles intersect.
    * 
    * A Triangle intersects another Triangle if any pair of their lines intersects or if any point of one Triangle is within the other Triangle. Thus, the Triangles are considered "solid".
    * @param triangleA The first Triangle to check for intersection.
    * @param triangleB The second Triangle to check for intersection.
    */
  def TriangleToTriangle(triangleA: Triangle, triangleB: Triangle): Boolean = js.native
}

