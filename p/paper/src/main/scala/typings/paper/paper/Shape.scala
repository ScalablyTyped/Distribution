package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Shape")
@js.native
class Shape () extends Item {
  /**
    * The radius of the shape, as a number if it is a circle, or a size object for ellipses and rounded rectangles.
    */
  var radius: Double | Size = js.native
  /**
    * The size of the shape.
    */
  var size: Size = js.native
  /**
    * The type of shape of the item as a string.
    */
  var `type`: String = js.native
  /**
    * Creates a new path item with same geometry as this shape item, and inherits all settings from it, similar to item.clone().
    * @param insert - specifies whether the new path should be inserted into the scene graph. When set to true, it is inserted above the shape item — optional, default: true
    */
  def toPath(): Shape = js.native
  def toPath(insert: Boolean): Shape = js.native
}

/* static members */
@JSGlobal("paper.Shape")
@js.native
object Shape extends js.Object {
  /**
    * Creates a circular shape item.
    * @param center - the center point of the circle
    * @param radius - the radius of the circle
    */
  def Circle(center: Point, radius: Double): Shape = js.native
  /**
    * Creates a circular shape item from the properties described by an object literal.
    * @param object - an object literal containing properties descriving the shapes attributes
    */
  def Circle(`object`: js.Any): Shape = js.native
  /**
    * Creates an elliptical shape item from the properties described by an object literal.
    * @param object - an object literal containing properties describing the shape's attributes
    */
  def Ellipse(`object`: js.Any): Shape = js.native
  /**
    * Creates an elliptical shape item.
    * @param rectangle - the rectangle circumscribing the ellipse
    */
  def Ellipse(rectangle: Rectangle): Shape = js.native
  /**
    * Creates a rectangular shape item from the passed points. These do not necessarily need to be the top left and bottom right corners, the constructor figures out how to fit a rectangle between them.
    * @param from - the first point defining the rectangle
    * @param to - the second point defining the rectangle
    */
  def Rectangle(from: Point, to: Point): Shape = js.native
  /**
    * Creates a rectangular shape item from the properties described by an object literal.
    * @param object - an object literal containing properties describing the shape's attributes
    */
  def Rectangle(`object`: js.Any): Shape = js.native
  /**
    * Creates a rectangular shape item from a point and a size object.
    * @param point - the rectangle's top-left corner
    * @param size - the rectangle's size.
    */
  def Rectangle(point: Point, size: Size): Shape = js.native
  /**
    * Creates a rectangular shape item, with optionally rounded corners.
    * @param rectangle - the rectangle object describing the geometry of the rectangular shape to be created.
    * @param radius [optional] - the size of the rounded corners, default: null
    */
  def Rectangle(rectangle: typings.paper.paper.Rectangle): Shape = js.native
  def Rectangle(rectangle: typings.paper.paper.Rectangle, radius: Double): Shape = js.native
}

