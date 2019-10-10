package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * A Rectangle specifies an area that is enclosed by it's top-left
  * point (x, y), its width, and its height. It should not be confused with a
  * rectangular path, it is not an item.
  */
@JSGlobal("paper.Rectangle")
@js.native
class Rectangle protected () extends js.Object {
  /** 
    * Creates a Rectangle object.
    * 
    * @param object - an object containing properties to be set on the
    * rectangle
    */
  def this(`object`: js.Object) = this()
  /** 
    * Creates a new rectangle object from the passed rectangle object.
    */
  def this(rectangle: Rectangle) = this()
  /** 
    * Creates a rectangle object from the passed points. These do not
    * necessarily need to be the top left and bottom right corners, the
    * constructor figures out how to fit a rectangle between them.
    * 
    * @param from - the first point defining the rectangle
    * @param to - the second point defining the rectangle
    */
  def this(from: Point, to: Point) = this()
  /** 
    * Creates a Rectangle object.
    * 
    * @param point - the top-left point of the rectangle
    * @param size - the size of the rectangle
    */
  def this(point: Point, size: Size) = this()
  /** 
    * Creates a rectangle object.
    * 
    * @param x - the left coordinate
    * @param y - the top coordinate
    */
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  /** 
    * The area of the rectangle.
    */
  val area: Double = js.native
  /** 
    * The bottom coordinate of the rectangle. Note that this doesn't move the
    * whole rectangle: the top won't move.
    */
  var bottom: Double | Null = js.native
  /** 
    * The bottom-center point of the rectangle.
    */
  var bottomCenter: Point | Null = js.native
  /** 
    * The bottom-left point of the rectangle.
    */
  var bottomLeft: Point | Null = js.native
  /** 
    * The bottom-right point of the rectangle.
    */
  var bottomRight: Point | Null = js.native
  /** 
    * The center point of the rectangle.
    */
  var center: Point | Null = js.native
  /** 
    * The height of the rectangle.
    */
  var height: Double | Null = js.native
  /** 
    * The position of the left hand side of the rectangle. Note that this
    * doesn't move the whole rectangle; the right hand side stays where it was.
    */
  var left: Double | Null = js.native
  /** 
    * The left-center point of the rectangle.
    */
  var leftCenter: Point | Null = js.native
  /** 
    * The top-left point of the rectangle
    */
  var point: Point | Null = js.native
  /** 
    * The position of the right hand side of the rectangle. Note that this
    * doesn't move the whole rectangle; the left hand side stays where it was.
    */
  var right: Double | Null = js.native
  /** 
    * The right-center point of the rectangle.
    */
  var rightCenter: Point | Null = js.native
  /** 
    * Specifies whether an item's bounds are to appear as selected.
    * 
    * Paper.js draws the bounds of items with selected bounds on top of
    * your project. This is very useful when debugging.
    */
  var selected: Boolean | Null = js.native
  /** 
    * The size of the rectangle
    */
  var size: Size | Null = js.native
  /** 
    * The top coordinate of the rectangle. Note that this doesn't move the
    * whole rectangle: the bottom won't move.
    */
  var top: Double | Null = js.native
  /** 
    * The top-center point of the rectangle.
    */
  var topCenter: Point | Null = js.native
  /** 
    * The top-left point of the rectangle.
    */
  var topLeft: Point | Null = js.native
  /** 
    * The top-right point of the rectangle.
    */
  var topRight: Point | Null = js.native
  /** 
    * The width of the rectangle.
    */
  var width: Double | Null = js.native
  /** 
    * The x position of the rectangle.
    */
  var x: Double | Null = js.native
  /** 
    * The y position of the rectangle.
    */
  var y: Double | Null = js.native
  /** 
    * Tests if the specified point is inside the boundary of the rectangle.
    * 
    * @param point - the specified point
    * 
    * @return true if the point is inside the rectangle's boundary
    */
  def contains(point: Point): Boolean = js.native
  /** 
    * Tests if the interior of the rectangle entirely contains the specified
    * rectangle.
    * 
    * @param rect - the specified rectangle
    * 
    * @return true if the rectangle entirely contains the specified
    * rectangle
    */
  def contains(rect: Rectangle): Boolean = js.native
  /** 
    * Checks whether the coordinates and size of the rectangle are equal to
    * that of the supplied rectangle.
    * 
    * @return true if the rectangles are equal
    */
  def equals(rect: Rectangle): Boolean = js.native
  /** 
    * Returns a new rectangle expanded by the specified amount in horizontal
    * and vertical directions.
    * 
    * @param amount - the amount to expand the rectangle in
    * both directions
    * 
    * @return the expanded rectangle
    */
  def expand(amount: Double): Rectangle = js.native
  def expand(amount: Point): Rectangle = js.native
  def expand(amount: Size): Rectangle = js.native
  /** 
    * Returns a new rectangle expanded by the specified amounts in horizontal
    * and vertical directions.
    * 
    * @param hor - the amount to expand the rectangle in horizontal
    * direction
    * @param ver - the amount to expand the rectangle in vertical
    * direction
    * 
    * @return the expanded rectangle
    */
  def expand(hor: Double, ver: Double): Rectangle = js.native
  /** 
    * Adds a point to this rectangle. The resulting rectangle is the smallest
    * rectangle that contains both the original rectangle and the specified
    * point.
    * 
    * After adding a point, a call to {@link #contains} with the added
    * point as an argument does not necessarily return `true`. The {@link
    * Rectangle#contains(point)} method does not return `true` for points on
    * the right or bottom edges of a rectangle. Therefore, if the added point
    * falls on the left or bottom edge of the enlarged rectangle, {@link
    * Rectangle#contains(point)} returns `false` for that point.
    * 
    * @return the smallest rectangle that contains both the
    * original rectangle and the specified point
    */
  def include(point: Point): Rectangle = js.native
  /** 
    * Returns a new rectangle representing the intersection of this rectangle
    * with the specified rectangle.
    * 
    * @param rect - the rectangle to be intersected with this
    * rectangle
    * 
    * @return the largest rectangle contained in both the specified
    * rectangle and in this rectangle
    */
  def intersect(rect: Rectangle): Rectangle = js.native
  /** 
    * Tests if the interior of this rectangle intersects the interior of
    * another rectangle. Rectangles just touching each other are considered as
    * non-intersecting, except if a `epsilon` value is specified by which this
    * rectangle's dimensions are increased before comparing.
    * 
    * @param rect - the specified rectangle
    * @param epsilon - the epsilon against which to compare the
    *     rectangle's dimensions
    * 
    * @return true if the rectangle and the specified rectangle
    *     intersect each other
    */
  def intersects(rect: Rectangle): Boolean = js.native
  def intersects(rect: Rectangle, epsilon: Double): Boolean = js.native
  /** 
    * @return true if the rectangle is empty
    */
  def isEmpty(): Boolean = js.native
  /** 
    * Returns a new rectangle scaled by the specified amount from its center.
    * 
    * @return the scaled rectangle
    */
  def scale(amount: Double): Rectangle = js.native
  /** 
    * Returns a new rectangle scaled in horizontal direction by the specified
    * `hor` amount and in vertical direction by the specified `ver` amount
    * from its center.
    * 
    * @return the scaled rectangle
    */
  def scale(hor: Double, ver: Double): Rectangle = js.native
  /** 
    * Sets the rectangle to the passed values. Note that any sequence of
    * parameters that is supported by the various {@link Rectangle}
    * constructors also work for calls of `set()`.
    */
  def set(values: js.Any*): Rectangle = js.native
  /** 
    * Returns a new rectangle representing the union of this rectangle with the
    * specified rectangle.
    * 
    * @param rect - the rectangle to be combined with this rectangle
    * 
    * @return the smallest rectangle containing both the specified
    * rectangle and this rectangle
    */
  def unite(rect: Rectangle): Rectangle = js.native
}

