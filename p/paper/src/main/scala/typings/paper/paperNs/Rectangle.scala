package typings.paper.paperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Rectangle")
@js.native
class Rectangle protected () extends Base {
  /**
    * Creates a Rectangle object.
    * @param object - an object containing properties to be set on the rectangle.
    */
  def this(`object`: js.Any) = this()
  /**
    * Creates a new rectangle object from the passed rectangle object.
    * @param rt - the rectangle to copy from
    */
  def this(rt: Rectangle) = this()
  /**
    * Creates a rectangle object from the passed points. These do not necessarily need to be the top left and bottom right corners, the constructor figures out how to fit a rectangle between them.
    * @param from - The first point defining the rectangle
    * @param to - The second point defining the rectangle
    */
  def this(from: Point, to: Point) = this()
  /**
    * Creates a Rectangle object.
    * @param point - the top-left point of the rectangle
    * @param size - the size of the rectangle
    */
  def this(point: Point, size: Size) = this()
  /**
    * Creates a rectangle object.
    * @param x - the left coordinate
    * @param y - the top coordinate
    * @param width - the width
    * @param height - the height
    */
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  /**
    * The area of the rectangle in square points.
    * Read only.
    */
  val area: Double = js.native
  /**
    * The bottom coordinate of the rectangle. Note that this doesn't move the whole rectangle: the top won't move.
    */
  var bottom: Double = js.native
  /**
    * The bottom-center point of the rectangle.
    */
  var bottomCenter: Point = js.native
  /**
    * The bottom-left point of the rectangle.
    */
  var bottomLeft: Point = js.native
  /**
    * The bottom-right point of the rectangle.
    */
  var bottomRight: Point = js.native
  /**
    * The center point of the rectangle.
    */
  var center: Point = js.native
  /**
    * The height of the rectangle.
    */
  var height: Double = js.native
  /**
    * The position of the left hand side of the rectangle. Note that this doesn't move the whole rectangle; the right hand side stays where it was.
    */
  var left: Double = js.native
  /**
    * The left-center point of the rectangle.
    */
  var leftCenter: Point = js.native
  /**
    * The top-left point of the rectangle
    */
  var point: Point = js.native
  /**
    * The position of the right hand side of the rectangle. Note that this doesn't move the whole rectangle; the left hand side stays where it was.
    */
  var right: Double = js.native
  /**
    * The right-center point of the rectangle.
    */
  var rightCenter: Point = js.native
  /**
    * Specifies whether an item's bounds are selected and will also mark the item as selected.
    * Paper.js draws the visual bounds of selected items on top of your project. This can be useful for debugging.
    */
  var selected: Boolean = js.native
  /**
    * The size of the rectangle
    */
  var size: Size = js.native
  /**
    * The top coordinate of the rectangle. Note that this doesn't move the whole rectangle: the bottom won't move.
    */
  var top: Double = js.native
  /**
    * The top-center point of the rectangle.
    */
  var topCenter: Point = js.native
  /**
    * The top-left point of the rectangle.
    */
  var topLeft: Point = js.native
  /**
    * The top-right point of the rectangle.
    */
  var topRight: Point = js.native
  /**
    * The width of the rectangle.
    */
  var width: Double = js.native
  /**
    * The x position of the rectangle.
    */
  var x: Double = js.native
  /**
    * The y position of the rectangle.
    */
  var y: Double = js.native
  /**
    * Tests if the specified point is inside the boundary of the rectangle.
    * @param point - the specified point
    */
  def contains(point: Point): Boolean = js.native
  /**
    * Tests if the interior of the rectangle entirely contains the specified rectangle.
    * @param rect - The specified rectangle
    */
  def contains(rect: Rectangle): Boolean = js.native
  /**
    * Checks whether the coordinates and size of the rectangle are equal to that of the supplied rectangle.
    * @param rect - the rectangle to check against
    */
  def equals(rect: Rectangle): Boolean = js.native
  /**
    * Expands the rectangle by the specified amount in horizontal and vertical directions.
    * @param amount - the amount to expand the rectangle in both directions
    */
  def expand(amount: Double): Rectangle = js.native
  def expand(amount: Point): Rectangle = js.native
  def expand(amount: Size): Rectangle = js.native
  /**
    * Expands the rectangle by the specified amounts in horizontal and vertical directions.
    * @param hor - the amount to expand the rectangle in horizontal direction
    * @param ver - the amount to expand the rectangle in vertical direction
    */
  def expand(hor: Double, ver: Double): Rectangle = js.native
  /**
    * Adds a point to this rectangle. The resulting rectangle is the smallest rectangle that contains both the original rectangle and the specified point.
    * After adding a point, a call to contains(point) with the added point as an argument does not necessarily return true.
    * The rectangle.contains(point) method does not return true for points on the right or bottom edges of a rectangle. Therefore, if the added point falls on the left or bottom edge of the enlarged rectangle, rectangle.contains(point) returns false for that point.
    * @param point - the point to add to the rectangle
    */
  def include(point: Point): Rectangle = js.native
  /**
    * Returns a new rectangle representing the intersection of this rectangle with the specified rectangle.
    * @param rect - The rectangle to be intersected with this rectangle
    */
  def intersect(rect: Rectangle): Rectangle = js.native
  /**
    * Tests if the interior of this rectangle intersects the interior of another rectangle. Rectangles just touching each other are considered as non-intersecting.
    * @param rect - the specified rectangle
    * @param epsilon - the epsilon against which to compare the rectangle’s dimensions. default 0
    * @returns true if the rectangle and the specified rectangle intersect each other, false
    */
  def intersects(rect: Rectangle): Boolean = js.native
  def intersects(rect: Rectangle, epsilon: Double): Boolean = js.native
  /**
    * Returns true if the rectangle is empty, false otherwise
    */
  def isEmpty(): Boolean = js.native
  /**
    * Scales the rectangle by the specified amount from its center.
    * @param amount - the amount to scale by
    */
  def scale(amount: Double): Rectangle = js.native
  /**
    * Scales the rectangle in horizontal direction by the specified hor amount and in vertical direction by the specified ver amount from its center.
    * @param hor - the amount to scale the rectangle in horizontal direction
    * @param ver - the amount to scale the rectangle in vertical direction
    */
  def scale(hor: Double, ver: Double): Rectangle = js.native
  /**
    * Sets the Rectangle object from the passed points. These do not necessarily need to be the top left and bottom right corners, the constructor figures out how to fit a rectangle between them.
    * @param from - The first point defining the rectangle
    * @param to - The second point defining the rectangle
    */
  def set(from: Point, to: Point): Rectangle = js.native
  /**
    * Sets the Rectangle object.
    * @param object - an object containing properties to be set on the rectangle.
    */
  def set(`object`: js.Any): Rectangle = js.native
  /**
    * Sets the Rectangle object.
    * @param point - the top-left point of the rectangle
    * @param size - the size of the rectangle
    */
  def set(point: Point, size: Size): Rectangle = js.native
  /**
    * Sets the Rectangle object from the passed rectangle object.
    * @param rt - the rectangle to copy from
    */
  def set(rt: Rectangle): Rectangle = js.native
  /**
    * Sets the Rectangle object.
    * @param x - the left coordinate
    * @param y - the top coordinate
    * @param width - the width
    * @param height - the height
    */
  def set(x: Double, y: Double, width: Double, height: Double): Rectangle = js.native
  /**
    * Returns a new rectangle representing the union of this rectangle with the specified rectangle.
    * @param rect - the rectangle to be combined with this rectangle
    */
  def unite(rect: Rectangle): Rectangle = js.native
}

